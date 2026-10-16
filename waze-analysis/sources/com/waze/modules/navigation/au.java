package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class au extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30325a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30326b;

    /* renamed from: c, reason: collision with root package name */
    int f30327c;

    /* renamed from: d, reason: collision with root package name */
    ao f30328d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.shared_infra.h.c f30329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f30326b = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30325a = obj;
        this.f30327c |= Integer.MIN_VALUE;
        return bk.g(this.f30326b, null, this);
    }
}
