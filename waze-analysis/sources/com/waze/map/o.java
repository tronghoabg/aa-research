package com.waze.map;

import com.waze.jni.protos.map.MapContent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29485a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GenericCanvasNativeManager f29486b;

    /* renamed from: c, reason: collision with root package name */
    int f29487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(GenericCanvasNativeManager genericCanvasNativeManager, h.c.e eVar) {
        super(eVar);
        this.f29486b = genericCanvasNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29485a = obj;
        this.f29487c |= Integer.MIN_VALUE;
        return this.f29486b.updateMapContent((MapContent) null, this);
    }
}
