package L4;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f6939a;

    public z(ByteBuffer byteBuffer) {
        this.f6939a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f6939a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j8, byte[] bArr, int i5, int i10) {
        ByteBuffer byteBuffer = this.f6939a;
        if (j8 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j8);
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i5, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
