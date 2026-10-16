package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    private final e f38466a;

    /* renamed from: b, reason: collision with root package name */
    private final q f38467b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f38468c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38469d;

    public bw(e eVar, q qVar, com.waze.sharedrive.d.a aVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(eVar, "createSharePreviewStateHolderFactory");
        h.g.b.x.f(qVar, "joinSharePreviewStateHolderFactory");
        h.g.b.x.f(aVar, "shareDriveControllerFactory");
        h.g.b.x.f(eVar2, "logger");
        this.f38466a = eVar;
        this.f38467b = qVar;
        this.f38468c = aVar;
        this.f38469d = eVar2;
    }

    public final cc a() {
        com.waze.sharedrive.d.aq aqVarA = this.f38468c.a();
        if (aqVarA != null) {
            return new ch(this.f38466a, this.f38467b, aqVarA, this.f38469d);
        }
        this.f38469d.g("ShareDriveController missing, cannot create ShareDriveStateHolder");
        return null;
    }
}
