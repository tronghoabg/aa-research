package e.a.d;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gh extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final int f47010a;

    /* renamed from: b, reason: collision with root package name */
    private final jt f47011b;

    /* renamed from: c, reason: collision with root package name */
    private long f47012c;

    /* renamed from: d, reason: collision with root package name */
    private long f47013d;

    /* renamed from: e, reason: collision with root package name */
    private long f47014e;

    gh(InputStream inputStream, int i2, jt jtVar) {
        super(inputStream);
        this.f47014e = -1L;
        this.f47010a = i2;
        this.f47011b = jtVar;
    }

    private final void a() {
        if (this.f47013d > this.f47012c) {
            this.f47011b.g();
            this.f47012c = this.f47013d;
        }
    }

    private final void b() {
        long j2 = this.f47013d;
        int i2 = this.f47010a;
        if (j2 <= i2) {
            return;
        }
        throw new e.a.eh(e.a.ee.f47407g.g("Decompressed gRPC message exceeds maximum size " + i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        this.in.mark(i2);
        this.f47014e = this.f47013d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = this.in.read();
        if (i2 != -1) {
            this.f47013d++;
        }
        b();
        a();
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f47014e == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.f47013d = this.f47014e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = this.in.skip(j2);
        this.f47013d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f47013d += i4;
        }
        b();
        a();
        return i4;
    }
}
