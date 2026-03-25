import java.util.*;
import java.util.stream.*;

class Bogie{
String name;int cap;
Bogie(String n,int c){name=n;cap=c;}
}

class TrainApp{
public static void main(String args[]){

System.out.println("=== Train Consist Management App ===");

List<Bogie> l=new ArrayList<>();
l.add(new Bogie("Sleeper",72));l.add(new Bogie("AC Chair",56));l.add(new Bogie("First Class",40));
l.add(new Bogie("Sleeper",72));l.add(new Bogie("AC Chair",56));

Map<String,List<Bogie>> grouped=l.stream().collect(Collectors.groupingBy(b->b.name));

for(String k:grouped.keySet())
System.out.println(k+" -> "+grouped.get(k).size()+" bogies");

}
}
