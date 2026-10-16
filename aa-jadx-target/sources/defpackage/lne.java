package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lne implements java.lang.Runnable {
    public com.google.android.apps.auto.components.media.compat.AaPlaybackState a;
    public java.lang.String b;
    final /* synthetic */ defpackage.lni c;

    public lne(defpackage.lni lniVar) {
        this.c = lniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.Q() == 3) {
            defpackage.lma lmaVar = new defpackage.lma((byte[][]) null);
            ((defpackage.eb) lmaVar.b).c(this.a.Q(), this.a.U() + 1000, this.a.O(), this.a.T() + 1000);
            ((defpackage.eb) lmaVar.b).d = this.a.n();
            this.a = lmaVar.K();
            this.c.g.postDelayed(this, 1000L);
        }
        this.c.q(this.a, this.b);
    }
}
