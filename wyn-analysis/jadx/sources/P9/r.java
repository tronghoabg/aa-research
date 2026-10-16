package p9;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f43395a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.h f43396b;

    public r(q qVar, s9.h hVar) {
        this.f43395a = qVar;
        this.f43396b = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f43395a.equals(rVar.f43395a) && this.f43396b.equals(rVar.f43396b);
    }

    public final int hashCode() {
        return this.f43396b.f45375a.hashCode() + ((this.f43395a.hashCode() + 2077) * 31);
    }
}
