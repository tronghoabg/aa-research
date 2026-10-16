package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bf extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f22778a;

    /* renamed from: b, reason: collision with root package name */
    boolean f22779b;

    /* renamed from: c, reason: collision with root package name */
    boolean f22780c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f22781d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bg f22782e;

    /* renamed from: f, reason: collision with root package name */
    int f22783f;

    /* renamed from: g, reason: collision with root package name */
    bg f22784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bg bgVar, h.c.e eVar) {
        super(eVar);
        this.f22782e = bgVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22781d = obj;
        this.f22783f |= Integer.MIN_VALUE;
        return bg.a(this.f22782e, false, false, false, false, null, this);
    }
}
