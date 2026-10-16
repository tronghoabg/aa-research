package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cak extends defpackage.cbd {
    public static final defpackage.cak a = new defpackage.cak();

    private cak() {
        super(1, 0);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.bzh bzhVar;
        int iA;
        int iA2 = cbgVar.a(0);
        if (bzpVar.m != 0) {
            defpackage.bvg.b("Cannot move a group while inserting");
        }
        if (iA2 < 0) {
            defpackage.bvg.b("Parameter offset is out of bounds");
        }
        if (iA2 == 0) {
            return;
        }
        int i = bzpVar.o;
        int i2 = bzpVar.q;
        int i3 = bzpVar.p;
        int i4 = i;
        while (iA2 > 0) {
            i4 += bzpVar.b[(bzpVar.g(i4) * 5) + 3];
            if (i4 > i3) {
                defpackage.bvg.b("Parameter offset is out of bounds");
            }
            iA2--;
        }
        int[] iArr = bzpVar.b;
        int i5 = iArr[(bzpVar.g(i4) * 5) + 3];
        int iC = bzpVar.c(iArr, bzpVar.g(bzpVar.o));
        int iC2 = bzpVar.c(bzpVar.b, bzpVar.g(i4));
        int i6 = i4 + i5;
        int iC3 = bzpVar.c(bzpVar.b, bzpVar.g(i6));
        int i7 = iC3 - iC2;
        bzpVar.C(i7, java.lang.Math.max(bzpVar.o - 1, 0));
        bzpVar.B(i5);
        int[] iArr2 = bzpVar.b;
        int iG = bzpVar.g(i6) * 5;
        int iG2 = bzpVar.g(i) * 5;
        iArr2.getClass();
        iArr2.getClass();
        java.lang.System.arraycopy(iArr2, iG, iArr2, iG2, ((i5 * 5) + iG) - iG);
        if (i7 > 0) {
            java.lang.Object[] objArr = bzpVar.c;
            int iD = bzpVar.d(iC2 + i7);
            java.lang.System.arraycopy(objArr, iD, objArr, iC, bzpVar.d(iC3 + i7) - iD);
        }
        int i8 = iC2 + i7;
        int i9 = i8 - iC;
        int i10 = bzpVar.j;
        int i11 = bzpVar.k;
        int length = bzpVar.c.length;
        int i12 = bzpVar.l;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iG3 = bzpVar.g(i14);
            int i15 = i9;
            int iC4 = bzpVar.c(iArr2, iG3) - i15;
            if (iC4 > (i12 < iG3 ? 0 : i10)) {
                iC4 = -(((length - i11) - iC4) + 1);
            }
            int i16 = bzpVar.j;
            int i17 = i10;
            int i18 = bzpVar.k;
            int length2 = bzpVar.c.length;
            if (iC4 > i16) {
                iC4 = -(((length2 - i18) - iC4) + 1);
            }
            iArr2[(iG3 * 5) + 4] = iC4;
            i14++;
            i9 = i15;
            i10 = i17;
        }
        int i19 = i6 + i5;
        int iF = bzpVar.f();
        int iA3 = defpackage.bzo.a(bzpVar.d, i6, iF);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iA3 < bzpVar.d.size() && (iA = bzpVar.a((bzhVar = (defpackage.bzh) bzpVar.d.get(iA3)))) >= i6 && iA < i19) {
            arrayList.add(bzhVar);
        }
        int i20 = i - i6;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            defpackage.bzh bzhVar2 = (defpackage.bzh) arrayList.get(i21);
            int iA4 = bzpVar.a(bzhVar2) + i20;
            if (iA4 >= bzpVar.f) {
                bzhVar2.a = -(iF - iA4);
            } else {
                bzhVar2.a = iA4;
            }
            bzpVar.d.add(defpackage.bzo.a(bzpVar.d, iA4, iF), bzhVar2);
        }
        if (bzpVar.U(i6, i5)) {
            defpackage.bvg.b("Unexpectedly removed anchors");
        }
        bzpVar.z(i2, bzpVar.p, i);
        if (i7 > 0) {
            bzpVar.H(i8, i7, i6 - 1);
        }
    }
}
