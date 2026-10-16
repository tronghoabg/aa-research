package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29286a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GenericCanvasNativeManager f29287b;

    /* renamed from: c, reason: collision with root package name */
    int f29288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(GenericCanvasNativeManager genericCanvasNativeManager, h.c.e eVar) {
        super(eVar);
        this.f29287b = genericCanvasNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29286a = obj;
        this.f29288c |= Integer.MIN_VALUE;
        return this.f29287b.performZoomIn(this);
    }
}
