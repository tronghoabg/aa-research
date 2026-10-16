package com.waze.map;

import com.waze.jni.protos.map.MapContent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class go extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f29163a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f29164b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ WazeMapNativeManager f29165c;

    /* renamed from: d, reason: collision with root package name */
    int f29166d;

    /* renamed from: e, reason: collision with root package name */
    MapContent f29167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    go(WazeMapNativeManager wazeMapNativeManager, h.c.e eVar) {
        super(eVar);
        this.f29165c = wazeMapNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29164b = obj;
        this.f29166d |= Integer.MIN_VALUE;
        return WazeMapNativeManager.updateMapContent$suspendImpl(this.f29165c, null, this);
    }
}
