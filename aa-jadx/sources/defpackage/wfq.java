package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wfq extends defpackage.wgm {
    public static final /* synthetic */ int a = 0;
    private final java.util.List b;

    public wfq(java.io.InputStream inputStream, java.util.List list) {
        super(inputStream);
        this.b = list;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((defpackage.wgw) it.next()).close();
            } catch (java.lang.Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int read() throws java.io.IOException {
        int i = this.in.read();
        if (i != -1) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((defpackage.wgw) it.next()).a();
            }
        }
        return i;
    }

    @Override // defpackage.wgm, java.io.FilterInputStream, java.io.InputStream
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int read(byte[] bArr) throws java.io.IOException {
        int i = this.in.read(bArr);
        if (i != -1) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((defpackage.wgw) it.next()).a();
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((defpackage.wgw) it.next()).a();
            }
        }
        return i3;
    }
}
