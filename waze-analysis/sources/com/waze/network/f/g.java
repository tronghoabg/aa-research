package com.waze.network.f;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements com.waze.authentication.h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.r.y f32303a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.install.x f32304b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32305c;

    public g(com.waze.shared_infra.r.y yVar, com.waze.install.x xVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(yVar, "userState");
        h.g.b.x.f(xVar, "installationRequirements");
        h.g.b.x.f(eVar, "logger");
        this.f32303a = yVar;
        this.f32304b = xVar;
        this.f32305c = eVar;
    }

    @Override // com.waze.authentication.h
    public final com.waze.authentication.g a(com.waze.authentication.v vVar, int i2) {
        h.g.b.x.f(vVar, "error");
        boolean z = vVar instanceof com.waze.authentication.q;
        com.waze.authentication.g gVar = com.waze.authentication.g.f15760a;
        if (z) {
            com.waze.shared_infra.i.e eVar = this.f32305c;
            com.waze.authentication.q qVar = (com.waze.authentication.q) vVar;
            com.waze.shared_infra.r.p pVarA = qVar.a();
            Objects.toString(pVarA);
            eVar.g("session error, logged in from another device: appType=".concat(String.valueOf(pVarA)));
            this.f32303a.c(new com.waze.shared_infra.r.u(new com.waze.shared_infra.r.q(qVar.a(), i2 > 0)));
            return com.waze.authentication.g.f15761b;
        }
        if (vVar instanceof com.waze.authentication.o) {
            this.f32305c.g("session error, invalid credentials");
            this.f32304b.e(com.waze.install.v.f24796a);
            return com.waze.authentication.g.f15761b;
        }
        if (!(vVar instanceof com.waze.authentication.u)) {
            return gVar;
        }
        com.waze.authentication.u uVar = (com.waze.authentication.u) vVar;
        this.f32305c.g("session error, current app version is not supported: hasUnsupportedOs = " + uVar.b() + ", appDownloadUrl = " + uVar.a());
        String strA = uVar.a();
        if (strA.length() == 0) {
            strA = com.waze.t.g();
        }
        com.waze.install.x xVar = this.f32304b;
        String str = strA;
        boolean zB = uVar.b();
        h.g.b.x.c(str);
        xVar.e(new com.waze.install.o(zB, str));
        return com.waze.authentication.g.f15761b;
    }
}
