package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44121a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f44122b;

    /* renamed from: c, reason: collision with root package name */
    int f44123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(al alVar, h.c.e eVar) {
        super(eVar);
        this.f44122b = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44121a = obj;
        this.f44123c |= Integer.MIN_VALUE;
        return al.d(this.f44122b, null, this);
    }
}
