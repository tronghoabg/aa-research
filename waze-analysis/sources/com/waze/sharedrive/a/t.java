package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38027a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38028b;

    /* renamed from: c, reason: collision with root package name */
    int f38029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38028b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38027a = obj;
        this.f38029c |= Integer.MIN_VALUE;
        return this.f38028b.a(null, null, this);
    }
}
