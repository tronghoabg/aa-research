package com.waze.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f18225a;

    /* renamed from: b, reason: collision with root package name */
    Object f18226b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f18227c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f18228d;

    /* renamed from: e, reason: collision with root package name */
    int f18229e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.sharedui.e.c f18230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f18228d = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18227c = obj;
        this.f18229e |= Integer.MIN_VALUE;
        return this.f18228d.a(null, false, this);
    }
}
