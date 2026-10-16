package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ato implements defpackage.cty {
    private final /* synthetic */ int e;
    public static final defpackage.ato d = new defpackage.ato(3);
    public static final defpackage.ato c = new defpackage.ato(2);
    public static final defpackage.ato b = new defpackage.ato(1);
    public static final defpackage.ato a = new defpackage.ato(0);

    public ato(int i) {
        this.e = i;
    }

    @Override // defpackage.cty
    public final /* synthetic */ int a(defpackage.csz cszVar, java.util.List list, int i) {
        int i2 = this.e;
        if (i2 == 0) {
            return defpackage.tw.q(this, cszVar, list, i);
        }
        if (i2 != 1) {
            return i2 != 2 ? defpackage.tw.q(this, cszVar, list, i) : defpackage.tw.q(this, cszVar, list, i);
        }
        return defpackage.tw.q(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int b(defpackage.csz cszVar, java.util.List list, int i) {
        int i2 = this.e;
        if (i2 == 0) {
            return defpackage.tw.r(this, cszVar, list, i);
        }
        if (i2 != 1) {
            return i2 != 2 ? defpackage.tw.r(this, cszVar, list, i) : defpackage.tw.r(this, cszVar, list, i);
        }
        return defpackage.tw.r(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int c(defpackage.csz cszVar, java.util.List list, int i) {
        int i2 = this.e;
        if (i2 == 0) {
            return defpackage.tw.s(this, cszVar, list, i);
        }
        if (i2 != 1) {
            return i2 != 2 ? defpackage.tw.s(this, cszVar, list, i) : defpackage.tw.s(this, cszVar, list, i);
        }
        return defpackage.tw.s(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int d(defpackage.csz cszVar, java.util.List list, int i) {
        int i2 = this.e;
        if (i2 == 0) {
            return defpackage.tw.t(this, cszVar, list, i);
        }
        if (i2 != 1) {
            return i2 != 2 ? defpackage.tw.t(this, cszVar, list, i) : defpackage.tw.t(this, cszVar, list, i);
        }
        return defpackage.tw.t(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        int i = this.e;
        if (i == 0) {
            return cubVar.dS(defpackage.dlm.d(j), defpackage.dlm.c(j), defpackage.afcf.a, new defpackage.ajg(18));
        }
        if (i == 1) {
            return cubVar.dS(defpackage.dlm.d(j), defpackage.dlm.c(j), defpackage.afcf.a, new defpackage.ajg(2));
        }
        int i2 = 0;
        if (i == 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            while (i2 < size) {
                arrayList.add(((defpackage.ctx) list.get(i2)).v(j));
                i2++;
            }
            return cubVar.dS(defpackage.dlm.b(j), defpackage.dlm.a(j), defpackage.afcf.a, new defpackage.bbs(arrayList, 6));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        while (i2 < size2) {
            defpackage.cux cuxVarV = ((defpackage.ctx) list.get(i2)).v(j);
            iMax = java.lang.Math.max(iMax, cuxVarV.a);
            iMax2 = java.lang.Math.max(iMax2, cuxVarV.b);
            arrayList2.add(cuxVarV);
            i2++;
        }
        return cubVar.dS(iMax, iMax2, defpackage.afcf.a, new defpackage.bjm(arrayList2, 7));
    }
}
