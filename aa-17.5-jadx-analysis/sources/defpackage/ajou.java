package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class ajou {
    public static final byte[] b = {13, 10};

    protected ajou() {
    }

    protected static final byte[] d(int i, ajot ajotVar) {
        byte[] bArr = ajotVar.b;
        if (bArr == null) {
            ajotVar.b = new byte[Math.max(i, 8192)];
            ajotVar.c = 0;
            ajotVar.d = 0;
        } else {
            int i2 = ajotVar.c + i;
            int length = bArr.length;
            if (i2 - length > 0) {
                int iMax = length + length;
                if (Integer.compare(iMax - Integer.MIN_VALUE, i2 - Integer.MIN_VALUE) < 0) {
                    iMax = i2;
                }
                if (Integer.compare(Integer.MIN_VALUE + iMax, -9) > 0) {
                    if (i2 < 0) {
                        throw new OutOfMemoryError("Unable to allocate array size: " + (i2 & 4294967295L));
                    }
                    iMax = Math.max(i2, 2147483639);
                }
                byte[] bArrCopyOf = Arrays.copyOf(ajotVar.b, iMax);
                ajotVar.b = bArrCopyOf;
                return bArrCopyOf;
            }
        }
        return ajotVar.b;
    }

    static final boolean e(ajot ajotVar) {
        return ajotVar.c > ajotVar.d;
    }

    public static final void f(byte[] bArr, int i, ajot ajotVar) {
        if (e(ajotVar)) {
            int iMin = Math.min(e(ajotVar) ? ajotVar.c - ajotVar.d : 0, i);
            System.arraycopy(ajotVar.b, ajotVar.d, bArr, 0, iMin);
            ajotVar.d += iMin;
            if (e(ajotVar)) {
                return;
            }
            ajotVar.d = 0;
            ajotVar.c = 0;
        }
    }

    public abstract void a(byte[] bArr, int i, ajot ajotVar);

    public abstract void b(byte[] bArr, int i, ajot ajotVar);

    public final byte[] c(byte[] bArr) {
        if (ahfz.a(bArr)) {
            return bArr;
        }
        int length = bArr.length;
        if (ahfz.a(bArr)) {
            return bArr;
        }
        ajot ajotVar = new ajot();
        b(bArr, length, ajotVar);
        b(bArr, -1, ajotVar);
        int i = ajotVar.c - ajotVar.d;
        byte[] bArr2 = new byte[i];
        f(bArr2, i, ajotVar);
        return bArr2;
    }
}
