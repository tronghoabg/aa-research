package com.waze.bp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f17210b;

    /* renamed from: c, reason: collision with root package name */
    int f17211c;

    /* renamed from: d, reason: collision with root package name */
    i f17212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f17210b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17209a = obj;
        this.f17211c |= Integer.MIN_VALUE;
        return i.d(this.f17210b, 0, this);
    }
}
