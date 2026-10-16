package G5;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
public abstract class J {
    public static void a(t tVar, Object obj) {
        C c10;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        G g9 = (G) tVar;
        if (audioDeviceInfo == null) {
            c10 = null;
        } else {
            g9.getClass();
            c10 = new C(audioDeviceInfo);
        }
        g9.f4281Y = c10;
        AudioTrack audioTrack = g9.f4305u;
        if (audioTrack != null) {
            A.a(audioTrack, c10);
        }
    }
}
