package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kya implements defpackage.kxu {
    public final android.media.AudioManager a;
    public final android.media.AudioDeviceInfo b;
    public final defpackage.yqm c = defpackage.yqm.c("GH.Bt.VvcAudioStrategy");

    public kya(android.media.AudioManager audioManager, android.media.AudioDeviceInfo audioDeviceInfo) {
        this.a = audioManager;
        this.b = audioDeviceInfo;
    }

    @Override // defpackage.kxu
    public final void a() {
        ((defpackage.yqj) this.c.l().ai(3526)).u("Stopping virtual voice call");
        this.a.clearCommunicationDevice();
    }
}
