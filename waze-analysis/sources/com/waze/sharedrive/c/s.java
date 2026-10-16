package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.b.a f38130a;

    /* renamed from: b, reason: collision with root package name */
    private final e f38131b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38132c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f38133d;

    public s(com.waze.sharedrive.b.a aVar, e eVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(eVar, "apiFactory");
        h.g.b.x.f(eVar2, "logger");
        this.f38130a = aVar;
        this.f38131b = eVar;
        this.f38132c = eVar2;
        this.f38133d = h.g.a(new r(this, 0));
    }

    static final y b(s sVar) {
        com.waze.sharedrive.b.a aVar = sVar.f38130a;
        if (!aVar.b()) {
            sVar.f38132c.a("ShareDriveService not created: feature disabled.");
            return null;
        }
        p pVarB = sVar.f38131b.b();
        if (pVarB != null) {
            return new y(pVarB, aVar, sVar.f38132c);
        }
        sVar.f38132c.g("ShareDriveApi not available, cannot create ShareDriveService");
        return null;
    }

    public final y a() {
        return (y) this.f38133d.getValue();
    }
}
