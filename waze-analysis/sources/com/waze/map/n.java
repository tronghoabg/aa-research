package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29482a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GenericCanvasNativeManager f29483b;

    /* renamed from: c, reason: collision with root package name */
    int f29484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(GenericCanvasNativeManager genericCanvasNativeManager, h.c.e eVar) {
        super(eVar);
        this.f29483b = genericCanvasNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29482a = obj;
        this.f29484c |= Integer.MIN_VALUE;
        return this.f29483b.updateMapBounds(null, this);
    }
}
