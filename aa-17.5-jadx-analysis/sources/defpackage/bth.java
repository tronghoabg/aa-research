package defpackage;

/* loaded from: classes2.dex */
public final class bth implements bta {
    private final cfr a;

    public bth(cfr cfrVar) {
        this.a = cfrVar;
    }

    @Override // defpackage.bta
    public final int a(dlp dlpVar, long j, int i) {
        return this.a.a(i, (int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bth) && affa.f(this.a, ((bth) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Vertical(alignment=" + this.a + ")";
    }
}
