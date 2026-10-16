package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abu implements defpackage.cty {
    private final defpackage.acc a;
    private boolean b;

    public abu(defpackage.acc accVar) {
        this.a = accVar;
    }

    @Override // defpackage.cty
    public final int a(defpackage.csz cszVar, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = ((defpackage.csy) list.get(0)).c(i);
        int iAb = defpackage.afga.ab(list);
        if (iAb > 0) {
            int i2 = 1;
            while (true) {
                int iC2 = ((defpackage.csy) list.get(i2)).c(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == iAb) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    @Override // defpackage.cty
    public final int b(defpackage.csz cszVar, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((defpackage.csy) list.get(0)).d(i);
        int iAb = defpackage.afga.ab(list);
        if (iAb > 0) {
            int i2 = 1;
            while (true) {
                int iD2 = ((defpackage.csy) list.get(i2)).d(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == iAb) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // defpackage.cty
    public final int c(defpackage.csz cszVar, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE = ((defpackage.csy) list.get(0)).e(i);
        int iAb = defpackage.afga.ab(list);
        if (iAb > 0) {
            int i2 = 1;
            while (true) {
                int iE2 = ((defpackage.csy) list.get(i2)).e(i);
                if (iE2 > iE) {
                    iE = iE2;
                }
                if (i2 == iAb) {
                    break;
                }
                i2++;
            }
        }
        return iE;
    }

    @Override // defpackage.cty
    public final int d(defpackage.csz cszVar, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((defpackage.csy) list.get(0)).f(i);
        int iAb = defpackage.afga.ab(list);
        if (iAb > 0) {
            int i2 = 1;
            while (true) {
                int iF2 = ((defpackage.csy) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == iAb) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            defpackage.cux cuxVarV = ((defpackage.ctx) list.get(i)).v(j);
            iMax2 = java.lang.Math.max(iMax2, cuxVarV.a);
            iMax = java.lang.Math.max(iMax, cuxVarV.b);
            arrayList.add(cuxVarV);
        }
        if (cubVar.dU()) {
            this.b = true;
            this.a.b.b(new defpackage.dly((((long) iMax2) << 32) | (4294967295L & ((long) iMax))));
        } else if (!this.b) {
            this.a.b.b(new defpackage.dly((((long) iMax2) << 32) | (4294967295L & ((long) iMax))));
        }
        return cubVar.dS(iMax2, iMax, defpackage.afcf.a, new defpackage.aap(arrayList, 8));
    }
}
