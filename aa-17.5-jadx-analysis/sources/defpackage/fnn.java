package defpackage;

/* loaded from: classes2.dex */
public final class fnn {
    public final String a;
    public final Long b;

    public fnn(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnn)) {
            return false;
        }
        fnn fnnVar = (fnn) obj;
        return affa.f(this.a, fnnVar.a) && affa.f(this.b, fnnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ")";
    }
}
