package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ex extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28869a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ey f28870b;

    /* renamed from: c, reason: collision with root package name */
    int f28871c;

    /* renamed from: d, reason: collision with root package name */
    ck f28872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ex(ey eyVar, h.c.e eVar) {
        super(eVar);
        this.f28870b = eyVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28869a = obj;
        this.f28871c |= Integer.MIN_VALUE;
        return this.f28870b.emit(null, this);
    }
}
