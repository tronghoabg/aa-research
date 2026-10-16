package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vqk {
    int a;
    public volatile int b;
    private final int c;
    private final java.util.concurrent.atomic.AtomicReferenceArray d;
    private final int e;

    public vqk(int i) {
        this.c = i;
        this.d = new java.util.concurrent.atomic.AtomicReferenceArray(i);
        this.e = i > 0 ? (Integer.MAX_VALUE % i) + i + 1 : 0;
    }

    public final void a(defpackage.vqh vqhVar) {
        int i = this.c;
        if (i <= 0) {
            return;
        }
        int i2 = this.a;
        this.d.set(i2 % i, vqhVar);
        int i3 = i2 == Integer.MAX_VALUE ? this.e : i2 + 1;
        this.a = i3;
        this.b = i3;
    }

    public final defpackage.vqh[] b(int i, int i2) {
        if (i2 > 0) {
            int i3 = this.c;
            int iMax = java.lang.Math.max(i - java.lang.Math.min(i2, i3 - 1), 0);
            int i4 = i - iMax;
            if (i4 > 0) {
                defpackage.vqh[] vqhVarArr = new defpackage.vqh[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    vqhVarArr[i5] = (defpackage.vqh) this.d.get((i5 + iMax) % i3);
                }
                int i6 = this.b;
                int i7 = ((i6 >= i ? i6 - i : ((i6 - this.e) + 1) + (Integer.MAX_VALUE - i)) - (i3 - i4)) + 1;
                if (i7 < i4) {
                    if (i7 <= 0) {
                        return vqhVarArr;
                    }
                    int i8 = i4 - i7;
                    defpackage.vqh[] vqhVarArr2 = new defpackage.vqh[i8];
                    java.lang.System.arraycopy(vqhVarArr, i7, vqhVarArr2, 0, i8);
                    return vqhVarArr2;
                }
            }
        }
        return new defpackage.vqh[0];
    }
}
