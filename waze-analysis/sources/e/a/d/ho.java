package e.a.d;

import java.io.Closeable;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface ho extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int e();

    int f();

    ho g(int i2);

    void i(OutputStream outputStream, int i2);

    void j(byte[] bArr, int i2, int i3);

    void k(int i2);
}
