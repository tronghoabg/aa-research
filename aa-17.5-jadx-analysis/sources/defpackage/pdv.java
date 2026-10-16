package defpackage;

/* loaded from: classes2.dex */
public final class pdv {
    public final Exception a;

    public pdv(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdv) && affa.f(this.a, ((pdv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(exception=" + this.a + ")";
    }
}
