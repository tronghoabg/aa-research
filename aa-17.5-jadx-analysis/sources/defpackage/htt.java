package defpackage;

/* loaded from: classes2.dex */
public final class htt extends hdq {
    public final htw a;

    public htt(htw htwVar) {
        this.a = htwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htt) && affa.f(this.a, ((htt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImmediateGlideSize(size=" + this.a + ")";
    }
}
