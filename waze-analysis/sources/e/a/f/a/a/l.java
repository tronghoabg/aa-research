package e.a.f.a.a;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l implements d {

    /* renamed from: a, reason: collision with root package name */
    private final k.i f47526a;

    /* renamed from: b, reason: collision with root package name */
    private final k.h f47527b;

    /* renamed from: c, reason: collision with root package name */
    private final g f47528c;

    /* renamed from: d, reason: collision with root package name */
    private int f47529d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47530e;

    l(k.i iVar) {
        this.f47526a = iVar;
        k.h hVar = new k.h();
        this.f47527b = hVar;
        this.f47528c = new g(hVar);
        this.f47529d = 16384;
    }

    @Override // e.a.f.a.a.d
    public final synchronized void a(p pVar) {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        this.f47529d = pVar.c(this.f47529d);
        l(0, 0, (byte) 4, (byte) 1);
        this.f47526a.flush();
    }

    @Override // e.a.f.a.a.d
    public final synchronized void b(boolean z, int i2, int i3) {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        l(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        k.i iVar = this.f47526a;
        iVar.ah(i2);
        iVar.ah(i3);
        iVar.flush();
    }

    @Override // e.a.f.a.a.d
    public final synchronized void c(int i2, a aVar) {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        int i3 = aVar.s;
        if (i3 == -1) {
            throw new IllegalArgumentException();
        }
        l(i2, 4, (byte) 3, (byte) 0);
        k.i iVar = this.f47526a;
        iVar.ah(i3);
        iVar.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f47530e = true;
        this.f47526a.close();
    }

    @Override // e.a.f.a.a.d
    public final int d() {
        return this.f47529d;
    }

    @Override // e.a.f.a.a.d
    public final synchronized void e() {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        if (m.f47531a.isLoggable(Level.FINE)) {
            m.f47531a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", m.f47532b.h()));
        }
        k.i iVar = this.f47526a;
        iVar.C(m.f47532b.s());
        iVar.flush();
    }

    @Override // e.a.f.a.a.d
    public final synchronized void f(boolean z, int i2, k.h hVar, int i3) {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        l(i2, i3, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i3 > 0) {
            this.f47526a.l(hVar, i3);
        }
    }

    @Override // e.a.f.a.a.d
    public final synchronized void g() {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        this.f47526a.flush();
    }

    @Override // e.a.f.a.a.d
    public final synchronized void h(p pVar) {
        int i2;
        if (this.f47530e) {
            throw new IOException("closed");
        }
        int i3 = 0;
        l(0, pVar.d() * 6, (byte) 4, (byte) 0);
        while (i3 < 10) {
            if (pVar.e(i3)) {
                if (i3 == 4) {
                    int i4 = i3;
                    i3 = 3;
                    i2 = i4;
                } else {
                    i2 = 7;
                    if (i3 == 7) {
                        i3 = 4;
                    } else {
                        i2 = i3;
                    }
                }
                k.i iVar = this.f47526a;
                iVar.aj(i3);
                iVar.ah(pVar.a(i2));
                i3 = i2;
            }
            i3++;
        }
        this.f47526a.flush();
    }

    @Override // e.a.f.a.a.d
    public final synchronized void i(int i2, long j2) {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        if (j2 == 0) {
            throw m.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{0L});
        }
        l(i2, 4, (byte) 8, (byte) 0);
        k.i iVar = this.f47526a;
        iVar.ah((int) j2);
        iVar.flush();
    }

    @Override // e.a.f.a.a.d
    public final synchronized void j(a aVar, byte[] bArr) {
        if (this.f47530e) {
            throw new IOException("closed");
        }
        int i2 = aVar.s;
        if (i2 == -1) {
            throw m.d("errorCode.httpCode == -1", new Object[0]);
        }
        l(0, 8, (byte) 7, (byte) 0);
        k.i iVar = this.f47526a;
        iVar.ah(0);
        iVar.ah(i2);
        iVar.flush();
    }

    @Override // e.a.f.a.a.d
    public final synchronized void k(boolean z, int i2, List list) {
        boolean z2 = this.f47530e;
        if (z2) {
            throw new IOException("closed");
        }
        if (z2) {
            throw new IOException("closed");
        }
        this.f47528c.b(list);
        k.h hVar = this.f47527b;
        long jQ = hVar.q();
        int iMin = (int) Math.min(this.f47529d, jQ);
        long j2 = iMin;
        l(i2, iMin, (byte) 1, jQ == j2 ? (byte) 4 : (byte) 0);
        k.i iVar = this.f47526a;
        iVar.l(hVar, j2);
        if (jQ > j2) {
            long j3 = jQ - j2;
            while (j3 > 0) {
                int iMin2 = (int) Math.min(this.f47529d, j3);
                long j4 = iMin2;
                j3 -= j4;
                l(i2, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                iVar.l(hVar, j4);
            }
        }
    }

    final void l(int i2, int i3, byte b2, byte b3) {
        if (m.f47531a.isLoggable(Level.FINE)) {
            m.f47531a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", j.a(false, i2, i3, b2, b3));
        }
        int i4 = this.f47529d;
        if (i3 > i4) {
            throw m.d("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3)});
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw m.d("reserved bit set: %s", new Object[]{Integer.valueOf(i2)});
        }
        k.i iVar = this.f47526a;
        iVar.ae((i3 >>> 16) & 255);
        iVar.ae((i3 >>> 8) & 255);
        iVar.ae(i3 & 255);
        iVar.ae(b2);
        iVar.ae(b3);
        iVar.ah(i2 & Integer.MAX_VALUE);
    }
}
