package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bpl implements defpackage.akr {
    public final long a;
    private final boolean b;
    private final float c;
    private final defpackage.ckg d;
    private final defpackage.cld e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public bpl(boolean z, float f, long j, defpackage.cld cldVar, boolean z2, boolean z3) {
        if (cldVar == null) {
            defpackage.dlr dlrVar = new defpackage.dlr(f);
            dlrVar = java.lang.Float.compare(dlrVar.a, Float.NaN) == 0 ? null : dlrVar;
            if (dlrVar != null) {
                float f2 = dlrVar.a;
                defpackage.bcr bcrVar = defpackage.bcw.a;
                defpackage.bct bctVar = new defpackage.bct(f2);
                cldVar = new defpackage.bcr(bctVar, bctVar, bctVar, bctVar);
            } else {
                cldVar = null;
            }
            if (cldVar == null) {
                cldVar = defpackage.cky.a;
            }
        }
        this.b = z;
        this.c = f;
        this.d = null;
        this.a = j;
        this.e = cldVar;
        this.f = z2;
        this.g = z3;
        this.h = true;
        this.i = true;
    }

    @Override // defpackage.akr
    public final defpackage.cwn a(defpackage.asj asjVar) {
        defpackage.bns bnsVar = new defpackage.bns(this, 4);
        return new defpackage.bnt(asjVar, this.b, this.c, bnsVar, this.f, this.g);
    }

    @Override // defpackage.akl
    public final /* synthetic */ defpackage.akz b(defpackage.bve bveVar) {
        return defpackage.ca.ba(bveVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bpl)) {
            return false;
        }
        defpackage.bpl bplVar = (defpackage.bpl) obj;
        if (this.b == bplVar.b && java.lang.Float.compare(this.c, bplVar.c) == 0) {
            defpackage.ckg ckgVar = bplVar.d;
            if (this.a != bplVar.a || !defpackage.afga.f(this.e, bplVar.e) || this.f != bplVar.f || this.g != bplVar.g) {
                return false;
            }
            boolean z = bplVar.h;
            boolean z2 = bplVar.i;
            return true;
        }
        return false;
    }

    @Override // defpackage.akr
    public final int hashCode() {
        return (((((((((((((defpackage.a.e(this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 961) + defpackage.a.f(this.a)) * 31) + this.e.hashCode()) * 31) + defpackage.a.e(this.f)) * 31) + defpackage.a.e(this.g)) * 31) + defpackage.a.e(true)) * 31) + defpackage.a.e(true);
    }
}
