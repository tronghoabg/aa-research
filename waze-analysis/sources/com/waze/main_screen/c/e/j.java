package com.waze.main_screen.c.e;

import com.waze.sharedrive.e.au;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final au f26213a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26214b;

    /* renamed from: c, reason: collision with root package name */
    private final af f26215c;

    public j(au auVar, com.waze.shared_infra.i.e eVar) {
        x.f(auVar, "openLiveShareDriveService");
        x.f(eVar, "logger");
        this.f26213a = auVar;
        this.f26214b = eVar;
        this.f26215c = com.waze.ui.a.l.p(this, "ButtonPackShareDriveButtonStateHolder");
    }

    @Override // com.waze.main_screen.c.e.i
    public final void a() {
        this.f26214b.a("onClicked: requesting to open live drive screen");
        this.f26213a.a();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f26215c, null);
    }
}
