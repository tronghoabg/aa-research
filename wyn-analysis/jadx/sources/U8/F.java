package U8;

/* loaded from: classes4.dex */
public final class F extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12396a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12397b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12398c;

    public F(String str, String str2, String str3) {
        this.f12396a = str;
        this.f12397b = str2;
        this.f12398c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f12396a.equals(((F) q0Var).f12396a)) {
                F f10 = (F) q0Var;
                if (this.f12397b.equals(f10.f12397b) && this.f12398c.equals(f10.f12398c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12396a.hashCode() ^ 1000003) * 1000003) ^ this.f12397b.hashCode()) * 1000003) ^ this.f12398c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f12396a);
        sb2.append(", libraryName=");
        sb2.append(this.f12397b);
        sb2.append(", buildId=");
        return wg.b.c(sb2, this.f12398c, "}");
    }
}
