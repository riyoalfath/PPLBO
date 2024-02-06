for row in range(0, 3):
    for col in range(0, 3):
        num = row * col
        if num < 10:
            empty = "  "
        else:
            if num < 100: 
                empty  = " " 
        if col == 0:
            if row == 0:
                print("    ", end = '')
            else:
                print("  ", row, end='')
        elif row == 0:
            print("  ", col, end='')
        else:
            print(empty, num, end = '')
    print()