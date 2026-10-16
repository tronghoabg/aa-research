package com.waze.map.canvas;

import java.util.concurrent.Executor;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t implements r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28661a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f28662b;

    public t(com.waze.shared_infra.i.e eVar, Executor executor) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(executor, "nativeThreadExecutor");
        this.f28661a = eVar;
        this.f28662b = executor;
    }

    @Override // com.waze.map.canvas.r
    public final ClosureCanvasDelegatorImpl a(ch chVar) {
        h.g.b.x.f(chVar, "canvasState");
        return new ClosureCanvasDelegatorImpl(chVar, this.f28661a, this.f28662b);
    }
}
