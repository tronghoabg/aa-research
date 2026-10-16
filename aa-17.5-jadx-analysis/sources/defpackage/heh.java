package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class heh {
    public final List a;
    public final List b;

    public heh(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heh)) {
            return false;
        }
        heh hehVar = (heh) obj;
        return affa.f(this.a, hehVar.a) && affa.f(this.b, hehVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "RowLayoutTrailingAndBelowModel(rowTrailingList=" + this.a + ", rowBelowActions=" + this.b + ")";
    }
}
