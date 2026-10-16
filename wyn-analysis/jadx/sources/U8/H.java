package U8;

import java.util.List;

/* loaded from: classes4.dex */
public final class H extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f12401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12402b;

    public H(List list, String str) {
        this.f12401a = list;
        this.f12402b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (this.f12401a.equals(((H) u0Var).f12401a) && ((str = this.f12402b) != null ? str.equals(((H) u0Var).f12402b) : ((H) u0Var).f12402b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12401a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12402b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f12401a);
        sb2.append(", orgId=");
        return wg.b.c(sb2, this.f12402b, "}");
    }
}
