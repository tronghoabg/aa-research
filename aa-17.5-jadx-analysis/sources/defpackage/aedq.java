package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class aedq extends adla {
    @Override // defpackage.adla
    public final adlf b(adkx adkxVar) {
        return g().b(adkxVar);
    }

    @Override // defpackage.adla
    public final adnw c() {
        return g().c();
    }

    @Override // defpackage.adla
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.adla
    public final void e() {
        g().e();
    }

    @Override // defpackage.adla
    public void f(adjh adjhVar, adlg adlgVar) {
        throw null;
    }

    protected abstract adla g();

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", g());
        return xxgVarAo.toString();
    }
}
