package com.waze.sound;

import android.app.Application;
import androidx.media3.common.MimeTypes;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gy implements com.waze.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40115a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40116b;

    /* renamed from: c, reason: collision with root package name */
    private final fc f40117c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.ab f40118d;

    public gy(Application application, com.waze.shared_infra.i.b bVar, fc fcVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(fcVar, "soundOutputRoutingManager");
        h.g.b.x.f(abVar, "mainDispatcher");
        this.f40115a = application;
        this.f40116b = bVar;
        this.f40117c = fcVar;
        this.f40118d = abVar;
    }

    @Override // com.waze.h.a.a
    public final hl a(com.waze.h.i iVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(iVar, "audioAttributes");
        h.g.b.x.f(eVar, "logger");
        return new hl(this.f40115a, this.f40116b, iVar, eVar, this.f40118d, this.f40117c);
    }
}
