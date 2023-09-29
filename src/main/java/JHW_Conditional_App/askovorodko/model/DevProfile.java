package JHW_Conditional_App.askovorodko.model;

public class DevProfile implements SystemProfile {
    public static final String msg = "Current profile is dev";
    @Override
    public String getProfile() {
        return msg;
    }
}