package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24723a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f24724b;

    /* renamed from: c, reason: collision with root package name */
    int f24725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f24724b = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24723a = obj;
        this.f24725c |= Integer.MIN_VALUE;
        return ae.h(this.f24724b, this);
    }
}
