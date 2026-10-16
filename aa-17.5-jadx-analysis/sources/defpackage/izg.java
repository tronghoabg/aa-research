package defpackage;

/* loaded from: classes.dex */
final class izg implements iyz {
    final /* synthetic */ int a;
    final /* synthetic */ izl b;

    public izg(izl izlVar, int i) {
        this.a = i;
        this.b = izlVar;
    }

    @Override // defpackage.iyz
    public final void P(int i) {
        yop yopVarAi = izl.a.f().ai(1671);
        int i2 = this.a;
        yopVarAi.B("onChannelClosed: %d, reason %d", i2, i);
        izl izlVar = this.b;
        synchronized (izlVar.d) {
            izlVar.c[i2] = null;
        }
    }

    @Override // defpackage.iyz
    public final void Q() {
        throw null;
    }
}
