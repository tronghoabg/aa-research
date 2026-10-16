package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38293a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ah f38294b;

    /* renamed from: c, reason: collision with root package name */
    int f38295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f38294b = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38293a = obj;
        this.f38295c |= Integer.MIN_VALUE;
        return this.f38294b.j(this);
    }
}
