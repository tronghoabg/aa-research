package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adoq implements defpackage.adnc {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private static boolean c(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    @Override // defpackage.adnc
    public final /* bridge */ /* synthetic */ java.lang.Object a(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return new java.lang.String(bArr, 0);
            }
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < length)) {
                java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length);
                int i2 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i2 >= length2) {
                        return new java.lang.String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), java.nio.charset.StandardCharsets.UTF_8);
                    }
                    int i3 = i2 + 1;
                    if (bArr[i2] == 37 && i2 + 2 < length2) {
                        try {
                            byteBufferAllocate.put((byte) java.lang.Integer.parseInt(new java.lang.String(bArr, i3, 2, java.nio.charset.StandardCharsets.US_ASCII), 16));
                            i2 += 3;
                        } catch (java.lang.NumberFormatException unused) {
                            byteBufferAllocate.put(bArr[i2]);
                            i2 = i3;
                        }
                    }
                    byteBufferAllocate.put(bArr[i2]);
                    i2 = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.adnc
    public final /* bridge */ /* synthetic */ byte[] b(java.lang.Object obj) {
        byte[] bytes = ((java.lang.String) obj).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            if (c(bytes[i])) {
                byte[] bArr = new byte[((length - i) * 3) + i];
                if (i != 0) {
                    java.lang.System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    int i3 = i2 + 1;
                    byte b = bytes[i];
                    if (c(b)) {
                        bArr[i2] = 37;
                        byte[] bArr2 = a;
                        bArr[i3] = bArr2[(b >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b;
                        i2 = i3;
                    }
                    i++;
                }
                return java.util.Arrays.copyOf(bArr, i2);
            }
            i++;
        }
    }
}
