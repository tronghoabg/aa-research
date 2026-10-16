package com.waze.cg.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22285a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f22286b;

    /* renamed from: c, reason: collision with root package name */
    int f22287c;

    /* renamed from: d, reason: collision with root package name */
    e f22288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f22286b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22285a = obj;
        this.f22287c |= Integer.MIN_VALUE;
        return e.c(this.f22286b, this);
    }
}
