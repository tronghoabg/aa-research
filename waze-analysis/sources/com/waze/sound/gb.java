package com.waze.sound;

import android.media.AudioManager;
import androidx.media3.exoplayer.ExoPlayer;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    private final cj f40068a;

    /* renamed from: b, reason: collision with root package name */
    private final p f40069b;

    /* renamed from: c, reason: collision with root package name */
    private final fc f40070c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f40071d;

    /* renamed from: e, reason: collision with root package name */
    private final bs f40072e;

    /* renamed from: f, reason: collision with root package name */
    private final gf f40073f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40074g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40075h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.ab f40076i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f40077j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.a.o f40078k;

    /* renamed from: l, reason: collision with root package name */
    private final CompletableDeferred f40079l;
    private final kotlinx.coroutines.af m;
    private final com.waze.main_screen.ag.a.c n;

    public gb(cj cjVar, p pVar, fc fcVar, AudioManager audioManager, bs bsVar, com.waze.main_screen.ag.a.c cVar, gf gfVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.i.b bVar, kotlinx.coroutines.ab abVar, kotlinx.coroutines.ab abVar2) {
        h.g.b.x.f(cjVar, "playerFactory");
        h.g.b.x.f(pVar, "audioFocusManager");
        h.g.b.x.f(fcVar, "soundOutputRoutingManager");
        h.g.b.x.f(audioManager, "audioManager");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(cVar, "config");
        h.g.b.x.f(gfVar, "soundPlayerStatSender");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(abVar, "ioDispatcher");
        h.g.b.x.f(abVar2, "mainDispatcher");
        this.f40068a = cjVar;
        this.f40069b = pVar;
        this.f40070c = fcVar;
        this.f40071d = audioManager;
        this.f40072e = bsVar;
        this.n = cVar;
        this.f40073f = gfVar;
        this.f40074g = eVar;
        this.f40075h = bVar;
        this.f40076i = abVar2;
        this.f40077j = kotlinx.coroutines.b.ck.b(new fn(fo.f40028a, false, 0));
        this.f40078k = h.g.b.w.c(32, null, null, 6);
        this.f40079l = kotlinx.coroutines.bo.j();
        this.m = kotlinx.coroutines.aj.e(abVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r13 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r13 == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0057, code lost:
    
        y(r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.waze.sound.gb] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.sound.gj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.waze.sound.gj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0075 -> B:27:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008a -> B:42:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c8 -> B:42:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0108 -> B:49:0x010a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.sound.gb r12, h.c.e r13) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.gb.f(com.waze.sound.gb, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (kotlinx.coroutines.aj.v(r2, r4, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.sound.gb r6, boolean r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.sound.fz
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sound.fz r0 = (com.waze.sound.fz) r0
            int r1 = r0.f40064d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40064d = r1
            goto L18
        L13:
            com.waze.sound.fz r0 = new com.waze.sound.fz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f40062b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40064d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r7 = r0.f40061a
            e.b.c.b(r8)
            goto L46
        L38:
            e.b.c.b(r8)
            r0.f40061a = r7
            r0.f40064d = r4
            java.lang.Object r8 = r6.u(r0)
            if (r8 != r1) goto L46
            goto L61
        L46:
            androidx.media3.exoplayer.ExoPlayer r8 = (androidx.media3.exoplayer.ExoPlayer) r8
            if (r8 != 0) goto L4d
            h.ab r6 = h.ab.f48028a
            return r6
        L4d:
            kotlinx.coroutines.ab r2 = r6.f40076i
            h.c.j r2 = (h.c.j) r2
            com.waze.sound.ga r4 = new com.waze.sound.ga
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.f40064d = r3
            java.lang.Object r6 = kotlinx.coroutines.aj.v(r2, r4, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.gb.g(com.waze.sound.gb, boolean, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void j(gb gbVar) {
        com.waze.shared_infra.i.e eVar = gbVar.f40074g;
        eVar.a("Clearing Queue");
        while (kotlinx.coroutines.a.t.a(gbVar.f40078k.h()) != null) {
            eVar.a("Removed item from queue");
        }
        eVar.a("Queue cleared");
    }

    private final ExoPlayer t() {
        try {
            return (ExoPlayer) this.f40079l.e();
        } catch (IllegalStateException e2) {
            this.f40075h.a(new Exception("Attempted to access ExoPlayer before it was initialized", e2), null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.sound.fq
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.fq r0 = (com.waze.sound.fq) r0
            int r1 = r0.f40034c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40034c = r1
            goto L18
        L13:
            com.waze.sound.fq r0 = new com.waze.sound.fq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40032a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40034c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            com.waze.sound.bi r6 = new com.waze.sound.bi
            r2 = 0
            r4 = 11
            r6.<init>(r5, r2, r4)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.f40034c = r3
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r6 = kotlinx.coroutines.aj.I(r2, r6, r0)
            if (r6 == r1) goto L61
        L46:
            androidx.media3.exoplayer.ExoPlayer r6 = (androidx.media3.exoplayer.ExoPlayer) r6
            if (r6 != 0) goto L60
            com.waze.shared_infra.i.e r0 = r5.f40074g
            java.lang.String r1 = "ExoPlayer initialization timed out after 5000ms"
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.b(r2)
            com.waze.shared_infra.i.b r5 = r5.f40075h
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.waze.shared_infra.h.b.f(r5, r0)
        L60:
            return r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.gb.u(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (kotlinx.coroutines.aj.v(r11, r4, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(int r11, boolean r12, h.c.e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.waze.sound.fs
            if (r0 == 0) goto L13
            r0 = r13
            com.waze.sound.fs r0 = (com.waze.sound.fs) r0
            int r1 = r0.f40040e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40040e = r1
            goto L18
        L13:
            com.waze.sound.fs r0 = new com.waze.sound.fs
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f40038c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40040e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r13)
            goto L67
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            boolean r12 = r0.f40037b
            int r11 = r0.f40036a
            e.b.c.b(r13)
            goto L49
        L3a:
            e.b.c.b(r13)
            r0.f40036a = r11
            r0.f40037b = r12
            r0.f40040e = r4
            java.lang.Object r13 = r10.u(r0)
            if (r13 == r1) goto L6a
        L49:
            r8 = r11
            r5 = r12
            r7 = r13
            androidx.media3.exoplayer.ExoPlayer r7 = (androidx.media3.exoplayer.ExoPlayer) r7
            if (r7 != 0) goto L51
            goto L67
        L51:
            kotlinx.coroutines.ab r11 = r10.f40076i
            h.c.j r11 = (h.c.j) r11
            com.waze.sound.ft r4 = new com.waze.sound.ft
            r9 = 0
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.f40040e = r3
            java.lang.Object r10 = kotlinx.coroutines.aj.v(r11, r4, r0)
            if (r10 != r1) goto L67
            goto L6a
        L67:
            h.ab r10 = h.ab.f48028a
            return r10
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.gb.v(int, boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0139, code lost:
    
        if (r11 != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.waze.sound.gj r12, h.c.e r13) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.gb.w(com.waze.sound.gj, h.c.e):java.lang.Object");
    }

    private final boolean x(gj gjVar) {
        boolean zC = ((fn) this.f40077j.d()).c();
        boolean z = false;
        if (gjVar.c()) {
            return false;
        }
        if (zC) {
            return true;
        }
        AudioManager audioManager = this.f40071d;
        boolean z2 = com.waze.sharedui.api.c.c(audioManager) && com.waze.main_screen.ag.a.c.c();
        boolean z3 = this.f40072e.b().d() == bp.f39558e;
        boolean z4 = z2 || z3;
        if (z4 && !gjVar.d()) {
            z = true;
        }
        this.f40074g.a("Should mute result = " + z + ", softMute = " + z4 + ", isHardMuted = false, ignoreHardMute = false, shouldMuteGuidance = " + z3 + ", isInACall = " + com.waze.sharedui.api.c.c(audioManager) + ", shouldMuteDuringCalls = " + com.waze.main_screen.ag.a.c.c());
        return z;
    }

    private static final void y(gj gjVar) {
        gjVar.b().invoke();
    }

    public final void m(gj gjVar) {
        h.g.b.x.f(gjVar, "soundProperties");
        if (t() == null) {
            gjVar.b().invoke();
            return;
        }
        Object objI = this.f40078k.i(gjVar);
        this.f40074g.a("Adding sound " + gjVar + " to queue result=" + kotlinx.coroutines.a.t.g(objI));
        if (objI instanceof kotlinx.coroutines.a.s) {
            gjVar.b().invoke();
        }
    }

    public final void n() {
        kotlinx.coroutines.aj.z(this.m, null, null, new aj(this, (h.c.e) null, 3), 3);
    }

    public final void o() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f40077j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, fn.d((fn) objD, null, true, 0, 5)));
    }

    public final void p() {
        ExoPlayer exoPlayerT = t();
        if (exoPlayerT == null) {
            return;
        }
        kotlinx.coroutines.aj.z(this.m, this.f40076i, null, new fy(exoPlayerT, this, (h.c.e) null, 0), 2);
    }

    public final void q() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f40077j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, fn.d((fn) objD, null, false, 0, 5)));
    }
}
