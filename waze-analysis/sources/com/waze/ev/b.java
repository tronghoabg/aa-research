package com.waze.ev;

import com.waze.config.ConfigValues;
import com.waze.n.ac;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.config.b f23676a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.config.d f23677b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.config.d f23678c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f23679d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f23680e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f23681f;

    /* renamed from: g, reason: collision with root package name */
    private final long f23682g;

    /* renamed from: h, reason: collision with root package name */
    private final long f23683h;

    /* renamed from: i, reason: collision with root package name */
    private final long f23684i;

    public b() {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_EV_HAS_EV_CAR;
        this.f23676a = bVar;
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_EV_SELECTED_EV_CONNECTOR_TYPES;
        this.f23677b = dVar;
        com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_EV_SELECTED_EV_NETWORK_TYPES;
        this.f23678c = dVar2;
        x.e(bVar, "configValueHasEvCar");
        this.f23679d = ac.p(bVar);
        x.e(dVar, "configValueSelectedEVConnectorTypes");
        this.f23680e = ac.p(dVar);
        x.e(dVar2, "configValueSelectedEVNetworkTypes");
        this.f23681f = ac.p(dVar2);
        Long lB = ConfigValues.CONFIG_VALUE_EV_PLUG_SPEED_TIER_1_MIN_KW.b();
        x.e(lB, "getValue(...)");
        this.f23682g = lB.longValue();
        Long lB2 = ConfigValues.CONFIG_VALUE_EV_PLUG_SPEED_TIER_2_MIN_KW.b();
        x.e(lB2, "getValue(...)");
        this.f23683h = lB2.longValue();
        Long lB3 = ConfigValues.CONFIG_VALUE_EV_PLUG_SPEED_TIER_3_MIN_KW.b();
        x.e(lB3, "getValue(...)");
        this.f23684i = lB3.longValue();
    }

    public final long a() {
        return this.f23682g;
    }

    public final long b() {
        return this.f23683h;
    }

    public final long c() {
        return this.f23684i;
    }

    public final ch d() {
        return this.f23679d;
    }

    public final ch e() {
        return this.f23680e;
    }

    public final ch f() {
        return this.f23681f;
    }

    public final void g(boolean z) {
        this.f23676a.d(Boolean.valueOf(z));
    }

    public final void h(String str) {
        x.f(str, "value");
        this.f23677b.d(str);
    }

    public final void i(String str) {
        x.f(str, "value");
        this.f23678c.d(str);
    }
}
