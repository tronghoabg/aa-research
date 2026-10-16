package defpackage;

/* loaded from: classes3.dex */
final class acjx {
    public final acjq a;
    public final int b;
    public final int c;
    public final int d;
    public final acjx e;
    public final int f;

    public acjx(ackb ackbVar, acjq acjqVar, int i, int i2, int i3, acjx acjxVar, acjt acjtVar) {
        this.a = acjqVar;
        this.b = i;
        acjq acjqVar2 = acjq.BYTE;
        int i4 = (acjqVar == acjqVar2 || acjxVar == null) ? i2 : acjxVar.c;
        this.c = i4;
        this.d = i3;
        this.e = acjxVar;
        boolean z = false;
        int iA = acjxVar != null ? acjxVar.f : 0;
        if (acjqVar == acjqVar2 && acjxVar == null) {
            if (i4 == 0) {
                i4 = 0;
                if (acjxVar != null) {
                }
            }
            z = true;
        } else if (acjxVar != null && i4 != acjxVar.c) {
            z = true;
        }
        iA = (acjxVar == null || acjqVar != acjxVar.a || z) ? iA + acjqVar.a(acjtVar) + 4 : iA;
        int iOrdinal = acjqVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iA += i3 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iA += ackbVar.c.d(ackbVar.a.substring(i, i3 + i), i2).length * 8;
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
