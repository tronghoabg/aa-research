package com.google.firebase.perf;

import com.google.android.datatransport.runtime.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f10416a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f10417b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.e f10418c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.e f10419d;

    private f(c.b.e eVar, c.b.e eVar2, c.b.e eVar3, c.b.e eVar4) {
        this.f10416a = eVar;
        this.f10417b = eVar2;
        this.f10418c = eVar3;
        this.f10419d = eVar4;
    }

    public static f a(c.b.e eVar, c.b.e eVar2, c.b.e eVar3, c.b.e eVar4) {
        return new f(eVar, eVar2, eVar3, eVar4);
    }

    @Override // g.a.a, f.a.a
    public final /* bridge */ /* synthetic */ Object get() {
        return new d(((com.google.firebase.perf.b.b.b) this.f10416a).get(), ((com.google.firebase.perf.b.b.d) this.f10417b).a(), ((com.google.firebase.perf.b.b.c) this.f10418c).get(), ((com.google.firebase.perf.b.b.d) this.f10419d).a(), p.f(), p.e(), p.g());
    }
}
