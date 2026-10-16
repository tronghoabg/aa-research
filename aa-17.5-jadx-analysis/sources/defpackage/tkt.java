package defpackage;

/* loaded from: classes3.dex */
public final class tkt extends ebj implements tkv {
    public final Object a;

    public tkt(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkt) && affa.f(this.a, ((tkt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Complete(innerResult=" + this.a + ")";
    }
}
