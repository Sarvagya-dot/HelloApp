public class helloapp {
    public static void main(String[] args) {
       //Default name
	   string name="World";
	   //Check if a name is provided as a command-line argument
	   if(args.lenght>0){
		   name=args[0];//use the provided name
	   }
	   System.out.println("Hello,"+name+"!");
    }
}