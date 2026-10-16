package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bq implements bo {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f38452a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.s f38453b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38454c;

    public bq(com.waze.sharedrive.d.a aVar, com.waze.sharedrive.s sVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "sharedDriveControllerFactory");
        h.g.b.x.f(sVar, "indicationController");
        h.g.b.x.f(eVar, "logger");
        this.f38452a = aVar;
        this.f38453b = sVar;
        this.f38454c = eVar;
    }

    @Override // com.waze.sharedrive.e.bo
    public final bp a() {
        com.waze.sharedrive.d.aq aqVarA = this.f38452a.a();
        if (aqVarA != null) {
            return new bv(aqVarA, this.f38453b, this.f38454c);
        }
        this.f38454c.g("Share drive controller factory not created, can't create state holder.");
        return null;
    }
}
