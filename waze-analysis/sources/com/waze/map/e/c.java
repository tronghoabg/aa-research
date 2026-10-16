package com.waze.map.e;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f28791a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28792b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f28793c;

    /* renamed from: d, reason: collision with root package name */
    int f28794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar, h.c.e eVar) {
        super(eVar);
        this.f28793c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28792b = obj;
        this.f28794d |= Integer.MIN_VALUE;
        return i.c(this.f28793c, null, this);
    }
}
