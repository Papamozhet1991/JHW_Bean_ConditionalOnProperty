package JHW_Conditional_App.askovorodko;

public class ProductionProfile implements SystemProfile {
    public static final String msg = "Current profile is production";
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}