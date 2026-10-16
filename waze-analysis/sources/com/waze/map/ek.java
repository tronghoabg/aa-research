package com.waze.map;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ek implements com.waze.map.isolated.b {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f28840a;

    public ek(Executor executor) {
        h.g.b.x.f(executor, "eventExecutor");
        this.f28840a = executor;
    }

    @Override // com.waze.map.isolated.b
    public final /* bridge */ /* synthetic */ com.waze.map.isolated.c a(String str) {
        h.g.b.x.f(str, "canvasId");
        return new NativeMapTouchController(str, this.f28840a);
    }
}
