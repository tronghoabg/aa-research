package com.waze.ce;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22169a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f22170b;

    /* renamed from: c, reason: collision with root package name */
    int f22171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f22170b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22169a = obj;
        this.f22171c |= Integer.MIN_VALUE;
        return this.f22170b.a(null, null, this);
    }
}
