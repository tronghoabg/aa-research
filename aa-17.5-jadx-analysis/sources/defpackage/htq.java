package defpackage;

/* loaded from: classes2.dex */
public final class htq extends hdq {
    public final afec a;

    public htq(afec afecVar) {
        this.a = afecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htq) && affa.f(this.a, ((htq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AsyncGlideSize(asyncSize=" + this.a + ")";
    }
}
