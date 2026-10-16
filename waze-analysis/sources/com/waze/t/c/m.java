package com.waze.t.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40867a;

    public m(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f40867a = eVar;
    }

    @Override // com.waze.t.c.l
    public final void a() {
        this.f40867a.a("onPermissionDenied");
    }

    @Override // com.waze.t.c.l
    public final void b() {
        this.f40867a.a("onPermissionGranted");
    }

    @Override // com.waze.t.c.l
    public final void c() {
        this.f40867a.a("onRationaleCancelClicked");
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // com.waze.t.c.l
    public final void d() {
        this.f40867a.a("onRationaleDialogShown");
    }

    @Override // com.waze.t.c.l
    public final void e() {
        this.f40867a.a("onRationaleProceedClicked");
    }

    @Override // com.waze.t.c.l
    public final void f() {
        this.f40867a.a("onSettingsCancelClicked");
    }

    @Override // com.waze.t.c.l
    public final void g() {
        this.f40867a.a("onSettingsDialogShown");
    }

    @Override // com.waze.t.c.l
    public final void h() {
        this.f40867a.a("onSettingsProceedClicked");
    }
}
