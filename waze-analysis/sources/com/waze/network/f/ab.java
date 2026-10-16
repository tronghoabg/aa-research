package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final x f32269a;

    /* renamed from: b, reason: collision with root package name */
    private final d f32270b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32271c;

    public ab(x xVar, d dVar) {
        h.g.b.x.f(xVar, "sessionRealtimeAdapter");
        h.g.b.x.f(dVar, "hasSessionAdapter");
        this.f32269a = xVar;
        this.f32270b = dVar;
        this.f32271c = "SessionRealtimeAdapter";
    }

    public static final /* synthetic */ Object d(ab abVar, h.c.e eVar) {
        Object objE = kotlinx.coroutines.b.ai.e(abVar.f32270b.a(), new aa(abVar, null), eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        Object objO = kotlinx.coroutines.aj.O(new z(this, null), eVar);
        return objO == h.c.a.a.f48038a ? objO : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f32271c;
    }
}
