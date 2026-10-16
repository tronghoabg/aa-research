package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class auu implements defpackage.cuf, defpackage.avz {
    public final defpackage.aue a;
    private final boolean b = true;
    private final defpackage.atb c;
    private final defpackage.ath d;
    private final float e;
    private final float f;
    private final int g;
    private final int h;
    private final defpackage.aus i;

    public auu(defpackage.atb atbVar, defpackage.ath athVar, float f, defpackage.aue aueVar, float f2, int i, int i2, defpackage.aus ausVar) {
        this.c = atbVar;
        this.d = athVar;
        this.e = f;
        this.a = aueVar;
        this.f = f2;
        this.g = i;
        this.h = i2;
        this.i = ausVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int k(java.util.List list, int i, int i2, int i3, int i4, int i5, defpackage.aus ausVar) {
        long jC;
        java.util.List list2 = list;
        int i6 = 0;
        if (list2.isEmpty()) {
            jC = defpackage.zl.c(0, 0);
        } else {
            int i7 = Integer.MAX_VALUE;
            long jD = defpackage.dln.d(0, i, 0, Integer.MAX_VALUE);
            defpackage.csy csyVar = (defpackage.csy) defpackage.afga.aC(list2, 0);
            int iE = csyVar != null ? csyVar.e(i) : 0;
            int iF = csyVar != null ? csyVar.f(iE) : 0;
            int i8 = iE;
            int i9 = iF;
            if (defpackage.ca.ar(list2.size() > 1, 0, defpackage.zl.c(i, Integer.MAX_VALUE), csyVar == null ? null : new defpackage.zl(defpackage.zl.c(iF, iE)), 0, 0, 0, false, false, i4, ausVar, jD, i5, i2, i3).b) {
                jC = defpackage.zl.c(0, 0);
            } else {
                int size = list2.size();
                int i10 = i;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = i8;
                int i17 = i9;
                int i18 = 0;
                while (i11 < size) {
                    int i19 = i10 - i17;
                    int i20 = i11 + 1;
                    int iMax = java.lang.Math.max(i12, i16);
                    defpackage.csy csyVar2 = (defpackage.csy) defpackage.afga.aC(list2, i20);
                    int iE2 = csyVar2 != null ? csyVar2.e(i) : i6;
                    int iF2 = csyVar2 != null ? csyVar2.f(iE2) + i2 : i6;
                    boolean z = i11 + 2 < list2.size() ? 1 : i6;
                    int i21 = i13;
                    int i22 = i14;
                    int i23 = i20 - i18;
                    int i24 = size;
                    long jC2 = defpackage.zl.c(i19, i7);
                    int i25 = iE2;
                    int i26 = iF2;
                    defpackage.aul aulVarAr = defpackage.ca.ar(z, i23, jC2, csyVar2 == null ? null : new defpackage.zl(defpackage.zl.c(iF2, iE2)), i21, i22, iMax, false, false, i4, ausVar, jD, i5, i2, i3);
                    if (aulVarAr.a) {
                        i14 = i22 + iMax + i3;
                        defpackage.ca.as(aulVarAr, ausVar);
                        int i27 = i26 - i2;
                        i13 = i21 + 1;
                        if (aulVarAr.b) {
                            i15 = i20;
                            break;
                        }
                        i18 = i20;
                        i10 = i;
                        i17 = i27;
                        i12 = 0;
                    } else {
                        i13 = i21;
                        i12 = iMax;
                        i14 = i22;
                        i10 = i19;
                        i17 = i26;
                    }
                    i11 = i20;
                    i15 = i11;
                    size = i24;
                    i16 = i25;
                    i7 = Integer.MAX_VALUE;
                    i6 = 0;
                    list2 = list;
                }
                jC = defpackage.zl.c(i14 - i3, i15);
            }
        }
        return defpackage.zl.a(jC);
    }

    @Override // defpackage.cuf
    public final int a(defpackage.csz cszVar, java.util.List list, int i) {
        java.util.List list2 = (java.util.List) defpackage.afga.aC(list, 1);
        defpackage.csy csyVar = list2 != null ? (defpackage.csy) defpackage.afga.aB(list2) : null;
        java.util.List list3 = (java.util.List) defpackage.afga.aC(list, 2);
        defpackage.csy csyVar2 = list3 != null ? (defpackage.csy) defpackage.afga.aB(list3) : null;
        defpackage.aus ausVar = this.i;
        ausVar.a(csyVar, csyVar2, defpackage.dln.d(0, i, 0, Integer.MAX_VALUE));
        java.util.List list4 = (java.util.List) defpackage.afga.aB(list);
        if (list4 == null) {
            list4 = defpackage.afce.a;
        }
        return k(list4, i, cszVar.dN(this.e), cszVar.dN(this.f), this.g, this.h, ausVar);
    }

    @Override // defpackage.cuf
    public final int b(defpackage.csz cszVar, java.util.List list, int i) {
        java.util.List list2 = (java.util.List) defpackage.afga.aC(list, 1);
        defpackage.csy csyVar = list2 != null ? (defpackage.csy) defpackage.afga.aB(list2) : null;
        java.util.List list3 = (java.util.List) defpackage.afga.aC(list, 2);
        this.i.a(csyVar, list3 != null ? (defpackage.csy) defpackage.afga.aB(list3) : null, defpackage.dln.d(0, Integer.MAX_VALUE, 0, i));
        java.util.List list4 = (java.util.List) defpackage.afga.aB(list);
        if (list4 == null) {
            list4 = defpackage.afce.a;
        }
        int iDN = cszVar.dN(this.e);
        int i2 = this.g;
        int size = list4.size();
        int i3 = 0;
        int iMax = 0;
        int iD = 0;
        int i4 = 0;
        while (i3 < size) {
            iD += ((defpackage.csy) list4.get(i3)).d(i) + iDN;
            int i5 = i3 + 1;
            if (i5 - i4 == i2 || i5 == list4.size()) {
                iMax = java.lang.Math.max(iMax, iD - iDN);
                i4 = i3;
                iD = 0;
            }
            i3 = i5;
        }
        return iMax;
    }

    @Override // defpackage.cuf
    public final int c(defpackage.csz cszVar, java.util.List list, int i) {
        java.util.List list2 = (java.util.List) defpackage.afga.aC(list, 1);
        defpackage.csy csyVar = list2 != null ? (defpackage.csy) defpackage.afga.aB(list2) : null;
        java.util.List list3 = (java.util.List) defpackage.afga.aC(list, 2);
        defpackage.csy csyVar2 = list3 != null ? (defpackage.csy) defpackage.afga.aB(list3) : null;
        defpackage.aus ausVar = this.i;
        ausVar.a(csyVar, csyVar2, defpackage.dln.d(0, i, 0, Integer.MAX_VALUE));
        java.util.List list4 = (java.util.List) defpackage.afga.aB(list);
        if (list4 == null) {
            list4 = defpackage.afce.a;
        }
        return k(list4, i, cszVar.dN(this.e), cszVar.dN(this.f), this.g, this.h, ausVar);
    }

    @Override // defpackage.cuf
    public final int d(defpackage.csz cszVar, java.util.List list, int i) {
        int i2;
        int i3;
        int[] iArr;
        java.util.List list2;
        defpackage.aus ausVar;
        long jC;
        defpackage.zl zlVar;
        java.util.List list3 = (java.util.List) defpackage.afga.aC(list, 1);
        defpackage.csy csyVar = list3 != null ? (defpackage.csy) defpackage.afga.aB(list3) : null;
        char c = 2;
        java.util.List list4 = (java.util.List) defpackage.afga.aC(list, 2);
        defpackage.csy csyVar2 = list4 != null ? (defpackage.csy) defpackage.afga.aB(list4) : null;
        defpackage.aus ausVar2 = this.i;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        ausVar2.a(csyVar, csyVar2, defpackage.dln.d(0, Integer.MAX_VALUE, 0, i));
        java.util.List list5 = (java.util.List) defpackage.afga.aB(list);
        if (list5 == null) {
            list5 = defpackage.afce.a;
        }
        int iDN = cszVar.dN(this.e);
        int iDN2 = cszVar.dN(this.f);
        int i6 = this.h;
        int i7 = this.g;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        int i8 = 0;
        while (i8 < size3) {
            defpackage.csy csyVar3 = (defpackage.csy) list5.get(i8);
            char c2 = c;
            int iF = csyVar3.f(i);
            iArr2[i8] = iF;
            iArr3[i8] = csyVar3.e(iF);
            i8++;
            c = c2;
        }
        int i9 = (i6 == Integer.MAX_VALUE || i7 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i7 * i6;
        if (i9 < list5.size()) {
            int i10 = ausVar2.c;
        }
        if (i9 >= list5.size()) {
            int i11 = ausVar2.c;
        }
        int iMin = java.lang.Math.min(i9, list5.size());
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += iArr2[i13];
        }
        int size4 = i12 + ((list5.size() - 1) * iDN);
        if (size2 == 0) {
            throw new java.util.NoSuchElementException();
        }
        int i14 = iArr3[0];
        int iBF = defpackage.afga.bF(iArr3);
        if (iBF > 0) {
            int i15 = 1;
            while (true) {
                int i16 = iArr3[i15];
                if (i14 < i16) {
                    i14 = i16;
                }
                if (i15 == iBF) {
                    break;
                }
                i15++;
            }
        }
        if (size == 0) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = iArr2[0];
        int iBF2 = defpackage.afga.bF(iArr2);
        if (iBF2 > 0) {
            int i18 = 1;
            while (true) {
                int i19 = iArr2[i18];
                if (i17 < i19) {
                    i17 = i19;
                }
                if (i18 == iBF2) {
                    break;
                }
                i18++;
            }
        }
        int i20 = size4;
        while (i17 <= i20 && i14 != i) {
            int i21 = (i17 + i20) / 2;
            if (list5.isEmpty()) {
                jC = defpackage.zl.c(i4, i4);
                i2 = i7;
                i3 = i6;
                list2 = list5;
                ausVar = ausVar2;
                iArr = iArr3;
            } else {
                long jD = defpackage.dln.d(i4, i21, i4, i5);
                defpackage.csy csyVar4 = (defpackage.csy) defpackage.afga.aC(list5, i4);
                int i22 = csyVar4 != null ? iArr3[i4] : i4;
                int i23 = csyVar4 != null ? iArr2[i4] : i4;
                i2 = i7;
                defpackage.aus ausVar3 = ausVar2;
                int i24 = i22;
                int i25 = i23;
                i3 = i6;
                int[] iArr4 = iArr3;
                if (defpackage.ca.ar(list5.size() > 1, 0, defpackage.zl.c(i21, Integer.MAX_VALUE), csyVar4 == null ? null : new defpackage.zl(defpackage.zl.c(i23, i22)), 0, 0, 0, false, false, i2, ausVar3, jD, i3, iDN, iDN2).b) {
                    jC = defpackage.zl.c(0, 0);
                    iArr = iArr4;
                    list2 = list5;
                    ausVar = ausVar3;
                } else {
                    int size5 = list5.size();
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = i21;
                    int i32 = i24;
                    int i33 = 0;
                    while (true) {
                        if (i26 >= size5) {
                            iArr = iArr4;
                            list2 = list5;
                            ausVar = ausVar3;
                            break;
                        }
                        int i34 = i31 - i25;
                        int i35 = i26 + 1;
                        int iMax = java.lang.Math.max(i27, i32);
                        defpackage.csy csyVar5 = (defpackage.csy) defpackage.afga.aC(list5, i35);
                        int i36 = csyVar5 != null ? iArr4[i35] : 0;
                        int i37 = csyVar5 != null ? iArr2[i35] + iDN : 0;
                        iArr = iArr4;
                        boolean z = i26 + 2 < list5.size();
                        int i38 = i35 - i33;
                        list2 = list5;
                        int i39 = i34;
                        long jC2 = defpackage.zl.c(i39, Integer.MAX_VALUE);
                        if (csyVar5 == null) {
                            zlVar = null;
                        } else {
                            zlVar = new defpackage.zl(defpackage.zl.c(i37, i36));
                            i39 = i39;
                        }
                        int i40 = i36;
                        defpackage.zl zlVar2 = zlVar;
                        int i41 = size5;
                        defpackage.aul aulVarAr = defpackage.ca.ar(z, i38, jC2, zlVar2, i29, i30, iMax, false, false, i2, ausVar3, jD, i3, iDN, iDN2);
                        ausVar = ausVar3;
                        if (aulVarAr.a) {
                            i30 += iMax + iDN2;
                            defpackage.ca.as(aulVarAr, ausVar);
                            int i42 = i37 - iDN;
                            i29++;
                            if (aulVarAr.b) {
                                i28 = i35;
                                break;
                            }
                            i33 = i35;
                            i37 = i42;
                            i31 = i21;
                            i27 = 0;
                        } else {
                            i27 = iMax;
                            i31 = i39;
                        }
                        i28 = i35;
                        size5 = i41;
                        i32 = i40;
                        ausVar3 = ausVar;
                        list5 = list2;
                        i25 = i37;
                        i26 = i28;
                        iArr4 = iArr;
                    }
                    jC = defpackage.zl.c(i30 - iDN2, i28);
                }
            }
            int iA = defpackage.zl.a(jC);
            if (iA > i || defpackage.zl.b(jC) < iMin) {
                i17 = i21 + 1;
                if (i17 > i20) {
                    return i17;
                }
            } else {
                if (iA >= i) {
                    return i21;
                }
                i20 = i21 - 1;
            }
            iArr3 = iArr;
            size4 = i21;
            ausVar2 = ausVar;
            i6 = i3;
            list5 = list2;
            i4 = 0;
            i5 = Integer.MAX_VALUE;
            i14 = iA;
            i7 = i2;
        }
        return size4;
    }

    @Override // defpackage.cuf
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        int i;
        defpackage.ca caVar;
        java.util.ArrayList arrayList;
        java.lang.Integer num;
        defpackage.zl zlVar;
        defpackage.zm zmVar;
        defpackage.zm zmVar2;
        int i2;
        int i3;
        int i4 = this.h;
        if (i4 != 0 && (i = this.g) != 0 && !list.isEmpty()) {
            if (defpackage.dlm.a(j) != 0) {
                java.util.List list2 = (java.util.List) defpackage.afga.az(list);
                if (list2.isEmpty()) {
                    return cubVar.dS(0, 0, defpackage.afcf.a, new defpackage.awl(1));
                }
                java.util.List list3 = (java.util.List) defpackage.afga.aC(list, 1);
                defpackage.ctx ctxVar = list3 != null ? (defpackage.ctx) defpackage.afga.aB(list3) : null;
                java.util.List list4 = (java.util.List) defpackage.afga.aC(list, 2);
                defpackage.ctx ctxVar2 = list4 != null ? (defpackage.ctx) defpackage.afga.aB(list4) : null;
                list2.size();
                defpackage.aus ausVar = this.i;
                long jD = defpackage.dln.d(defpackage.dlm.d(j), defpackage.dlm.b(j), defpackage.dlm.c(j), defpackage.dlm.a(j));
                long jD2 = defpackage.dln.d((10 & 1) != 0 ? defpackage.dlm.d(jD) : 0, (10 & 2) != 0 ? defpackage.dlm.b(jD) : 0, (10 & 4) != 0 ? defpackage.dlm.c(jD) : 0, defpackage.dlm.a(jD));
                long jD3 = defpackage.dln.d(defpackage.dlm.d(jD2), defpackage.dlm.b(jD2), defpackage.dlm.c(jD2), defpackage.dlm.a(jD2));
                if (ctxVar != null) {
                    defpackage.ca.aq(ctxVar, jD3, new defpackage.aun(ausVar, 3));
                    ausVar.a = ctxVar;
                }
                if (ctxVar2 != null) {
                    defpackage.ca.aq(ctxVar2, jD3, new defpackage.aun(ausVar, 4));
                    ausVar.b = ctxVar2;
                }
                java.util.Iterator it = list2.iterator();
                float f = this.e;
                float f2 = this.f;
                long jD4 = defpackage.dln.d(defpackage.dlm.d(j), defpackage.dlm.b(j), defpackage.dlm.c(j), defpackage.dlm.a(j));
                defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.ctz[16]);
                int iB = defpackage.dlm.b(jD4);
                int iD = defpackage.dlm.d(jD4);
                int iA = defpackage.dlm.a(jD4);
                defpackage.zo zoVar = defpackage.zp.a;
                defpackage.zo zoVar2 = new defpackage.zo(6);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                float fCeil = (float) java.lang.Math.ceil(cubVar.dI(f));
                float fCeil2 = (float) java.lang.Math.ceil(cubVar.dI(f2));
                long jD5 = defpackage.dln.d(0, iB, 0, iA);
                long jD6 = defpackage.dln.d((10 & 1) != 0 ? defpackage.dlm.d(jD5) : 0, (10 & 2) != 0 ? defpackage.dlm.b(jD5) : 0, (10 & 4) != 0 ? defpackage.dlm.c(jD5) : 0, defpackage.dlm.a(jD5));
                long jD7 = defpackage.dln.d(defpackage.dlm.d(jD6), defpackage.dlm.b(jD6), defpackage.dlm.c(jD6), defpackage.dlm.a(jD6));
                defpackage.afgv afgvVar = new defpackage.afgv();
                if (it instanceof defpackage.aua) {
                    cubVar.dG(iB);
                    cubVar.dG(iA);
                    caVar = new defpackage.ca();
                } else {
                    caVar = null;
                }
                defpackage.ctx ctxVarBm = !it.hasNext() ? null : defpackage.ca.bm(it, caVar);
                defpackage.zl zlVar2 = ctxVarBm != null ? new defpackage.zl(defpackage.ca.aq(ctxVarBm, jD7, new defpackage.aun(afgvVar, 0))) : null;
                java.lang.Integer numValueOf = zlVar2 != null ? java.lang.Integer.valueOf(defpackage.zl.a(zlVar2.a)) : null;
                java.lang.Integer numValueOf2 = zlVar2 != null ? java.lang.Integer.valueOf(defpackage.zl.b(zlVar2.a)) : null;
                int i5 = (int) fCeil2;
                int i6 = (int) fCeil;
                defpackage.zl zlVar3 = zlVar2;
                defpackage.zm zmVar3 = new defpackage.zm(16);
                defpackage.ctx ctxVar3 = ctxVarBm;
                defpackage.zm zmVar4 = new defpackage.zm(16);
                int[] iArr = defpackage.zr.a;
                defpackage.zq zqVar = new defpackage.zq(6);
                defpackage.aul aulVarAr = defpackage.ca.ar(it.hasNext(), 0, defpackage.zl.c(iB, iA), zlVar3, 0, 0, 0, false, false, i, ausVar, jD4, i4, i6, i5);
                java.lang.Integer num2 = numValueOf2;
                int i7 = i;
                if (aulVarAr.b) {
                    defpackage.ca.as(aulVarAr, ausVar);
                }
                defpackage.zq zqVar2 = zqVar;
                int iMax = iD;
                int i8 = iA;
                defpackage.zm zmVar5 = zmVar4;
                defpackage.aus ausVar2 = ausVar;
                int i9 = iB;
                defpackage.aul aulVar = aulVarAr;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                defpackage.ctx ctxVar4 = ctxVar3;
                java.lang.Integer num3 = numValueOf;
                defpackage.zm zmVar6 = zmVar3;
                int i15 = 0;
                while (!aulVar.b && ctxVar4 != null) {
                    num3.getClass();
                    int iIntValue = num3.intValue();
                    num2.getClass();
                    int i16 = i11 + iIntValue;
                    int i17 = iB;
                    int iMax2 = java.lang.Math.max(i15, num2.intValue());
                    int i18 = i9 - iIntValue;
                    arrayList2.add(ctxVar4);
                    zoVar2.g(i10, afgvVar.a);
                    java.lang.Object objG = ctxVar4.g();
                    if (objG instanceof defpackage.awa) {
                    }
                    i10++;
                    int i19 = i10 - i14;
                    boolean z = i19 < i7;
                    if (caVar != null) {
                        if (z) {
                            int i20 = i18 - i6;
                            arrayList = arrayList2;
                            i2 = i20 < 0 ? 0 : i20;
                        } else {
                            arrayList = arrayList2;
                            i2 = i17;
                        }
                        cubVar.dG(i2);
                        if (z) {
                            i3 = i8;
                        } else {
                            i3 = (i8 - iMax2) - i5;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                        }
                        cubVar.dG(i3);
                    } else {
                        arrayList = arrayList2;
                    }
                    defpackage.ctx ctxVarBm2 = !it.hasNext() ? null : defpackage.ca.bm(it, caVar);
                    afgvVar.a = null;
                    defpackage.zl zlVar4 = ctxVarBm2 != null ? new defpackage.zl(defpackage.ca.aq(ctxVarBm2, jD7, new defpackage.aun(afgvVar, 2))) : null;
                    java.lang.Integer numValueOf3 = zlVar4 != null ? java.lang.Integer.valueOf(defpackage.zl.a(zlVar4.a) + i6) : null;
                    java.lang.Integer numValueOf4 = zlVar4 != null ? java.lang.Integer.valueOf(defpackage.zl.b(zlVar4.a)) : null;
                    defpackage.zl zlVar5 = zlVar4;
                    boolean zHasNext = it.hasNext();
                    long jC = defpackage.zl.c(i18, i8);
                    if (zlVar5 == null) {
                        num = numValueOf4;
                        zlVar = null;
                    } else {
                        numValueOf3.getClass();
                        int iIntValue2 = numValueOf3.intValue();
                        numValueOf4.getClass();
                        num = numValueOf4;
                        zlVar = new defpackage.zl(defpackage.zl.c(iIntValue2, num.intValue()));
                    }
                    int i21 = i7;
                    defpackage.aul aulVarAr2 = defpackage.ca.ar(zHasNext, i19, jC, zlVar, i12, i13, iMax2, false, false, i21, ausVar2, jD4, i4, i6, i5);
                    defpackage.aus ausVar3 = ausVar2;
                    if (aulVarAr2.a) {
                        iB = i17;
                        int iMin = java.lang.Math.min(java.lang.Math.max(iMax, i16), iB);
                        int i22 = i13 + iMax2;
                        defpackage.ca.as(aulVarAr2, ausVar3);
                        zmVar2 = zmVar5;
                        zmVar2.e(iMax2);
                        int i23 = (iA - i22) - i5;
                        zmVar = zmVar6;
                        zmVar.e(i10);
                        i12++;
                        i13 = i22 + i5;
                        i8 = i23;
                        numValueOf3 = numValueOf3 != 0 ? java.lang.Integer.valueOf(numValueOf3.intValue() - i6) : null;
                        i14 = i10;
                        i9 = iB;
                        i15 = 0;
                        i11 = 0;
                        iMax = iMin;
                    } else {
                        zmVar = zmVar6;
                        zmVar2 = zmVar5;
                        iB = i17;
                        i11 = i16;
                        i9 = i18;
                        i15 = iMax2;
                    }
                    aulVar = aulVarAr2;
                    ausVar2 = ausVar3;
                    zmVar5 = zmVar2;
                    zmVar6 = zmVar;
                    i7 = i21;
                    it = it;
                    jD7 = jD7;
                    afgvVar = afgvVar;
                    ctxVar4 = ctxVarBm2;
                    num2 = num;
                    arrayList2 = arrayList;
                    num3 = numValueOf3;
                }
                java.util.ArrayList arrayList3 = arrayList2;
                defpackage.zm zmVar7 = zmVar6;
                defpackage.zm zmVar8 = zmVar5;
                int size = arrayList3.size();
                defpackage.cux[] cuxVarArr = new defpackage.cux[size];
                for (int i24 = 0; i24 < size; i24++) {
                    cuxVarArr[i24] = (defpackage.cux) zoVar2.a(i24);
                }
                int i25 = zmVar7.b;
                int[] iArr2 = new int[i25];
                int[] iArr3 = new int[i25];
                defpackage.auq auqVar = new defpackage.auq(cubVar);
                int[] iArr4 = zmVar7.a;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i27 < i25) {
                    int i29 = iArr4[i27];
                    int iA2 = zmVar8.a(i27);
                    defpackage.zq zqVar3 = zqVar2;
                    if (!zqVar3.a(i27)) {
                        iA2 = defpackage.dlm.a(jD5) == Integer.MAX_VALUE ? Integer.MAX_VALUE : defpackage.dlm.a(jD5) - i28;
                    }
                    zqVar2 = zqVar3;
                    int[] iArr5 = iArr4;
                    int[] iArr6 = iArr3;
                    int i30 = iMax;
                    defpackage.ctz ctzVarB = defpackage.asq.B(this, i30, defpackage.dlm.c(jD5), defpackage.dlm.b(jD5), iA2, i6, auqVar, arrayList3, cuxVarArr, i26, i29, iArr2, i27);
                    int iC = ctzVarB.c();
                    int iB2 = ctzVarB.b();
                    iArr6[i27] = iB2;
                    i28 += iB2;
                    iMax = java.lang.Math.max(i30, iC);
                    bzcVar.n(ctzVarB);
                    i27++;
                    i26 = i29;
                    iArr3 = iArr6;
                    i25 = i25;
                    iArr4 = iArr5;
                    zmVar8 = zmVar8;
                }
                int[] iArr7 = iArr3;
                int i31 = iMax;
                int i32 = bzcVar.b;
                int i33 = i32 == 0 ? 0 : i28;
                if (i32 == 0) {
                    i31 = 0;
                }
                defpackage.ath athVar = this.d;
                int iDN = cubVar.dN(athVar.a()) * (bzcVar.b - 1);
                int iC2 = defpackage.dlm.c(jD4);
                int iA3 = defpackage.dlm.a(jD4);
                int i34 = i33 + iDN;
                if (i34 >= iC2) {
                    iC2 = i34;
                }
                if (iC2 <= iA3) {
                    iA3 = iC2;
                }
                athVar.c(cubVar, iA3, iArr7, iArr2);
                int iD2 = defpackage.dlm.d(jD4);
                int iB3 = defpackage.dlm.b(jD4);
                defpackage.aun aunVar = new defpackage.aun(bzcVar, 1);
                if (i31 < iD2) {
                    i31 = iD2;
                }
                if (i31 <= iB3) {
                    iB3 = i31;
                }
                return cubVar.dS(iB3, iA3, defpackage.afcf.a, aunVar);
            }
            int i35 = this.i.c;
        }
        return cubVar.dS(0, 0, defpackage.afcf.a, new defpackage.ajg(20));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.auu)) {
            return false;
        }
        defpackage.auu auuVar = (defpackage.auu) obj;
        boolean z = auuVar.b;
        return defpackage.afga.f(this.c, auuVar.c) && defpackage.afga.f(this.d, auuVar.d) && java.lang.Float.compare(this.e, auuVar.e) == 0 && defpackage.afga.f(this.a, auuVar.a) && java.lang.Float.compare(this.f, auuVar.f) == 0 && this.g == auuVar.g && this.h == auuVar.h && defpackage.afga.f(this.i, auuVar.i);
    }

    @Override // defpackage.avz
    public final /* synthetic */ int f(defpackage.cux cuxVar) {
        return cuxVar.dK();
    }

    @Override // defpackage.avz
    public final /* synthetic */ int g(defpackage.cux cuxVar) {
        return cuxVar.x();
    }

    @Override // defpackage.avz
    public final /* synthetic */ defpackage.ctz h(final defpackage.cux[] cuxVarArr, defpackage.cub cubVar, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final defpackage.dlz dlzVar = defpackage.dlz.a;
        return cubVar.dS(i2, i3, defpackage.afcf.a, new defpackage.affc() { // from class: aut
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                defpackage.aue aueVar;
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    defpackage.cux cuxVar = cuxVarArr[i9];
                    cuxVar.getClass();
                    defpackage.awa awaVarD = defpackage.asq.D(cuxVar);
                    if (awaVarD == null || (aueVar = awaVarD.c) == null) {
                        aueVar = this.a;
                    }
                    cuwVar.r(cuxVar, iArr[i9 - i8], aueVar.a(i3, cuxVar.dK(), dlzVar, cuxVar, i) + i7, 0.0f);
                }
                return defpackage.afbk.a;
            }
        });
    }

    public final int hashCode() {
        return ((((((((((((((this.c.hashCode() + 38161) * 31) + this.d.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + this.a.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + this.g) * 31) + this.h) * 31) + 1922;
    }

    @Override // defpackage.avz
    public final /* synthetic */ void i(int i, int[] iArr, int[] iArr2, defpackage.cub cubVar) {
        this.c.b(cubVar, i, iArr, cubVar.p(), iArr2);
    }

    @Override // defpackage.avz
    public final /* synthetic */ long j(int i, int i2, int i3, boolean z) {
        return defpackage.awb.b(z, i, i2, i3);
    }

    public final java.lang.String toString() {
        float f = this.f;
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.c + ", verticalArrangement=" + this.d + ", mainAxisSpacing=" + defpackage.dlr.b(this.e) + ", crossAxisAlignment=" + this.a + ", crossAxisArrangementSpacing=" + defpackage.dlr.b(f) + ", maxItemsInMainAxis=" + this.g + ", maxLines=" + this.h + ", overflow=" + this.i + ")";
    }
}
