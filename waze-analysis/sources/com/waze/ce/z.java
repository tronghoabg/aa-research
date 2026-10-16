package com.waze.ce;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22172a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f22173b;

    /* renamed from: c, reason: collision with root package name */
    int f22174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f22173b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22172a = obj;
        this.f22174c |= Integer.MIN_VALUE;
        return this.f22173b.b(null, null, this);
    }
}
