package src.Comportamental.ChainOfResponsability;

public abstract class AvaliadorHandler {
   protected AvaliadorHandler nextHandler;

   public void setNextHandler(AvaliadorHandler nextHandler) {
      this.nextHandler = nextHandler;
   }
   public abstract void handleRequest(double grade);
}