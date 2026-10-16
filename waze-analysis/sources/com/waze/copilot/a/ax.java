package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ax extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22732a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f22733b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ be f22734c;

    /* renamed from: d, reason: collision with root package name */
    int f22735d;

    /* renamed from: e, reason: collision with root package name */
    String f22736e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.copilot.data.a.g f22737f;

    /* renamed from: g, reason: collision with root package name */
    String f22738g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22734c = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22733b = obj;
        this.f22735d |= Integer.MIN_VALUE;
        return this.f22734c.j(null, null, this);
    }
}
