package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bf extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28583a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bi f28584b;

    /* renamed from: c, reason: collision with root package name */
    int f28585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bi biVar, h.c.e eVar) {
        super(eVar);
        this.f28584b = biVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28583a = obj;
        this.f28585c |= Integer.MIN_VALUE;
        return this.f28584b.b(this);
    }
}
