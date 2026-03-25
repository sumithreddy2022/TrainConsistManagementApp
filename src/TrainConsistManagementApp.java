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

List<Bogie> filtered=l.stream().filter(b->b.cap>60).collect(Collectors.toList());

for(Bogie x:filtered)System.out.println(x.name+" "+x.cap);

}
}
