package androidx.car.app.mediaextensions.analytics.event;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AnalyticsEventsUtil {
    private AnalyticsEventsUtil() {
    }

    public static String browseModeToString(int i2) {
        switch (i2) {
            case 1:
                return "TREE_ROOT";
            case 2:
                return "TREE_BROWSE";
            case 3:
                return "TREE_TAB";
            case 4:
                return "LINK";
            case 5:
                return "LINK_BROWSE";
            case 6:
                return "SEARCH_BROWSE";
            case 7:
                return "SEARCH_RESULTS";
            default:
                return "" + i2;
        }
    }

    public static String viewActionModeToString(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "SCROLL" : "NONE";
    }

    public static String viewActionToString(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "SHOW" : "HIDE";
    }

    public static String viewComponentToString(int i2) {
        switch (i2) {
            case 1:
                return "BROWSE_LIST";
            case 2:
                return "BROWSE_TABS";
            case 3:
                return "QUEUE_LIST";
            case 4:
                return "PLAYBACK";
            case 5:
                return "MINI_PLAYBACK";
            case 6:
                return "LAUNCHER";
            case 7:
                return "SETTINGS_VIEW";
            case 8:
                return "BROWSE_ACTION_OVERFLOW";
            case 9:
                return "MEDIA_HOST";
            case 10:
                return "ERROR_MESSAGE";
            default:
                return "UNKNOWN";
        }
    }
}
