package com.waze.bl.d;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Application f17033a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17034b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bl.c.c.d f17035c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.m.a f17036d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.bl.c.d.a f17037e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bl.c.c.c f17038f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.bl.c.c.g f17039g;

    public a(Application application, com.waze.shared_infra.i.e eVar, com.waze.bl.c.c.d dVar, com.waze.shared_infra.m.a aVar, com.waze.bl.c.d.a aVar2, com.waze.bl.c.c.c cVar, com.waze.bl.c.c.g gVar) {
        x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        x.f(eVar, "logger");
        x.f(dVar, "controllerStarter");
        x.f(aVar, "mediaVolumeRepository");
        x.f(aVar2, "categoriesTransformer");
        x.f(cVar, "reportAgentConfig");
        x.f(gVar, "saveClosureCandidatesUseCase");
        this.f17033a = application;
        this.f17034b = eVar;
        this.f17035c = dVar;
        this.f17036d = aVar;
        this.f17037e = aVar2;
        this.f17038f = cVar;
        this.f17039g = gVar;
    }

    public final l a() {
        return new l(this.f17033a, this.f17034b, this.f17035c, this.f17036d, this.f17037e, this.f17038f, this.f17039g);
    }
}
