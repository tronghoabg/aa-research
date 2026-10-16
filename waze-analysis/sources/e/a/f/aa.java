package e.a.f;

import androidx.collection.SieveCacheKt;
import androidx.media3.muxer.MuxerUtil;
import e.a.cm;
import e.a.d.df;
import e.a.d.dl;
import e.a.d.gd;
import e.a.eb;
import e.a.ee;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa implements Runnable, e.a.f.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    final e.a.f.a.a.c f47606a;

    /* renamed from: b, reason: collision with root package name */
    boolean f47607b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f47608c;

    /* renamed from: d, reason: collision with root package name */
    private final af f47609d;

    aa(ac acVar, e.a.f.a.a.c cVar) {
        Objects.requireNonNull(acVar);
        this.f47608c = acVar;
        this.f47609d = new af(Level.FINE, ac.class);
        this.f47607b = true;
        this.f47606a = cVar;
    }

    @Override // e.a.f.a.a.b
    public final void a(boolean z, int i2, k.j jVar, int i3, int i4) {
        this.f47609d.a(1, i2, jVar.B(), i3, z);
        ac acVar = this.f47608c;
        t tVarQ = acVar.q(i2);
        if (tVarQ != null) {
            long j2 = i3;
            jVar.O(j2);
            k.h hVar = new k.h();
            hVar.l(jVar.B(), j2);
            int i5 = e.b.b.f47862a;
            synchronized (this.f47608c.r) {
                tVarQ.F().I(hVar, z, i4 - i3);
            }
        } else {
            if (!acVar.Z(i2)) {
                ac acVar2 = this.f47608c;
                e.a.f.a.a.a aVar = e.a.f.a.a.a.PROTOCOL_ERROR;
                acVar2.ai(0, aVar, ac.l(aVar).c("Received data for unknown stream: " + i2));
                return;
            }
            synchronized (acVar.r) {
                acVar.p.c(i2, e.a.f.a.a.a.STREAM_CLOSED);
            }
            jVar.Q(i3);
        }
        ac acVar3 = this.f47608c;
        acVar3.z += i4;
        if (acVar3.z >= acVar3.m * 0.5f) {
            synchronized (acVar3.r) {
                acVar3.p.i(0, acVar3.z);
            }
            this.f47608c.z = 0;
        }
    }

    @Override // e.a.f.a.a.b
    public final void b(int i2, e.a.f.a.a.a aVar, k.k kVar) {
        this.f47609d.b(1, i2, aVar, kVar);
        if (aVar == e.a.f.a.a.a.ENHANCE_YOUR_CALM) {
            String strI = kVar.i();
            ac.f47612e.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strI));
            if ("too_many_pings".equals(strI)) {
                this.f47608c.T.run();
            }
        }
        ee eeVarC = df.b(aVar.s).c("Received Goaway");
        if (kVar.d() > 0) {
            eeVarC = eeVarC.c(kVar.i());
        }
        this.f47608c.ai(i2, null, eeVarC);
    }

    @Override // e.a.f.a.a.b
    public final void c(boolean z, int i2, int i3) {
        dl dlVar;
        af afVar = this.f47609d;
        long j2 = (i2 << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        afVar.c(1, j2);
        ac acVar = this.f47608c;
        if (!z) {
            synchronized (acVar.r) {
                acVar.p.b(true, i2, i3);
            }
            return;
        }
        synchronized (acVar.r) {
            dlVar = null;
            if (acVar.E == null) {
                ac.f47612e.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
            } else if (acVar.E.a() == j2) {
                dlVar = acVar.E;
                acVar.E = null;
            } else {
                ac.f47612e.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(acVar.E.a()), Long.valueOf(j2)));
            }
        }
        if (dlVar != null) {
            dlVar.d();
        }
    }

    @Override // e.a.f.a.a.b
    public final void d(int i2, int i3, List list) {
        this.f47609d.i(i2, i3, list);
        ac acVar = this.f47608c;
        synchronized (acVar.r) {
            acVar.p.c(i2, e.a.f.a.a.a.PROTOCOL_ERROR);
        }
    }

    @Override // e.a.f.a.a.b
    public final void e(int i2, e.a.f.a.a.a aVar) {
        boolean z = true;
        this.f47609d.d(1, i2, aVar);
        ee eeVarC = ac.l(aVar).c("Rst Stream");
        if (eeVarC.a() != eb.CANCELLED && eeVarC.a() != eb.DEADLINE_EXCEEDED) {
            z = false;
        }
        boolean z2 = z;
        ac acVar = this.f47608c;
        synchronized (acVar.r) {
            if (((t) acVar.u.get(Integer.valueOf(i2))) != null) {
                int i3 = e.b.b.f47862a;
                acVar.V(i2, eeVarC, aVar == e.a.f.a.a.a.REFUSED_STREAM ? e.a.d.ag.f46606b : e.a.d.ag.f46605a, z2, null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // e.a.f.a.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r6, long r7) {
        /*
            r5 = this;
            e.a.f.af r0 = r5.f47609d
            r1 = 1
            r0.f(r1, r6, r7)
            e.a.f.ac r0 = r5.f47608c
            java.lang.Object r2 = e.a.f.ac.y(r0)
            monitor-enter(r2)
            if (r6 != 0) goto L1a
            e.a.f.aq r5 = e.a.f.ac.u(r0)     // Catch: java.lang.Throwable -> L5d
            r6 = 0
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L5d
            r5.h(r6, r7)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5d
            return
        L1a:
            java.util.Map r3 = e.a.f.ac.F(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L5d
            e.a.f.t r3 = (e.a.f.t) r3     // Catch: java.lang.Throwable -> L5d
            r4 = 0
            if (r3 == 0) goto L3c
            e.a.f.aq r0 = e.a.f.ac.u(r0)     // Catch: java.lang.Throwable -> L5d
            e.a.f.s r1 = r3.F()     // Catch: java.lang.Throwable -> L5d
            e.a.f.an r1 = r1.D()     // Catch: java.lang.Throwable -> L5d
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L5d
            r0.h(r1, r7)     // Catch: java.lang.Throwable -> L5d
            goto L43
        L3c:
            boolean r7 = r0.Z(r6)     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L43
            goto L44
        L43:
            r1 = r4
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5c
            e.a.f.ac r5 = r5.f47608c
            e.a.f.a.a.a r7 = e.a.f.a.a.a.PROTOCOL_ERROR
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Received window_update for unknown stream: "
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            e.a.f.ac.T(r5, r7, r6)
        L5c:
            return
        L5d:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.f.aa.f(int, long):void");
    }

    @Override // e.a.f.a.a.b
    public final void g(boolean z, int i2, List list) {
        this.f47609d.g(i2, list, z);
        ac acVar = this.f47608c;
        ee eeVarG = null;
        boolean z2 = true;
        if (acVar.U != Integer.MAX_VALUE) {
            long jD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                e.a.f.a.a.e eVar = (e.a.f.a.a.e) list.get(i3);
                jD += eVar.f47495f.d() + 32 + eVar.f47496g.d();
            }
            int iMin = (int) Math.min(jD, SieveCacheKt.NodeLinkMask);
            if (iMin > acVar.U) {
                eeVarG = ee.f47407g.g(String.format(Locale.US, "Response %s metadata larger than %d: %d", true != z ? "header" : "trailer", Integer.valueOf(acVar.U), Integer.valueOf(iMin)));
            }
        }
        synchronized (acVar.r) {
            t tVar = (t) acVar.u.get(Integer.valueOf(i2));
            if (tVar == null) {
                if (acVar.Z(i2)) {
                    acVar.p.c(i2, e.a.f.a.a.a.STREAM_CLOSED);
                }
            } else if (eeVarG == null) {
                int i4 = e.b.b.f47862a;
                tVar.F().J(list, z);
            } else {
                if (!z) {
                    acVar.p.c(i2, e.a.f.a.a.a.CANCEL);
                }
                tVar.F().o(eeVarG, false, new cm());
            }
            z2 = false;
        }
        if (z2) {
            ac acVar2 = this.f47608c;
            e.a.f.a.a.a aVar = e.a.f.a.a.a.PROTOCOL_ERROR;
            acVar2.ai(0, aVar, ac.l(aVar).c("Received header for unknown stream: " + i2));
        }
    }

    @Override // e.a.f.a.a.b
    public final void h(e.a.f.a.a.p pVar) {
        boolean zG;
        this.f47609d.e(1, pVar);
        ac acVar = this.f47608c;
        synchronized (acVar.r) {
            if (pVar.e(4)) {
                acVar.L = pVar.a(4);
            }
            if (pVar.e(7)) {
                zG = acVar.q.g(pVar.a(7));
            } else {
                zG = false;
            }
            if (this.f47607b) {
                gd gdVar = acVar.o;
                e.a.c cVar = acVar.B;
                gdVar.h();
                acVar.B = cVar;
                acVar.o.b();
                this.f47607b = false;
            }
            acVar.p.a(pVar);
            if (zG) {
                acVar.q.f();
            }
            acVar.al();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ac acVar;
        ee eeVarG;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (true) {
            try {
                boolean zA = this.f47606a.a(this);
                acVar = this.f47608c;
                if (!zA) {
                    break;
                } else if (acVar.O != null) {
                    acVar.O.k();
                }
            } catch (Throwable th) {
                try {
                    this.f47608c.ai(0, e.a.f.a.a.a.PROTOCOL_ERROR, ee.f47410j.g("error in frame handler").f(th));
                } catch (Throwable th2) {
                    try {
                        this.f47606a.close();
                    } catch (IOException e2) {
                        ac.f47612e.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e2);
                    } catch (RuntimeException e3) {
                        if (!"bio == null".equals(e3.getMessage())) {
                            throw e3;
                        }
                    }
                    this.f47608c.o.d();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (acVar.r) {
            eeVarG = acVar.C;
        }
        if (eeVarG == null) {
            eeVarG = ee.f47411k.g("End of stream or IOException");
        }
        this.f47608c.ai(0, e.a.f.a.a.a.INTERNAL_ERROR, eeVarG);
        try {
            this.f47606a.close();
        } catch (IOException e4) {
            ac.f47612e.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e4);
        } catch (RuntimeException e5) {
            if (!"bio == null".equals(e5.getMessage())) {
                throw e5;
            }
        }
        this.f47608c.o.d();
        Thread.currentThread().setName(name);
    }
}
