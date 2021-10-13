import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private Pattern pattern;
    private Matcher matcher;
    private static final String NUMBER_REGEX="^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public ValidatePhone(){
        pattern=Pattern.compile(NUMBER_REGEX);
    }
    public boolean Validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
