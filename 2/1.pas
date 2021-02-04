var
i:integer;

begin
Write('Введите число: ');
Read(i);
Writeln('');
Write(i+' ');
case i of
11,12,13,14:Writeln('лет');
else
case (i mod 10) of
1:Writeln('год');
2,3,4:Writeln('года');
5,6,7,8,9,0:Writeln('лет');
end;
end;

end.