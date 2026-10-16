package G5;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
public abstract class A {
    public static void a(AudioTrack audioTrack, C c10) {
        audioTrack.setPreferredDevice(c10 == null ? null : c10.f4239a);
    }
}
