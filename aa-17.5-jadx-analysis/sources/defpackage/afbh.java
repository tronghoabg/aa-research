package defpackage;

/* loaded from: classes3.dex */
public final class afbh<T> {
    public final int a;
    public final Object b;

    public afbh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afbh)) {
            return false;
        }
        afbh afbhVar = (afbh) obj;
        return this.a == afbhVar.a && affa.f(this.b, afbhVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
