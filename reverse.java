import java.util.*;
class A
{
List<Integer> al=new ArrayList<>();
List<Integer> al1=new ArrayList<>();
for(int i=2;i<=30;i++)
{
if(i%2==0)
al.add(i);
if(i%3==0)
al1.add(i);
}
for(Integer k:al)
{
if(al1.contains(k))
{
System.out.print(k);
al1.remove(k);
}
}
}