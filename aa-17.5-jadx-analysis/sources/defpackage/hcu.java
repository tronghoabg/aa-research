package defpackage;

/* loaded from: classes2.dex */
public final class hcu implements hcw {
    public final gbg a;

    public hcu(gbg gbgVar) {
        this.a = gbgVar;
    }

    @Override // defpackage.hcw
    public final void a(cfy cfyVar, boolean z, hjw hjwVar, bux buxVar, int i) {
        cfyVar.getClass();
        buxVar.v(1243097787);
        gui.g(this, cfyVar, buxVar, ((i >> 9) & 14) | ((i << 3) & 112));
        ((bvv) buxVar).Y(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcu) && affa.f(this.a, ((hcu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Image(image=" + this.a + ")";
    }
}
