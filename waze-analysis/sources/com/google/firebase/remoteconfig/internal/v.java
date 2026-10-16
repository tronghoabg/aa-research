package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    static final Date f10740a = new Date(-1);

    /* renamed from: b, reason: collision with root package name */
    static final Date f10741b = new Date(-1);

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f10742c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f10743d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f10744e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f10745f = new Object();

    public v(SharedPreferences sharedPreferences) {
        this.f10742c = sharedPreferences;
    }

    public final long a() {
        return this.f10742c.getLong("fetch_timeout_in_seconds", 60L);
    }

    final long b() {
        return this.f10742c.getLong("last_template_version", 0L);
    }

    public final long c() {
        return this.f10742c.getLong("minimum_fetch_interval_in_seconds", m.f10699a);
    }

    final t d() {
        t tVar;
        synchronized (this.f10744e) {
            SharedPreferences sharedPreferences = this.f10742c;
            tVar = new t(sharedPreferences.getInt("num_failed_fetches", 0), new Date(sharedPreferences.getLong("backoff_end_time_in_millis", -1L)));
        }
        return tVar;
    }

    public final u e() {
        u uVar;
        synchronized (this.f10745f) {
            SharedPreferences sharedPreferences = this.f10742c;
            uVar = new u(sharedPreferences.getInt("num_failed_realtime_streams", 0), new Date(sharedPreferences.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return uVar;
    }

    final String f() {
        return this.f10742c.getString("last_fetch_etag", null);
    }

    final Date g() {
        return new Date(this.f10742c.getLong("last_fetch_time_in_millis", -1L));
    }

    public final Map h() {
        try {
            JSONObject jSONObject = new JSONObject(this.f10742c.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    final void i(int i2, Date date) {
        synchronized (this.f10744e) {
            this.f10742c.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    final void j(String str) {
        synchronized (this.f10743d) {
            this.f10742c.edit().putString("last_fetch_etag", str).apply();
        }
    }

    final void k(long j2) {
        synchronized (this.f10743d) {
            this.f10742c.edit().putLong("last_template_version", j2).apply();
        }
    }

    public final void l(Date date) {
        synchronized (this.f10745f) {
            this.f10742c.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    final void m(int i2, Date date) {
        synchronized (this.f10745f) {
            this.f10742c.edit().putInt("num_failed_realtime_streams", i2).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    final void n() {
        synchronized (this.f10743d) {
            this.f10742c.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    final void o(Date date) {
        synchronized (this.f10743d) {
            this.f10742c.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    final void p() {
        synchronized (this.f10743d) {
            this.f10742c.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public final y q() {
        y yVarA;
        synchronized (this.f10743d) {
            SharedPreferences sharedPreferences = this.f10742c;
            sharedPreferences.getLong("last_fetch_time_in_millis", -1L);
            int i2 = sharedPreferences.getInt("last_fetch_status", 0);
            long j2 = m.f10699a;
            long j3 = sharedPreferences.getLong("fetch_timeout_in_seconds", 60L);
            if (j3 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j3)));
            }
            long j4 = sharedPreferences.getLong("minimum_fetch_interval_in_seconds", m.f10699a);
            if (j4 < 0) {
                throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j4 + " is an invalid argument");
            }
            x xVar = new x();
            xVar.b(i2);
            yVarA = xVar.a();
        }
        return yVarA;
    }
}
