package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f38553a;

    /* renamed from: b, reason: collision with root package name */
    private final cn f38554b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38555c;

    public q(com.waze.sharedrive.d.a aVar, cn cnVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "controllerFactory");
        h.g.b.x.f(cnVar, "uiMapper");
        h.g.b.x.f(eVar, "logger");
        this.f38553a = aVar;
        this.f38554b = cnVar;
        this.f38555c = eVar;
    }

    public final r a() {
        com.waze.sharedrive.d.aq aqVarA = this.f38553a.a();
        if (aqVarA != null) {
            return new v(aqVarA, this.f38554b);
        }
        this.f38555c.f("ShareDriveController missing, cannot create JoinSharePreviewStateHolder");
        return null;
    }
}
