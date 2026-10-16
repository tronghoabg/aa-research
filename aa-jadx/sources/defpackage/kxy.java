package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kxy implements defpackage.kxu {
    public final android.media.AudioManager a;
    public final defpackage.yqm b = defpackage.yqm.c("GH.Bt.ScoAudioStrategy");

    public kxy(android.media.AudioManager audioManager) {
        this.a = audioManager;
    }

    @Override // defpackage.kxu
    public final void a() {
        ((defpackage.yqj) this.b.l().ai(3520)).u("Stopping Bluetooth SCO");
        this.a.stopBluetoothSco();
    }
}
