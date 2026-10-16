package com.waze.main_screen.c.e;

import com.waze.sharedrive.d.aq;
import com.waze.sharedrive.e.au;
import h.g.b.x;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f26210a;

    /* renamed from: b, reason: collision with root package name */
    private final au f26211b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26212c;

    public h(com.waze.sharedrive.d.a aVar, au auVar, com.waze.shared_infra.i.e eVar) {
        x.f(aVar, "controllerFactory");
        x.f(auVar, "openLiveShareDriveService");
        x.f(eVar, "logger");
        this.f26210a = aVar;
        this.f26211b = auVar;
        this.f26212c = eVar;
    }

    public final kotlinx.coroutines.b.k c() {
        aq aqVarA = this.f26210a.a();
        if (aqVarA != null) {
            return new g(ai.y(new d(aqVarA.n())), this);
        }
        this.f26212c.f("Share drive controller not created, can't create state holder.");
        return ai.G(null);
    }
}
