package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class izn implements defpackage.izg {
    final /* synthetic */ int a;
    final /* synthetic */ defpackage.izs b;

    public izn(defpackage.izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // defpackage.izg
    public final void P(int i) {
        defpackage.ypu ypuVarAi = defpackage.izs.a.f().ai(1671);
        int i2 = this.a;
        ypuVarAi.B("onChannelClosed: %d, reason %d", i2, i);
        defpackage.izs izsVar = this.b;
        synchronized (izsVar.d) {
            izsVar.c[i2] = null;
        }
    }

    @Override // defpackage.izg
    public final void Q() {
        throw null;
    }
}
