package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wfr extends defpackage.wgn {
    public static final /* synthetic */ int a = 0;
    private final java.util.List b;

    public wfr(java.io.OutputStream outputStream, java.util.List list) {
        super(outputStream);
        this.b = list;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((defpackage.wgx) it.next()).close();
            } catch (java.lang.Throwable unused) {
            }
        }
        super.close();
    }

    @Override // defpackage.wgn, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        this.out.write(bArr);
        for (defpackage.wgx wgxVar : this.b) {
            int length = bArr.length;
            wgxVar.a();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        this.out.write(i);
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.wgx) it.next()).a();
        }
    }

    @Override // defpackage.wgn, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.out.write(bArr, i, i2);
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.wgx) it.next()).a();
        }
    }
}
