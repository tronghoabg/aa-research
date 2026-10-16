package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class in extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40246a;

    /* renamed from: b, reason: collision with root package name */
    Object f40247b;

    /* renamed from: c, reason: collision with root package name */
    long f40248c;

    /* renamed from: d, reason: collision with root package name */
    int f40249d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f40250e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ip f40251f;

    /* renamed from: g, reason: collision with root package name */
    int f40252g;

    /* renamed from: h, reason: collision with root package name */
    com.waze.ce.b f40253h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    in(ip ipVar, h.c.e eVar) {
        super(eVar);
        this.f40251f = ipVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40250e = obj;
        this.f40252g |= Integer.MIN_VALUE;
        return this.f40251f.b(null, 0, null, null, this);
    }
}
