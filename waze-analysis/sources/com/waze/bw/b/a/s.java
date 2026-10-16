package com.waze.bw.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17715a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f17716b;

    /* renamed from: c, reason: collision with root package name */
    int f17717c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.sharedui.e.c f17718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(t tVar, h.c.e eVar) {
        super(eVar);
        this.f17716b = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17715a = obj;
        this.f17717c |= Integer.MIN_VALUE;
        return this.f17716b.a(null, null, this);
    }
}
