package pwo.lab10.chain;

public class TxtProcRemoveDigits extends TxtProc {

    public static String ACTION = "REMOVE_DIGITS";

    @Override
    public String processRequest(Request request) {
        if (request.action.toUpperCase().equals(ACTION)) {
            final StringBuilder sb = new StringBuilder();

            for (char c : request.text.toCharArray()) {
                if (!Character.isDigit(c)) {
                    sb.append(c);
                }
            }

            return sb.toString();
        } else {
            return next(request);
        }
    }

}
