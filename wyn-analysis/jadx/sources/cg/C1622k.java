package cg;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1622k implements F {

    /* renamed from: a, reason: collision with root package name */
    public final C1609A f19907a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f19908b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19909c;

    public C1622k(C1609A c1609a, Deflater deflater) {
        this.f19907a = c1609a;
        this.f19908b = deflater;
    }

    @Override // cg.F
    public final void E(C1618g source, long j8) throws IOException {
        AbstractC3340k.e(source, "source");
        AbstractC1613b.f(source.f19902b, 0L, j8);
        while (j8 > 0) {
            C1611C c1611c = source.f19901a;
            AbstractC3340k.b(c1611c);
            int iMin = (int) Math.min(j8, c1611c.f19868c - c1611c.f19867b);
            this.f19908b.setInput(c1611c.f19866a, c1611c.f19867b, iMin);
            a(false);
            long j10 = iMin;
            source.f19902b -= j10;
            int i5 = c1611c.f19867b + iMin;
            c1611c.f19867b = i5;
            if (i5 == c1611c.f19868c) {
                source.f19901a = c1611c.a();
                D.a(c1611c);
            }
            j8 -= j10;
        }
    }

    public final void a(boolean z2) throws IOException {
        C1611C c1611cP;
        int iDeflate;
        C1609A c1609a = this.f19907a;
        C1618g c1618g = c1609a.f19861b;
        while (true) {
            c1611cP = c1618g.P(1);
            Deflater deflater = this.f19908b;
            byte[] bArr = c1611cP.f19866a;
            if (z2) {
                try {
                    int i5 = c1611cP.f19868c;
                    iDeflate = deflater.deflate(bArr, i5, 8192 - i5, 2);
                } catch (NullPointerException e7) {
                    throw new IOException("Deflater already closed", e7);
                }
            } else {
                int i10 = c1611cP.f19868c;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (iDeflate > 0) {
                c1611cP.f19868c += iDeflate;
                c1618g.f19902b += iDeflate;
                c1609a.b();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c1611cP.f19867b == c1611cP.f19868c) {
            c1618g.f19901a = c1611cP.a();
            D.a(c1611cP);
        }
    }

    @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f19908b;
        if (this.f19909c) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f19907a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f19909c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // cg.F, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.f19907a.flush();
    }

    @Override // cg.F
    public final J timeout() {
        return this.f19907a.f19860a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f19907a + ')';
    }
}
