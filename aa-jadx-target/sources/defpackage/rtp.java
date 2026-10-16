package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rtp implements defpackage.rtk {
    final /* synthetic */ int a;
    final /* synthetic */ defpackage.rtt b;

    public rtp(defpackage.rtt rttVar, int i) {
        this.a = i;
        this.b = rttVar;
    }

    @Override // defpackage.rtk
    public final void u(int i) {
        defpackage.ypu ypuVarAi = defpackage.rtt.a.f().ai(8279);
        int i2 = this.a;
        ypuVarAi.B("onChannelClosed: %d, reason %d", i2, i);
        defpackage.rtt rttVar = this.b;
        synchronized (rttVar.d) {
            rttVar.c[i2] = null;
        }
    }

    @Override // defpackage.rtk
    public final void v() {
        defpackage.rtt.a.f().ai(8280).w("onChannelOpened: %d", this.a);
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.qtk(this.b.y, 13));
    }
}
