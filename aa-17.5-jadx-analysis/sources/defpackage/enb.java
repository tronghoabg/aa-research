package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes2.dex */
final class enb extends MediaDataSource {
    long a;
    final /* synthetic */ enc b;

    public enb(enc encVar) {
        this.b = encVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() throws IOException {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.b.available()) {
                    return -1;
                }
                this.b.c(j);
                this.a = j;
            }
            enc encVar = this.b;
            if (i2 > encVar.available()) {
                i2 = encVar.available();
            }
            int i3 = encVar.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
