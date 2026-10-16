package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29289a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GenericCanvasNativeManager f29290b;

    /* renamed from: c, reason: collision with root package name */
    int f29291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(GenericCanvasNativeManager genericCanvasNativeManager, h.c.e eVar) {
        super(eVar);
        this.f29290b = genericCanvasNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29289a = obj;
        this.f29291c |= Integer.MIN_VALUE;
        return this.f29290b.performZoomOut(this);
    }
}
