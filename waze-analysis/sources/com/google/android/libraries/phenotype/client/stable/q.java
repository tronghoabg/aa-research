package com.google.android.libraries.phenotype.client.stable;

import android.util.Log;
import com.google.d.d.ci;
import com.google.d.m.a.bm;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6146b = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile ax f6148d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.h f6149e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6150f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6151g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6152h;

    /* renamed from: i, reason: collision with root package name */
    private final ci f6153i;

    /* renamed from: j, reason: collision with root package name */
    private final ay f6154j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.a.a.d f6155k;

    /* renamed from: c, reason: collision with root package name */
    private static final p f6147c = new p();

    /* renamed from: a, reason: collision with root package name */
    static final n f6145a = new n(new l(0), false, ci.o());

    /* synthetic */ q(com.google.android.libraries.phenotype.client.h hVar, n nVar) {
        this.f6149e = hVar;
        String strB = nVar.b(hVar.a());
        this.f6150f = strB;
        this.f6151g = "";
        this.f6152h = nVar.c();
        this.f6153i = nVar.a();
        this.f6148d = null;
        this.f6155k = new com.google.android.datatransport.runtime.a.a.d();
        this.f6154j = new ay(hVar, strB, "", false);
    }

    public static p a() {
        return f6147c;
    }

    public static /* synthetic */ bm b(q qVar, ax axVar, com.google.android.libraries.phenotype.client.a.m mVar) {
        int iA = mVar.a();
        if ((iA == 29501 || iA == 29537 || iA == 29538 || iA == 29539 || iA == 29540 || iA == 29541 || iA == 29542 || iA == 29543 || iA == 29544 || iA == 29547) && axVar.l()) {
            qVar.q();
        }
        return com.google.d.m.a.bd.i();
    }

    public static /* synthetic */ void e(q qVar, bm bmVar) {
        try {
            com.google.d.m.a.bd.o(bmVar);
        } catch (Exception e2) {
            Log.w("FlagStore", "Failed to store account on flag read for: " + qVar.f6150f + " which may lead to stale flags.", e2);
        }
    }

    public static /* synthetic */ void g(q qVar) {
        com.google.android.libraries.phenotype.client.h hVar = qVar.f6149e;
        bm bmVarE = ae.e(hVar, qVar.f6150f);
        bmVarE.addListener(new android.support.v4.app.ac(qVar, bmVarE, 8, null), hVar.j());
    }

    static /* bridge */ /* synthetic */ boolean j(q qVar) {
        if (!qVar.f6152h) {
            return true;
        }
        ax axVar = qVar.f6148d;
        if (axVar == null) {
            return false;
        }
        if (!axVar.k() && !axVar.j() && !qVar.f6154j.e()) {
            return false;
        }
        synchronized (qVar) {
            ax axVar2 = qVar.f6148d;
            if (axVar2 != null && (axVar2.k() || axVar2.j() || qVar.f6154j.e())) {
                qVar.f6148d = null;
                qVar.f6155k.d();
            }
        }
        return false;
    }

    public static /* synthetic */ void l(final q qVar) {
        bm bmVarD;
        final ax axVarP = qVar.p();
        String strG = axVarP.g();
        com.google.android.libraries.phenotype.client.h hVar = qVar.f6149e;
        as asVarA = hVar.f().a(false);
        if (asVarA.g()) {
            if (com.google.d.b.an.f(strG) && !asVarA.f()) {
                com.google.d.m.a.bd.i();
                return;
            }
            com.google.android.libraries.phenotype.client.a.a aVarNewBuilder = com.google.android.libraries.phenotype.client.a.f.newBuilder();
            aVarNewBuilder.b(axVarP.a());
            if (!com.google.d.b.an.f(strG)) {
                aVarNewBuilder.c(strG);
            }
            if (asVarA.f()) {
                aVarNewBuilder.a(qVar.f6150f);
            }
            bmVarD = hVar.m().e(aVarNewBuilder.build());
        } else {
            if (com.google.d.b.an.f(strG)) {
                com.google.d.m.a.bd.i();
                return;
            }
            bmVarD = hVar.m().d(strG);
        }
        com.google.d.m.a.bd.e(bmVarD, com.google.android.libraries.phenotype.client.a.m.class, new com.google.d.m.a.ag() { // from class: com.google.android.libraries.phenotype.client.stable.m
            @Override // com.google.d.m.a.ag
            public final bm apply(Object obj) {
                return q.b(this.f6135a, axVarP, (com.google.android.libraries.phenotype.client.a.m) obj);
            }
        }, hVar.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x00ae, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0013, B:24:0x009a, B:26:0x009e, B:28:0x00a4, B:12:0x001e, B:14:0x002d, B:16:0x0037, B:17:0x004e, B:19:0x0075, B:20:0x0083, B:22:0x008b, B:30:0x00a8, B:31:0x00ab, B:32:0x00ac, B:8:0x000d), top: B:40:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.libraries.phenotype.client.stable.ax p() {
        /*
            r6 = this;
            com.google.android.libraries.phenotype.client.stable.ax r0 = r6.f6148d
            if (r0 != 0) goto Lb1
            monitor-enter(r6)
            com.google.android.libraries.phenotype.client.stable.ax r0 = r6.f6148d     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto Lac
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> Lae
            com.google.android.libraries.phenotype.client.stable.ay r1 = r6.f6154j     // Catch: java.lang.Throwable -> La7
            com.google.android.libraries.phenotype.client.stable.ax r1 = r1.a()     // Catch: java.lang.Throwable -> La7
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r1.h()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L1e
            goto L99
        L1e:
            com.google.android.libraries.phenotype.client.h r0 = r6.f6149e     // Catch: java.lang.Throwable -> Lae
            com.google.android.libraries.phenotype.client.stable.bh r2 = r0.f()     // Catch: java.lang.Throwable -> Lae
            r2.g()     // Catch: java.lang.Throwable -> Lae
            boolean r2 = r1.l()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L4e
            java.lang.String r2 = r1.g()     // Catch: java.lang.Throwable -> Lae
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L4e
            com.google.d.m.a.bo r0 = r0.j()     // Catch: java.lang.Throwable -> Lae
            android.support.v4.app.ae r2 = new android.support.v4.app.ae     // Catch: java.lang.Throwable -> Lae
            r3 = 13
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> Lae
            r0.execute(r2)     // Catch: java.lang.Throwable -> Lae
            com.google.android.libraries.phenotype.client.stable.ba r0 = com.google.android.libraries.phenotype.client.stable.ba.getDefaultInstance()     // Catch: java.lang.Throwable -> Lae
            com.google.android.libraries.phenotype.client.stable.ax r0 = com.google.android.libraries.phenotype.client.stable.ax.d(r0, r1)     // Catch: java.lang.Throwable -> Lae
            goto L9a
        L4e:
            com.google.d.m.a.bo r2 = r0.j()     // Catch: java.lang.Throwable -> Lae
            android.support.v4.app.ae r3 = new android.support.v4.app.ae     // Catch: java.lang.Throwable -> Lae
            r4 = 14
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> Lae
            r2.execute(r3)     // Catch: java.lang.Throwable -> Lae
            com.google.android.libraries.phenotype.client.stable.j r2 = r0.k()     // Catch: java.lang.Throwable -> Lae
            com.google.v.v r3 = r1.f()     // Catch: java.lang.Throwable -> Lae
            com.google.d.d.ci r4 = r6.f6153i     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = r6.f6150f     // Catch: java.lang.Throwable -> Lae
            r2.a(r3, r4, r5)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = r6.f6151g     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto L83
            com.google.d.m.a.bo r2 = r0.j()     // Catch: java.lang.Throwable -> Lae
            android.support.v4.app.ae r3 = new android.support.v4.app.ae     // Catch: java.lang.Throwable -> Lae
            r4 = 15
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> Lae
            r2.execute(r3)     // Catch: java.lang.Throwable -> Lae
        L83:
            com.google.android.libraries.phenotype.client.stable.ay r2 = r6.f6154j     // Catch: java.lang.Throwable -> Lae
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L99
            com.google.d.m.a.bo r0 = r0.j()     // Catch: java.lang.Throwable -> Lae
            android.support.v4.app.ae r2 = new android.support.v4.app.ae     // Catch: java.lang.Throwable -> Lae
            r3 = 16
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> Lae
            r0.execute(r2)     // Catch: java.lang.Throwable -> Lae
        L99:
            r0 = r1
        L9a:
            boolean r1 = r6.f6152h     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La4
            boolean r1 = r0.i()     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto Lac
        La4:
            r6.f6148d = r0     // Catch: java.lang.Throwable -> Lae
            goto Lac
        La7:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> Lae
            throw r1     // Catch: java.lang.Throwable -> Lae
        Lac:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lae
            return r0
        Lae:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lae
            throw r0
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.q.p():com.google.android.libraries.phenotype.client.stable.ax");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        ay ayVar = this.f6154j;
        bm bmVarB = ayVar.b(this.f6151g);
        Objects.requireNonNull(ayVar);
        am amVar = new am(ayVar, 1);
        com.google.android.libraries.phenotype.client.h hVar = this.f6149e;
        com.google.d.m.a.bd.n(bmVarB, amVar, hVar.j()).addListener(new android.support.v4.app.ac(this, bmVarB, 9, null), hVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: CancellationException | ExecutionException -> 0x006b, ExecutionException -> 0x006d, TryCatch #3 {CancellationException | ExecutionException -> 0x006b, blocks: (B:2:0x0000, B:4:0x0017, B:12:0x0024, B:14:0x0032, B:16:0x003a, B:20:0x0046, B:22:0x004a, B:6:0x001b, B:26:0x006a, B:8:0x001e, B:11:0x0023, B:18:0x003e, B:19:0x0045), top: B:35:0x0000, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void r(com.google.d.m.a.bm r5) {
        /*
            r4 = this;
            java.lang.Object r5 = com.google.d.m.a.bd.o(r5)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.android.libraries.phenotype.client.stable.ba r5 = (com.google.android.libraries.phenotype.client.stable.ba) r5     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.android.libraries.phenotype.client.stable.aw r0 = new com.google.android.libraries.phenotype.client.stable.aw     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.android.libraries.phenotype.client.a.d r1 = com.google.android.libraries.phenotype.client.a.d.GET_CONFIGURATION_SNAPSHOT_CALL     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.android.libraries.phenotype.client.a.c r2 = com.google.android.libraries.phenotype.client.a.c.ERROR_UNSPECIFIED     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.android.libraries.phenotype.client.stable.ax r0 = com.google.android.libraries.phenotype.client.stable.ax.b(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            boolean r1 = r4.f6152h     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            if (r1 != 0) goto L1b
            com.google.android.libraries.phenotype.client.stable.ax r2 = r4.f6148d     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            if (r2 != 0) goto L24
        L1b:
            monitor-enter(r4)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            if (r1 != 0) goto L3e
            com.google.android.libraries.phenotype.client.stable.ax r2 = r4.f6148d     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L23
            goto L3e
        L23:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
        L24:
            com.google.d.d.bs r1 = r2.e()     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.d.d.bs r0 = r0.e()     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            boolean r0 = r1.equals(r0)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            if (r0 != 0) goto L46
            com.google.android.libraries.phenotype.client.h r5 = r4.f6149e     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.android.libraries.phenotype.client.stable.ar r5 = r5.e()     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            if (r5 == 0) goto L90
            r5.a()     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            return
        L3e:
            r4.f6148d = r0     // Catch: java.lang.Throwable -> L68
            com.google.android.datatransport.runtime.a.a.d r0 = r4.f6155k     // Catch: java.lang.Throwable -> L68
            r0.d()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
        L46:
            boolean r0 = r4.f6152h     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            if (r0 == 0) goto L90
            com.google.android.libraries.phenotype.client.h r0 = r4.f6149e     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.bumptech.glide.load.c.e.e r1 = r0.m()     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            java.lang.String r5 = r5.getSnapshotToken()     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.d.m.a.bm r5 = r1.d(r5)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            com.google.android.libraries.phenotype.client.stable.ac r2 = new com.google.android.libraries.phenotype.client.stable.ac     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            r3 = 1
            r2.<init>(r4, r3)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.d.m.a.bo r0 = r0.j()     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            com.google.d.m.a.bd.d(r5, r1, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
            return
        L68:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.util.concurrent.CancellationException -> L6b java.util.concurrent.ExecutionException -> L6d
        L6b:
            r5 = move-exception
            goto L6e
        L6d:
            r5 = move-exception
        L6e:
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L90
            java.lang.String r4 = r4.f6150f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to update local snapshot for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ", may result in stale flags."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FlagStore"
            android.util.Log.w(r0, r4, r5)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.q.r(com.google.d.m.a.bm):void");
    }

    final String c() {
        return this.f6150f;
    }

    final Object n() {
        return p().e().get("Passkeys__json_for_parcelables");
    }

    final com.google.android.datatransport.runtime.a.a.d o() {
        return this.f6155k;
    }
}
