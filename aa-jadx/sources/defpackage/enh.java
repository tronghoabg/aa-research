package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class enh extends android.media.MediaDataSource {
    long a;
    final /* synthetic */ defpackage.eni b;

    public enh(defpackage.eni eniVar) {
        this.b = eniVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() throws java.io.IOException {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.b.available())) {
                    return -1;
                }
                this.b.c(j);
                this.a = j;
            }
            defpackage.eni eniVar = this.b;
            if (i2 > eniVar.available()) {
                i2 = eniVar.available();
            }
            int i3 = eniVar.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += (long) i3;
                return i3;
            }
        } catch (java.io.IOException unused) {
        }
        this.a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }
}
