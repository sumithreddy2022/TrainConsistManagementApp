import java.util.*;

class Bogie{
String name;int cap;
Bogie(String n,int c){name=n;cap=c;}
}

class TrainApp{
public static void main(String args[]){

System.out.println("=== Train Consist Management App ===");

List<Bogie> l=new ArrayList<>();

l.add(new Bogie("Sleeper",72));l.add(new Bogie("AC Chair",56));l.add(new Bogie("First Class",40));

Collections.sort(l,(a,b)->a.cap-b.cap);

for(Bogie x:l)System.out.println(x.name+" "+x.cap);

}
}
