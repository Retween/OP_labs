var
n:integer;
z,sum,x,eps:real;
begin
  eps:=0.0001;
  z:=1;
  n:=1;
  sum:=1;
  writeln('Введите x:');
  read(x);
  writeln('Заданная точность: 0.0001');
  
  repeat
    z:=z*(-power(x,2)/(2*n*(2*n-1))); //реккурентная формула: из z(n-1) => находим z(n)
    sum:=sum+z;
    n+=1;
  until abs(z)<eps;
  
  write('Результат: ');
  writeln(sum);
  
  writeln('Cos(x): ',  cos(x));
end.