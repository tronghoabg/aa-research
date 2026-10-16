package defpackage;

/* loaded from: classes2.dex */
public final class btg implements bsz {
    private final cfm a;

    public btg(cfm cfmVar) {
        this.a = cfmVar;
    }

    @Override // defpackage.bsz
    public final int a(dlp dlpVar, long j, int i, dlr dlrVar) {
        return Math.round(((((int) (j >> 32)) - i) / 2.0f) * (((cfo) this.a).a + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btg) && affa.f(this.a, ((btg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ")";
    }
}
