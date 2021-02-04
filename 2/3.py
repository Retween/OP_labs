import math

# eps = float(input("Введите точность eps: "))
eps = 0.0001
x = float(input("Введите x: "))

n = 1
z = 1
s = z

while abs(z) > eps:
    z = (-1) ** n * x ** (2 * n) / (math.factorial(2 * n))
    s += z
    n += 1
print("\tСумма равна: ", s)

print("\tCos(x):      ", math.cos(x))
