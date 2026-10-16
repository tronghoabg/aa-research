package com.waze.car_lib.i.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f19847a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19848b;

    public aa(h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar, "onShow");
        h.g.b.x.f(aVar2, "onHide");
        this.f19847a = aVar2;
        aVar.invoke();
        this.f19848b = true;
    }

    public final void a() {
        if (this.f19848b) {
            this.f19847a.invoke();
            this.f19848b = false;
        }
    }
}
