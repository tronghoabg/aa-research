package com.waze.car_lib.screens.core;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21948a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScreenPresentable f21949b;

    /* renamed from: c, reason: collision with root package name */
    int f21950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ScreenPresentable screenPresentable, h.c.e eVar) {
        super(eVar);
        this.f21949b = screenPresentable;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21948a = obj;
        this.f21950c |= Integer.MIN_VALUE;
        return this.f21949b.awaitTop(this);
    }
}
