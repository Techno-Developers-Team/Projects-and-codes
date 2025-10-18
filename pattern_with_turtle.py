import turtle
t=turtle.Pen()
turtle.bgcolor("Black")
t.speed("fastest")
t.hideturtle()
colors = ["red", "yellow", "blue", "green" ]
for i in range(700):
    t.pencolor(colors[i%4])
    t.circle(i)
    t.left(90)
