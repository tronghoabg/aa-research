package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajtv extends java.io.InputStream implements j$.io.InputStreamRetargetInterface, defpackage.ajtu {
    protected java.io.InputStream a;
    private boolean b;
    private final defpackage.ajtn c;

    public ajtv(java.io.InputStream inputStream, defpackage.ajtn ajtnVar) {
        defpackage.aguw.e(inputStream, "Wrapped stream");
        this.a = inputStream;
        this.b = false;
        this.c = ajtnVar;
    }

    protected final void a() throws java.io.IOException {
        java.io.InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                defpackage.ajtn ajtnVar = this.c;
                if (ajtnVar != null) {
                    defpackage.ajty ajtyVar = ajtnVar.a;
                    if (ajtyVar != null) {
                        ajtyVar.hk();
                    }
                } else {
                    inputStream.close();
                }
            } finally {
                this.a = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        if (!c()) {
            return 0;
        }
        try {
            return this.a.available();
        } catch (java.io.IOException e) {
            a();
            throw e;
        }
    }

    protected final void b(int i) throws java.io.IOException {
        java.io.InputStream inputStream = this.a;
        if (inputStream == null || i >= 0) {
            return;
        }
        try {
            defpackage.ajtn ajtnVar = this.c;
            if (ajtnVar != null) {
                try {
                    defpackage.ajty ajtyVar = ajtnVar.a;
                    if (ajtyVar != null) {
                        if (ajtnVar.b) {
                            inputStream.close();
                            ajtnVar.a.o();
                        } else {
                            ajtyVar.s();
                        }
                    }
                    ajtnVar.l();
                } catch (java.lang.Throwable th) {
                    ajtnVar.l();
                    throw th;
                }
            } else {
                inputStream.close();
            }
            this.a = null;
        } catch (java.lang.Throwable th2) {
            this.a = null;
            throw th2;
        }
    }

    protected final boolean c() throws java.io.IOException {
        if (this.b) {
            throw new java.io.IOException("Attempted read on closed stream.");
        }
        return this.a != null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.b = true;
        java.io.InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                defpackage.ajtn ajtnVar = this.c;
                if (ajtnVar != null) {
                    ajtnVar.m(inputStream);
                } else {
                    inputStream.close();
                }
            } finally {
                this.a = null;
            }
        }
    }

    @Override // defpackage.ajtu
    public final void hk() throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.ajtu
    public final void hl() throws java.io.IOException {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (!c()) {
            return -1;
        }
        try {
            int i = this.a.read();
            b(i);
            return i;
        } catch (java.io.IOException e) {
            a();
            throw e;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!c()) {
            return -1;
        }
        try {
            int i3 = this.a.read(bArr, i, i2);
            b(i3);
            return i3;
        } catch (java.io.IOException e) {
            a();
            throw e;
        }
    }
}
