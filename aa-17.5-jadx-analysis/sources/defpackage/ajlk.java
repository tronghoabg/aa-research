package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ajlk implements Closeable {
    public static final Logger a = Logger.getLogger(ajku.class.getName());
    public final ajmz b;
    public final ajmy c;
    public int d;
    public boolean e;
    public final ajks f;

    public ajlk(ajmz ajmzVar) {
        this.b = ajmzVar;
        ajmy ajmyVar = new ajmy();
        this.c = ajmyVar;
        this.d = 16384;
        this.f = new ajks(ajmyVar);
    }

    public final void a(boolean z, int i, ajmy ajmyVar, int i2) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            c(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                ajmz ajmzVar = this.b;
                ajmyVar.getClass();
                ajmzVar.a(ajmyVar, i2);
            }
        }
    }

    public final void b() throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.b.flush();
        }
    }

    public final void c(int i, int i2, int i3, int i4) throws IOException {
        if (i3 != 8) {
            Logger logger = a;
            if (logger.isLoggable(Level.FINE)) {
                ajnb ajnbVar = ajku.a;
                logger.fine(ajku.b(false, i, i2, i3, i4));
            }
        }
        int i5 = this.d;
        if (i2 > i5) {
            throw new IllegalArgumentException(a.bo(i2, i5, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(a.bp(i, "reserved bit set: "));
        }
        ajmz ajmzVar = this.b;
        int i6 = ajiq.a;
        ajmzVar.W((i2 >>> 16) & 255);
        ajmzVar.W((i2 >>> 8) & 255);
        ajmzVar.W(i2 & 255);
        ajmzVar.W(i3);
        ajmzVar.W(i4);
        ajmzVar.P(i & Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            this.e = true;
            this.b.close();
        }
    }

    public final void d(int i, long j) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException(a.bN(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
            }
            Logger logger = a;
            if (logger.isLoggable(Level.FINE)) {
                ajnb ajnbVar = ajku.a;
                logger.fine(ajku.c(false, i, j));
            }
            c(i, 4, 8, 0);
            ajmz ajmzVar = this.b;
            ajmzVar.P((int) j);
            ajmzVar.flush();
        }
    }

    public final void e(int i, int i2) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            c(i, 4, 3, 0);
            ajmz ajmzVar = this.b;
            ajmzVar.P(i2 - 1);
            ajmzVar.flush();
        }
    }
}
