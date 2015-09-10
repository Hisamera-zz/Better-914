Function MouseLook(cam)
	RotateEntity cam, -(GraphicsHeight()/2-MouseY()), Float(GraphicsWidth()/2-MouseX()), 0
	 If KeyDown(17) MoveEntity cam,0,0,.1 
	 If KeyDown(31) MoveEntity cam,0,0,-.1
	 If KeyDown(32) MoveEntity cam,0.1,0,0 
	 If KeyDown(30) MoveEntity cam,-0.1,0,0 
End Function


Function CreateScene3D()
	Local i, cub, cam
	For i=1 To 50
		cub=CreateCube()
		EntityColor cub,Rand(128,255),Rand(128,255),Rand(128,255)
		PositionEntity cub,Rnd(-10,10),Rnd(-10,10),Rnd(-10,10)
		ScaleEntity cub,Rnd(0.3,0.5),Rnd(0.3,0.5),Rnd(0.3,0.5)
		TurnEntity cub,Rnd(0,90),Rnd(0,90),Rnd(0,90)
	Next
	SetFont LoadFont("Tahoma",13)
	CreateLight()
	cam = CreateCamera()
	CameraClsColor cam, 40, 40, 40
	Return cam
End Function