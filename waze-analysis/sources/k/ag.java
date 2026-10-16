package k;

import androidx.collection.SieveCacheKt;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ag extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f50802a;

    ag(ah ahVar) {
        this.f50802a = ahVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ah ahVar = this.f50802a;
        if (ahVar.f50805c) {
            throw new IOException("closed");
        }
        return (int) Math.min(ahVar.f50804b.q(), SieveCacheKt.NodeLinkMask);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f50802a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        h.g.b.x.f(bArr, "data");
        ah ahVar = this.f50802a;
        if (ahVar.f50805c) {
            throw new IOException("closed");
        }
        okhttp3.internal.publicsuffix.a.g(bArr.length, i2, i3);
        h hVar = ahVar.f50804b;
        if (hVar.q() == 0 && ahVar.f50803a.a(hVar, 8192L) == -1) {
            return -1;
        }
        return hVar.d(bArr, i2, i3);
    }

    public final String toString() {
        ah ahVar = this.f50802a;
        Objects.toString(ahVar);
        return ahVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        h.g.b.x.f(outputStream, "out");
        ah ahVar = this.f50802a;
        if (ahVar.f50805c) {
            throw new IOException("closed");
        }
        long jQ = 0;
        while (true) {
            h hVar = ahVar.f50804b;
            if (hVar.q() == 0 && ahVar.f50803a.a(hVar, 8192L) == -1) {
                return jQ;
            }
            jQ += hVar.q();
            hVar.ak(outputStream, hVar.f50842b);
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ah ahVar = this.f50802a;
        if (ahVar.f50805c) {
            throw new IOException("closed");
        }
        h hVar = ahVar.f50804b;
        if (hVar.q() == 0 && ahVar.f50803a.a(hVar, 8192L) == -1) {
            return -1;
        }
        return hVar.c() & 255;
    }
}
