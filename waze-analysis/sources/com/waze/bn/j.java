package com.waze.bn;

import com.waze.NativeManager;
import com.waze.mz;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.navigate.et;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17161a;

    /* renamed from: b, reason: collision with root package name */
    private final af f17162b;

    /* renamed from: c, reason: collision with root package name */
    private final a f17163c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f17164d;

    public /* synthetic */ j(final com.waze.sharedui.e.g gVar, af afVar, a aVar, int i2) {
        com.waze.shared_infra.i.e eVarD;
        final k kVarT;
        if ((i2 & 1) != 0) {
            eVarD = com.waze.shared_infra.i.a.d("SuggestionsRoamingProvider");
            x.e(eVarD, "create(...)");
        } else {
            eVarD = null;
        }
        if ((i2 & 4) != 0) {
            NavigationInfoNativeManager navigationInfoNativeManager = NavigationInfoNativeManager.getInstance();
            x.e(navigationInfoNativeManager, "getInstance(...)");
            kVarT = et.t(navigationInfoNativeManager);
        } else {
            kVarT = null;
        }
        afVar = (i2 & 8) != 0 ? aj.f() : afVar;
        aVar = (i2 & 16) != 0 ? new mz(1, null) : aVar;
        x.f(eVarD, "logger");
        x.f(gVar, "locationService");
        x.f(kVarT, "navigationStatus");
        x.f(afVar, "scope");
        x.f(aVar, "configuration");
        this.f17161a = eVarD;
        this.f17162b = afVar;
        this.f17163c = aVar;
        this.f17164d = ck.b(c.f17149a);
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.bn.f
            @Override // java.lang.Runnable
            public final void run() {
                j.e(this.f17152a, gVar, kVarT);
            }
        });
    }

    static final void e(j jVar, com.waze.sharedui.e.g gVar, k kVar) {
        a aVar = jVar.f17163c;
        String str = "init with roamingDelay=" + aVar.a() + "ms and roamingSpeed=" + aVar.b() + "km/h";
        com.waze.shared_infra.i.e eVar = jVar.f17161a;
        eVar.e(str);
        if (aVar.a() == 0 || aVar.b() == 0) {
            eVar.e("Roaming detection is disabled due to configuration");
            return;
        }
        k kVarK = ai.K(gVar.d(), new g(jVar, null));
        af afVar = jVar.f17162b;
        ai.m(kVarK, afVar);
        ai.m(ai.K(ai.y(kVar), new h(jVar, null)), afVar);
    }

    public static final /* synthetic */ void f(j jVar, float f2) {
        a aVar = jVar.f17163c;
        x.f(aVar, "<this>");
        float fB = aVar.b();
        bn bnVar = jVar.f17164d;
        c dVar = (com.waze.resume_drive.a) bnVar.d();
        if (!(dVar instanceof e)) {
            float f3 = ((fB * 1000.0f) / 60.0f) / 60.0f;
            if (dVar instanceof c) {
                if (f2 >= f3) {
                    dVar = new d(aj.z(jVar.f17162b, null, null, new i(jVar, null), 3));
                }
            } else {
                if (!(dVar instanceof d)) {
                    throw new h.i();
                }
                if (f2 < f3) {
                    jVar.f17161a.e("Speed bellow threshold, stopping activation job");
                    ((d) dVar).b().s(null);
                    dVar = c.f17149a;
                }
            }
        }
        bnVar.e(dVar);
        jVar.f17161a.a("New roaming state for speed " + f2 + " is " + bnVar.d());
    }

    @Override // com.waze.bn.b
    public final ch a() {
        return ai.U(this.f17164d);
    }
}
