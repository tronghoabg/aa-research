package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uip extends ukd {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final ujo e;
    public final toc f;
    public final uks g;
    public final int[] h;
    public final int[] i;
    public final ukf j;
    public final int k;
    public final abiy l;
    public final abhw m;
    public final boolean n;
    public final yfy o;
    public final tzv p;
    public final abbb q;
    public final boolean r;
    public final yfh s;

    public uip(float f, float f2, int i, int i2, ujo ujoVar, toc tocVar, uks uksVar, int[] iArr, int[] iArr2, uju ujuVar, int i3, ukf ukfVar, int i4, tzv tzvVar, yfh yfhVar, abiy abiyVar, yfy yfyVar, abbb abbbVar, abhw abhwVar, boolean z, boolean z2) {
        super(ujuVar, i3);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = ujoVar;
        this.f = tocVar;
        this.g = uksVar;
        this.h = iArr;
        this.i = iArr2;
        this.j = ukfVar;
        this.k = i4;
        this.p = tzvVar;
        this.s = yfhVar;
        this.l = abiyVar;
        this.o = yfyVar;
        this.q = abbbVar;
        this.m = abhwVar;
        this.r = z;
        this.n = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uip d(defpackage.abax r38, defpackage.tof r39, defpackage.ujx r40, defpackage.ukq r41, boolean r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uip.d(abax, tof, ujx, ukq, boolean):uip");
    }

    public static boolean i(abiy abiyVar) {
        return !abiyVar.e.isEmpty();
    }

    @Override // defpackage.ukd
    public final int a() {
        return 3;
    }

    @Override // defpackage.ukd
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ukd
    public final int c() {
        return this.d;
    }

    public final Boolean e() {
        return Boolean.valueOf(this.r);
    }

    public final List f() {
        int[] iArr;
        int[] iArr2;
        int i;
        ArrayList arrayList = new ArrayList();
        uks uksVar = this.g;
        int i2 = uksVar.g / 2;
        if (i2 >= 2 && (iArr = this.i) != null && (iArr2 = this.h) != null) {
            too tooVarE = uksVar.e(0);
            int i3 = iArr.length <= 0 ? -1 : iArr[0];
            int i4 = uksVar.j;
            int i5 = uksVar.h;
            int i6 = uksVar.i;
            top topVar = new top(16, i4, i5, i6);
            int length = iArr2.length;
            int i7 = length <= 0 ? -1 : iArr2[0];
            if (i7 == 0) {
                i7 = length <= 1 ? -1 : iArr2[1];
                i = 1;
            } else {
                topVar.c(tooVarE);
                i = 0;
            }
            int i8 = 1;
            int i9 = i7;
            int i10 = i;
            top topVar2 = topVar;
            int i11 = i3;
            too tooVar = tooVarE;
            int i12 = 0;
            while (i8 < i2) {
                too tooVarE2 = uksVar.e(i8);
                if (tooVar == null) {
                    tooVar = tooVarE2;
                }
                uks uksVar2 = uksVar;
                int i13 = i8 + 1;
                if (i11 == i13) {
                    i12++;
                    i11 = i12 >= iArr.length ? -1 : iArr[i12];
                    topVar2.c(tooVarE2);
                    if (i9 == i8) {
                        i10++;
                        i9 = i10 >= iArr2.length ? -1 : iArr2[i10];
                    } else {
                        topVar2.c(tooVar);
                    }
                    if (topVar2.b > 1) {
                        arrayList.add(topVar2.a());
                    }
                    tooVar = null;
                    topVar2 = new top(16, i4, i5, i6);
                } else if (i9 == i8) {
                    i10++;
                    topVar2.c(tooVarE2);
                    int i14 = i10 >= iArr2.length ? -1 : iArr2[i10];
                    if (topVar2.b > 1) {
                        arrayList.add(topVar2.a());
                    }
                    topVar2 = new top(16, i4, i5, i6);
                    i9 = i14;
                } else {
                    topVar2.c(tooVarE2);
                }
                i8 = i13;
                uksVar = uksVar2;
            }
            if (i9 == -1 && tooVar != null) {
                topVar2.c(tooVar);
            }
            if (topVar2.b > 1) {
                arrayList.add(topVar2.a());
            }
        }
        return arrayList;
    }

    public final boolean g() {
        return this.i != null;
    }

    public final boolean h() {
        return uqw.x(this.k, 4);
    }
}
