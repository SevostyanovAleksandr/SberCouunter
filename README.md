# SberCouunter
Тестовое задание счетчик
1. При  старте программы метод checkFile проверяется размер файла, если размер не равен нулю, то вызывается метод readVariableToFile который построчно считывает значения файла.
2.  Выводит приглашение пользователю ввести команду.
3. Считывает введенную команду с использованием объекта scanner.
4. Если команда равна "/inc", то вызывается метод incrementcounter() для увеличения значения счетчика и метод printcounter() для вывода текущего значения счетчика.
5. Если команда равна "/reset", то вызывается метод resetcounter() для сброса счетчика в ноль и метод printcounter() для вывода текущего значения счетчика.
6. Если команда не равна "/stop", выводится сообщение "Неверная команда, попробуйте еще раз."
7. Цикл do-while продолжается, пока команда не будет "/stop".
8. После окончания цикла, выводится текущее значение счетчика при помощи метода printcounter().
9. Значение счетчика записывается в файл "counter.txt" при помощи метода writevariabletofile().
   

