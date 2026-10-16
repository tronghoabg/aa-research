package com.waze.speech;

import androidx.media3.common.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements com.waze.h.b.i {

    /* renamed from: a, reason: collision with root package name */
    private final h f40445a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40446b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f40447c;

    /* renamed from: d, reason: collision with root package name */
    private af f40448d;

    /* renamed from: e, reason: collision with root package name */
    private int f40449e;

    /* renamed from: f, reason: collision with root package name */
    private ByteArrayOutputStream f40450f;

    /* renamed from: g, reason: collision with root package name */
    private long f40451g;

    /* renamed from: h, reason: collision with root package name */
    private Long f40452h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.h.c.a f40453i;

    /* renamed from: j, reason: collision with root package name */
    private long f40454j;

    /* renamed from: k, reason: collision with root package name */
    private final bm f40455k;

    /* renamed from: l, reason: collision with root package name */
    private final bq f40456l;

    public j(h hVar, com.waze.shared_infra.i.e eVar, ab abVar) {
        h.g.b.x.f(hVar, "config");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "dispatcher");
        this.f40445a = hVar;
        this.f40446b = eVar;
        this.f40447c = abVar;
        bm bmVarE = bu.e(0, 0, null, 7);
        this.f40455k = bmVarE;
        this.f40456l = ai.S(bmVarE);
    }

    private final int e() {
        com.waze.h.c.a aVar = this.f40453i;
        if (aVar == null) {
            throw new IllegalStateException("No input audio config, make sure to call start() first.");
        }
        if (aVar.b() != com.waze.h.c.b.f24340a) {
            throw new IllegalArgumentException("Only PCM_16BIT is supported");
        }
        float fA = aVar.d().a() * (this.f40445a.b() / 1000.0f);
        return h.h.a.b(fA + fA);
    }

    private final void f(Throwable th) {
        h(new com.waze.h.b.f(th));
        close();
    }

    private static final int g(byte[] bArr, int i2) {
        h.k.h hVarT = h.k.n.t(h.k.n.u(0, i2), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        long j2 = 0;
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (true) {
                int i3 = iA + 1;
                if (i3 >= i2) {
                    break;
                }
                short s = (short) ((bArr[i3] << 8) | (bArr[iA] & 255));
                j2 += s * s;
                if (iA == iB) {
                    break;
                }
                iA += iC;
            }
        }
        return h.h.a.a(Math.sqrt(j2 / (bArr.length >> 1)));
    }

    private final void h(com.waze.a.af afVar) {
        Objects.toString(afVar);
        String strConcat = "sendEvent : ".concat(afVar.toString());
        com.waze.shared_infra.i.e eVar = this.f40446b;
        eVar.a(strConcat);
        af afVar2 = this.f40448d;
        if (afVar2 != null) {
            aj.z(afVar2, null, null, new i(this, afVar, null), 3);
            return;
        }
        eVar.b("sendEvent called with " + afVar + " but scope is null");
    }

    @Override // com.waze.h.b.i
    public final bq a() {
        return this.f40456l;
    }

    @Override // com.waze.h.b.i
    public final void b(com.waze.h.c.a aVar) {
        Object objA;
        h.g.b.x.f(aVar, "inputAudioConfig");
        try {
            j jVar = this;
            this.f40453i = aVar;
            this.f40449e = e();
            this.f40450f = new ByteArrayOutputStream(this.f40449e);
            this.f40451g = System.currentTimeMillis();
            this.f40452h = null;
            af afVar = this.f40448d;
            if (afVar != null) {
                aj.h(afVar, null);
            }
            this.f40448d = aj.e(this.f40447c);
            this.f40454j = System.currentTimeMillis();
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            f(thC);
        }
    }

    @Override // com.waze.h.b.i
    public final void c(byte[] bArr, int i2) {
        Object objA;
        Long l2;
        h.g.b.x.f(bArr, MimeTypes.BASE_TYPE_AUDIO);
        try {
            j jVar = this;
            l2 = this.f40452h;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (l2 == null) {
            ByteArrayOutputStream byteArrayOutputStream = this.f40450f;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.write(bArr, 0, i2);
            }
            ByteArrayOutputStream byteArrayOutputStream2 = this.f40450f;
            if (byteArrayOutputStream2 == null || byteArrayOutputStream2.size() < this.f40449e) {
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream3 = this.f40450f;
            h.g.b.x.c(byteArrayOutputStream3);
            h.g.b.x.e(byteArrayOutputStream3.toByteArray(), "toByteArray(...)");
            h.g.b.x.c(this.f40450f);
            this.f40452h = Long.valueOf(g(r6, r7.size()) * this.f40445a.d());
            return;
        }
        if (g(bArr, i2) > l2.longValue()) {
            this.f40451g = System.currentTimeMillis();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.f40451g;
        long j3 = jCurrentTimeMillis - this.f40454j;
        h hVar = this.f40445a;
        if (j3 >= h.o.a.m(hVar.a()) && j2 >= hVar.c()) {
            h(com.waze.h.b.g.f24323a);
        }
        objA = h.ab.f48028a;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            f(thC);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object objA;
        try {
            j jVar = this;
            ByteArrayOutputStream byteArrayOutputStream = this.f40450f;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            this.f40450f = null;
            this.f40452h = null;
            this.f40451g = 0L;
            this.f40454j = 0L;
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            f(thC);
        }
    }
}
