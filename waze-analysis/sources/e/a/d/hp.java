package e.a.d;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hp extends InputStream implements InputStreamRetargetInterface, e.a.bf {

    /* renamed from: a, reason: collision with root package name */
    private final ho f47104a;

    public hp(ho hoVar) {
        com.google.d.b.an.C(hoVar, "buffer");
        this.f47104a = hoVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f47104a.f();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47104a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        this.f47104a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f47104a.d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        ho hoVar = this.f47104a;
        if (hoVar.f() == 0) {
            return -1;
        }
        int iMin = Math.min(hoVar.f(), i3);
        hoVar.j(bArr, i2, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f47104a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        ho hoVar = this.f47104a;
        int iMin = (int) Math.min(hoVar.f(), j2);
        hoVar.k(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        ho hoVar = this.f47104a;
        if (hoVar.f() == 0) {
            return -1;
        }
        return hoVar.e();
    }
}
