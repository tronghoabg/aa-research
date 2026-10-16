package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bm extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34255a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bo f34256b;

    /* renamed from: c, reason: collision with root package name */
    int f34257c;

    /* renamed from: d, reason: collision with root package name */
    String f34258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(bo boVar, h.c.e eVar) {
        super(eVar);
        this.f34256b = boVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34255a = obj;
        this.f34257c |= Integer.MIN_VALUE;
        return this.f34256b.c(null, null, this);
    }
}
