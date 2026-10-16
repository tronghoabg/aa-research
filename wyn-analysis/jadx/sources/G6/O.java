package G6;

import A7.RunnableC0278p;
import D6.C0395s;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfy;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class O implements N {

    /* renamed from: b, reason: collision with root package name */
    public boolean f4532b;

    /* renamed from: d, reason: collision with root package name */
    public p8.p f4534d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f4536f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f4537g;

    /* renamed from: i, reason: collision with root package name */
    public String f4539i;

    /* renamed from: j, reason: collision with root package name */
    public String f4540j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4531a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4533c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public zzbfx f4535e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4538h = true;
    public boolean k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f4541l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f4542m = -1;

    /* renamed from: n, reason: collision with root package name */
    public zzcff f4543n = new zzcff("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f4544o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f4545p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f4546q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f4547r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f4548s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f4549t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f4550u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4551v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f4552w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f4553x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f4554y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f4555z = "";

    /* renamed from: A, reason: collision with root package name */
    public String f4524A = JsonUtils.EMPTY_JSON;

    /* renamed from: B, reason: collision with root package name */
    public int f4525B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f4526C = -1;

    /* renamed from: D, reason: collision with root package name */
    public long f4527D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4528E = false;

    /* renamed from: F, reason: collision with root package name */
    public int f4529F = 0;

    /* renamed from: G, reason: collision with root package name */
    public int f4530G = 0;

    public final String A() {
        String str;
        l();
        synchronized (this.f4531a) {
            str = this.f4552w;
        }
        return str;
    }

    public final void B(String str) {
        l();
        synchronized (this.f4531a) {
            try {
                if (TextUtils.equals(this.f4552w, str)) {
                    return;
                }
                this.f4552w = str;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(boolean z2) {
        l();
        synchronized (this.f4531a) {
            try {
                if (z2 == this.k) {
                    return;
                }
                this.k = z2;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z2);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean D() {
        boolean z2;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbm)).booleanValue()) {
            return false;
        }
        l();
        synchronized (this.f4531a) {
            z2 = this.k;
        }
        return z2;
    }

    public final void E(boolean z2) {
        l();
        synchronized (this.f4531a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzmd)).longValue();
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z2);
                    this.f4537g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        l();
        synchronized (this.f4531a) {
            try {
                this.f4541l = str;
                if (this.f4537g != null) {
                    if (str.equals("-1")) {
                        this.f4537g.remove(AndroidTcfDataSource.TCF_TCSTRING_KEY);
                    } else {
                        this.f4537g.putString(AndroidTcfDataSource.TCF_TCSTRING_KEY, str);
                    }
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i5) {
        l();
        synchronized (this.f4531a) {
            try {
                this.f4542m = i5;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    if (i5 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i5);
                    }
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i5) {
        l();
        synchronized (this.f4531a) {
            try {
                if (this.f4526C == i5) {
                    return;
                }
                this.f4526C = i5;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i5);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j8) {
        l();
        synchronized (this.f4531a) {
            try {
                if (this.f4527D == j8) {
                    return;
                }
                this.f4527D = j8;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j8);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        String str;
        l();
        synchronized (this.f4531a) {
            str = this.f4553x;
        }
        return str;
    }

    public final boolean f() {
        boolean z2;
        l();
        synchronized (this.f4531a) {
            z2 = this.f4554y;
        }
        return z2;
    }

    public final void g(boolean z2) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
            l();
            synchronized (this.f4531a) {
                try {
                    if (this.f4554y == z2) {
                        return;
                    }
                    this.f4554y = z2;
                    SharedPreferences.Editor editor = this.f4537g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z2);
                        this.f4537g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
            l();
            synchronized (this.f4531a) {
                try {
                    if (this.f4555z.equals(str)) {
                        return;
                    }
                    this.f4555z = str;
                    SharedPreferences.Editor editor = this.f4537g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f4537g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void i(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkY)).booleanValue()) {
            l();
            synchronized (this.f4531a) {
                try {
                    if (this.f4524A.equals(str)) {
                        return;
                    }
                    this.f4524A = str;
                    SharedPreferences.Editor editor = this.f4537g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f4537g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void j() {
        l();
        synchronized (this.f4531a) {
            try {
                if (this.f4528E) {
                    return;
                }
                this.f4528E = true;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int k() {
        int i5;
        l();
        synchronized (this.f4531a) {
            i5 = this.f4530G;
        }
        return i5;
    }

    public final void l() {
        p8.p pVar = this.f4534d;
        if (pVar == null || pVar.isDone()) {
            return;
        }
        try {
            this.f4534d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            int i5 = L.f4523b;
            H6.l.g("Interrupted while waiting for preferences loaded.", e7);
        } catch (CancellationException e10) {
            e = e10;
            int i10 = L.f4523b;
            H6.l.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e11) {
            e = e11;
            int i102 = L.f4523b;
            H6.l.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e12) {
            e = e12;
            int i1022 = L.f4523b;
            H6.l.d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void m() {
        zzcfy.zza.execute(new A7.V(this, 13));
    }

    public final void n(Context context) {
        synchronized (this.f4531a) {
            try {
                if (this.f4536f != null) {
                    return;
                }
                this.f4534d = zzcfy.zza.zza(new RunnableC0278p(this, false, context, 18));
                this.f4532b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o() {
        boolean z2;
        l();
        synchronized (this.f4531a) {
            z2 = this.f4550u;
        }
        return z2;
    }

    public final boolean p() {
        boolean z2;
        l();
        synchronized (this.f4531a) {
            z2 = this.f4551v;
        }
        return z2;
    }

    public final void q(int i5) {
        l();
        synchronized (this.f4531a) {
            try {
                if (this.f4547r == i5) {
                    return;
                }
                this.f4547r = i5;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putInt("version_code", i5);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzcff r() {
        zzcff zzcffVar;
        l();
        synchronized (this.f4531a) {
            try {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznq)).booleanValue() && this.f4543n.zzj()) {
                    Iterator it = this.f4533c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                zzcffVar = this.f4543n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcffVar;
    }

    public final long s() {
        long j8;
        l();
        synchronized (this.f4531a) {
            j8 = this.f4544o;
        }
        return j8;
    }

    public final void t(int i5) {
        l();
        synchronized (this.f4531a) {
            try {
                if (this.f4546q == i5) {
                    return;
                }
                this.f4546q = i5;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i5);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int u() {
        int i5;
        l();
        synchronized (this.f4531a) {
            i5 = this.f4546q;
        }
        return i5;
    }

    public final void v(long j8) {
        l();
        synchronized (this.f4531a) {
            try {
                if (this.f4545p == j8) {
                    return;
                }
                this.f4545p = j8;
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j8);
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long w() {
        long j8;
        l();
        synchronized (this.f4531a) {
            j8 = this.f4545p;
        }
        return j8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        C6.n.f1857D.k.getClass();
        r3.put("timestamp_ms", java.lang.System.currentTimeMillis());
        r1.put(r2, r3);
        r7.f4549t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r10 = G6.L.f4523b;
        H6.l.g("Could not update native advanced settings", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.l()
            java.lang.Object r0 = r7.f4531a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f4549t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L91
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            java.lang.String r9 = "timestamp_ms"
            C6.n r10 = C6.n.f1857D     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            n7.b r10 = r10.k     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r10.getClass()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            org.json.JSONObject r9 = r7.f4549t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L70
            goto L78
        L70:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            int r10 = G6.L.f4523b     // Catch: java.lang.Throwable -> L14
            H6.l.g(r9, r8)     // Catch: java.lang.Throwable -> L14
        L78:
            android.content.SharedPreferences$Editor r8 = r7.f4537g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8c
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f4549t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f4537g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L8c:
            r7.m()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.O.x(java.lang.String, java.lang.String, boolean):void");
    }

    public final JSONObject y() {
        JSONObject jSONObject;
        l();
        synchronized (this.f4531a) {
            jSONObject = this.f4549t;
        }
        return jSONObject;
    }

    public final void z() {
        l();
        synchronized (this.f4531a) {
            try {
                this.f4549t = new JSONObject();
                SharedPreferences.Editor editor = this.f4537g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f4537g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
