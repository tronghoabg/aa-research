package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29292a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GenericCanvasNativeManager f29293b;

    /* renamed from: c, reason: collision with root package name */
    int f29294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(GenericCanvasNativeManager genericCanvasNativeManager, h.c.e eVar) {
        super(eVar);
        this.f29293b = genericCanvasNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29292a = obj;
        this.f29294c |= Integer.MIN_VALUE;
        return this.f29293b.setShowMapLoader(false, (h.c.e<? super h.ab>) this);
    }
}
