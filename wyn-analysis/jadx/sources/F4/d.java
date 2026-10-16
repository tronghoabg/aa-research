package F4;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e f3841a;

    /* renamed from: b, reason: collision with root package name */
    public int f3842b;

    /* renamed from: c, reason: collision with root package name */
    public Class f3843c;

    public d(e eVar) {
        this.f3841a = eVar;
    }

    @Override // F4.h
    public final void a() {
        this.f3841a.M(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f3842b == dVar.f3842b && this.f3843c == dVar.f3843c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f3842b * 31;
        Class cls = this.f3843c;
        return i5 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f3842b + "array=" + this.f3843c + '}';
    }
}
