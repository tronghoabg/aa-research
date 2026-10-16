package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f38534a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38535b;

    public j(com.waze.sharedrive.d.a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "controllerFactory");
        h.g.b.x.f(eVar, "logger");
        this.f38534a = aVar;
        this.f38535b = eVar;
    }

    public final n a() {
        com.waze.sharedrive.d.aq aqVarA = this.f38534a.a();
        if (aqVarA != null) {
            return new n(aqVarA, this.f38535b);
        }
        this.f38535b.f("Share drive controller factory not created, can't create state holder.");
        return null;
    }
}
