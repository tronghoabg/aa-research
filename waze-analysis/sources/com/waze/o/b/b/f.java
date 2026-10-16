package com.waze.o.b.b;

import com.waze.reports_v2.b.aq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements com.waze.o.c.c.c {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f32732a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32733b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.o.c.c.d f32734c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.m.a f32735d;

    /* renamed from: e, reason: collision with root package name */
    private final m f32736e;

    /* renamed from: f, reason: collision with root package name */
    private final aq f32737f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.o.c.c.b f32738g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f32739h;

    public f(h.c.j jVar, com.waze.shared_infra.i.e eVar, com.waze.o.c.c.d dVar, com.waze.shared_infra.m.a aVar, m mVar, aq aqVar, com.waze.o.c.c.b bVar) {
        x.f(jVar, "coroutineContext");
        x.f(eVar, "logger");
        x.f(dVar, "controllerStarter");
        x.f(aVar, "mediaVolumeRepository");
        x.f(mVar, "reportLocationSnapper");
        x.f(aqVar, "reportPointsProvider");
        x.f(bVar, "config");
        this.f32732a = jVar;
        this.f32733b = eVar;
        this.f32734c = dVar;
        this.f32735d = aVar;
        this.f32736e = mVar;
        this.f32737f = aqVar;
        this.f32738g = bVar;
        this.f32739h = h.g.a(new h.g.a.a() { // from class: com.waze.o.b.b.e
            @Override // h.g.a.a
            public final Object invoke() {
                return f.a(this.f32731a);
            }
        });
    }

    static final k a(f fVar) {
        if (fVar.f32738g.d()) {
            return new k(fVar.f32732a, fVar.f32733b, fVar.f32734c, fVar.f32735d, fVar.f32736e, fVar.f32737f);
        }
        fVar.f32733b.a("CompaninioController was not created: feature disabled.");
        return null;
    }

    @Override // com.waze.o.c.c.c
    public final k b() {
        return (k) this.f32739h.getValue();
    }
}
