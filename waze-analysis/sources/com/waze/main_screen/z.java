package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27884a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f27885b;

    /* renamed from: c, reason: collision with root package name */
    int f27886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f27885b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27884a = obj;
        this.f27886c |= Integer.MIN_VALUE;
        return this.f27885b.j(null, null, null, this);
    }
}
