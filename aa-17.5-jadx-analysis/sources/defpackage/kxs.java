package defpackage;

import android.media.AudioManager;

/* loaded from: classes2.dex */
final class kxs implements kxn {
    public final AudioManager a;
    public final yph b = yph.c("GH.Bt.ScoAudioStrategy");

    public kxs(AudioManager audioManager) {
        this.a = audioManager;
    }

    @Override // defpackage.kxn
    public final void a() {
        ((ype) this.b.l().ai(3517)).u("Stopping Bluetooth SCO");
        this.a.stopBluetoothSco();
    }
}
