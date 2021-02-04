var deg, min, sec:integer;
    grad, rad: real;
begin
write ('Введите deg, min, sec: ');
read(deg, min, sec);

rad := deg*Pi/180 + min*Pi/(180*60) + sec*Pi/(180*60*60);
grad := deg + min/60 + sec/(60*60);

write ('Радианы: ',rad);
write ('  Градусы с долями: ',grad);
end.