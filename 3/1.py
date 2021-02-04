import math


def my_cos(x):
    eps = 0.0001

    n = 1
    z = 1
    s = z

    while abs(z) > eps:
        z = (-1) ** n * x ** (2 * n) / (math.factorial(2 * n))
        s += z
        n += 1


x = float(input("Введите x: "))

print("\tВычисленный cos(x):      ", math.cos(x))
print("\tИстинный cos(x):      ", math.cos(x))
