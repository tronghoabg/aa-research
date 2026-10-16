package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22878a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22879b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f22880c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f22881d;

    public w() {
        this.f22878a = h.g.a(new com.waze.main_screen.c.g.a(8));
        this.f22880c = h.g.a(new com.waze.main_screen.c.g.a(9));
        this.f22881d = h.g.a(new com.waze.main_screen.c.g.a(10));
        this.f22879b = h.g.a(new com.waze.main_screen.c.g.a(11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (((com.waze.copilot.a.bk) r9).a(r10, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.waze.copilot.data.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.copilot.a.w r8, com.waze.copilot.data.c r9, com.waze.mywaze.ag r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.w.b(com.waze.copilot.a.w, com.waze.copilot.data.c, com.waze.mywaze.ag, h.c.e):java.lang.Object");
    }

    public final Object a(com.waze.copilot.data.c cVar, com.waze.mywaze.ag agVar, h.c.e eVar) {
        return b(this, cVar, agVar, eVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.f, java.lang.Object] */
    public final int c() {
        return ((Number) this.f22878a.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.f, java.lang.Object] */
    public final int d() {
        return ((Number) this.f22880c.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long e() {
        return ((h.o.a) this.f22879b.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long f() {
        return ((h.o.a) this.f22881d.getValue()).w();
    }

    public w(com.waze.copilot.data.l lVar, bl blVar, bk bkVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(lVar, "copilotAssetDownloader");
        h.g.b.x.f(blVar, "setSelectedCarUseCase");
        h.g.b.x.f(bkVar, "setDefaultCarUseCase");
        h.g.b.x.f(eVar, "logger");
        this.f22878a = lVar;
        this.f22879b = blVar;
        this.f22880c = bkVar;
        this.f22881d = eVar;
    }
}
