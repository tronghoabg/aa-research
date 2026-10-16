package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22882a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f22883b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f22884c;

    /* renamed from: d, reason: collision with root package name */
    int f22885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(y yVar, h.c.e eVar) {
        super(eVar);
        this.f22884c = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22883b = obj;
        this.f22885d |= Integer.MIN_VALUE;
        return this.f22884c.a(null, this);
    }
}
