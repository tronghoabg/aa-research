package com.waze.car_lib.i;

import com.waze.app_nav.hub.b.m;
import com.waze.config.ConfigValues;
import com.waze.map.b.n;
import com.waze.navigate.eo;
import com.waze.navigate.et;
import com.waze.z;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final n f20153a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.main.b f20154b;

    /* renamed from: c, reason: collision with root package name */
    private final eo f20155c;

    /* renamed from: d, reason: collision with root package name */
    private final z f20156d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20157e;

    public d(n nVar, com.waze.map.main.b bVar, eo eoVar, z zVar, m mVar, com.waze.shared_infra.i.e eVar) {
        x.f(nVar, "mainMapController");
        x.f(bVar, "mainMapConfiguration");
        x.f(eoVar, "navigationStatusInterface");
        x.f(zVar, "appType");
        x.f(mVar, "config");
        x.f(eVar, "logger");
        this.f20153a = nVar;
        this.f20154b = bVar;
        this.f20155c = eoVar;
        this.f20156d = zVar;
        this.f20157e = eVar;
    }

    public static final /* synthetic */ Object c(d dVar, h.c.e eVar) {
        Object objCollect = ai.B(ai.y(et.b(dVar.f20155c)), new a(null)).collect(new b(dVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    public final void d(af afVar) {
        boolean zBooleanValue;
        x.f(afVar, "scope");
        if (this.f20156d == z.f45554b) {
            zBooleanValue = false;
        } else {
            Boolean boolB = ConfigValues.CONFIG_VALUE_GOOGLE_ADS_IN_CAR_ENABLED.b();
            x.e(boolB, "getValue(...)");
            zBooleanValue = boolB.booleanValue();
        }
        this.f20153a.l(zBooleanValue);
        if (this.f20154b.a()) {
            aj.z(afVar, null, null, new c(this, null), 3);
        }
    }
}
