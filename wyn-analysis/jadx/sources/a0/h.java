package A0;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ NotificationChannel c(int i5) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i5);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f(int i5) {
        return new AudioFocusRequest.Builder(i5);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest l(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void m() {
    }
}
