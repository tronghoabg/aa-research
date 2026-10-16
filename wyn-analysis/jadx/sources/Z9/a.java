package Z9;

import java.util.HashSet;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f17047a;

    public a(HashSet hashSet) {
        this.f17047a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f17047a.equals(((a) obj).f17047a);
    }

    public final int hashCode() {
        return this.f17047a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f17047a + "}";
    }
}
