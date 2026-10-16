package com.waze.sound;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39875a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.a.c f39876b;

    /* renamed from: c, reason: collision with root package name */
    private final iv f39877c;

    /* renamed from: d, reason: collision with root package name */
    private final ik f39878d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.ab f39879e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.af f39880f;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap f39881g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f39882h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f39883i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f39884j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39885k;

    public eb(com.waze.shared_infra.i.e eVar, com.waze.sound.a.c cVar, iv ivVar, ik ikVar, dx dxVar, kotlinx.coroutines.ab abVar, kotlinx.coroutines.ab abVar2) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(ivVar, "voiceFilesProvider");
        h.g.b.x.f(ikVar, "dataSource");
        h.g.b.x.f(dxVar, "config");
        h.g.b.x.f(abVar, "mainDispatcher");
        h.g.b.x.f(abVar2, "ioDispatcher");
        this.f39875a = eVar;
        this.f39876b = cVar;
        this.f39877c = ivVar;
        this.f39878d = ikVar;
        this.f39879e = abVar2;
        this.f39880f = kotlinx.coroutines.aj.e(abVar);
        this.f39881g = new ConcurrentHashMap();
        this.f39882h = new AtomicReference("");
        this.f39883i = new AtomicInteger(0);
        this.f39884j = new AtomicInteger(0);
        this.f39885k = kotlinx.coroutines.b.ck.b(Float.valueOf(0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object f(com.waze.sound.eb r7, com.waze.sound.ak r8, h.c.e r9) {
        /*
            boolean r0 = r9 instanceof com.waze.sound.dy
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.sound.dy r0 = (com.waze.sound.dy) r0
            int r1 = r0.f39829c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39829c = r1
            goto L18
        L13:
            com.waze.sound.dy r0 = new com.waze.sound.dy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f39827a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39829c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            e.b.c.b(r9)
            goto L5a
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            e.b.c.b(r9)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            com.waze.config.c r2 = com.waze.config.ConfigValues.CONFIG_VALUE_VOICES_CUSTOM_START_ANNOUNCEMENT_MAX_DOWNLOAD_TIME_SECONDS
            java.lang.Long r2 = r2.b()
            java.lang.String r5 = "getValue(...)"
            h.g.b.x.e(r2, r5)
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            long r5 = r9.toMillis(r5)
            com.waze.sound.dz r9 = new com.waze.sound.dz
            r2 = 0
            r9.<init>(r7, r8, r2, r3)
            h.g.a.p r9 = (h.g.a.p) r9
            r0.f39829c = r4
            java.lang.Object r9 = kotlinx.coroutines.aj.I(r5, r9, r0)
            if (r9 == r1) goto L67
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L62
            boolean r3 = r9.booleanValue()
        L62:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.eb.f(com.waze.sound.eb, com.waze.sound.ak, h.c.e):java.lang.Object");
    }

    static /* synthetic */ Object h(eb ebVar, com.google.v.v vVar, h.c.e eVar) {
        com.waze.sound.a.b bVarC = ebVar.f39876b.c();
        if (bVarC == null) {
            return null;
        }
        Object objC = ebVar.f39878d.c(bVarC.a().f(), bVarC.a().a(), vVar, ij.f40237a, eVar);
        return objC == h.c.a.a.f48038a ? objC : (ak) objC;
    }

    public final ap b(an anVar, String str) {
        h.g.b.x.f(anVar, "clientAnnouncement");
        h.g.b.x.f(str, "routeUUID");
        return (ap) this.f39881g.get(new h.k(str, Long.valueOf(anVar.b())));
    }

    public final kotlinx.coroutines.b.ch k() {
        return kotlinx.coroutines.b.ai.U(this.f39885k);
    }

    public final void l() {
        this.f39875a.a("Clearing all voice assets");
        this.f39881g.clear();
    }

    public final void m(List list, String str) {
        h.g.b.x.f(list, "instructions");
        h.g.b.x.f(str, "routeUUID");
        this.f39885k.e(Float.valueOf(0.0f));
        this.f39883i.set(0);
        this.f39884j.set(0);
        this.f39882h.set(str);
        String strConcat = "downloadVoiceInstructions. Route: ".concat(String.valueOf(str));
        com.waze.shared_infra.i.e eVar = this.f39875a;
        eVar.a(strConcat);
        com.waze.sound.a.c cVar = this.f39876b;
        com.waze.sound.a.b bVarC = cVar.c();
        if (bVarC == null) {
            eVar.g("Not sending GenerateInstructionVoiceAssetsRequest. Voice is null");
            return;
        }
        if (cVar.h()) {
            eVar.g("Not sending GenerateInstructionVoiceAssetsRequest. Voice " + bVarC + " is custom prompt");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eb ebVar = this;
            String str2 = str;
            kotlinx.coroutines.aj.z(this.f39880f, null, null, new ef(ebVar, (jn) it.next(), bVarC, str2, (h.c.e) null, 1), 3);
            this = ebVar;
            str = str2;
        }
    }

    public final void n(String str) {
        h.g.b.x.f(str, "requestRouteUuid");
        AtomicReference atomicReference = this.f39882h;
        if (!h.g.b.x.n(str, atomicReference.get())) {
            this.f39875a.g("Ignoring chunk download failure for stale route: " + str + " (Current: " + atomicReference.get() + ")");
            return;
        }
        AtomicInteger atomicInteger = this.f39883i;
        AtomicInteger atomicInteger2 = this.f39884j;
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        int i2 = atomicInteger2.get();
        if (i2 > 0) {
            this.f39885k.e(Float.valueOf((iIncrementAndGet / i2) * 100.0f));
        }
        this.f39875a.a("Chunk download failed. Failed: " + iIncrementAndGet + ", Total: " + i2 + ", Percentage: " + this.f39885k.d() + "%");
    }

    public final void o(String str) {
        h.g.b.x.f(str, "requestRouteUuid");
        AtomicReference atomicReference = this.f39882h;
        boolean zN = h.g.b.x.n(str, atomicReference.get());
        com.waze.shared_infra.i.e eVar = this.f39875a;
        if (zN) {
            eVar.a("Instruction metadata download failed. Not counting towards failure percentage.");
            return;
        }
        eVar.g("Ignoring metadata download failure for stale route: " + str + " (Current: " + atomicReference.get() + ")");
    }
}
