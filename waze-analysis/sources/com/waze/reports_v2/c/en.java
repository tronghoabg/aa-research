package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class en extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34473a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eo f34474b;

    /* renamed from: c, reason: collision with root package name */
    int f34475c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.reports_v2.presentation.a.ao f34476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    en(eo eoVar, h.c.e eVar) {
        super(eVar);
        this.f34474b = eoVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34473a = obj;
        this.f34475c |= Integer.MIN_VALUE;
        return this.f34474b.a(null, this);
    }
}
