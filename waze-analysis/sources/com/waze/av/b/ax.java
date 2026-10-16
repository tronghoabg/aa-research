package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ax extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f15903a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15904b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ be f15905c;

    /* renamed from: d, reason: collision with root package name */
    int f15906d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.av.a.p f15907e;

    /* renamed from: f, reason: collision with root package name */
    aa f15908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(be beVar, h.c.e eVar) {
        super(eVar);
        this.f15905c = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15904b = obj;
        this.f15906d |= Integer.MIN_VALUE;
        return this.f15905c.a(null, null, this);
    }
}
