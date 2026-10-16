package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34796a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f34797b;

    /* renamed from: c, reason: collision with root package name */
    int f34798c;

    /* renamed from: d, reason: collision with root package name */
    aj f34799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(al alVar, h.c.e eVar) {
        super(eVar);
        this.f34797b = alVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34796a = obj;
        this.f34798c |= Integer.MIN_VALUE;
        return this.f34797b.g(null, this);
    }
}
