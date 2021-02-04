var x: real;
    a, b, c: real;
begin 
  write('Введите x(градусы с долями): ');
  read (x);
  
  a:= sin(x*Pi/180);
  b:= cos(x*Pi/180);
  c:= sqr(x);
  
  writeln('x: ',x);
  writeln('Sin(x): ',a:10:3);
  writeln('Cos(x): ',b:10:3);
  writeln('x^2:    ',c:10:3);
end.