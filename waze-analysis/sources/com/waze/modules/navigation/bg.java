package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30386a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30387b;

    /* renamed from: c, reason: collision with root package name */
    int f30388c;

    /* renamed from: d, reason: collision with root package name */
    ao f30389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f30387b = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30386a = obj;
        this.f30388c |= Integer.MIN_VALUE;
        return this.f30387b.w(null, this);
    }
}
