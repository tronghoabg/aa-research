package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38364a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f38365b;

    public /* synthetic */ au(byte[] bArr) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("OpenLiveShareDriveService");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(eVarD, "logger");
        this.f38364a = eVarD;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(false);
        this.f38365b = bnVarB;
        kotlinx.coroutines.b.ai.U(bnVarB);
    }

    public final void a() {
        this.f38364a.a("requestOpen: navigation requested");
        this.f38365b.e(true);
    }

    public au() {
        this(null);
    }
}
