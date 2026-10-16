package U8;

import java.util.List;

/* renamed from: U8.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0873i0 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f12593a;

    public C0873i0(List list) {
        this.f12593a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        return this.f12593a.equals(((C0873i0) ((K0) obj)).f12593a);
    }

    public final int hashCode() {
        return this.f12593a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f12593a + "}";
    }
}
