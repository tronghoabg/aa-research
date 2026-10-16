package pd;

import N.I;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import rd.C3974i;
import rd.C3975j;
import rd.EnumC3966a;

/* renamed from: pd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3793b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C3974i f43465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f43466b;

    public C3793b(c cVar, C3974i c3974i) {
        this.f43466b = cVar;
        this.f43465a = c3974i;
    }

    public final void a(I i5) {
        this.f43466b.f43477l++;
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            if (c3974i.f44794e) {
                throw new IOException("closed");
            }
            int i10 = c3974i.f44793d;
            if ((i5.f7705a & 32) != 0) {
                i10 = i5.f7706b[5];
            }
            c3974i.f44793d = i10;
            c3974i.a(0, 0, (byte) 4, (byte) 1);
            c3974i.f44790a.flush();
        }
    }

    public final void b() {
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            try {
                if (c3974i.f44794e) {
                    throw new IOException("closed");
                }
                Logger logger = C3975j.f44795a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + C3975j.f44796b.e());
                }
                c3974i.f44790a.write(C3975j.f44796b.s());
                c3974i.f44790a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43465a.close();
    }

    public final void d(EnumC3966a enumC3966a, byte[] bArr) {
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            try {
                if (c3974i.f44794e) {
                    throw new IOException("closed");
                }
                if (enumC3966a.f44753a == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                c3974i.a(0, bArr.length + 8, (byte) 7, (byte) 0);
                c3974i.f44790a.d(0);
                c3974i.f44790a.d(enumC3966a.f44753a);
                if (bArr.length > 0) {
                    c3974i.f44790a.write(bArr);
                }
                c3974i.f44790a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            if (c3974i.f44794e) {
                throw new IOException("closed");
            }
            c3974i.f44790a.flush();
        }
    }

    public final void h(boolean z2, int i5, int i10) {
        if (z2) {
            this.f43466b.f43477l++;
        }
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            if (c3974i.f44794e) {
                throw new IOException("closed");
            }
            c3974i.a(0, 8, (byte) 6, z2 ? (byte) 1 : (byte) 0);
            c3974i.f44790a.d(i5);
            c3974i.f44790a.d(i10);
            c3974i.f44790a.flush();
        }
    }

    public final void i(int i5, EnumC3966a enumC3966a) {
        this.f43466b.f43477l++;
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            if (c3974i.f44794e) {
                throw new IOException("closed");
            }
            if (enumC3966a.f44753a == -1) {
                throw new IllegalArgumentException();
            }
            c3974i.a(i5, 4, (byte) 3, (byte) 0);
            c3974i.f44790a.d(enumC3966a.f44753a);
            c3974i.f44790a.flush();
        }
    }

    public final void o(I i5) {
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            try {
                if (c3974i.f44794e) {
                    throw new IOException("closed");
                }
                int i10 = 0;
                c3974i.a(0, Integer.bitCount(i5.f7705a) * 6, (byte) 4, (byte) 0);
                while (i10 < 10) {
                    if (i5.a(i10)) {
                        c3974i.f44790a.h(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                        c3974i.f44790a.d(i5.f7706b[i10]);
                    }
                    i10++;
                }
                c3974i.f44790a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(int i5, long j8) {
        C3974i c3974i = this.f43465a;
        synchronized (c3974i) {
            if (c3974i.f44794e) {
                throw new IOException("closed");
            }
            if (j8 == 0 || j8 > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j8);
            }
            c3974i.a(i5, 4, (byte) 8, (byte) 0);
            c3974i.f44790a.d((int) j8);
            c3974i.f44790a.flush();
        }
    }
}
