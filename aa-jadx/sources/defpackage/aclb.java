package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aclb {
    public final java.util.List a = new java.util.ArrayList();
    public final defpackage.ackv b;
    final /* synthetic */ defpackage.acld c;

    public aclb(defpackage.acld acldVar, defpackage.ackv ackvVar, defpackage.ackz ackzVar) {
        int i;
        int i2;
        this.c = acldVar;
        defpackage.ackz ackzVar2 = ackzVar;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (ackzVar2 == null) {
                break;
            }
            int i5 = i3 + ackzVar2.d;
            defpackage.ackz ackzVar3 = ackzVar2.e;
            int i6 = i4;
            defpackage.acks acksVar = ackzVar2.a;
            if ((acksVar != defpackage.acks.BYTE || ackzVar3 != null || ackzVar2.c == 0) && (ackzVar3 == null || ackzVar2.c == ackzVar3.c)) {
                i = 0;
            }
            int i7 = i | i6;
            if (ackzVar3 != null && ackzVar3.a == acksVar && i == 0) {
                i2 = i5;
            } else {
                this.a.add(0, new defpackage.acla(this, acksVar, ackzVar2.b, ackzVar2.c, i5));
                i2 = 0;
            }
            if (i != 0) {
                this.a.add(0, new defpackage.acla(this, defpackage.acks.ECI, ackzVar2.b, ackzVar2.c, 0));
            }
            ackzVar2 = ackzVar3;
            i4 = i7;
            i3 = i2;
        }
        int i8 = i4;
        if (acldVar.b) {
            defpackage.acla aclaVar = (defpackage.acla) this.a.get(0);
            if (aclaVar != null) {
                defpackage.acks acksVar2 = aclaVar.a;
                defpackage.acks acksVar3 = defpackage.acks.ECI;
                if (acksVar2 != acksVar3 && i8 != 0) {
                    this.a.add(0, new defpackage.acla(this, acksVar3, 0, 0, 0));
                }
            }
            this.a.add(((defpackage.acla) this.a.get(0)).a == defpackage.acks.ECI ? 1 : 0, new defpackage.acla(this, defpackage.acks.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i9 = ackvVar.a;
        int i10 = 26;
        int iOrdinal = (i9 <= 9 ? defpackage.aclc.SMALL : i9 <= 26 ? defpackage.aclc.MEDIUM : defpackage.aclc.LARGE).ordinal();
        if (iOrdinal == 0) {
            i10 = 9;
        } else if (iOrdinal != 1) {
            i10 = 40;
            i = 27;
        } else {
            i = 10;
        }
        int iA = a(ackvVar);
        while (i9 < i10 && !defpackage.ackx.f(iA, defpackage.ackv.b(i9), acldVar.d)) {
            i9++;
        }
        while (i9 > i) {
            int i11 = i9 - 1;
            if (!defpackage.ackx.f(iA, defpackage.ackv.b(i11), acldVar.d)) {
                break;
            } else {
                i9 = i11;
            }
        }
        this.b = defpackage.ackv.b(i9);
    }

    public final int a(defpackage.ackv ackvVar) {
        int iA;
        int i = 0;
        for (defpackage.acla aclaVar : this.a) {
            defpackage.acks acksVar = aclaVar.a;
            int iA2 = acksVar.a(ackvVar);
            int i2 = iA2 + 4;
            int iOrdinal = acksVar.ordinal();
            if (iOrdinal == 1) {
                int i3 = aclaVar.d;
                int i4 = i2 + ((i3 / 3) * 10);
                int i5 = i3 % 3;
                i2 = i4 + (i5 != 1 ? i5 == 2 ? 7 : 0 : 4);
            } else if (iOrdinal != 2) {
                if (iOrdinal == 4) {
                    iA = aclaVar.a() * 8;
                } else if (iOrdinal == 5) {
                    i2 = iA2 + 12;
                } else if (iOrdinal == 6) {
                    iA = aclaVar.d * 13;
                }
                i2 += iA;
            } else {
                int i6 = aclaVar.d;
                i2 = i2 + ((i6 / 2) * 11) + (i6 % 2 != 1 ? 0 : 6);
            }
            i += i2;
        }
        return i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.acla aclaVar = null;
        for (defpackage.acla aclaVar2 : this.a) {
            if (aclaVar != null) {
                sb.append(",");
            }
            sb.append(aclaVar2.toString());
            aclaVar = aclaVar2;
        }
        return sb.toString();
    }
}
