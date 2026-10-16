package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cae extends cax {
    public static final cae a = new cae();

    private cae() {
        super(1, 0);
    }

    @Override // defpackage.cax
    protected final void a(cba cbaVar, buj bujVar, bzj bzjVar, cda cdaVar, cay cayVar) {
        bzb bzbVar;
        int iA;
        int i;
        int i2;
        int iA2 = cbaVar.a(0);
        if (bzjVar.m != 0) {
            buz.b("Cannot move a group while inserting");
        }
        if (iA2 < 0) {
            buz.b("Parameter offset is out of bounds");
        }
        if (iA2 == 0) {
            return;
        }
        int i3 = bzjVar.o;
        int i4 = bzjVar.q;
        int i5 = bzjVar.p;
        int i6 = i3;
        while (iA2 > 0) {
            i6 += bzjVar.b[(bzjVar.g(i6) * 5) + 3];
            if (i6 > i5) {
                buz.b("Parameter offset is out of bounds");
            }
            iA2--;
        }
        int[] iArr = bzjVar.b;
        int i7 = iArr[(bzjVar.g(i6) * 5) + 3];
        int iC = bzjVar.c(iArr, bzjVar.g(bzjVar.o));
        int iC2 = bzjVar.c(bzjVar.b, bzjVar.g(i6));
        int i8 = i6 + i7;
        int iC3 = bzjVar.c(bzjVar.b, bzjVar.g(i8));
        int i9 = iC3 - iC2;
        bzjVar.C(i9, Math.max(bzjVar.o - 1, 0));
        bzjVar.B(i7);
        int[] iArr2 = bzjVar.b;
        int iG = bzjVar.g(i8) * 5;
        int iG2 = bzjVar.g(i3) * 5;
        iArr2.getClass();
        iArr2.getClass();
        System.arraycopy(iArr2, iG, iArr2, iG2, ((i7 * 5) + iG) - iG);
        if (i9 > 0) {
            Object[] objArr = bzjVar.c;
            int iD = bzjVar.d(iC2 + i9);
            System.arraycopy(objArr, iD, objArr, iC, bzjVar.d(iC3 + i9) - iD);
        }
        int i10 = iC2 + i9;
        int i11 = i10 - iC;
        int i12 = bzjVar.j;
        int i13 = bzjVar.k;
        int length = bzjVar.c.length;
        int i14 = bzjVar.l;
        int i15 = i3 + i7;
        int i16 = i3;
        while (i16 < i15) {
            int iG3 = bzjVar.g(i16);
            int i17 = i11;
            int iC4 = bzjVar.c(iArr2, iG3) - i17;
            if (i14 < iG3) {
                i = iG3;
                i2 = 0;
            } else {
                i = iG3;
                i2 = i12;
            }
            if (iC4 > i2) {
                iC4 = -(((length - i13) - iC4) + 1);
            }
            int i18 = bzjVar.j;
            int i19 = i12;
            int i20 = bzjVar.k;
            int length2 = bzjVar.c.length;
            if (iC4 > i18) {
                iC4 = -(((length2 - i20) - iC4) + 1);
            }
            iArr2[(i * 5) + 4] = iC4;
            i16++;
            i11 = i17;
            i12 = i19;
        }
        int i21 = i8 + i7;
        int iF = bzjVar.f();
        int iA3 = bzi.a(bzjVar.d, i8, iF);
        ArrayList arrayList = new ArrayList();
        while (iA3 < bzjVar.d.size() && (iA = bzjVar.a((bzbVar = (bzb) bzjVar.d.get(iA3)))) >= i8 && iA < i21) {
            arrayList.add(bzbVar);
        }
        int i22 = i3 - i8;
        int size = arrayList.size();
        for (int i23 = 0; i23 < size; i23++) {
            bzb bzbVar2 = (bzb) arrayList.get(i23);
            int iA4 = bzjVar.a(bzbVar2) + i22;
            if (iA4 >= bzjVar.f) {
                bzbVar2.a = -(iF - iA4);
            } else {
                bzbVar2.a = iA4;
            }
            bzjVar.d.add(bzi.a(bzjVar.d, iA4, iF), bzbVar2);
        }
        if (bzjVar.U(i8, i7)) {
            buz.b("Unexpectedly removed anchors");
        }
        bzjVar.z(i4, bzjVar.p, i3);
        if (i9 > 0) {
            bzjVar.H(i10, i9, i8 - 1);
        }
    }
}
