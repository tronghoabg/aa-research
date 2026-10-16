package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cm extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39689a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39690b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ co f39691c;

    /* renamed from: d, reason: collision with root package name */
    int f39692d;

    /* renamed from: e, reason: collision with root package name */
    co f39693e;

    /* renamed from: f, reason: collision with root package name */
    String f39694f;

    /* renamed from: g, reason: collision with root package name */
    String f39695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cm(co coVar, h.c.e eVar) {
        super(eVar);
        this.f39691c = coVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39690b = obj;
        this.f39692d |= Integer.MIN_VALUE;
        return co.a(this.f39691c, null, null, this);
    }
}
