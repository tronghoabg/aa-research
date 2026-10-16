package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f38521a;

    /* renamed from: b, reason: collision with root package name */
    private final cn f38522b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.mywaze.n f38523c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38524d;

    public e(com.waze.sharedrive.d.a aVar, cn cnVar, com.waze.mywaze.n nVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "controllerFactory");
        h.g.b.x.f(cnVar, "uiMapper");
        h.g.b.x.f(nVar, "myWazeInterface");
        h.g.b.x.f(eVar, "logger");
        this.f38521a = aVar;
        this.f38522b = cnVar;
        this.f38523c = nVar;
        this.f38524d = eVar;
    }

    public final kotlinx.coroutines.b.k d() {
        com.waze.sharedrive.d.aq aqVarA = this.f38521a.a();
        if (aqVarA != null) {
            return kotlinx.coroutines.b.ai.R(kotlinx.coroutines.b.ai.y(new m(aqVarA.n(), 1)), new b(null, aqVarA, this));
        }
        this.f38524d.f("Share drive controller factory not created, can't create state holder.");
        return kotlinx.coroutines.b.ai.G(null);
    }
}
