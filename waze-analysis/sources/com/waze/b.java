package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f16132a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f16133b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f16134c;

    /* renamed from: d, reason: collision with root package name */
    int f16135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f16134c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16133b = obj;
        this.f16135d |= Integer.MIN_VALUE;
        return this.f16134c.b(this);
    }
}
