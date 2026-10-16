package cg;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1609A implements InterfaceC1619h {

    /* renamed from: a, reason: collision with root package name */
    public final F f19860a;

    /* renamed from: b, reason: collision with root package name */
    public final C1618g f19861b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19862c;

    public C1609A(F sink) {
        AbstractC3340k.e(sink, "sink");
        this.f19860a = sink;
        this.f19861b = new C1618g();
    }

    @Override // cg.F
    public final void E(C1618g source, long j8) {
        AbstractC3340k.e(source, "source");
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.E(source, j8);
        b();
    }

    @Override // cg.InterfaceC1619h
    public final InterfaceC1619h L(int i5, int i10, String string) {
        AbstractC3340k.e(string, "string");
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.c0(i5, i10, string);
        b();
        return this;
    }

    @Override // cg.InterfaceC1619h
    public final InterfaceC1619h T(int i5, int i10, byte[] source) {
        AbstractC3340k.e(source, "source");
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.W(source, i5, i10);
        b();
        return this;
    }

    public final InterfaceC1619h a() {
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        C1618g c1618g = this.f19861b;
        long j8 = c1618g.f19902b;
        if (j8 > 0) {
            this.f19860a.E(c1618g, j8);
        }
        return this;
    }

    public final InterfaceC1619h b() {
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        C1618g c1618g = this.f19861b;
        long jD = c1618g.d();
        if (jD > 0) {
            this.f19860a.E(c1618g, jD);
        }
        return this;
    }

    @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        F f10 = this.f19860a;
        if (this.f19862c) {
            return;
        }
        try {
            C1618g c1618g = this.f19861b;
            long j8 = c1618g.f19902b;
            if (j8 > 0) {
                f10.E(c1618g, j8);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            f10.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f19862c = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC1619h d(int i5) {
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.a0(i5);
        b();
        return this;
    }

    @Override // cg.InterfaceC1619h, cg.F, java.io.Flushable
    public final void flush() {
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        C1618g c1618g = this.f19861b;
        long j8 = c1618g.f19902b;
        F f10 = this.f19860a;
        if (j8 > 0) {
            f10.E(c1618g, j8);
        }
        f10.flush();
    }

    @Override // cg.InterfaceC1619h
    public final C1618g getBuffer() {
        return this.f19861b;
    }

    public final InterfaceC1619h h(int i5) {
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.b0(i5);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f19862c;
    }

    @Override // cg.InterfaceC1619h
    public final long q(H h10) {
        long j8 = 0;
        while (true) {
            long j10 = ((C1615d) h10).read(this.f19861b, 8192L);
            if (j10 == -1) {
                return j8;
            }
            j8 += j10;
            b();
        }
    }

    @Override // cg.F
    public final J timeout() {
        return this.f19860a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f19860a + ')';
    }

    @Override // cg.InterfaceC1619h
    public final InterfaceC1619h u(C1621j byteString) {
        AbstractC3340k.e(byteString, "byteString");
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.Q(byteString);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC3340k.e(source, "source");
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f19861b.write(source);
        b();
        return iWrite;
    }

    @Override // cg.InterfaceC1619h
    public final InterfaceC1619h writeByte(int i5) {
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.X(i5);
        b();
        return this;
    }

    @Override // cg.InterfaceC1619h
    public final InterfaceC1619h writeDecimalLong(long j8) {
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.Y(j8);
        b();
        return this;
    }

    @Override // cg.InterfaceC1619h
    public final InterfaceC1619h writeUtf8(String string) {
        AbstractC3340k.e(string, "string");
        if (this.f19862c) {
            throw new IllegalStateException("closed");
        }
        this.f19861b.d0(string);
        b();
        return this;
    }

    @Override // cg.InterfaceC1619h
    public final InterfaceC1619h write(byte[] source) {
        AbstractC3340k.e(source, "source");
        if (!this.f19862c) {
            this.f19861b.V(source);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
