package defpackage;

/* loaded from: classes2.dex */
public final class jrd extends eqm {
    public final jra a;
    public final long h;
    final /* synthetic */ jre i;
    private Runnable j;
    private ajmd k;

    public jrd(jre jreVar, jra jraVar, long j) {
        this.i = jreVar;
        this.a = jraVar;
        this.h = j;
    }

    public final void a() {
        ajmd ajmdVar = this.k;
        if (ajmdVar != null) {
            this.i.c.remove(ajmdVar);
            this.k = null;
        }
        Runnable runnable = this.j;
        if (runnable != null) {
            this.i.e.removeCallbacks(runnable);
            this.j = null;
        }
    }

    @Override // defpackage.eqj
    protected final void c() {
        ((ype) jre.a.l().ai(2657)).y("InsightsLiveData onActive for %s, registering listener.", this.a);
        byte[] bArr = null;
        this.k = new ajmd(this, null);
        if (this.j == null) {
            this.j = new joo(this, 7, bArr);
        }
        jre jreVar = this.i;
        jreVar.c.add(this.k);
        jreVar.e.postDelayed(this.j, acll.b());
    }

    @Override // defpackage.eqj
    protected final void d() {
        ((ype) jre.a.l().ai(2658)).y("InsightsLiveData onInactive for %s, cleaning up.", this.a);
        a();
    }
}
