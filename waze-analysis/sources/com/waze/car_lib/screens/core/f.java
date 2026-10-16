package com.waze.car_lib.screens.core;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21951a;

    /* renamed from: b, reason: collision with root package name */
    long f21952b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21953c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ScreenPresentable f21954d;

    /* renamed from: e, reason: collision with root package name */
    int f21955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ScreenPresentable screenPresentable, h.c.e eVar) {
        super(eVar);
        this.f21954d = screenPresentable;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21953c = obj;
        this.f21955e |= Integer.MIN_VALUE;
        return this.f21954d.awaitTopScreen(this);
    }
}
