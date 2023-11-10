n = int(input())
result = []
if n == 1:
    print(1)
elif n <= 3:
    print("NO SOLUTION")
else:
    for i in range(2, n + 1, 2):
        result.append(str(i))
    for i in range(1, n + 1, 2):
        result.append(str(i))
    print(" ".join(result))
