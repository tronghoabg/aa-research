package defpackage;

/* loaded from: classes2.dex */
final class htl {
    public final cfy a;
    public final hdq b;

    public htl(hdq hdqVar, cfy cfyVar) {
        cfyVar.getClass();
        this.b = hdqVar;
        this.a = cfyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htl)) {
            return false;
        }
        htl htlVar = (htl) obj;
        return affa.f(this.b, htlVar.b) && affa.f(this.a, htlVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SizeAndModifier(size=" + this.b + ", modifier=" + this.a + ")";
    }
}
