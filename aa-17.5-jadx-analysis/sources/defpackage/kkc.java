package defpackage;

/* loaded from: classes2.dex */
public final class kkc implements kkf {
    public final Object a;

    public kkc(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkc) && affa.f(this.a, ((kkc) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Available(value=" + this.a + ")";
    }
}
