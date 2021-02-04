import math


def calc(f, l1, l2, n):
    print("\nчисло разбиений: ", n)
    h = (l2 - l1) / n  # шаг
    total = sum([f((l1 + (k * h))) for k in range(0, n - 1)])
    result = h * total
    print("результат:         ", result)
    return result


def f(x):
    return 1 / ((a ** 2) * math.sin(x) ** 2 + (b ** 2) * math.cos(x) ** 2)


a = 0.1
b = 10.0
n = 60  # 495

l1 = 0
l2 = math.pi

f_correct = math.pi / (a * b)

f1 = calc(f, l1, l2, n)
print("истинное значение: ", f_correct)

d = abs((f1 - f_correct) / f_correct)
print("погрешность: ", d)
