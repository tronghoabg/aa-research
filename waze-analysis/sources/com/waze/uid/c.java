package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44184a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f44185b;

    /* renamed from: c, reason: collision with root package name */
    int f44186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f44185b = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f44184a = obj;
        this.f44186c |= Integer.MIN_VALUE;
        return d.a(this.f44185b, null, this);
    }
}
