package Y4;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Class f16696a;

    /* renamed from: b, reason: collision with root package name */
    public Class f16697b;

    /* renamed from: c, reason: collision with root package name */
    public Class f16698c;

    public k(Class cls, Class cls2, Class cls3) {
        this.f16696a = cls;
        this.f16697b = cls2;
        this.f16698c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f16696a.equals(kVar.f16696a) && this.f16697b.equals(kVar.f16697b) && m.a(this.f16698c, kVar.f16698c);
    }

    public final int hashCode() {
        int iHashCode = (this.f16697b.hashCode() + (this.f16696a.hashCode() * 31)) * 31;
        Class cls = this.f16698c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f16696a + ", second=" + this.f16697b + '}';
    }
}
