package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajpu {
    public static final byte[] b = {13, 10};

    protected ajpu() {
    }

    protected static final byte[] d(int i, defpackage.ajpt ajptVar) {
        byte[] bArr = ajptVar.b;
        if (bArr == null) {
            ajptVar.b = new byte[java.lang.Math.max(i, 8192)];
            ajptVar.c = 0;
            ajptVar.d = 0;
        } else {
            int i2 = ajptVar.c + i;
            int length = bArr.length;
            if (i2 - length > 0) {
                int iMax = length + length;
                if (java.lang.Integer.compare(iMax - Integer.MIN_VALUE, i2 - Integer.MIN_VALUE) < 0) {
                    iMax = i2;
                }
                if (java.lang.Integer.compare(Integer.MIN_VALUE + iMax, -9) > 0) {
                    if (i2 < 0) {
                        throw new java.lang.OutOfMemoryError("Unable to allocate array size: " + (i2 & 4294967295L));
                    }
                    iMax = java.lang.Math.max(i2, 2147483639);
                }
                byte[] bArrCopyOf = java.util.Arrays.copyOf(ajptVar.b, iMax);
                ajptVar.b = bArrCopyOf;
                return bArrCopyOf;
            }
        }
        return ajptVar.b;
    }

    static final boolean e(defpackage.ajpt ajptVar) {
        return ajptVar.c > ajptVar.d;
    }

    public static final void f(byte[] bArr, int i, defpackage.ajpt ajptVar) {
        if (e(ajptVar)) {
            int iMin = java.lang.Math.min(e(ajptVar) ? ajptVar.c - ajptVar.d : 0, i);
            java.lang.System.arraycopy(ajptVar.b, ajptVar.d, bArr, 0, iMin);
            ajptVar.d += iMin;
            if (e(ajptVar)) {
                return;
            }
            ajptVar.d = 0;
            ajptVar.c = 0;
        }
    }

    public abstract void a(byte[] bArr, int i, defpackage.ajpt ajptVar);

    public abstract void b(byte[] bArr, int i, defpackage.ajpt ajptVar);

    public final byte[] c(byte[] bArr) {
        if (defpackage.aguo.a(bArr)) {
            return bArr;
        }
        int length = bArr.length;
        if (defpackage.aguo.a(bArr)) {
            return bArr;
        }
        defpackage.ajpt ajptVar = new defpackage.ajpt();
        b(bArr, length, ajptVar);
        b(bArr, -1, ajptVar);
        int i = ajptVar.c - ajptVar.d;
        byte[] bArr2 = new byte[i];
        f(bArr2, i, ajptVar);
        return bArr2;
    }
}
