package defpackage;

/* loaded from: classes2.dex */
final class hxa implements huu {
    final /* synthetic */ hxb a;
    final /* synthetic */ ncp b;

    public hxa(hxb hxbVar, ncp ncpVar) {
        this.b = ncpVar;
        this.a = hxbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [hui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [huv, java.lang.Object] */
    @Override // defpackage.huu
    public final void f(Object obj) {
        hxb hxbVar = this.a;
        ncp ncpVar = this.b;
        if (hxbVar.e(ncpVar)) {
            hwf hwfVar = hxbVar.a.o;
            if (obj != null && hwfVar.c(ncpVar.a.e())) {
                hxbVar.c = obj;
                ((hvy) hxbVar.b).e(2);
            } else {
                hvv hvvVar = hxbVar.b;
                ?? r1 = ncpVar.c;
                ?? r3 = ncpVar.a;
                hvvVar.d(r1, obj, r3, r3.e(), hxbVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [huv, java.lang.Object] */
    @Override // defpackage.huu
    public final void g(Exception exc) {
        hxb hxbVar = this.a;
        ncp ncpVar = this.b;
        if (hxbVar.e(ncpVar)) {
            hvu hvuVar = hxbVar.d;
            ?? r3 = ncpVar.a;
            hxbVar.b.c(hvuVar, exc, r3, r3.e());
        }
    }
}
