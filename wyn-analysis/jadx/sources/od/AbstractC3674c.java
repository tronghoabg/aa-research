package od;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: od.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3674c implements Closeable {
    public void B() {
        throw new UnsupportedOperationException();
    }

    public abstract void D(int i5);

    public final void a(int i5) {
        if (z() < i5) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean d() {
        return this instanceof C3718q1;
    }

    public abstract AbstractC3674c h(int i5);

    public abstract void i(int i5, int i10, byte[] bArr);

    public abstract void o(OutputStream outputStream, int i5);

    public abstract void w(ByteBuffer byteBuffer);

    public abstract int y();

    public abstract int z();

    public void b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
