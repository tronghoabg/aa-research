package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yrn extends defpackage.yrp {
    public final int[] a;
    public final int b;
    private final defpackage.yqy c;
    private final defpackage.yqy d;

    public yrn(defpackage.yqy yqyVar, defpackage.yqy yqyVar2) {
        int iH;
        this.c = yqyVar;
        this.d = yqyVar2;
        int iB = yqyVar2.b();
        if (iB > 28) {
            throw new java.lang.IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[iB];
        this.a = iArr;
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            defpackage.ypx ypxVarE = e(i);
            long j2 = ypxVarE.d | j;
            if (j2 != j || (iH = h(ypxVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = ypxVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(defpackage.ypx ypxVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (ypxVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.yrp
    public final int a() {
        return this.b;
    }

    @Override // defpackage.yrp
    public final java.lang.Object b(defpackage.ypx ypxVar) {
        defpackage.ysr.i(!ypxVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(ypxVar, iArr, this.b);
        if (iH >= 0) {
            return ypxVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.yrp
    public final java.util.Set c() {
        return new defpackage.yrl(this);
    }

    @Override // defpackage.yrp
    public final void d(defpackage.yrf yrfVar, java.lang.Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            defpackage.ypx ypxVarE = e(i2 & 31);
            if (ypxVarE.b) {
                yrfVar.b(ypxVarE, new yrm(this, ypxVarE, i2), obj);
            } else {
                yrfVar.a(ypxVarE, ypxVarE.c(f(i2)), obj);
            }
        }
    }

    public final defpackage.ypx e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final java.lang.Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
