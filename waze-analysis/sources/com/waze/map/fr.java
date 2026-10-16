package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fr extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f28990a;

    /* renamed from: b, reason: collision with root package name */
    Object f28991b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f28992c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fs f28993d;

    /* renamed from: e, reason: collision with root package name */
    int f28994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fr(fs fsVar, h.c.e eVar) {
        super(eVar);
        this.f28993d = fsVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28992c = obj;
        this.f28994e |= Integer.MIN_VALUE;
        return this.f28993d.emit(null, this);
    }
}
