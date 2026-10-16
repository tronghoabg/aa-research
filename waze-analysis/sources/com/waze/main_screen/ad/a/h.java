package com.waze.main_screen.ad.a;

import com.waze.app_nav.w;
import com.waze.config.ConfigValues;
import com.waze.navigate.ao;
import com.waze.navigate.ce;
import com.waze.navigate.gj;
import h.g.b.x;
import h.k.j;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25707a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final j f25708b = new j(-99, 99);

    /* renamed from: c, reason: collision with root package name */
    private final af f25709c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25710d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f25711e;

    public h(gj gjVar, ao aoVar, ce ceVar, w wVar) {
        x.f(gjVar, "trafficStateInterface");
        x.f(aoVar, "ascStateInterface");
        x.f(ceVar, "enforcementZoneStateInterface");
        x.f(wVar, "flowController");
        int i2 = av.f51370a;
        af afVarE = aj.e(ac.f51860a.c().plus(aj.Q()));
        this.f25709c = afVarE;
        this.f25710d = ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_ENABLED.b().booleanValue() && !ConfigValues.CONFIG_VALUE_INSIGHT_ALLOW_TRAFFIC_BAR_WHILE_STANDARD_INSIGHT_ENABLED.b().booleanValue();
        k kVarY = ai.y(ai.s(new e(gjVar.al(), this, 1), new e(aoVar.I(), this, 0), new e(ceVar.i(), this, 2), wVar.b(), new g(f25707a)));
        int i3 = bz.f51630a;
        this.f25711e = ai.V(kVarY, afVarE, by.b(), com.waze.view.navbar.c.f45068a);
    }

    public final ch b() {
        return this.f25711e;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f25709c, bo.g("closed", null));
    }
}
