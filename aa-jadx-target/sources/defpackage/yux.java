package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yux {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.yuw();
    }

    public static long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static void b(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
        bArr.getClass();
        int i3 = 0;
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("len (%s) cannot be negative", java.lang.Integer.valueOf(i2)));
        }
        defpackage.ysr.bi(i, i + i2, bArr.length);
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            } else {
                i3 += i4;
            }
        }
        if (i3 != i2) {
            throw new java.io.EOFException(defpackage.a.bz(i2, i3, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static byte[] c(java.io.InputStream inputStream) throws java.io.IOException {
        return d(inputStream, new java.util.ArrayDeque(20), 0);
    }

    public static byte[] d(java.io.InputStream inputStream, java.util.Queue queue, int i) throws java.io.IOException {
        int iHighestOneBit = java.lang.Integer.highestOneBit(i);
        int iMin = java.lang.Math.min(8192, java.lang.Math.max(128, iHighestOneBit + iHighestOneBit));
        while (i < 2147483639) {
            int iMin2 = java.lang.Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return e(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = defpackage.ysr.cO(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return e(queue, 2147483639);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] e(java.util.Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = java.lang.Math.min(i2, bArr2.length);
            java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
            i2 -= iMin;
        }
        return bArrCopyOf;
    }
}
