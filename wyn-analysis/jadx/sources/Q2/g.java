package Q2;

import P2.i;

/* loaded from: classes.dex */
public final class g extends i implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (h(4) != gVar.h(4)) {
            return h(4) ? 1 : -1;
        }
        long j8 = this.f11360g - gVar.f11360g;
        if (j8 == 0) {
            j8 = this.k - gVar.k;
            if (j8 == 0) {
                return 0;
            }
        }
        return j8 > 0 ? 1 : -1;
    }
}
