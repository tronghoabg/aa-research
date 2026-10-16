package com.waze.rtalerts;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    MapProblem[] f35143a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f35144b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ RtAlertsNativeManager f35145c;

    n(RtAlertsNativeManager rtAlertsNativeManager, q qVar) {
        this.f35144b = qVar;
        Objects.requireNonNull(rtAlertsNativeManager);
        this.f35145c = rtAlertsNativeManager;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        this.f35144b.a(this.f35143a);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        this.f35143a = this.f35145c.getMapProblemsNTV();
    }
}
