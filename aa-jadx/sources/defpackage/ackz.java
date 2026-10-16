package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ackz {
    public final defpackage.acks a;
    public final int b;
    public final int c;
    public final int d;
    public final defpackage.ackz e;
    public final int f;

    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    public ackz(defpackage.acld acldVar, defpackage.acks acksVar, int i, int i2, int i3, defpackage.ackz ackzVar, defpackage.ackv ackvVar) {
        this.a = acksVar;
        this.b = i;
        defpackage.acks acksVar2 = defpackage.acks.BYTE;
        int i4 = (acksVar == acksVar2 || ackzVar == null) ? i2 : ackzVar.c;
        this.c = i4;
        this.d = i3;
        this.e = ackzVar;
        boolean z = false;
        int iA = ackzVar != null ? ackzVar.f : 0;
        if (acksVar == acksVar2 && ackzVar == null) {
            if (i4 == 0) {
                i4 = 0;
                if (ackzVar != null) {
                    z = true;
                }
            } else {
                z = true;
            }
        } else if (ackzVar != null && i4 != ackzVar.c) {
            z = true;
        }
        iA = (ackzVar == null || acksVar != ackzVar.a || z) ? iA + acksVar.a(ackvVar) + 4 : iA;
        int iOrdinal = acksVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iA += i3 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iA += acldVar.c.d(acldVar.a.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    iA += 12;
                }
            } else if (iOrdinal == 6) {
                iA += 13;
            }
        } else {
            iA += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = iA;
    }
}
