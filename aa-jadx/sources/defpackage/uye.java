package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uye {
    private static final byte[] a = {0};

    public static byte[] a(byte[] bArr, int i) throws java.io.IOException {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr, 0, i);
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
            deflater.end();
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2) throws java.io.IOException {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        inflater.setInput(bArr, 0, i);
        try {
            try {
                byte[] bArr2 = new byte[i2];
                inflater.inflate(bArr2);
                inflater.end();
                return bArr2;
            } catch (java.util.zip.DataFormatException e) {
                throw new java.io.IOException(e);
            }
        } catch (java.lang.Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static void c(byte[] bArr, int i, defpackage.uya uyaVar) throws java.util.zip.DataFormatException {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        try {
            inflater.setInput(bArr, 0, i);
            uyaVar.d(i * 4);
            int iInflate = inflater.inflate(uyaVar.e(), 0, uyaVar.a());
            boolean z = false;
            while (!inflater.finished()) {
                int iA = uyaVar.a();
                uyaVar.d(iA + iA);
                int iInflate2 = inflater.inflate(uyaVar.e(), iInflate, uyaVar.a() - iInflate);
                if (iInflate2 == 0) {
                    if (!inflater.needsInput() || z) {
                        break;
                    }
                    inflater.setInput(a);
                    z = true;
                    iInflate2 = 0;
                }
                iInflate += iInflate2;
            }
            uyaVar.d(iInflate);
        } finally {
            inflater.end();
        }
    }
}
