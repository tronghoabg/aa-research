package defpackage;

/* loaded from: classes3.dex */
public final class agnv {
    private final Object value;

    public agnv(Object obj) {
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnv) && affa.f(this.value, ((agnv) obj).value);
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "KmConstantValue(value=" + this.value + ')';
    }
}
