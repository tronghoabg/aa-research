package da;

import java.util.HashSet;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f34200a;

    public d(HashSet hashSet) {
        this.f34200a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f34200a.equals(((d) obj).f34200a);
    }

    public final int hashCode() {
        return this.f34200a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f34200a + "}";
    }
}
