package B1;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f1497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1498b;

    public a(g gVar) {
        this.f1498b = gVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j8, byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        if (j8 < 0) {
            return -1;
        }
        try {
            long j10 = this.f1497a;
            g gVar = this.f1498b;
            if (j10 != j8) {
                if (j10 >= 0 && j8 >= j10 + gVar.f1499a.available()) {
                    return -1;
                }
                gVar.b(j8);
                this.f1497a = j8;
            }
            if (i10 > gVar.f1499a.available()) {
                i10 = gVar.f1499a.available();
            }
            int i11 = gVar.read(bArr, i5, i10);
            if (i11 >= 0) {
                this.f1497a += i11;
                return i11;
            }
        } catch (IOException unused) {
        }
        this.f1497a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
