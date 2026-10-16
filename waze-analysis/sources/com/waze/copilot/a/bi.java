package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bi extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f22789a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f22790b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bj f22791c;

    /* renamed from: d, reason: collision with root package name */
    int f22792d;

    /* renamed from: e, reason: collision with root package name */
    bj f22793e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.copilot.data.af f22794f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.copilot.data.ag f22795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bj bjVar, h.c.e eVar) {
        super(eVar);
        this.f22791c = bjVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22790b = obj;
        this.f22792d |= Integer.MIN_VALUE;
        return bj.a(this.f22791c, null, null, null, false, null, this);
    }
}
