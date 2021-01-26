function ss_toDec(chislo : string; osnovanie : byte) : integer;
const hash_table : string = '0123456789ABCDEF';
var   otvet : integer;
      p, i  : integer;
begin
  otvet := 0;
  for i:= 1 to length(chislo) do
  begin
    p := pos(chislo[i], hash_table);
    if p in [1..osnovanie] then
      otvet := (otvet * osnovanie) + (p-1)
  end;
  ss_toDec := otvet;
end;

function ss_DecTo(chislo : integer; osnovanie : byte) : string;
const hash_table : string = '0123456789ABCDEF';
var   otvet : string;
      t, i  : integer;
begin
  otvet := '';
  while chislo >= osnovanie do
  begin
    otvet  := hash_table[(chislo mod osnovanie)+1] + otvet;
    chislo := chislo div osnovanie;
  end;
  if chislo=osnovanie then
    otvet  := hash_table[chislo] + otvet
  else
    otvet  := hash_table[chislo + 1] + otvet;
  ss_DecTo := otvet;
end;
var
i,f,e:integer;
s,g:string;
begin
  ReadLn(g);
  ReadLn(s);
  e := ss_toDec(g, 10);
  i := ss_toDec(s, e);
  for f:= 2 to 16 do
  begin
    WriteLn( ss_decTo(i, f),' ',f );
  end;
  ReadLn;
end.