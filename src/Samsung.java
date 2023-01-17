public class Samsung extends Phone{


    public Samsung(String model, String processor, double display) {
        super(model, processor, display);
    }

    @Override
    public void print() {
        System.out.println("Модель: "+this.getModel()+
                "\nПроцессор: "+this.getProcessor()+
                "\nДисплей: "+this.getDisplay());
    }
}
