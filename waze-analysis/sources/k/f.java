package k;

import androidx.collection.SieveCacheKt;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f50839a;

    f(h hVar) {
        this.f50839a = hVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f50839a.q(), SieveCacheKt.NodeLinkMask);
    }

    @Override // java.io.InputStream
    public final int read() {
        h hVar = this.f50839a;
        if (hVar.q() > 0) {
            return hVar.c() & 255;
        }
        return -1;
    }

    public final String toString() {
        h hVar = this.f50839a;
        Objects.toString(hVar);
        return hVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "sink");
        return this.f50839a.d(bArr, i2, i3);
    }
}
