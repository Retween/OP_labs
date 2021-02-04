var 
    r, a, x: real;
begin 
  write('Введите точность r: ');
  read(r);

  write('Введите число: ');
  read(a);
  
  x:= round(a/r)*r;
 
  
  writeln(a, ' округлённо = ', x:8:3);
end.