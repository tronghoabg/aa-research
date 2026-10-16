package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aeds extends java.io.InputStream implements j$.io.InputStreamRetargetInterface, adkv, adlv {
    public defpackage.abpy a;
    public final abqe b;
    private java.io.ByteArrayInputStream c;

    public aeds(defpackage.abpy abpyVar, abqe abqeVar) {
        this.a = abpyVar;
        this.b = abqeVar;
    }

    public final int a(java.io.OutputStream outputStream) throws java.io.IOException {
        defpackage.abpy abpyVar = this.a;
        if (abpyVar != null) {
            int iM = abpyVar.m();
            this.a.g(outputStream);
            this.a = null;
            return iM;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        defpackage.abol abolVar = defpackage.aedu.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        defpackage.abpy abpyVar = this.a;
        if (abpyVar != null) {
            return abpyVar.m();
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        defpackage.abpy abpyVar = this.a;
        if (abpyVar != null) {
            int iM = abpyVar.m();
            if (iM == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= iM) {
                defpackage.aboa aboaVar = new defpackage.aboa(bArr, i, iM, null);
                this.a.R(aboaVar);
                aboaVar.c();
                aboaVar.I();
                this.a = null;
                this.c = null;
                return iM;
            }
            this.c = new java.io.ByteArrayInputStream(this.a.h());
            this.a = null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        defpackage.abpy abpyVar = this.a;
        if (abpyVar != null) {
            this.c = new java.io.ByteArrayInputStream(abpyVar.h());
            this.a = null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
