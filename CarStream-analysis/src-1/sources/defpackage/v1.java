package defpackage;

import android.media.AudioDeviceInfo;
import android.media.MediaPlayer;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class v1 implements Runnable {
    public final /* synthetic */ int a;

    public v1(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer = w1.a;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.isPlaying();
        } catch (Throwable unused) {
        }
        try {
            AudioDeviceInfo routedDevice = mediaPlayer.getRoutedDevice();
            if (routedDevice != null) {
                routedDevice.getType();
                routedDevice.getId();
            }
        } catch (Throwable unused2) {
        }
        w1.w(this.a);
    }
}
