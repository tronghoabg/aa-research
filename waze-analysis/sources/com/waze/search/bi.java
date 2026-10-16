package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bi extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f35560a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35561b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bl f35562c;

    /* renamed from: d, reason: collision with root package name */
    int f35563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bl blVar, h.c.e eVar) {
        super(eVar);
        this.f35562c = blVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35561b = obj;
        this.f35563d |= Integer.MIN_VALUE;
        return this.f35562c.v(null, null, null, null, null, this);
    }
}
