package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bi extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30391a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30392b;

    /* renamed from: c, reason: collision with root package name */
    int f30393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f30392b = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30391a = obj;
        this.f30393c |= Integer.MIN_VALUE;
        return bk.k(this.f30392b, null, this);
    }
}
