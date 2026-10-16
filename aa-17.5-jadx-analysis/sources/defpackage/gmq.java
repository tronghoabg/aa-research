package defpackage;

@rb
/* loaded from: classes2.dex */
public final class gmq implements gmw {
    public final gmo a;

    public gmq(gmo gmoVar) {
        this.a = gmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmq) && affa.f(this.a, ((gmq) obj).a);
    }

    public final int hashCode() {
        gmo gmoVar = this.a;
        if (gmoVar == null) {
            return 0;
        }
        return gmoVar.hashCode();
    }

    public final String toString() {
        return "LoadingInternal(content=" + this.a + ")";
    }

    public gmq() {
        this(null);
    }
}
