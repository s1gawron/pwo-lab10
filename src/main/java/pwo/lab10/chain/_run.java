package pwo.lab10.chain;

public class _run {

    public static void main(String[] args) {
        TxtProc procChain = new TxtProcUp();
        procChain.add(new TxtProcDown());
        procChain.add(new TxtProcReverse());
        procChain.add(new TxtProcRemoveDigits());

        Request request0 = new Request("Ala Ma 23 Koty", "up");
        Request request1 = new Request("Ala Ma 23 Koty", "down");
        Request request2 = new Request("Ala Ma 23 Koty", "reverse");
        Request request3 = new Request("Ala Ma 23 Koty", "remove_digits");
        Request request4 = new Request("Ala Ma 23 Koty", "?");

        System.out.println(procChain.processRequest(request0));
        System.out.println(procChain.processRequest(request1));
        System.out.println(procChain.processRequest(request2));
        System.out.println(procChain.processRequest(request3));
    }

}
