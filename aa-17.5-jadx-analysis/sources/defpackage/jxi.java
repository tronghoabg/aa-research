package defpackage;

/* loaded from: classes2.dex */
public final class jxi {
    public Object a;

    public jxi(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxi) && affa.f(this.a, ((jxi) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Closure(value=" + this.a + ")";
    }
}
