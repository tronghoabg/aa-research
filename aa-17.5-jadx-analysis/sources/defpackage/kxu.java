package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes2.dex */
final class kxu implements kxn {
    public final AudioManager a;
    public final AudioDeviceInfo b;
    public final yph c = yph.c("GH.Bt.VvcAudioStrategy");

    public kxu(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        this.a = audioManager;
        this.b = audioDeviceInfo;
    }

    @Override // defpackage.kxn
    public final void a() {
        ((ype) this.c.l().ai(3523)).u("Stopping virtual voice call");
        this.a.clearCommunicationDevice();
    }
}
