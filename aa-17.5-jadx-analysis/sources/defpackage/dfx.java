package defpackage;

/* loaded from: classes.dex */
public final class dfx implements deq {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfx) && affa.f(this.a, ((dfx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ")";
    }
}
