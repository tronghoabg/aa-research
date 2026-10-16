package com.waze.alerters.a;

import com.waze.alerters.AlerterNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final AlerterNativeManager f14170a;

    public m(AlerterNativeManager alerterNativeManager) {
        h.g.b.x.f(alerterNativeManager, "nativeManager");
        this.f14170a = alerterNativeManager;
    }

    @Override // com.waze.alerters.a.l
    public final void a(com.waze.k kVar, a aVar) {
        h.g.b.x.f(kVar, "alertId");
        h.g.b.x.f(aVar, "action");
        this.f14170a.onAlertAction(kVar, aVar);
    }

    @Override // com.waze.alerters.a.l
    public final void b(com.waze.k kVar) {
        h.g.b.x.f(kVar, "alertId");
        this.f14170a.onAlertEnd(kVar);
    }

    @Override // com.waze.alerters.a.l
    public final void c(com.waze.k kVar, com.waze.f fVar) {
        h.g.b.x.f(kVar, "alertId");
        h.g.b.x.f(fVar, "rejectedAlertReason");
        this.f14170a.onAlertRejected(kVar, fVar);
    }

    @Override // com.waze.alerters.a.l
    public final void d(com.waze.k kVar) {
        h.g.b.x.f(kVar, "alertId");
        this.f14170a.onAlertStart(kVar);
    }

    @Override // com.waze.alerters.a.l
    public final void e(com.waze.k kVar) {
        h.g.b.x.f(kVar, "alertId");
        this.f14170a.onAlertTimeoutStarted(kVar);
    }

    @Override // com.waze.alerters.a.l
    public final void f(com.waze.k kVar) {
        h.g.b.x.f(kVar, "alertId");
        this.f14170a.playSound(kVar);
    }

    @Override // com.waze.alerters.a.l
    public final void g() {
        com.waze.alerters.f.playZoneAlertExitSound$default(this.f14170a, null, 1, null);
    }
}
