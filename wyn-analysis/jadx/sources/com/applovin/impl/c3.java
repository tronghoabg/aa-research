package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c3 extends y2 implements t1 {

    /* renamed from: t, reason: collision with root package name */
    private final Bundle f21185t;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f21186u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f21187v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f21188w;

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f21189x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f21190y;

    /* renamed from: z, reason: collision with root package name */
    private String f21191z;

    public c3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, null, kVar);
        this.f21185t = new Bundle();
        this.f21188w = new AtomicBoolean();
        this.f21189x = new AtomicBoolean();
        this.f21186u = new AtomicReference();
        this.f21187v = new AtomicBoolean();
    }

    private long d0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f21804a.a(r3.f22700W7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.y2
    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new c3(this, hVar);
    }

    public void c0() {
        this.f21187v.set(true);
    }

    public long e0() {
        return a("ahdm", ((Long) this.f21804a.a(r3.f22696Q7)).longValue());
    }

    public long f0() {
        long jA = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f21804a.a(r3.f22707e8)).longValue());
    }

    public long g0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((Long) this.f21804a.a(r3.f22704b8)).longValue());
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        return d0() - (SystemClock.elapsedRealtime() - G());
    }

    public o4 h0() {
        return (o4) this.f21186u.getAndSet(null);
    }

    public long i0() {
        if (G() > 0) {
            return SystemClock.elapsedRealtime() - G();
        }
        return -1L;
    }

    public void j(String str) {
        this.f21191z = str;
    }

    public Bundle j0() {
        return this.f21185t;
    }

    public long k0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((Long) this.f21804a.a(r3.f22694O7)).longValue();
    }

    public String l0() {
        return b("mcode", "");
    }

    public AtomicBoolean m0() {
        return this.f21188w;
    }

    public String n0() {
        return this.f21191z;
    }

    public AtomicBoolean o0() {
        return this.f21189x;
    }

    public boolean p0() {
        return this.f21187v.get();
    }

    public boolean q0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f21804a.a(r3.f22705c8)).booleanValue();
    }

    public boolean r0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f21804a.a(r3.f22706d8)).booleanValue();
    }

    public boolean s0() {
        return a("susaode", (Boolean) this.f21804a.a(r3.f22695P7)).booleanValue();
    }

    @Override // com.applovin.impl.t1
    public void setExpired() {
        this.f21190y = true;
    }

    @Override // com.applovin.impl.y2
    public void a(Bundle bundle) throws JSONException {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f21185t.putBundle("applovin_ad_view_info", bundle2);
    }

    public void a(o4 o4Var) {
        this.f21186u.set(o4Var);
    }

    private c3(c3 c3Var, com.applovin.impl.mediation.h hVar) {
        super(c3Var.L(), c3Var.a(), c3Var.g(), hVar, c3Var.f21804a);
        this.f21185t = new Bundle();
        this.f21188w = new AtomicBoolean();
        this.f21189x = new AtomicBoolean();
        this.f21186u = c3Var.f21186u;
        this.f21187v = c3Var.f21187v;
    }
}
