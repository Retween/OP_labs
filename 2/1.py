n = input("Введите число: ")

if 5 <= int(n) <= 19:
    print(n + " лет")
elif int(n) % 10 == 1:
    print(n + " год")
elif 2 <= int(n) % 10 <= 4:
    print(n + " года")
elif 5 <= int(n) % 10 <= 9:
    print(n + " лет")
elif int(n) % 10 == 0:
    print(n + " лет")
