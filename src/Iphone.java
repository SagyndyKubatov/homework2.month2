public class Iphone extends Phone{

    public Iphone(String model, String processor, double display) {
        super(model, processor, display);
    }

    @Override
    public void print() {
        System.out.println("Модель: "+this.getModel()+
                "\nПроцессор: "+this.getProcessor()+
                "\nДисплей: "+this.getDisplay());
    }
}
