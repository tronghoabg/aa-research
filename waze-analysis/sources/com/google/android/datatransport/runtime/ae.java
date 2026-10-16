package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f4153a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f4154b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.e f4155c;

    private ae(c.b.e eVar, c.b.e eVar2, c.b.e eVar3) {
        this.f4153a = eVar;
        this.f4154b = eVar2;
        this.f4155c = eVar3;
    }

    public static ae a(c.b.e eVar, c.b.e eVar2, c.b.e eVar3) {
        return new ae(eVar, eVar2, eVar3);
    }

    @Override // g.a.a, f.a.a
    public final /* bridge */ /* synthetic */ Object get() {
        return new ac(p.c(), p.d(), ((com.google.android.datatransport.runtime.scheduling.b) this.f4153a).get(), ((com.google.android.datatransport.runtime.scheduling.jobscheduling.l) this.f4154b).get(), ((com.google.android.datatransport.runtime.scheduling.jobscheduling.n) this.f4155c).get());
    }
}
