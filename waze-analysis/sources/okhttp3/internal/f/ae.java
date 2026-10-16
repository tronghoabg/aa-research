package okhttp3.internal.f;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ae implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f56124a = Logger.getLogger(g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final k.i f56125b;

    /* renamed from: c, reason: collision with root package name */
    private final k.h f56126c;

    /* renamed from: d, reason: collision with root package name */
    private int f56127d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f56128e;

    /* renamed from: f, reason: collision with root package name */
    private final e f56129f;

    public ae(k.i iVar) {
        h.g.b.x.f(iVar, "sink");
        this.f56125b = iVar;
        k.h hVar = new k.h();
        this.f56126c = hVar;
        this.f56127d = 16384;
        this.f56129f = new e(hVar);
    }

    public final int a() {
        return this.f56127d;
    }

    public final synchronized void b() {
        if (this.f56128e) {
            throw new IOException("closed");
        }
        Logger logger = f56124a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(okhttp3.internal.b.j(">> CONNECTION ".concat(g.f56178a.h()), new Object[0]));
        }
        k.i iVar = this.f56125b;
        iVar.Z(g.f56178a);
        iVar.flush();
    }

    public final synchronized void c(boolean z, int i2, k.h hVar, int i3) {
        if (this.f56128e) {
            throw new IOException("closed");
        }
        e(i2, i3, 0, z ? 1 : 0);
        if (i3 > 0) {
            k.i iVar = this.f56125b;
            h.g.b.x.c(hVar);
            iVar.l(hVar, i3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f56128e = true;
        this.f56125b.close();
    }

    public final synchronized void d() {
        if (this.f56128e) {
            throw new IOException("closed");
        }
        this.f56125b.flush();
    }

    public final void e(int i2, int i3, int i4, int i5) {
        Logger logger = f56124a;
        if (logger.isLoggable(Level.FINE)) {
            k.k kVar = g.f56178a;
            logger.fine(g.b(false, i2, i3, i4, i5));
        }
        int i6 = this.f56127d;
        if (i3 > i6) {
            throw new IllegalArgumentException("FRAME_SIZE_ERROR length > " + i6 + ": " + i3);
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException("reserved bit set: " + i2);
        }
        k.i iVar = this.f56125b;
        byte[] bArr = okhttp3.internal.b.f55955a;
        h.g.b.x.f(iVar, "<this>");
        iVar.ae((i3 >>> 16) & 255);
        iVar.ae((i3 >>> 8) & 255);
        iVar.ae(i3 & 255);
        iVar.ae(i4);
        iVar.ae(i5);
        iVar.ah(i2 & Integer.MAX_VALUE);
    }

    public final synchronized void f(int i2, b bVar, byte[] bArr) {
        h.g.b.x.f(bVar, "errorCode");
        h.g.b.x.f(bArr, "debugData");
        if (this.f56128e) {
            throw new IOException("closed");
        }
        bVar.a();
        e(0, 8, 7, 0);
        k.i iVar = this.f56125b;
        iVar.ah(i2);
        iVar.ah(bVar.a());
        iVar.flush();
    }

    public final synchronized void g(boolean z, int i2, List list) {
        h.g.b.x.f(list, "headerBlock");
        if (this.f56128e) {
            throw new IOException("closed");
        }
        this.f56129f.c(list);
        k.h hVar = this.f56126c;
        long jQ = hVar.q();
        long jMin = Math.min(this.f56127d, jQ);
        int i3 = jQ == jMin ? 4 : 0;
        if (z) {
            i3 |= 1;
        }
        e(i2, (int) jMin, 1, i3);
        k.i iVar = this.f56125b;
        iVar.l(hVar, jMin);
        if (jQ > jMin) {
            long j2 = jQ - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.f56127d, j2);
                j2 -= jMin2;
                e(i2, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                iVar.l(hVar, jMin2);
            }
        }
    }

    public final synchronized void h(boolean z, int i2, int i3) {
        if (this.f56128e) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z ? 1 : 0);
        k.i iVar = this.f56125b;
        iVar.ah(i2);
        iVar.ah(i3);
        iVar.flush();
    }

    public final synchronized void i(int i2, b bVar) {
        h.g.b.x.f(bVar, "errorCode");
        if (this.f56128e) {
            throw new IOException("closed");
        }
        bVar.a();
        e(i2, 4, 3, 0);
        k.i iVar = this.f56125b;
        iVar.ah(bVar.a());
        iVar.flush();
    }

    public final synchronized void j(int i2, long j2) {
        if (this.f56128e) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2);
        }
        e(i2, 4, 8, 0);
        k.i iVar = this.f56125b;
        iVar.ah((int) j2);
        iVar.flush();
    }

    public final synchronized void k(com.google.firebase.d.c.b bVar) {
        h.g.b.x.f(bVar, "peerSettings");
        if (this.f56128e) {
            throw new IOException("closed");
        }
        this.f56127d = bVar.j(this.f56127d);
        if (bVar.g() != -1) {
            this.f56129f.a(bVar.g());
        }
        e(0, 0, 4, 1);
        this.f56125b.flush();
    }

    public final synchronized void l(com.google.firebase.d.c.b bVar) {
        h.g.b.x.f(bVar, "settings");
        if (this.f56128e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        e(0, bVar.k() * 6, 4, 0);
        while (i2 < 10) {
            if (bVar.l(i2)) {
                int i3 = i2 != 4 ? i2 != 7 ? i2 : 4 : 3;
                k.i iVar = this.f56125b;
                iVar.aj(i3);
                iVar.ah(bVar.f(i2));
            }
            i2++;
        }
        this.f56125b.flush();
    }
}
