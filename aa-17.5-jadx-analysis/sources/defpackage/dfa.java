package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class dfa implements afec {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ dfa(long j, float[] fArr, afft afftVar, affs affsVar, int i) {
        this.e = i;
        this.a = j;
        this.b = fArr;
        this.c = afftVar;
        this.d = affsVar;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        dgi dgiVar;
        float fA;
        float fA2;
        if (this.e != 0) {
            cxd cxdVar = (cxd) obj;
            cxdVar.q();
            izj izjVar = cxdVar.r().c;
            cjb cjbVar = (cjb) this.d;
            float f = cjbVar.b;
            float f2 = cjbVar.c;
            izjVar.l(f, f2);
            float f3 = -f2;
            float f4 = -f;
            try {
                czz.J(cxdVar, (cjj) ((affv) this.b).a, 0L, this.a, 0L, BitmapDescriptorFactory.HUE_RED, (cjw) this.c, 0, 890);
                cxdVar.r().c.l(f4, f3);
                return afak.a;
            } catch (Throwable th) {
                cxdVar.r().c.l(f4, f3);
                throw th;
            }
        }
        dfd dfdVar = (dfd) obj;
        int iMin = dfdVar.a;
        long j = this.a;
        long j2 = dfv.a;
        int i3 = (int) (j >> 32);
        int i4 = (int) (j & 4294967295L);
        if (iMin <= Math.min(i3, i4)) {
            iMin = Math.min(i3, i4);
        }
        int iMax = dfdVar.b;
        if (iMax >= Math.max(i3, i4)) {
            iMax = Math.max(i3, i4);
        }
        Object obj2 = this.c;
        long jT = czz.t(dfdVar.e(iMin), dfdVar.e(iMax));
        den denVar = dfdVar.g;
        dgi dgiVar2 = denVar.b;
        afft afftVar = (afft) obj2;
        int i5 = afftVar.a;
        int i6 = (int) (jT >> 32);
        int i7 = (int) (4294967295L & jT);
        int iMin2 = Math.min(i6, i7);
        int iMax2 = Math.max(i6, i7);
        int length = dgiVar2.o().length();
        if (iMin2 < 0) {
            dka.c("startOffset must be > 0");
        }
        if (iMin2 >= length) {
            dka.c("startOffset must be less than text length");
        }
        if (iMax2 <= iMin2) {
            dka.c("endOffset must be greater than startOffset");
        }
        if (iMax2 > length) {
            dka.c("endOffset must be smaller or equal to text length");
        }
        float[] fArr = (float[]) this.b;
        if (fArr.length - i5 < (iMax2 - iMin2) * 4) {
            dka.c("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iK = dgiVar2.k(iMin2);
        int iK2 = dgiVar2.k(iMax2 - 1);
        lfj lfjVar = new lfj(dgiVar2);
        if (iK <= iK2) {
            while (true) {
                int iL = dgiVar2.l(iK);
                int iJ = dgiVar2.j(iK);
                int iMax3 = Math.max(iMin2, iL);
                int iMin3 = Math.min(iMax2, iJ);
                float fD = dgiVar2.d(iK);
                float fB = dgiVar2.b(iK);
                int i8 = i5;
                int i9 = iMin2;
                if (dgiVar2.m(iK) == 1) {
                    i = i8;
                    z = true;
                } else {
                    i = i8;
                    z = false;
                }
                while (iMax3 < iMin3) {
                    int i10 = iMax3 + 1;
                    boolean zP = dgiVar2.p(iMax3);
                    if (!z) {
                        i2 = i;
                        z2 = true;
                    } else if (zP) {
                        i2 = i;
                        z2 = true;
                        zP = true;
                    } else {
                        dgiVar = dgiVar2;
                        i2 = i;
                        z2 = true;
                        fA = lfjVar.a(iMax3, false, false, true);
                        fA2 = lfjVar.a(i10, true, true, true);
                        fArr[i2] = fA;
                        fArr[i2 + 1] = fD;
                        fArr[i2 + 2] = fA2;
                        fArr[i2 + 3] = fB;
                        i = i2 + 4;
                        iMax3 = i10;
                        dgiVar2 = dgiVar;
                    }
                    dgiVar = dgiVar2;
                    if (z) {
                        fA2 = lfjVar.a(iMax3, false, false, false);
                        fA = lfjVar.a(i10, z2, z2, false);
                    } else if (zP) {
                        fA2 = lfjVar.a(iMax3, false, false, z2);
                        fA = lfjVar.a(i10, z2, z2, z2);
                    } else {
                        fA = lfjVar.a(iMax3, false, false, false);
                        fA2 = lfjVar.a(i10, z2, z2, false);
                    }
                    fArr[i2] = fA;
                    fArr[i2 + 1] = fD;
                    fArr[i2 + 2] = fA2;
                    fArr[i2 + 3] = fB;
                    i = i2 + 4;
                    iMax3 = i10;
                    dgiVar2 = dgiVar;
                }
                dgi dgiVar3 = dgiVar2;
                int i11 = i;
                if (iK == iK2) {
                    break;
                }
                iK++;
                i5 = i11;
                iMin2 = i9;
                dgiVar2 = dgiVar3;
            }
        }
        int iMax4 = afftVar.a + ((Math.max(i6, i7) - Math.min(i6, i7)) * 4);
        int i12 = afftVar.a;
        while (true) {
            Object obj3 = this.d;
            if (i12 >= iMax4) {
                afftVar.a = iMax4;
                ((affs) obj3).a += denVar.d;
                return afak.a;
            }
            int i13 = i12 + 1;
            float f5 = fArr[i13];
            float f6 = ((affs) obj3).a;
            fArr[i13] = f5 + f6;
            int i14 = i12 + 3;
            fArr[i14] = fArr[i14] + f6;
            i12 += 4;
        }
    }

    public /* synthetic */ dfa(cjb cjbVar, affv affvVar, long j, cjw cjwVar, int i) {
        this.e = i;
        this.d = cjbVar;
        this.b = affvVar;
        this.a = j;
        this.c = cjwVar;
    }
}
