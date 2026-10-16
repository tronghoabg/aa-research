package androidx.car.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class SessionInfoIntentEncoder {
    private static final String EXTRA_SESSION_INFO = "androidx.car.app.extra.SESSION_INFO_BUNDLE";
    private static final String KEY_DISPLAY_TYPE = "display-type";
    private static final String KEY_SESSION_ID = "session-id";

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static class Api29 {
        private Api29() {
        }

        public static void setIdentifier(Intent intent, String str) {
            intent.setIdentifier(str);
        }
    }

    private SessionInfoIntentEncoder() {
    }

    public static boolean containsSessionInfo(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(EXTRA_SESSION_INFO);
    }

    public static SessionInfo decode(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        }
        Bundle bundle = extras.getBundle(EXTRA_SESSION_INFO);
        return new SessionInfo(bundle.getInt(KEY_DISPLAY_TYPE), bundle.getString(KEY_SESSION_ID));
    }

    public static void encode(SessionInfo sessionInfo, Intent intent) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29.setIdentifier(intent, sessionInfo.toString());
        } else {
            intent.setData(new Uri.Builder().path(sessionInfo.toString()).build());
        }
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_DISPLAY_TYPE, sessionInfo.getDisplayType());
        bundle.putString(KEY_SESSION_ID, sessionInfo.getSessionId());
        intent.putExtra(EXTRA_SESSION_INFO, bundle);
    }
}
