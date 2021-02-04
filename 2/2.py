d1, m1, y1 = input("Введите первую дату: ").split()
d2, m2, y2 = input("Введите вторую дату: ").split()

if y2 > y1:
    print("Возрастает")
elif y1 > y2:
    print("Убывает")
else:
    if m2 > m1:
        print("Возрастает")
    elif m1 > m2:
        print("Убывает")
    else:
        if d2 > d1:
            print("Возрастает")
        elif d1 > d2:
            print("Убывает")
        else:
            print("Одна и та же дата")
