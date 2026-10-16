package com.waze.google_assistant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24250a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f24251b;

    /* renamed from: c, reason: collision with root package name */
    int f24252c;

    /* renamed from: d, reason: collision with root package name */
    aa f24253d;

    /* renamed from: e, reason: collision with root package name */
    aa f24254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f24251b = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24250a = obj;
        this.f24252c |= Integer.MIN_VALUE;
        return aa.e(this.f24251b, this);
    }
}
