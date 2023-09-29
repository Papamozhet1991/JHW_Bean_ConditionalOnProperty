package JHW_Conditional_App.askovorodko.model;

public class ProductionProfile implements SystemProfile {
    public static final String msg = "Current profile is production";
    @Override
    public String getProfile() {
        return msg;
    }
}