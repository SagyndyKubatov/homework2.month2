public abstract class Phone implements Printable{
    private String model;
    private String processor;
    private double display;

    public Phone(String model, String processor, double display) {
        this.model = model;
        this.processor = processor;
        this.display = display;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public double getDisplay() {
        return display;
    }
}
