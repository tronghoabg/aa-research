package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    int f30334a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f30335b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bk f30336c;

    /* renamed from: d, reason: collision with root package name */
    int f30337d;

    /* renamed from: e, reason: collision with root package name */
    ao f30338e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.av.b.l f30339f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.av.d.k f30340g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f30336c = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30335b = obj;
        this.f30337d |= Integer.MIN_VALUE;
        return bk.h(this.f30336c, null, this);
    }
}
