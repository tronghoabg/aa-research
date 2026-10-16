package defpackage;

/* loaded from: classes2.dex */
public final class hby implements hju {
    public final gfa a;

    public hby(gfa gfaVar) {
        this.a = gfaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hby) && affa.f(this.a, ((hby) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoItemsMessageUiModel(message=" + this.a + ")";
    }
}
