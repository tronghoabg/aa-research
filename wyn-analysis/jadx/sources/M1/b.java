package M1;

import android.app.Notification;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class b {
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i5, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i5, pendingIntent);
        }
        return mediaStyle;
    }
}
