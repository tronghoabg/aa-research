package com.waze.sound;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class el implements com.waze.h.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f39931a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.h.b.i f39932b;

    /* renamed from: c, reason: collision with root package name */
    private final ec f39933c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39934d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sound.c.f f39935e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sound.c.f f39936f;

    /* renamed from: g, reason: collision with root package name */
    private final z f39937g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.ab f39938h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.ab f39939i;

    /* renamed from: j, reason: collision with root package name */
    private kotlinx.coroutines.br f39940j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39941k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f39942l;

    public el(Context context, com.waze.shared_infra.i.b bVar, com.waze.h.b.i iVar, ec ecVar, com.waze.shared_infra.i.e eVar, com.waze.sound.c.f fVar, com.waze.sound.c.f fVar2, z zVar, kotlinx.coroutines.ab abVar, kotlinx.coroutines.ab abVar2) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(iVar, "silenceDetector");
        h.g.b.x.f(ecVar, "config");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(fVar, "wavEncoder");
        h.g.b.x.f(fVar2, "oggOpusEncoder");
        h.g.b.x.f(zVar, "audioInputRepository");
        h.g.b.x.f(abVar, "mainDispatcher");
        h.g.b.x.f(abVar2, "ioDispatcher");
        this.f39931a = bVar;
        this.f39932b = iVar;
        this.f39933c = ecVar;
        this.f39934d = eVar;
        this.f39935e = fVar;
        this.f39936f = fVar2;
        this.f39937g = zVar;
        this.f39938h = abVar;
        this.f39939i = abVar2;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(com.waze.h.b.o.f24332a);
        this.f39941k = bnVarB;
        this.f39942l = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (r7.collect(r8, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object h(com.waze.sound.el r6, kotlinx.coroutines.b.k r7, com.waze.h.c.a r8, com.waze.h.c.b r9, h.c.e r10) {
        /*
            boolean r0 = r10 instanceof com.waze.sound.ee
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.sound.ee r0 = (com.waze.sound.ee) r0
            int r1 = r0.f39896d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39896d = r1
            goto L18
        L13:
            com.waze.sound.ee r0 = new com.waze.sound.ee
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f39894b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39896d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L29
            if (r2 != r3) goto L33
        L29:
            e.b.c.b(r10)
            h.m r10 = (h.m) r10
            java.lang.Object r6 = r10.b()
            return r6
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f39893a
            java.io.ByteArrayOutputStream r6 = (java.io.ByteArrayOutputStream) r6
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L90
            goto L8b
        L43:
            e.b.c.b(r10)
            com.waze.h.c.b r10 = com.waze.h.c.b.f24340a
            int r9 = r9.ordinal()
            if (r9 == 0) goto L70
            if (r9 == r5) goto L64
            if (r9 != r4) goto L5e
            com.waze.sound.c.f r6 = r6.f39936f
            r0.f39896d = r3
            java.lang.Object r6 = r6.a(r7, r8, r0)
            if (r6 != r1) goto L5d
            goto L8a
        L5d:
            return r6
        L5e:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        L64:
            com.waze.sound.c.f r6 = r6.f39935e
            r0.f39896d = r4
            java.lang.Object r6 = r6.a(r7, r8, r0)
            if (r6 != r1) goto L6f
            goto L8a
        L6f:
            return r6
        L70:
            com.waze.sound.el r6 = (com.waze.sound.el) r6     // Catch: java.lang.Throwable -> L90
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L90
            r6.<init>()     // Catch: java.lang.Throwable -> L90
            com.waze.sound.bh r8 = new com.waze.sound.bh     // Catch: java.lang.Throwable -> L90
            r9 = 10
            r8.<init>(r6, r9)     // Catch: java.lang.Throwable -> L90
            kotlinx.coroutines.b.l r8 = (kotlinx.coroutines.b.l) r8     // Catch: java.lang.Throwable -> L90
            r0.f39893a = r6     // Catch: java.lang.Throwable -> L90
            r0.f39896d = r5     // Catch: java.lang.Throwable -> L90
            java.lang.Object r7 = r7.collect(r8, r0)     // Catch: java.lang.Throwable -> L90
            if (r7 != r1) goto L8b
        L8a:
            return r1
        L8b:
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L90
            return r6
        L90:
            r6 = move-exception
            java.lang.Object r6 = e.b.c.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.el.h(com.waze.sound.el, kotlinx.coroutines.b.k, com.waze.h.c.a, com.waze.h.c.b, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void l(el elVar, byte[] bArr, com.waze.h.c.b bVar) {
        int length = bArr.length;
        long jP = length / h.o.a.p(elVar.f39933c.a());
        boolean z = false;
        if (bVar == com.waze.h.c.b.f24342c && jP < 2000) {
            z = true;
        }
        elVar.f39934d.a("timeout. total bytes " + length + ", bytes per second: " + jP + ", probably-silent? " + z);
        elVar.f39931a.a(new RuntimeException("Sound recording timeout"), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        Object objA;
        try {
            el elVar = this;
            objA = null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f39934d.c("Could not clean temp files", thC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(com.waze.authentication.ax axVar, boolean z) {
        Object objD;
        kotlinx.coroutines.b.bn bnVar = this.f39941k;
        if (h.g.b.x.n(axVar, bnVar.d())) {
            return;
        }
        if (z) {
            this.f39934d.a("setStateTo : " + bnVar.d() + " -> " + axVar);
        }
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, axVar));
    }

    @Override // com.waze.h.b.r
    public final Object a(com.waze.h.c.b bVar, h.c.e eVar) {
        return kotlinx.coroutines.aj.d(new eg(this, bVar, null), eVar);
    }

    @Override // com.waze.h.b.r
    public final kotlinx.coroutines.b.ch b() {
        return this.f39942l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q();
        kotlinx.coroutines.br brVar = this.f39940j;
        if (brVar != null) {
            brVar.s(new CancellationException("close() was called during recording"));
        }
        r(com.waze.h.b.o.f24332a, true);
    }
}
