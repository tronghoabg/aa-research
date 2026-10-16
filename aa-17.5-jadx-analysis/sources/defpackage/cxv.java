package defpackage;

/* loaded from: classes.dex */
final class cxv {
    public cfx a;
    public int b;
    public boolean c;
    final /* synthetic */ cxx d;
    public aag e;
    public aag f;

    public cxv(cxx cxxVar, cfx cfxVar, int i, aag aagVar, aag aagVar2, boolean z) {
        this.d = cxxVar;
        this.a = cfxVar;
        this.b = i;
        this.e = aagVar;
        this.f = aagVar2;
        this.c = z;
    }

    public final boolean a(int i, int i2) {
        return cjn.r((cfw) this.e.c(this.b + i), (cfw) this.f.c(this.b + i2)) != 0;
    }
}
