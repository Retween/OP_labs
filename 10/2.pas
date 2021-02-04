const
  n = 5;
  m = 5;
  k=2;
Type
  p = array [1..n*m*k] of integer;
  
  
var
  i,j,d: integer;
  y:^p;
  
  
  a: array [1..n,1..m,1..k] of integer ;
begin
  
  randomize;
  for i:=1 to n do
  begin
    for j:=1 to m do
    begin
      for d:=1 to k do
      begin
        a[i,j,d] := random(10);
        write(a[i,j,d]:4);
      end;
      writeln();
    end;
    writeln();
  end;
  
  
  y := @a;
  
  for i:= 1 to n*m*k do
    begin
      write(y^[i]:4);
    end;
end.