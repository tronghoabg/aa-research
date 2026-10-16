package com.waze.reports_v2.c;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    private final bo f34289a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.a.c f34290b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34291c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.network.bj f34292d;

    public bu(bo boVar, com.waze.sound.a.c cVar, com.waze.network.bj bjVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(boVar, "conversationalReportingLocaleValidatorUseCase");
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(bjVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f34289a = boVar;
        this.f34290b = cVar;
        this.f34292d = bjVar;
        this.f34291c = eVar;
    }

    public final Object c(Context context, h.c.e eVar) {
        Object objCollect;
        return (this.f34292d.c() && (objCollect = kotlinx.coroutines.b.ai.y(this.f34290b.e()).collect(new bt(this, context), eVar)) == h.c.a.a.f48038a) ? objCollect : h.ab.f48028a;
    }
}
