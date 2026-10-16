package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajvw extends defpackage.ajvv {
    public java.io.InputStream d;
    public long e = -1;

    @Override // defpackage.ajqb
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ajqb
    public final java.io.InputStream b() throws java.lang.IllegalStateException {
        defpackage.agvb.b(this.d != null, "Content has not been provided");
        return this.d;
    }

    @Override // defpackage.ajqb
    public final void f(java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.InputStream inputStreamB = b();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStreamB.read(bArr);
                if (i == -1) {
                    inputStreamB.close();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (java.lang.Throwable th) {
            inputStreamB.close();
            throw th;
        }
    }

    @Override // defpackage.ajqb
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ajqb
    public final boolean i() {
        java.io.InputStream inputStream = this.d;
        return (inputStream == null || inputStream == defpackage.akal.a) ? false : true;
    }
}
