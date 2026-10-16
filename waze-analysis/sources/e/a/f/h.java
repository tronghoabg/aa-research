package e.a.f;

import androidx.media3.muxer.MuxerUtil;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements e.a.f.a.a.d {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47681a = Logger.getLogger(ac.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final g f47682b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.f.a.a.d f47683c;

    /* renamed from: d, reason: collision with root package name */
    private final af f47684d = new af(Level.FINE, ac.class);

    h(g gVar, e.a.f.a.a.d dVar) {
        this.f47682b = gVar;
        this.f47683c = dVar;
    }

    @Override // e.a.f.a.a.d
    public final void a(e.a.f.a.a.p pVar) {
        this.f47684d.j();
        try {
            this.f47683c.a(pVar);
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void b(boolean z, int i2, int i3) {
        long j2 = (i2 << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        af afVar = this.f47684d;
        if (z) {
            afVar.h(j2);
        } else {
            afVar.c(2, j2);
        }
        try {
            this.f47683c.b(z, i2, i3);
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void c(int i2, e.a.f.a.a.a aVar) {
        this.f47684d.d(2, i2, aVar);
        try {
            this.f47683c.c(i2, aVar);
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f47683c.close();
        } catch (IOException e2) {
            f47681a.logp(e2.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final int d() {
        return this.f47683c.d();
    }

    @Override // e.a.f.a.a.d
    public final void e() {
        try {
            this.f47683c.e();
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void f(boolean z, int i2, k.h hVar, int i3) {
        this.f47684d.a(2, i2, hVar, i3, z);
        try {
            this.f47683c.f(z, i2, hVar, i3);
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void g() {
        try {
            this.f47683c.g();
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void h(e.a.f.a.a.p pVar) {
        this.f47684d.e(2, pVar);
        try {
            this.f47683c.h(pVar);
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void i(int i2, long j2) {
        this.f47684d.f(2, i2, j2);
        try {
            this.f47683c.i(i2, j2);
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void j(e.a.f.a.a.a aVar, byte[] bArr) {
        this.f47684d.b(2, 0, aVar, k.k.j(bArr));
        try {
            e.a.f.a.a.d dVar = this.f47683c;
            dVar.j(aVar, bArr);
            dVar.g();
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }

    @Override // e.a.f.a.a.d
    public final void k(boolean z, int i2, List list) {
        try {
            this.f47683c.k(false, i2, list);
        } catch (IOException e2) {
            this.f47682b.e(e2);
        }
    }
}
