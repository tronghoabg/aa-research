package defpackage;

/* loaded from: classes2.dex */
final class pvt implements zge {
    final /* synthetic */ boolean a;
    final /* synthetic */ pvu b;

    public pvt(pvu pvuVar, boolean z) {
        this.a = z;
        this.b = pvuVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        ((ynz) ((ynz) ((ynz) pvu.a.g()).p(th)).ai((char) 6910)).u("Failed to get auth token");
        if (this.a) {
            this.b.g(th);
        }
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String strAk = woy.ak((String) obj);
        if (strAk != null) {
            this.b.h(strAk);
        } else if (this.a) {
            this.b.g(new pwv(pwu.n));
        }
    }
}
