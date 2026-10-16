package k;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ae extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f50798a;

    ae(af afVar) {
        this.f50798a = afVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f50798a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        af afVar = this.f50798a;
        if (afVar.f50801c) {
            return;
        }
        afVar.flush();
    }

    public final String toString() {
        af afVar = this.f50798a;
        Objects.toString(afVar);
        return afVar.toString().concat(".outputStream()");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        h.g.b.x.f(bArr, "data");
        af afVar = this.f50798a;
        if (afVar.f50801c) {
            throw new IOException("closed");
        }
        afVar.f50800b.aa(bArr, i2, i3);
        afVar.a();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        af afVar = this.f50798a;
        if (!afVar.f50801c) {
            afVar.f50800b.ae((byte) i2);
            afVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
