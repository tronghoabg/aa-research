package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class loc extends eqj {
    public final ComponentName a;
    private final lmb h;
    private final llu i = new lob(this);

    public loc(lmb lmbVar, ComponentName componentName) {
        this.h = lmbVar;
        this.a = componentName;
    }

    @Override // defpackage.eqj
    protected final void c() {
        lmb lmbVar = this.h;
        llv llvVar = new llv(lmbVar, 3);
        int i = yfq.d;
        yfq yfqVarC = lod.c((yfq) lmbVar.Q(llvVar, yls.a, "get queue"));
        ((ype) lod.a.l().ai(4099)).K("QueueLiveData#onActive componentName=%s size=%d", new zjd(zjc.a, this.a.flattenToShortString()), yfqVarC.size());
        m(yfqVarC);
        lmbVar.W(this.i);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.h.X(this.i);
    }
}
