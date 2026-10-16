package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class acjz {
    public final List a = new ArrayList();
    public final acjt b;
    final /* synthetic */ ackb c;

    public acjz(ackb ackbVar, acjt acjtVar, acjx acjxVar) {
        int i;
        int i2;
        this.c = ackbVar;
        acjx acjxVar2 = acjxVar;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (acjxVar2 == null) {
                break;
            }
            int i5 = i3 + acjxVar2.d;
            acjx acjxVar3 = acjxVar2.e;
            int i6 = i4;
            acjq acjqVar = acjxVar2.a;
            if ((acjqVar != acjq.BYTE || acjxVar3 != null || acjxVar2.c == 0) && (acjxVar3 == null || acjxVar2.c == acjxVar3.c)) {
                i = 0;
            }
            int i7 = i | i6;
            if (acjxVar3 != null && acjxVar3.a == acjqVar && i == 0) {
                i2 = i5;
            } else {
                this.a.add(0, new acjy(this, acjqVar, acjxVar2.b, acjxVar2.c, i5));
                i2 = 0;
            }
            if (i != 0) {
                this.a.add(0, new acjy(this, acjq.ECI, acjxVar2.b, acjxVar2.c, 0));
            }
            acjxVar2 = acjxVar3;
            i4 = i7;
            i3 = i2;
        }
        int i8 = i4;
        if (ackbVar.b) {
            acjy acjyVar = (acjy) this.a.get(0);
            if (acjyVar != null) {
                acjq acjqVar2 = acjyVar.a;
                acjq acjqVar3 = acjq.ECI;
                if (acjqVar2 != acjqVar3 && i8 != 0) {
                    this.a.add(0, new acjy(this, acjqVar3, 0, 0, 0));
                }
            }
            this.a.add(((acjy) this.a.get(0)).a == acjq.ECI ? 1 : 0, new acjy(this, acjq.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i9 = acjtVar.a;
        int i10 = 26;
        int iOrdinal = (i9 <= 9 ? acka.SMALL : i9 <= 26 ? acka.MEDIUM : acka.LARGE).ordinal();
        if (iOrdinal == 0) {
            i10 = 9;
        } else if (iOrdinal != 1) {
            i10 = 40;
            i = 27;
        } else {
            i = 10;
        }
        int iA = a(acjtVar);
        while (i9 < i10 && !acjv.f(iA, acjt.b(i9), ackbVar.d)) {
            i9++;
        }
        while (i9 > i) {
            int i11 = i9 - 1;
            if (!acjv.f(iA, acjt.b(i11), ackbVar.d)) {
                break;
            } else {
                i9 = i11;
            }
        }
        this.b = acjt.b(i9);
    }

    public final int a(acjt acjtVar) {
        int iA;
        int i = 0;
        for (acjy acjyVar : this.a) {
            acjq acjqVar = acjyVar.a;
            int iA2 = acjqVar.a(acjtVar);
            int i2 = iA2 + 4;
            int iOrdinal = acjqVar.ordinal();
            if (iOrdinal == 1) {
                int i3 = acjyVar.d;
                int i4 = i2 + ((i3 / 3) * 10);
                int i5 = i3 % 3;
                i2 = i4 + (i5 != 1 ? i5 == 2 ? 7 : 0 : 4);
            } else if (iOrdinal != 2) {
                if (iOrdinal == 4) {
                    iA = acjyVar.a() * 8;
                } else if (iOrdinal == 5) {
                    i2 = iA2 + 12;
                } else if (iOrdinal == 6) {
                    iA = acjyVar.d * 13;
                }
                i2 += iA;
            } else {
                int i6 = acjyVar.d;
                i2 = i2 + ((i6 / 2) * 11) + (i6 % 2 != 1 ? 0 : 6);
            }
            i += i2;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        acjy acjyVar = null;
        for (acjy acjyVar2 : this.a) {
            if (acjyVar != null) {
                sb.append(",");
            }
            sb.append(acjyVar2.toString());
            acjyVar = acjyVar2;
        }
        return sb.toString();
    }
}
