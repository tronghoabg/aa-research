package com.waze.car_lib;

import androidx.car.app.CarContext;
import com.waze.iv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.h.c.b f18884a = com.waze.h.c.b.f24340a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.h.b.r f18885b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.speech.g f18886c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18887d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f18888e;

    /* renamed from: f, reason: collision with root package name */
    private kotlinx.coroutines.br f18889f;

    /* renamed from: g, reason: collision with root package name */
    private h.g.a.l f18890g;

    public ai(com.waze.h.b.r rVar, com.waze.speech.g gVar, com.waze.shared_infra.i.e eVar, h.c.j jVar) {
        h.g.b.x.f(rVar, "singleUtteranceRecorder");
        h.g.b.x.f(gVar, "googleSpeechRecognizerApi");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f18885b = rVar;
        this.f18886c = gVar;
        this.f18887d = eVar;
        this.f18888e = kotlinx.coroutines.aj.e(jVar.plus(kotlinx.coroutines.aj.Q()));
    }

    public static /* synthetic */ h.ab d(ai aiVar) {
        aiVar.f18889f = null;
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.car_lib.ai r5, com.waze.a.af r6, h.c.e r7) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.ai.e(com.waze.car_lib.ai, com.waze.a.af, h.c.e):java.lang.Object");
    }

    private final void f(com.waze.beacons.n nVar) {
        h.g.a.l lVar = this.f18890g;
        if (lVar != null) {
            lVar.invoke(nVar);
        }
        this.f18890g = null;
    }

    public final void c(CarContext carContext, h.g.a.l lVar) {
        h.g.b.x.f(carContext, "context");
        h.g.b.x.f(lVar, "callback");
        h.g.a.l lVar2 = this.f18890g;
        if (lVar2 != null) {
            lVar2.invoke(new ab(aa.f18868a));
        }
        kotlinx.coroutines.br brVar = this.f18889f;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f18890g = lVar;
        kotlinx.coroutines.br brVarZ = kotlinx.coroutines.aj.z(this.f18888e, null, null, new ah(this, null), 3);
        brVarZ.bY(new iv(this, 10));
        this.f18889f = brVarZ;
    }
}
