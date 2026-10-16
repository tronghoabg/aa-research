package N9;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f8619a;

    public f(String str) {
        this.f8619a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f8619a;
        return str.hashCode() == fVar.f8619a.hashCode() && str.equals(fVar.f8619a);
    }

    public final int hashCode() {
        return this.f8619a.hashCode();
    }
}
