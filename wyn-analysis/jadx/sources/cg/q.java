package cg;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class q implements F {

    /* renamed from: a, reason: collision with root package name */
    public final C1609A f19916a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f19917b;

    /* renamed from: c, reason: collision with root package name */
    public final C1622k f19918c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19919d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f19920e;

    public q(C1618g c1618g) {
        C1609A c1609a = new C1609A(c1618g);
        this.f19916a = c1609a;
        Deflater deflater = new Deflater(-1, true);
        this.f19917b = deflater;
        this.f19918c = new C1622k(c1609a, deflater);
        this.f19920e = new CRC32();
        C1618g c1618g2 = c1609a.f19861b;
        c1618g2.b0(8075);
        c1618g2.X(8);
        c1618g2.X(0);
        c1618g2.a0(0);
        c1618g2.X(0);
        c1618g2.X(0);
    }

    @Override // cg.F
    public final void E(C1618g source, long j8) throws IOException {
        AbstractC3340k.e(source, "source");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        if (j8 == 0) {
            return;
        }
        C1611C c1611c = source.f19901a;
        AbstractC3340k.b(c1611c);
        long j10 = j8;
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, c1611c.f19868c - c1611c.f19867b);
            this.f19920e.update(c1611c.f19866a, c1611c.f19867b, iMin);
            j10 -= iMin;
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
        }
        this.f19918c.E(source, j8);
    }

    @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int value;
        Deflater deflater = this.f19917b;
        C1609A c1609a = this.f19916a;
        if (this.f19919d) {
            return;
        }
        try {
            C1622k c1622k = this.f19918c;
            c1622k.f19908b.finish();
            c1622k.a(false);
            value = (int) this.f19920e.getValue();
        } catch (Throwable th) {
            th = th;
        }
        if (c1609a.f19862c) {
            throw new IllegalStateException("closed");
        }
        int i5 = AbstractC1613b.i(value);
        C1618g c1618g = c1609a.f19861b;
        c1618g.a0(i5);
        c1609a.b();
        int bytesRead = (int) deflater.getBytesRead();
        if (c1609a.f19862c) {
            throw new IllegalStateException("closed");
        }
        c1618g.a0(AbstractC1613b.i(bytesRead));
        c1609a.b();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            c1609a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f19919d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // cg.F, java.io.Flushable
    public final void flush() throws IOException {
        this.f19918c.flush();
    }

    @Override // cg.F
    public final J timeout() {
        return this.f19916a.f19860a.timeout();
    }
}
