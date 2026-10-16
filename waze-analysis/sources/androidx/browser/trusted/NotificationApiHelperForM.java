package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class NotificationApiHelperForM {
    private NotificationApiHelperForM() {
    }

    static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
