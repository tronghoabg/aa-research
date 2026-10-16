package defpackage;

@afdo
/* loaded from: classes3.dex */
public final class tjc implements tjg {
    public final afdr a;

    public final boolean equals(Object obj) {
        return (obj instanceof tjc) && affa.f(this.a, ((tjc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Browsable(onClick=" + this.a + ")";
    }
}
