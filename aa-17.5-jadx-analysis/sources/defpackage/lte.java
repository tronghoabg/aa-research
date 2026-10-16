package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class lte {
    public final ltg a;
    public final ltg b;
    public final List c;
    private final String d;

    public lte(String str, ltg ltgVar, ltg ltgVar2, List list) {
        this.d = str;
        this.a = ltgVar;
        this.b = ltgVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lte)) {
            return false;
        }
        lte lteVar = (lte) obj;
        return affa.f(this.d, lteVar.d) && affa.f(this.a, lteVar.a) && affa.f(this.b, lteVar.b) && affa.f(this.c, lteVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        ltg ltgVar = this.a;
        int iHashCode2 = (iHashCode + (ltgVar == null ? 0 : ltgVar.hashCode())) * 31;
        ltg ltgVar2 = this.b;
        return ((iHashCode2 + (ltgVar2 != null ? ltgVar2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Actions(packageName=" + this.d + ", secondary=" + this.a + ", tertiary=" + this.b + ", remainingActions=" + this.c + ")";
    }
}
