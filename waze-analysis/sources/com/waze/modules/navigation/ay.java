package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ay extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f30344a;

    /* renamed from: b, reason: collision with root package name */
    Object f30345b;

    /* renamed from: c, reason: collision with root package name */
    Object f30346c;

    /* renamed from: d, reason: collision with root package name */
    Object f30347d;

    /* renamed from: e, reason: collision with root package name */
    boolean f30348e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f30349f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ bk f30350g;

    /* renamed from: h, reason: collision with root package name */
    int f30351h;

    /* renamed from: i, reason: collision with root package name */
    ao f30352i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f30350g = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30349f = obj;
        this.f30351h |= Integer.MIN_VALUE;
        return bk.u(this.f30350g, null, null, null, this);
    }
}
