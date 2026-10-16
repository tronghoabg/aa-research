package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f35552a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35553b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bl f35554c;

    /* renamed from: d, reason: collision with root package name */
    int f35555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bl blVar, h.c.e eVar) {
        super(eVar);
        this.f35554c = blVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35553b = obj;
        this.f35555d |= Integer.MIN_VALUE;
        return this.f35554c.p(null, this);
    }
}
