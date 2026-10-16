package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
final class rsw implements rsq {
    final /* synthetic */ int a;
    final /* synthetic */ rta b;

    public rsw(rta rtaVar, int i) {
        this.a = i;
        this.b = rtaVar;
    }

    @Override // defpackage.rsq
    public final void u(int i) {
        yop yopVarAi = rta.a.f().ai(8254);
        int i2 = this.a;
        yopVarAi.B("onChannelClosed: %d, reason %d", i2, i);
        rta rtaVar = this.b;
        synchronized (rtaVar.d) {
            rtaVar.c[i2] = null;
        }
    }

    @Override // defpackage.rsq
    public final void v() {
        rta.a.f().ai(8255).w("onChannelOpened: %d", this.a);
        new sss(Looper.getMainLooper()).post(new rsv(this.b.y, 0));
    }
}
