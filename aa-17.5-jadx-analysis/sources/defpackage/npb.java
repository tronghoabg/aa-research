package defpackage;

/* loaded from: classes2.dex */
public final class npb {
    private final String a;
    private final kll b;

    public npb(String str, kll kllVar) {
        this.a = str;
        this.b = kllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npb)) {
            return false;
        }
        npb npbVar = (npb) obj;
        return affa.f(this.a, npbVar.a) && affa.f(this.b, npbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ControlCacheKey(type=" + this.a + ", area=" + this.b + ")";
    }
}
