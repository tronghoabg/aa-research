package defpackage;

/* loaded from: classes2.dex */
public final class gcq implements hju {
    public final gfa a;

    public gcq(gfa gfaVar) {
        gfaVar.getClass();
        this.a = gfaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcq) && affa.f(this.a, ((gcq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarTextUiModel(annotatedStringProvider=" + this.a + ")";
    }
}
