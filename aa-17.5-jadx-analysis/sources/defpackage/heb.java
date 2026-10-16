package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class heb {
    public final List a;
    public final List b;

    public heb(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heb)) {
            return false;
        }
        heb hebVar = (heb) obj;
        return affa.f(this.a, hebVar.a) && affa.f(this.b, hebVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SplitTrailingItems(nonFocusableTrailingItems=" + this.a + ", focusableTrailingItems=" + this.b + ")";
    }
}
