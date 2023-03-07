package homework_7;

//Заставить работать. (помним про SOLID)
// public class App {

//     public static void main(String[] args) {
//       new Innerapp(null).write();
//     }
//   }
  
//   interface IInterface {
//     void print();
//   }
  
//   class Innerapp {
//     IInterface v;
  
//     public Innerapp(IInterface v) {
//       this.v = v;
//     }
  
//     void write() {
//       v.print();
//     }
//   }


public class App {
    public static void main(String[] args) {
        IInterface obj = new Writer();
        new InnerApp(obj).write();
    }
}

interface IInterface {
    void print();
}

interface IWriter {
    void write();
}

class InnerApp implements IWriter {
    private final IInterface v;

    public InnerApp(IInterface v) {
        this.v = v;
    }

    @Override
    public void write() {
        v.print();
    }
}

class Writer implements IInterface {
    @Override
    public void print() {
        System.out.println("Hello, world!");
    }
}
