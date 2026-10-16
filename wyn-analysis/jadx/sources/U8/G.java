package U8;

/* loaded from: classes4.dex */
public final class G extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12400b;

    public G(String str, String str2) {
        this.f12399a = str;
        this.f12400b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f12399a.equals(((G) s0Var).f12399a) && this.f12400b.equals(((G) s0Var).f12400b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12399a.hashCode() ^ 1000003) * 1000003) ^ this.f12400b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f12399a);
        sb2.append(", value=");
        return wg.b.c(sb2, this.f12400b, "}");
    }
}
