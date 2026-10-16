package U8;

import java.util.List;

/* loaded from: classes4.dex */
public final class T extends D0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f12474a;

    /* renamed from: b, reason: collision with root package name */
    public final V f12475b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f12476c;

    /* renamed from: d, reason: collision with root package name */
    public final W f12477d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12478e;

    public T(List list, V v2, r0 r0Var, W w2, List list2) {
        this.f12474a = list;
        this.f12475b = v2;
        this.f12476c = r0Var;
        this.f12477d = w2;
        this.f12478e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        List list = this.f12474a;
        if (list == null) {
            if (((T) d02).f12474a != null) {
                return false;
            }
        } else if (!list.equals(((T) d02).f12474a)) {
            return false;
        }
        V v2 = this.f12475b;
        if (v2 == null) {
            if (((T) d02).f12475b != null) {
                return false;
            }
        } else if (!v2.equals(((T) d02).f12475b)) {
            return false;
        }
        r0 r0Var = this.f12476c;
        if (r0Var == null) {
            if (((T) d02).f12476c != null) {
                return false;
            }
        } else if (!r0Var.equals(((T) d02).f12476c)) {
            return false;
        }
        T t10 = (T) d02;
        return this.f12477d.equals(t10.f12477d) && this.f12478e.equals(t10.f12478e);
    }

    public final int hashCode() {
        List list = this.f12474a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        V v2 = this.f12475b;
        int iHashCode2 = (iHashCode ^ (v2 == null ? 0 : v2.hashCode())) * 1000003;
        r0 r0Var = this.f12476c;
        return (((((r0Var != null ? r0Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f12477d.hashCode()) * 1000003) ^ this.f12478e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f12474a + ", exception=" + this.f12475b + ", appExitInfo=" + this.f12476c + ", signal=" + this.f12477d + ", binaries=" + this.f12478e + "}";
    }
}
