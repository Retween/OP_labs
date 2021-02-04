var deg, min, sec:real;
    grad, rad: real;
begin
write ('Введите угол в радианах(rad): ');
read(rad);

grad:= rad*180/Pi;

deg:= int(grad);
min:= int((grad-deg)*60);
sec:= ((grad-deg)*60 - min)*60;

write(deg,'^', min,'^^', sec:4:2,'^^^')

end.