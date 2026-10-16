package k;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class g extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f50840a;

    g(h hVar) {
        this.f50840a = hVar;
    }

    public final String toString() {
        h hVar = this.f50840a;
        Objects.toString(hVar);
        return hVar.toString().concat(".outputStream()");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "data");
        this.f50840a.aa(bArr, i2, i3);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f50840a.ae(i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
