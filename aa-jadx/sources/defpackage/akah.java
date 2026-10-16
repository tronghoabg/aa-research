package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akah extends java.io.OutputStream {
    private final defpackage.akav a;
    private int c = 0;
    private boolean d = false;
    private boolean e = false;
    private final byte[] b = new byte[2048];

    public akah(defpackage.akav akavVar) {
        this.a = akavVar;
    }

    protected final void a() throws java.io.IOException {
        int i = this.c;
        if (i > 0) {
            defpackage.akav akavVar = this.a;
            akavVar.d(java.lang.Integer.toHexString(i));
            akavVar.c(this.b, 0, this.c);
            akavVar.d("");
            this.c = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        if (!this.d) {
            a();
            defpackage.akav akavVar = this.a;
            akavVar.d(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.DBG_VALUE);
            akavVar.d("");
            this.d = true;
        }
        this.a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        a();
        this.a.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.e) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        byte[] bArr2 = this.b;
        int length = bArr2.length;
        int i3 = this.c;
        if (i2 < 2048 - i3) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.c += i2;
            return;
        }
        defpackage.akav akavVar = this.a;
        akavVar.d(java.lang.Integer.toHexString(i3 + i2));
        akavVar.c(bArr2, 0, this.c);
        akavVar.c(bArr, i, i2);
        akavVar.d("");
        this.c = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        if (!this.e) {
            byte[] bArr = this.b;
            int i2 = this.c;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.c = i3;
            int length = bArr.length;
            if (i3 == 2048) {
                a();
                return;
            }
            return;
        }
        throw new java.io.IOException("Attempted write to closed stream.");
    }
}
