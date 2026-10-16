package pd;

import ba.C1521a;
import cg.C1618g;
import cg.C1621j;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rd.C3974i;
import rd.EnumC3966a;

/* loaded from: classes5.dex */
public final class d implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f43479d = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final m f43480a;

    /* renamed from: b, reason: collision with root package name */
    public final C3793b f43481b;

    /* renamed from: c, reason: collision with root package name */
    public final C1521a f43482c;

    public d(m mVar, C3793b c3793b) {
        Level level = Level.FINE;
        this.f43482c = new C1521a(19);
        this.f43480a = mVar;
        this.f43481b = c3793b;
    }

    public final void a(boolean z2, int i5, C1618g c1618g, int i10) {
        c1618g.getClass();
        this.f43482c.B(2, i5, c1618g, i10, z2);
        try {
            C3974i c3974i = this.f43481b.f43465a;
            synchronized (c3974i) {
                if (c3974i.f44794e) {
                    throw new IOException("closed");
                }
                c3974i.a(i5, i10, (byte) 0, z2 ? (byte) 1 : (byte) 0);
                if (i10 > 0) {
                    c3974i.f44790a.E(c1618g, i10);
                }
            }
        } catch (IOException e7) {
            this.f43480a.q(e7);
        }
    }

    public final void b(EnumC3966a enumC3966a, byte[] bArr) {
        C3793b c3793b = this.f43481b;
        this.f43482c.C(2, 0, enumC3966a, C1621j.l(bArr));
        try {
            c3793b.d(enumC3966a, bArr);
            c3793b.flush();
        } catch (IOException e7) {
            this.f43480a.q(e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f43481b.close();
        } catch (IOException e7) {
            f43479d.log(e7.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e7);
        }
    }

    public final void d(boolean z2, int i5, int i10) {
        C1521a c1521a = this.f43482c;
        if (z2) {
            long j8 = (4294967295L & i10) | (i5 << 32);
            if (c1521a.A()) {
                ((Logger) c1521a.f19414b).log((Level) c1521a.f19415c, "OUTBOUND PING: ack=true bytes=" + j8);
            }
        } else {
            c1521a.D(2, (4294967295L & i10) | (i5 << 32));
        }
        try {
            this.f43481b.h(z2, i5, i10);
        } catch (IOException e7) {
            this.f43480a.q(e7);
        }
    }

    public final void flush() {
        try {
            this.f43481b.flush();
        } catch (IOException e7) {
            this.f43480a.q(e7);
        }
    }

    public final void h(int i5, EnumC3966a enumC3966a) {
        this.f43482c.E(2, i5, enumC3966a);
        try {
            this.f43481b.i(i5, enumC3966a);
        } catch (IOException e7) {
            this.f43480a.q(e7);
        }
    }

    public final void i(boolean z2, int i5, ArrayList arrayList) {
        try {
            C3974i c3974i = this.f43481b.f43465a;
            synchronized (c3974i) {
                if (c3974i.f44794e) {
                    throw new IOException("closed");
                }
                c3974i.b(z2, i5, arrayList);
            }
        } catch (IOException e7) {
            this.f43480a.q(e7);
        }
    }

    public final void o(int i5, long j8) {
        this.f43482c.G(2, i5, j8);
        try {
            this.f43481b.w(i5, j8);
        } catch (IOException e7) {
            this.f43480a.q(e7);
        }
    }
}
