package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface adxi extends Closeable {
    void b();

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean d();

    int e();

    int f();

    adxi g(int i);

    void i(OutputStream outputStream, int i) throws IOException;

    void j(byte[] bArr, int i, int i2);

    void k(int i);
}
