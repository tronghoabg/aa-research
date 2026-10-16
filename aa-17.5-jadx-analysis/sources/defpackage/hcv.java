package defpackage;

/* loaded from: classes2.dex */
public final class hcv implements hcw {
    public final gbg a;

    public hcv(gbg gbgVar) {
        this.a = gbgVar;
    }

    @Override // defpackage.hcw
    public final void a(cfy cfyVar, boolean z, hjw hjwVar, bux buxVar, int i) {
        cfyVar.getClass();
        buxVar.v(1433506384);
        gui.f(this, cfyVar, buxVar, ((i >> 9) & 14) | ((i << 3) & 112));
        ((bvv) buxVar).Y(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcv) && affa.f(this.a, ((hcv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LargeImage(image=" + this.a + ")";
    }
}
