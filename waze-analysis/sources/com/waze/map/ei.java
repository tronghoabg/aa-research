package com.waze.map;

import com.waze.native_managers.WazeNativeLooperDispatcher;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ei implements com.waze.map.canvas.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final cl f28834a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.native_managers.j f28835b;

    /* renamed from: c, reason: collision with root package name */
    private final WazeNativeLooperDispatcher f28836c;

    public ei(cl clVar, com.waze.native_managers.j jVar, WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        h.g.b.x.f(clVar, "coroutineDispatcherProvider");
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        h.g.b.x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.f28834a = clVar;
        this.f28835b = jVar;
        this.f28836c = wazeNativeLooperDispatcher;
    }

    @Override // com.waze.map.canvas.a.d
    public final com.waze.map.canvas.a.e a(com.waze.ae.e eVar) {
        h.g.b.x.f(eVar, "context");
        if (eVar instanceof ac) {
            return new WazeMapNativeManager(((ac) eVar).i(), this.f28834a.a(cv.f28708b));
        }
        if (eVar instanceof ab) {
            return new GenericCanvasNativeManager(((ab) eVar).i(), this.f28835b, this.f28836c);
        }
        throw new h.i();
    }
}
