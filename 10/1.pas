const
  n = 5;
  m = 5;
Type
  p = array [1..25] of integer;
  
  
var
  i,j: integer;
  y:^p;
  
  
  a: array [1..n,1..m] of integer = ((9,1,3,6,3),
                                     (4,7,2,0,4),
                                     (2,6,9,2,4),
                                     (3,8,4,8,8),
                                     (4,2,8,4,6));
begin
//  y:= New(p);
for i:=1 to n do
  begin
    for j:=1 to m do
    begin
        write(a[i,j]:4);
    end;
    writeln();
  end;
  writeln();
  y := @a;
  
  for i:= 1 to n*m do
    begin
      write(y^[i]:4);
    end;
end.