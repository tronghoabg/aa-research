package defpackage;

/* loaded from: classes2.dex */
public final class chl extends cxt<cjr> {
    public final float a;
    public final ckv b;
    public final boolean c;
    public final long d = -72057594037927936L;
    public final long f = -72057594037927936L;

    public chl(float f, ckv ckvVar, boolean z) {
        this.a = f;
        this.b = ckvVar;
        this.c = z;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cjr(new chk(this, 0));
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cjr cjrVar = (cjr) cfxVar;
        cjrVar.a = new chk(this, 0);
        cjrVar.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chl)) {
            return false;
        }
        chl chlVar = (chl) obj;
        if (!dlj.c(this.a, chlVar.a) || !affa.f(this.b, chlVar.b) || this.c != chlVar.c) {
            return false;
        }
        long j = chlVar.d;
        if (!a.j(-72057594037927936L, -72057594037927936L)) {
            return false;
        }
        long j2 = chlVar.f;
        return a.j(-72057594037927936L, -72057594037927936L);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + a.f(this.c)) * 31) + a.g(-72057594037927936L)) * 31) + a.g(-72057594037927936L);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + dlj.b(this.a) + ", shape=" + this.b + ", clip=" + this.c + ", ambientColor=" + cjv.g(-72057594037927936L) + ", spotColor=" + cjv.g(-72057594037927936L) + ")";
    }
}
