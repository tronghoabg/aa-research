package defpackage;

/* loaded from: classes2.dex */
public final class bsf implements bta {
    private final cfr a;
    private final cfr b;

    public bsf(cfr cfrVar, cfr cfrVar2) {
        this.a = cfrVar;
        this.b = cfrVar2;
    }

    @Override // defpackage.bta
    public final int a(dlp dlpVar, long j, int i) {
        int iA = this.b.a(0, dlpVar.a());
        return dlpVar.c + iA + (-this.a.a(0, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsf)) {
            return false;
        }
        bsf bsfVar = (bsf) obj;
        return affa.f(this.a, bsfVar.a) && affa.f(this.b, bsfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ")";
    }
}
