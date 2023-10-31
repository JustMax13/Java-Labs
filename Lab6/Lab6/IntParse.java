package Lab6;

public class IntParse{
    private boolean _success;
    private int _result;

    public boolean getSuccess(){
        return _success;
    }
    public void setSuccess(boolean value){
        _success = value;
    }
    public int getResult(){
        return _result;
    }
    public void setResult(int value){
        _result = value;
    }

    public IntParse(){}
    public IntParse(boolean success, int result){
        _success = success;
        _result = result;
    }


    public static IntParse Parse(String value){
        try {
            int number = Integer.parseInt(value);
            return new IntParse(true, number);
        } catch (NumberFormatException e) {
            return new IntParse(false, -1);
        }
    }
}