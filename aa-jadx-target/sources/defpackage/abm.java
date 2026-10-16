package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abm implements defpackage.cty {
    public final defpackage.abr a;
    public defpackage.cux[] b;
    public defpackage.cux[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final defpackage.affc h = new defpackage.aap(this, 4);
    private final defpackage.affc i = new defpackage.aap(this, 5);

    public abm(defpackage.abr abrVar) {
        this.a = abrVar;
    }

    @Override // defpackage.cty
    public final int a(defpackage.csz cszVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.csy) list.get(0)).c(i));
            int iAb = defpackage.afga.ab(list);
            if (iAb > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.csy) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAb) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cty
    public final int b(defpackage.csz cszVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.csy) list.get(0)).d(i));
            int iAb = defpackage.afga.ab(list);
            if (iAb > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.csy) list.get(i2)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAb) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cty
    public final int c(defpackage.csz cszVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.csy) list.get(0)).e(i));
            int iAb = defpackage.afga.ab(list);
            if (iAb > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.csy) list.get(i2)).e(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAb) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cty
    public final int d(defpackage.csz cszVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.csy) list.get(0)).f(i));
            int iAb = defpackage.afga.ab(list);
            if (iAb > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.csy) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAb) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        defpackage.afau afauVar;
        defpackage.abr abrVar = this.a;
        defpackage.cfu cfuVar = abrVar.b;
        int size = list.size();
        defpackage.cux[] cuxVarArr = new defpackage.cux[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            defpackage.ctx ctxVar = (defpackage.ctx) list.get(i);
            java.lang.Object objG = ctxVar.g();
            defpackage.abq abqVar = objG instanceof defpackage.abq ? (defpackage.abq) objG : null;
            if (abqVar != null && ((java.lang.Boolean) abqVar.a.a()).booleanValue()) {
                defpackage.cux cuxVarV = ctxVar.v(j);
                long j3 = ((long) cuxVarV.a) << 32;
                long j4 = ((long) cuxVarV.b) & 4294967295L;
                cuxVarArr[i] = cuxVarV;
                j2 = j4 | j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            defpackage.ctx ctxVar2 = (defpackage.ctx) list.get(i2);
            if (cuxVarArr[i2] == null) {
                cuxVarArr[i2] = ctxVar2.v(j);
            }
        }
        if (cubVar.dU()) {
            afauVar = new defpackage.afau(java.lang.Integer.valueOf((int) (j2 >> 32)), java.lang.Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                defpackage.cux cuxVar = cuxVarArr[i5];
                if (cuxVar != null) {
                    java.lang.Object objG2 = ((defpackage.ctx) list.get(i5)).g();
                    defpackage.abq abqVar2 = objG2 instanceof defpackage.abq ? (defpackage.abq) objG2 : null;
                    if (abqVar2 == null || !((java.lang.Boolean) abqVar2.b.a()).booleanValue()) {
                        int i6 = cuxVar.a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = cuxVar.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            afauVar = new defpackage.afau(java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
        }
        int iIntValue = ((java.lang.Number) afauVar.a).intValue();
        int iIntValue2 = ((java.lang.Number) afauVar.b).intValue();
        if (cubVar.dU()) {
            this.b = cuxVarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return cubVar.dS(iIntValue, iIntValue2, defpackage.afcf.a, this.h);
        }
        abrVar.d.b(new defpackage.dly((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = cuxVarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return cubVar.dS(iIntValue, iIntValue2, defpackage.afcf.a, this.i);
    }
}
