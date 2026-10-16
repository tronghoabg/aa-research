package defpackage;

/* loaded from: classes2.dex */
public final class hga {
    public final afeg a;
    public final afeg b;
    public final afeh c;
    public final afeg d;
    public final afec e;
    public final afec f;
    public final afdr g;

    public /* synthetic */ hga(byte[] bArr) {
        this(new hdh(11), new hdh(12), new hfg(2), new hdh(13), new hao(18), new hao(19), new grl(4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hga)) {
            return false;
        }
        hga hgaVar = (hga) obj;
        return affa.f(this.a, hgaVar.a) && affa.f(this.b, hgaVar.b) && affa.f(this.c, hgaVar.c) && affa.f(this.d, hgaVar.d) && affa.f(this.e, hgaVar.e) && affa.f(this.f, hgaVar.f) && affa.f(this.g, hgaVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "SurfaceCallbacksModel(onScroll=" + this.a + ", onFling=" + this.b + ", onZoom=" + this.c + ", onClick=" + this.d + ", onVisibleAreaChanged=" + this.e + ", onStableAreaChanged=" + this.f + ", onUserAction=" + this.g + ")";
    }

    public hga(afeg afegVar, afeg afegVar2, afeh afehVar, afeg afegVar3, afec afecVar, afec afecVar2, afdr afdrVar) {
        this.a = afegVar;
        this.b = afegVar2;
        this.c = afehVar;
        this.d = afegVar3;
        this.e = afecVar;
        this.f = afecVar2;
        this.g = afdrVar;
    }

    public hga() {
        this(null);
    }
}
