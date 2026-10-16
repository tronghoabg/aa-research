package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class mcx {
    public final qrn a;
    public final Map b;
    public final boolean c;

    public mcx(qrn qrnVar, Map map, boolean z) {
        this.a = qrnVar;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcx)) {
            return false;
        }
        mcx mcxVar = (mcx) obj;
        return affa.f(this.a, mcxVar.a) && affa.f(this.b, mcxVar.b) && this.c == mcxVar.c;
    }

    public final int hashCode() {
        qrn qrnVar = this.a;
        return ((((qrnVar == null ? 0 : qrnVar.hashCode()) * 31) + this.b.hashCode()) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "ParkedAppState(carToken=" + this.a + ", appsByRegion=" + this.b + ", isParked=" + this.c + ")";
    }
}
