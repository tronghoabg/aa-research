package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wby extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ defpackage.wca a;

    public wby(defpackage.wca wcaVar) {
        this.a = wcaVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.util.zip.Inflater inflater = this.a.a;
            int iInflate = inflater.inflate(bArr, i, i2);
            if (iInflate > 0) {
                return iInflate;
            }
            if (i2 == 0) {
                return 0;
            }
            if (inflater.getRemaining() == 0) {
                return -1;
            }
            throw new java.io.IOException("Read no bytes (requested up to " + i2 + ") but did not reach end of stream, had " + this.a.a.getRemaining());
        } catch (java.util.zip.DataFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }
}
