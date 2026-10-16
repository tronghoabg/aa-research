package defpackage;

/* loaded from: classes2.dex */
public final class hgd {
    public final dlj a;
    public final dlj b;
    private final dlj c = null;
    private final dlj d = null;

    public hgd(dlj dljVar, dlj dljVar2) {
        this.a = dljVar;
        this.b = dljVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgd)) {
            return false;
        }
        hgd hgdVar = (hgd) obj;
        dlj dljVar = hgdVar.c;
        if (!affa.f(null, null) || !affa.f(this.a, hgdVar.a) || !affa.f(this.b, hgdVar.b)) {
            return false;
        }
        dlj dljVar2 = hgdVar.d;
        return affa.f(null, null);
    }

    public final int hashCode() {
        dlj dljVar = this.a;
        int iFloatToIntBits = dljVar == null ? 0 : Float.floatToIntBits(dljVar.a);
        dlj dljVar2 = this.b;
        return ((iFloatToIntBits * 31) + (dljVar2 != null ? Float.floatToIntBits(dljVar2.a) : 0)) * 31;
    }

    public final String toString() {
        return "StableAreaAnchors(startAnchor=null, endAnchor=" + this.a + ", topAnchor=" + this.b + ", bottomAnchor=null)";
    }
}
