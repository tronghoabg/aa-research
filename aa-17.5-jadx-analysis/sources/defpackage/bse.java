package defpackage;

/* loaded from: classes2.dex */
public final class bse implements bsz {
    private final cfm a;
    private final cfm b;

    public bse(cfm cfmVar, cfm cfmVar2) {
        this.a = cfmVar;
        this.b = cfmVar2;
    }

    @Override // defpackage.bsz
    public final int a(dlp dlpVar, long j, int i, dlr dlrVar) {
        int iA = this.b.a(0, dlpVar.b(), dlrVar);
        return dlpVar.b + iA + (-this.a.a(0, i, dlrVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bse)) {
            return false;
        }
        bse bseVar = (bse) obj;
        return affa.f(this.a, bseVar.a) && affa.f(this.b, bseVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ")";
    }
}
