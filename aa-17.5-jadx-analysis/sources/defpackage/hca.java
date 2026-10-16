package defpackage;

/* loaded from: classes2.dex */
public final class hca implements hju {
    public final gfa a;

    public hca(gfa gfaVar) {
        this.a = gfaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hca) && affa.f(this.a, ((hca) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SectionTitleUiModel(title=" + this.a + ")";
    }
}
