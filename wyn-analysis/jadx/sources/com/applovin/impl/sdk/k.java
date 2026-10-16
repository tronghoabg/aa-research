package com.applovin.impl.sdk;

import A7.AbstractC0279p0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.AbstractC1659r0;
import com.applovin.impl.C1629c;
import com.applovin.impl.C1635f;
import com.applovin.impl.C1643j;
import com.applovin.impl.C1658q0;
import com.applovin.impl.C1667u0;
import com.applovin.impl.a5;
import com.applovin.impl.a7;
import com.applovin.impl.b5;
import com.applovin.impl.c4;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e1;
import com.applovin.impl.e6;
import com.applovin.impl.f1;
import com.applovin.impl.g7;
import com.applovin.impl.i8;
import com.applovin.impl.j1;
import com.applovin.impl.j4;
import com.applovin.impl.j5;
import com.applovin.impl.k2;
import com.applovin.impl.k3;
import com.applovin.impl.l3;
import com.applovin.impl.m7;
import com.applovin.impl.m8;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.o7;
import com.applovin.impl.p3;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.r1;
import com.applovin.impl.r3;
import com.applovin.impl.r4;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u3;
import com.applovin.impl.u5;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ka.AbstractC3256n;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: D0, reason: collision with root package name */
    public static k f22986D0;

    /* renamed from: E0, reason: collision with root package name */
    protected static Context f22987E0;

    /* renamed from: F0, reason: collision with root package name */
    private static boolean f22988F0;

    /* renamed from: H0, reason: collision with root package name */
    private static final boolean f22990H0;

    /* renamed from: I0, reason: collision with root package name */
    private static volatile C1629c f22991I0;

    /* renamed from: A0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f22994A0;

    /* renamed from: a, reason: collision with root package name */
    private String f23020a;

    /* renamed from: b, reason: collision with root package name */
    private String f23022b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f23024c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23026d;

    /* renamed from: e, reason: collision with root package name */
    private long f23028e;

    /* renamed from: f, reason: collision with root package name */
    private long f23030f;

    /* renamed from: g, reason: collision with root package name */
    private Long f23032g;

    /* renamed from: h, reason: collision with root package name */
    private long f23034h;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f23038j;

    /* renamed from: j0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f23039j0;
    private MaxSegmentCollection k;

    /* renamed from: l, reason: collision with root package name */
    private String f23041l;

    /* renamed from: l0, reason: collision with root package name */
    private List f23042l0;

    /* renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f23051q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f23052q0;
    private String v0;

    /* renamed from: w0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f23063w0;

    /* renamed from: z0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f23069z0;

    /* renamed from: J0, reason: collision with root package name */
    private static final Object f22992J0 = new Object();

    /* renamed from: G0, reason: collision with root package name */
    private static final long f22989G0 = System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f23036i = new AtomicBoolean();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f23043m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f23045n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f23047o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    private final AtomicReference f23049p = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private final o f23053r = new o(this);

    /* renamed from: s, reason: collision with root package name */
    private final C1635f f23055s = new C1635f(this);

    /* renamed from: t, reason: collision with root package name */
    private final z2 f23057t = new z2(this);

    /* renamed from: u, reason: collision with root package name */
    private final r1 f23059u = new r1(this);

    /* renamed from: v, reason: collision with root package name */
    private final m7 f23061v = new m7(this);

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f23062w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f23064x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private final AtomicReference f23066y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    private final AtomicReference f23068z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    private final AtomicReference f22993A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    private final AtomicReference f22995B = new AtomicReference();

    /* renamed from: C, reason: collision with root package name */
    private final AtomicReference f22996C = new AtomicReference();

    /* renamed from: D, reason: collision with root package name */
    private final AtomicReference f22998D = new AtomicReference();

    /* renamed from: E, reason: collision with root package name */
    private final AtomicReference f22999E = new AtomicReference();

    /* renamed from: F, reason: collision with root package name */
    private final AtomicReference f23000F = new AtomicReference();

    /* renamed from: G, reason: collision with root package name */
    private final AtomicReference f23001G = new AtomicReference();

    /* renamed from: H, reason: collision with root package name */
    private final AtomicReference f23002H = new AtomicReference();

    /* renamed from: I, reason: collision with root package name */
    private final AtomicReference f23003I = new AtomicReference();

    /* renamed from: J, reason: collision with root package name */
    private final AtomicReference f23004J = new AtomicReference();

    /* renamed from: K, reason: collision with root package name */
    private final AtomicReference f23005K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();

    /* renamed from: M, reason: collision with root package name */
    private final AtomicReference f23006M = new AtomicReference();

    /* renamed from: N, reason: collision with root package name */
    private final AtomicReference f23007N = new AtomicReference();

    /* renamed from: O, reason: collision with root package name */
    private final AtomicReference f23008O = new AtomicReference();

    /* renamed from: P, reason: collision with root package name */
    private final AtomicReference f23009P = new AtomicReference();

    /* renamed from: Q, reason: collision with root package name */
    private final AtomicReference f23010Q = new AtomicReference();

    /* renamed from: R, reason: collision with root package name */
    private final AtomicReference f23011R = new AtomicReference();

    /* renamed from: S, reason: collision with root package name */
    private final AtomicReference f23012S = new AtomicReference();

    /* renamed from: T, reason: collision with root package name */
    private final AtomicReference f23013T = new AtomicReference();

    /* renamed from: U, reason: collision with root package name */
    private final AtomicReference f23014U = new AtomicReference();

    /* renamed from: V, reason: collision with root package name */
    private final AtomicReference f23015V = new AtomicReference();

    /* renamed from: W, reason: collision with root package name */
    private final AtomicReference f23016W = new AtomicReference();

    /* renamed from: X, reason: collision with root package name */
    private final AtomicReference f23017X = new AtomicReference();

    /* renamed from: Y, reason: collision with root package name */
    private final AtomicReference f23018Y = new AtomicReference();

    /* renamed from: Z, reason: collision with root package name */
    private final AtomicReference f23019Z = new AtomicReference();

    /* renamed from: a0, reason: collision with root package name */
    private final AtomicReference f23021a0 = new AtomicReference();

    /* renamed from: b0, reason: collision with root package name */
    private final AtomicReference f23023b0 = new AtomicReference();

    /* renamed from: c0, reason: collision with root package name */
    private final AtomicReference f23025c0 = new AtomicReference();

    /* renamed from: d0, reason: collision with root package name */
    private final AtomicReference f23027d0 = new AtomicReference();

    /* renamed from: e0, reason: collision with root package name */
    private final AtomicReference f23029e0 = new AtomicReference();

    /* renamed from: f0, reason: collision with root package name */
    private final AtomicReference f23031f0 = new AtomicReference();

    /* renamed from: g0, reason: collision with root package name */
    private final AtomicReference f23033g0 = new AtomicReference();

    /* renamed from: h0, reason: collision with root package name */
    private final AtomicReference f23035h0 = new AtomicReference();

    /* renamed from: i0, reason: collision with root package name */
    private final AtomicReference f23037i0 = new AtomicReference();

    /* renamed from: k0, reason: collision with root package name */
    private final AtomicReference f23040k0 = new AtomicReference();

    /* renamed from: m0, reason: collision with root package name */
    private final Object f23044m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    private final AtomicBoolean f23046n0 = new AtomicBoolean(true);

    /* renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f23048o0 = new AtomicBoolean();

    /* renamed from: p0, reason: collision with root package name */
    private final AtomicBoolean f23050p0 = new AtomicBoolean();

    /* renamed from: r0, reason: collision with root package name */
    private boolean f23054r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f23056s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f23058t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private int f23060u0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    private final Object f23065x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    private SdkConfigurationImpl f23067y0 = new SdkConfigurationImpl(this);
    private final j5 B0 = new s6(this, true, "scheduleAdLoadIntegrationError", new x(2, this));

    /* renamed from: C0, reason: collision with root package name */
    private final j5 f22997C0 = new s6(this, true, "sdkInit", new x(3, this));

    public class a implements u5.b {
        public a() {
        }

        @Override // com.applovin.impl.u5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            k.this.c(jSONObject);
            if (((Boolean) k.this.a(r3.j8)).booleanValue()) {
                k kVar = k.this;
                kVar.f23039j0 = new com.applovin.impl.mediation.e(kVar);
            }
            k.this.m().a();
            AbstractC1659r0.a(jSONObject, zIsValid, k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k.this.D().b();
            k kVar2 = k.this;
            kVar2.f23042l0 = kVar2.a(jSONObject);
            if (zIsValid) {
                k.this.f23067y0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            k.this.t0().a(jSONObject);
            k.this.b(jSONObject);
            t2.b(((Boolean) k.this.a(y4.f23939x6)).booleanValue());
            t2.a(((Boolean) k.this.a(y4.f23947y6)).booleanValue());
            k.this.R0();
            if (!((Boolean) k.this.a(y4.f23818i3)).booleanValue() || zIsValid || !AbstractC1659r0.a(k.o())) {
                k.this.P0();
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.U0();
        }
    }

    public class b implements C1667u0.c {
        public b() {
        }

        @Override // com.applovin.impl.C1667u0.c
        public void a(C1667u0.b bVar) {
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            k.this.f23050p0.set(bVar.b());
            if (!bVar.a()) {
                k.this.c("Initializing SDK in MAX environment...");
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            k.this.T0();
            k.this.S0();
        }
    }

    public class c implements u5.b {
        public c() {
        }

        @Override // com.applovin.impl.u5.b
        public void a(JSONObject jSONObject) {
            k.this.c(jSONObject);
            k.this.f23036i.set(false);
            k.this.P0();
        }
    }

    public class d implements y3.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y3 f23073a;

        public d(y3 y3Var) {
            this.f23073a = y3Var;
        }

        @Override // com.applovin.impl.y3.a
        public void a() {
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f23044m0) {
                try {
                    if (!k.this.f23052q0) {
                        k.this.T0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f23073a.b(this);
        }

        @Override // com.applovin.impl.y3.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Rc.b(1));
            f22990H0 = true;
        } catch (Throwable unused) {
            f22990H0 = false;
        }
    }

    public k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f23052q0 = false;
        f22986D0 = this;
        this.f23038j = appLovinSdkSettings;
        this.f23026d = System.currentTimeMillis();
        this.f23052q0 = true;
        if (!G0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        f22987E0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f23024c = new WeakReference((Activity) context);
        }
    }

    private void B0() {
        Context context = f22987E0;
        o oVarO = O();
        b5 b5VarQ0 = q0();
        C1667u0 c1667u0X = x();
        a(context);
        n0();
        j();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f23020a;
        if (str == null || str.length() != 86) {
            o.h("AppLovinSdk", "SDK key provided is invalid (" + this.f23020a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f23022b) && this.f23022b.length() != 36) {
            String strC = wg.b.c(new StringBuilder("Axon event key length "), this.f23022b, " is invalid - expected 36");
            if (o7.c(this)) {
                throw new IllegalArgumentException(strC);
            }
            o.h("AppLovinSdk", strC);
        }
        if (c1667u0X.l()) {
            String str2 = "Terms Flow has been replaced. " + c1667u0X.g();
            if (o7.c(this)) {
                throw new IllegalStateException(str2);
            }
            o.h("AppLovinSdk", str2);
        }
        if (o7.i()) {
            o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!o7.b(this)) {
            o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (o7.m(context)) {
            this.f23038j.setVerboseLogging(true);
        }
        p0().a(y4.k, Boolean.valueOf(this.f23038j.isVerboseLoggingEnabled()));
        w3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        a5 a5Var = a5.f20950c;
        if (TextUtils.isEmpty((String) b5VarQ0.a(a5Var, (Object) null, defaultSharedPreferences))) {
            this.f23056s0 = true;
            b5VarQ0.b(a5Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            b5VarQ0.b(a5Var, Boolean.toString(false), defaultSharedPreferences);
        }
        a5 a5Var2 = a5.f20951d;
        if (((Boolean) b5VarQ0.a(a5Var2, Boolean.FALSE)).booleanValue()) {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f23058t0 = true;
        } else {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            b5VarQ0.b(a5Var2, Boolean.TRUE);
            b5VarQ0.b(a5.f20966t, Boolean.valueOf(c1667u0X.j()));
        }
        a5 a5Var3 = a5.f20952e;
        this.f23030f = ((Long) b5VarQ0.a(a5Var3, 0L)).longValue() + 1;
        q0().b(a5Var3, Long.valueOf(this.f23030f));
        a5 a5Var4 = a5.f20953f;
        this.f23032g = (Long) b5VarQ0.a(a5Var4, null);
        q0().b(a5Var4, Long.valueOf(f22989G0));
        a5 a5Var5 = a5.f20954g;
        String str3 = (String) b5VarQ0.a(a5Var5, null);
        if (StringUtils.isValidString(str3)) {
            if (AppLovinSdk.VERSION_CODE > o7.g(str3)) {
                b5VarQ0.b(a5Var5, AppLovinSdk.VERSION);
            }
        } else {
            b5VarQ0.b(a5Var5, AppLovinSdk.VERSION);
        }
        w0().d(d2.f21313e, CollectionUtils.map("details", "isInitProviderContextSet=" + f22988F0));
    }

    public static boolean G0() {
        return f22990H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        if (r0().g()) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        r0().h();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        e6 e6VarR0 = r0();
        int i5 = this.f23060u0 + 1;
        this.f23060u0 = i5;
        e6VarR0.a((j5) new u5(i5, this, new c()), e6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        if (H0()) {
            k2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0() {
        synchronized (this.f23044m0) {
            try {
                boolean zA = AbstractC1659r0.a(o());
                if (!H0()) {
                    O();
                    if (o.a()) {
                        O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                    }
                }
                if (!((Boolean) a(y4.f23826j3)).booleanValue() || zA) {
                    T0();
                }
                if (((Boolean) a(y4.f23818i3)).booleanValue() && !zA) {
                    O();
                    if (o.a()) {
                        O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    U0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private r O0() {
        if (!r4.f(f22987E0)) {
            return null;
        }
        try {
            return new r(this);
        } catch (Throwable th) {
            o.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        Long l10 = (Long) a(y4.f23894r3);
        if (l10.longValue() >= 0 && this.f23036i.compareAndSet(false, true)) {
            i8.a(l10.longValue(), false, this, new x(1, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        if (!H0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f23048o0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!x().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            x().a(v0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        y3 y3VarC0 = c0();
        y3VarC0.a(new d(y3VarC0));
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(y4.f23861n4)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public static Context o() {
        return f22987E0;
    }

    public l A() {
        Object lVar = this.f22993A.get();
        if (lVar == null) {
            synchronized (this.f22993A) {
                try {
                    lVar = this.f22993A.get();
                    if (lVar == null) {
                        lVar = new l(this);
                        this.f22993A.set(lVar);
                    }
                } finally {
                }
            }
        }
        if (lVar == this.f22993A) {
            lVar = null;
        }
        return (l) lVar;
    }

    public boolean A0() {
        return this.f23058t0;
    }

    public j1 B() {
        Object j1Var = this.f22999E.get();
        if (j1Var == null) {
            synchronized (this.f22999E) {
                try {
                    j1Var = this.f22999E.get();
                    if (j1Var == null) {
                        j1Var = new j1(this);
                        this.f22999E.set(j1Var);
                    }
                } finally {
                }
            }
        }
        if (j1Var == this.f22999E) {
            j1Var = null;
        }
        return (j1) j1Var;
    }

    public String C() {
        return this.v0;
    }

    public boolean C0() {
        boolean z2;
        synchronized (this.f23044m0) {
            z2 = this.f23054r0;
        }
        return z2;
    }

    public r1 D() {
        return this.f23059u;
    }

    public boolean D0() {
        return this.f23056s0;
    }

    public String E() {
        return x0().d();
    }

    public boolean E0() {
        boolean z2;
        synchronized (this.f23065x0) {
            z2 = this.f23063w0 != null;
        }
        return z2;
    }

    public EventServiceImpl F() {
        Object eventServiceImpl = this.f23047o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f23047o) {
                try {
                    eventServiceImpl = this.f23047o.get();
                    if (eventServiceImpl == null) {
                        eventServiceImpl = new EventServiceImpl(this);
                        this.f23047o.set(eventServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (eventServiceImpl == this.f23047o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public boolean F0() {
        boolean z2;
        synchronized (this.f23044m0) {
            z2 = this.f23052q0;
        }
        return z2;
    }

    public m G() {
        Object mVar = this.f23002H.get();
        if (mVar == null) {
            synchronized (this.f23002H) {
                try {
                    mVar = this.f23002H.get();
                    if (mVar == null) {
                        mVar = new m(this);
                        this.f23002H.set(mVar);
                    }
                } finally {
                }
            }
        }
        if (mVar == this.f23002H) {
            mVar = null;
        }
        return (m) mVar;
    }

    public n H() {
        Object nVar = this.f23004J.get();
        if (nVar == null) {
            synchronized (this.f23004J) {
                try {
                    nVar = this.f23004J.get();
                    if (nVar == null) {
                        nVar = new n(this);
                        this.f23004J.set(nVar);
                    }
                } finally {
                }
            }
        }
        if (nVar == this.f23004J) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean H0() {
        return StringUtils.containsIgnoreCase(V(), AppLovinMediationProvider.MAX);
    }

    public Activity I() {
        WeakReference weakReference;
        if (!((Boolean) a(y4.f23577D4)).booleanValue() || (weakReference = this.f23024c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public boolean I0() {
        return o7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public AppLovinSdkInitializationConfiguration J() {
        return this.f23063w0;
    }

    public long K() {
        return this.f23026d;
    }

    public Long L() {
        return this.f23032g;
    }

    public long M() {
        return this.f23030f;
    }

    public o2 N() {
        Object o2Var = this.f23018Y.get();
        if (o2Var == null) {
            synchronized (this.f23018Y) {
                try {
                    o2Var = this.f23018Y.get();
                    if (o2Var == null) {
                        o2Var = new o2(this);
                        this.f23018Y.set(o2Var);
                    }
                } finally {
                }
            }
        }
        if (o2Var == this.f23018Y) {
            o2Var = null;
        }
        return (o2) o2Var;
    }

    public void N0() {
        b(false);
    }

    public o O() {
        return this.f23053r;
    }

    public z2 P() {
        return this.f23057t;
    }

    public com.applovin.impl.mediation.d Q() {
        Object dVar = this.f23037i0.get();
        if (dVar == null) {
            synchronized (this.f23037i0) {
                try {
                    dVar = this.f23037i0.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.mediation.d(this);
                        this.f23037i0.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.f23037i0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public void Q0() {
        if (StringUtils.isValidString(this.f23041l)) {
            return;
        }
        this.f23041l = AppLovinMediationProvider.MAX;
    }

    public com.applovin.impl.mediation.e R() {
        return this.f23039j0;
    }

    public com.applovin.impl.mediation.f S() {
        Object fVar = this.f23027d0.get();
        if (fVar == null) {
            synchronized (this.f23027d0) {
                try {
                    fVar = this.f23027d0.get();
                    if (fVar == null) {
                        fVar = new com.applovin.impl.mediation.f(this);
                        this.f23027d0.set(fVar);
                    }
                } finally {
                }
            }
        }
        if (fVar == this.f23027d0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public void S0() {
        t().a();
    }

    public com.applovin.impl.mediation.g T() {
        Object gVar = this.f23025c0.get();
        if (gVar == null) {
            synchronized (this.f23025c0) {
                try {
                    gVar = this.f23025c0.get();
                    if (gVar == null) {
                        gVar = new com.applovin.impl.mediation.g(this);
                        this.f23025c0.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.f23025c0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void T0() {
        synchronized (this.f23044m0) {
            this.f23052q0 = true;
            r0().i();
            d();
        }
    }

    public p3 U() {
        Object p3Var = this.f23033g0.get();
        if (p3Var == null) {
            synchronized (this.f23033g0) {
                try {
                    p3Var = this.f23033g0.get();
                    if (p3Var == null) {
                        p3Var = new p3(this);
                        this.f23033g0.set(p3Var);
                    }
                } finally {
                }
            }
        }
        if (p3Var == this.f23033g0) {
            p3Var = null;
        }
        return (p3) p3Var;
    }

    public String V() {
        return this.f23041l;
    }

    public void V0() {
        o.h("AppLovinSdk", "Resetting SDK state...");
        p0().a();
        p0().e();
        if (this.f23046n0.compareAndSet(true, false)) {
            T0();
        } else {
            this.f23046n0.set(true);
        }
    }

    public void W0() {
        if (StringUtils.isValidString(this.v0)) {
            return;
        }
        this.v0 = AppLovinMediationProvider.MAX;
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public MediationServiceImpl X() {
        Object mediationServiceImpl = this.f23029e0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f23029e0) {
                try {
                    mediationServiceImpl = this.f23029e0.get();
                    if (mediationServiceImpl == null) {
                        mediationServiceImpl = new MediationServiceImpl(this);
                        this.f23029e0.set(mediationServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (mediationServiceImpl == this.f23029e0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void X0() {
        y().n();
    }

    public u3 Y() {
        Object u3Var = this.f23068z.get();
        if (u3Var == null) {
            synchronized (this.f23068z) {
                try {
                    u3Var = this.f23068z.get();
                    if (u3Var == null) {
                        u3Var = new u3(this);
                        this.f23068z.set(u3Var);
                    }
                } finally {
                }
            }
        }
        if (u3Var == this.f23068z) {
            u3Var = null;
        }
        return (u3) u3Var;
    }

    public void Y0() {
        a((Map) null);
    }

    public v3 Z() {
        Object v3Var = this.f23031f0.get();
        if (v3Var == null) {
            synchronized (this.f23031f0) {
                try {
                    v3Var = this.f23031f0.get();
                    if (v3Var == null) {
                        v3Var = new v3();
                        this.f23031f0.set(v3Var);
                    }
                } finally {
                }
            }
        }
        if (v3Var == this.f23031f0) {
            v3Var = null;
        }
        return (v3) v3Var;
    }

    public void Z0() {
        if (AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.f23041l) && ((Boolean) a(y4.f23684R3)).booleanValue()) {
            String str = (String) a(y4.f23676Q3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb2.append(str2);
            sb2.append(".");
            if (str.startsWith(sb2.toString())) {
                return;
            }
            String strG = R8.v.g("Mismatched AdMob adapter (", str, ") and AppLovin SDK (", str2, ") versions detected, which may cause compatibility issues.");
            o.h("AppLovinSdk", strG);
            AppLovinSdkUtils.runOnUiThread(true, new u(3, this, strG));
        }
    }

    public p a0() {
        Object pVar = this.f23035h0.get();
        if (pVar == null) {
            synchronized (this.f23035h0) {
                try {
                    pVar = this.f23035h0.get();
                    if (pVar == null) {
                        pVar = new p(this);
                        this.f23035h0.set(pVar);
                    }
                } finally {
                }
            }
        }
        if (pVar == this.f23035h0) {
            pVar = null;
        }
        return (p) pVar;
    }

    public AppLovinNativeAdService b0() {
        Object appLovinNativeAdService = this.f23045n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f23045n) {
                try {
                    appLovinNativeAdService = this.f23045n.get();
                    if (appLovinNativeAdService == null) {
                        appLovinNativeAdService = new AppLovinNativeAdService(this);
                        this.f23045n.set(appLovinNativeAdService);
                    }
                } finally {
                }
            }
        }
        if (appLovinNativeAdService == this.f23045n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public y3 c0() {
        Object y3Var = this.f23006M.get();
        if (y3Var == null) {
            synchronized (this.f23006M) {
                try {
                    y3Var = this.f23006M.get();
                    if (y3Var == null) {
                        y3Var = new y3(o());
                        this.f23006M.set(y3Var);
                    }
                } finally {
                }
            }
        }
        if (y3Var == this.f23006M) {
            y3Var = null;
        }
        return (y3) y3Var;
    }

    public c4 d0() {
        Object c4Var = this.f23017X.get();
        if (c4Var == null) {
            synchronized (this.f23017X) {
                try {
                    c4Var = this.f23017X.get();
                    if (c4Var == null) {
                        c4Var = new c4(this);
                        this.f23017X.set(c4Var);
                    }
                } finally {
                }
            }
        }
        if (c4Var == this.f23017X) {
            c4Var = null;
        }
        return (c4) c4Var;
    }

    public j4 e0() {
        Object j4Var = this.f23013T.get();
        if (j4Var == null) {
            synchronized (this.f23013T) {
                try {
                    j4Var = this.f23013T.get();
                    if (j4Var == null) {
                        j4Var = new j4(this);
                        this.f23013T.set(j4Var);
                    }
                } finally {
                }
            }
        }
        if (j4Var == this.f23013T) {
            j4Var = null;
        }
        return (j4) j4Var;
    }

    public com.applovin.impl.sdk.network.b f0() {
        Object bVar = this.f23021a0.get();
        if (bVar == null) {
            synchronized (this.f23021a0) {
                try {
                    bVar = this.f23021a0.get();
                    if (bVar == null) {
                        bVar = new com.applovin.impl.sdk.network.b(this);
                        this.f23021a0.set(bVar);
                    }
                } finally {
                }
            }
        }
        if (bVar == this.f23021a0) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public PostbackServiceImpl g0() {
        Object postbackServiceImpl = this.f23019Z.get();
        if (postbackServiceImpl == null) {
            synchronized (this.f23019Z) {
                try {
                    postbackServiceImpl = this.f23019Z.get();
                    if (postbackServiceImpl == null) {
                        postbackServiceImpl = new PostbackServiceImpl(this);
                        this.f23019Z.set(postbackServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (postbackServiceImpl == this.f23019Z) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public r h0() {
        Object objO0 = this.f22995B.get();
        if (objO0 == null) {
            synchronized (this.f22995B) {
                try {
                    objO0 = this.f22995B.get();
                    if (objO0 == null) {
                        objO0 = O0();
                        if (objO0 == null) {
                            objO0 = this.f22995B;
                        }
                        this.f22995B.set(objO0);
                    }
                } finally {
                }
            }
        }
        if (objO0 == this.f22995B) {
            objO0 = null;
        }
        return (r) objO0;
    }

    public String i0() {
        return x0().a();
    }

    public String j0() {
        return this.f23020a;
    }

    public MaxSegmentCollectionImpl k0() {
        return (MaxSegmentCollectionImpl) this.k;
    }

    public Map l0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplK0 = k0();
        if (maxSegmentCollectionImplK0 == null) {
            return null;
        }
        return maxSegmentCollectionImplK0.getJsonData();
    }

    public x4 m0() {
        Object x4Var = this.f23008O.get();
        if (x4Var == null) {
            synchronized (this.f23008O) {
                try {
                    x4Var = this.f23008O.get();
                    if (x4Var == null) {
                        x4Var = new x4(this);
                        this.f23008O.set(x4Var);
                    }
                } finally {
                }
            }
        }
        if (x4Var == this.f23008O) {
            x4Var = null;
        }
        return (x4) x4Var;
    }

    public SessionTracker n0() {
        Object sessionTracker = this.f23003I.get();
        if (sessionTracker == null) {
            synchronized (this.f23003I) {
                try {
                    sessionTracker = this.f23003I.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.f23003I.set(sessionTracker);
                    }
                } finally {
                }
            }
        }
        if (sessionTracker == this.f23003I) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings o0() {
        return this.f23038j;
    }

    public i p() {
        Object iVar = this.f23009P.get();
        if (iVar == null) {
            synchronized (this.f23009P) {
                try {
                    iVar = this.f23009P.get();
                    if (iVar == null) {
                        iVar = new i(this);
                        this.f23009P.set(iVar);
                    }
                } finally {
                }
            }
        }
        if (iVar == this.f23009P) {
            iVar = null;
        }
        return (i) iVar;
    }

    public z4 p0() {
        Object z4Var = this.f23064x.get();
        if (z4Var == null) {
            synchronized (this.f23064x) {
                try {
                    z4Var = this.f23064x.get();
                    if (z4Var == null) {
                        z4Var = new z4(this);
                        this.f23064x.set(z4Var);
                    }
                } finally {
                }
            }
        }
        if (z4Var == this.f23064x) {
            z4Var = null;
        }
        return (z4) z4Var;
    }

    public String q() {
        return this.f23022b;
    }

    public b5 q0() {
        Object b5Var = this.f22996C.get();
        if (b5Var == null) {
            synchronized (this.f22996C) {
                try {
                    b5Var = this.f22996C.get();
                    if (b5Var == null) {
                        b5Var = new b5(this);
                        this.f22996C.set(b5Var);
                    }
                } finally {
                }
            }
        }
        if (b5Var == this.f22996C) {
            b5Var = null;
        }
        return (b5) b5Var;
    }

    public String r() {
        return x0().b();
    }

    public e6 r0() {
        Object e6Var = this.f23062w.get();
        if (e6Var == null) {
            synchronized (this.f23062w) {
                try {
                    e6Var = this.f23062w.get();
                    if (e6Var == null) {
                        e6Var = new e6(this);
                        this.f23062w.set(e6Var);
                    }
                } finally {
                }
            }
        }
        if (e6Var == this.f23062w) {
            e6Var = null;
        }
        return (e6) e6Var;
    }

    public CmpServiceImpl s() {
        Object cmpServiceImpl = this.f23049p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f23049p) {
                try {
                    cmpServiceImpl = this.f23049p.get();
                    if (cmpServiceImpl == null) {
                        cmpServiceImpl = new CmpServiceImpl(this);
                        this.f23049p.set(cmpServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (cmpServiceImpl == this.f23049p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public a7 s0() {
        Object a7Var = this.f23011R.get();
        if (a7Var == null) {
            synchronized (this.f23011R) {
                try {
                    a7Var = this.f23011R.get();
                    if (a7Var == null) {
                        a7Var = new a7(this);
                        this.f23011R.set(a7Var);
                    }
                } finally {
                }
            }
        }
        if (a7Var == this.f23011R) {
            a7Var = null;
        }
        return (a7) a7Var;
    }

    public j t() {
        Object jVar = this.f23007N.get();
        if (jVar == null) {
            synchronized (this.f23007N) {
                try {
                    jVar = this.f23007N.get();
                    if (jVar == null) {
                        jVar = new j(this);
                        this.f23007N.set(jVar);
                    }
                } finally {
                }
            }
        }
        if (jVar == this.f23007N) {
            jVar = null;
        }
        return (j) jVar;
    }

    public g7 t0() {
        Object g7Var = this.f23040k0.get();
        if (g7Var == null) {
            synchronized (this.f23040k0) {
                try {
                    g7Var = this.f23040k0.get();
                    if (g7Var == null) {
                        g7Var = new g7(this);
                        this.f23040k0.set(g7Var);
                    }
                } finally {
                }
            }
        }
        if (g7Var == this.f23040k0) {
            g7Var = null;
        }
        return (g7) g7Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CoreSdk{sdkKey='");
        sb2.append(this.f23020a);
        sb2.append("', enabled=");
        sb2.append(this.f23054r0);
        sb2.append(", isFirstSession=");
        return AbstractC0279p0.p(sb2, this.f23056s0, '}');
    }

    public String u() {
        return x0().c();
    }

    public long u0() {
        if (this.f23034h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f23034h;
    }

    public SdkConfigurationImpl v() {
        return this.f23067y0;
    }

    public Activity v0() {
        Activity activityB = a(o()).b();
        return activityB != null ? activityB : I();
    }

    public C1658q0 w() {
        Object c1658q0 = this.f23066y.get();
        if (c1658q0 == null) {
            synchronized (this.f23066y) {
                try {
                    c1658q0 = this.f23066y.get();
                    if (c1658q0 == null) {
                        c1658q0 = new C1658q0(this);
                        this.f23066y.set(c1658q0);
                    }
                } finally {
                }
            }
        }
        if (c1658q0 == this.f23066y) {
            c1658q0 = null;
        }
        return (C1658q0) c1658q0;
    }

    public m7 w0() {
        return this.f23061v;
    }

    public C1667u0 x() {
        Object c1667u0 = this.f23010Q.get();
        if (c1667u0 == null) {
            synchronized (this.f23010Q) {
                try {
                    c1667u0 = this.f23010Q.get();
                    if (c1667u0 == null) {
                        c1667u0 = new C1667u0(this);
                        this.f23010Q.set(c1667u0);
                    }
                } finally {
                }
            }
        }
        if (c1667u0 == this.f23010Q) {
            c1667u0 = null;
        }
        return (C1667u0) c1667u0;
    }

    public n7 x0() {
        Object n7Var = this.f22998D.get();
        if (n7Var == null) {
            synchronized (this.f22998D) {
                try {
                    n7Var = this.f22998D.get();
                    if (n7Var == null) {
                        n7Var = new n7(this);
                        this.f22998D.set(n7Var);
                    }
                } finally {
                }
            }
        }
        if (n7Var == this.f22998D) {
            n7Var = null;
        }
        return (n7) n7Var;
    }

    public e1 y() {
        Object e1Var = this.f23012S.get();
        if (e1Var == null) {
            synchronized (this.f23012S) {
                try {
                    e1Var = this.f23012S.get();
                    if (e1Var == null) {
                        e1Var = new e1(this);
                        this.f23012S.set(e1Var);
                    }
                } finally {
                }
            }
        }
        if (e1Var == this.f23012S) {
            e1Var = null;
        }
        return (e1) e1Var;
    }

    public m8 y0() {
        Object m8Var = this.L.get();
        if (m8Var == null) {
            synchronized (this.L) {
                try {
                    m8Var = this.L.get();
                    if (m8Var == null) {
                        m8Var = new m8(this);
                        this.L.set(m8Var);
                    }
                } finally {
                }
            }
        }
        if (m8Var == this.L) {
            m8Var = null;
        }
        return (m8) m8Var;
    }

    public f1 z() {
        Object f1Var = this.f23014U.get();
        if (f1Var == null) {
            synchronized (this.f23014U) {
                try {
                    f1Var = this.f23014U.get();
                    if (f1Var == null) {
                        f1Var = new f1(this);
                        this.f23014U.set(f1Var);
                    }
                } finally {
                }
            }
        }
        if (f1Var == this.f23014U) {
            f1Var = null;
        }
        return (f1) f1Var;
    }

    public AppLovinSdk z0() {
        return this.f23051q;
    }

    private void d() {
        e6 e6VarR0 = r0();
        int i5 = this.f23060u0 + 1;
        this.f23060u0 = i5;
        e6VarR0.a((j5) new u5(i5, this, new a()), e6.b.CORE);
    }

    public static long n() {
        return f22989G0;
    }

    public C1629c e() {
        return a(f22987E0);
    }

    public C1662a f() {
        Object c1662a = this.f23001G.get();
        if (c1662a == null) {
            synchronized (this.f23001G) {
                try {
                    c1662a = this.f23001G.get();
                    if (c1662a == null) {
                        c1662a = new C1662a(this);
                        this.f23001G.set(c1662a);
                    }
                } finally {
                }
            }
        }
        if (c1662a == this.f23001G) {
            c1662a = null;
        }
        return (C1662a) c1662a;
    }

    public C1635f g() {
        return this.f23055s;
    }

    public com.applovin.impl.sdk.d h() {
        Object dVar = this.f23015V.get();
        if (dVar == null) {
            synchronized (this.f23015V) {
                try {
                    dVar = this.f23015V.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.sdk.d(this);
                        this.f23015V.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.f23015V) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public e i() {
        Object eVar = this.f23000F.get();
        if (eVar == null) {
            synchronized (this.f23000F) {
                try {
                    eVar = this.f23000F.get();
                    if (eVar == null) {
                        eVar = new e(this);
                        this.f23000F.set(eVar);
                    }
                } finally {
                }
            }
        }
        if (eVar == this.f23000F) {
            eVar = null;
        }
        return (e) eVar;
    }

    public C1643j j() {
        Object c1643j = this.f23023b0.get();
        if (c1643j == null) {
            synchronized (this.f23023b0) {
                try {
                    c1643j = this.f23023b0.get();
                    if (c1643j == null) {
                        c1643j = new C1643j(this);
                        this.f23023b0.set(c1643j);
                    }
                } finally {
                }
            }
        }
        if (c1643j == this.f23023b0) {
            c1643j = null;
        }
        return (C1643j) c1643j;
    }

    public AppLovinAdServiceImpl k() {
        Object appLovinAdServiceImpl = this.f23043m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f23043m) {
                try {
                    appLovinAdServiceImpl = this.f23043m.get();
                    if (appLovinAdServiceImpl == null) {
                        appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                        this.f23043m.set(appLovinAdServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (appLovinAdServiceImpl == this.f23043m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public g l() {
        Object gVar = this.f23005K.get();
        if (gVar == null) {
            synchronized (this.f23005K) {
                try {
                    gVar = this.f23005K.get();
                    if (gVar == null) {
                        gVar = new g(this);
                        this.f23005K.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.f23005K) {
            gVar = null;
        }
        return (g) gVar;
    }

    public h m() {
        Object hVar = this.f23016W.get();
        if (hVar == null) {
            synchronized (this.f23016W) {
                try {
                    hVar = this.f23016W.get();
                    if (hVar == null) {
                        hVar = new h(this);
                        this.f23016W.set(hVar);
                    }
                } finally {
                }
            }
        }
        if (hVar == this.f23016W) {
            hVar = null;
        }
        return (h) hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f23034h = System.currentTimeMillis();
            AbstractC1659r0.c(jSONObject, this);
            AbstractC1659r0.b(jSONObject, this);
            AbstractC1659r0.a(jSONObject, this);
            l3.f(jSONObject, this);
            l3.d(jSONObject, this);
            l3.e(jSONObject, this);
            l3.g(jSONObject, this);
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        f22987E0 = context.getApplicationContext();
        f22988F0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        B0();
        this.f23038j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            o.g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            p0().a(y4.f23676Q3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(y4.f23898s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        e6 e6VarR0 = r0();
        j5 j5Var = this.B0;
        e6.b bVar = e6.b.CORE;
        e6VarR0.a(j5Var, bVar);
        r0().a(this.f22997C0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f23051q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i5) {
        return a(i5, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextO = o();
        return a(contextO.getResources().getIdentifier(str, "string", contextO.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", str);
        }
        r0().a(new d6(this));
    }

    public static String a(int i5, List list) throws Resources.NotFoundException {
        String string = o().getResources().getString(i5);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public void c() {
        synchronized (this.f23044m0) {
            try {
                if (!this.f23052q0 && !this.f23054r0) {
                    T0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            o.h("AppLovinSdk", (String) it.next());
        }
    }

    public static C1629c a(Context context) {
        if (f22991I0 == null) {
            synchronized (f22992J0) {
                try {
                    if (f22991I0 == null) {
                        f22991I0 = new C1629c(context);
                    }
                } finally {
                }
            }
        }
        return f22991I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!o7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", AppLovinMediationProvider.ADMOB);
            map.put("error_message", str);
            D().a(d2.f21291S0, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(y4 y4Var) {
        return p0().c(y4Var);
    }

    public void c(a5 a5Var) {
        q0().b(a5Var);
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f23065x0) {
            try {
                if (this.f23063w0 != null) {
                    o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f23063w0 + ". Ignoring the provided initialization configuration.");
                    if (!C0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new w(this, sdkInitializationListener, 0));
                    return;
                }
                this.f23028e = System.currentTimeMillis();
                this.f23063w0 = appLovinSdkInitializationConfiguration;
                this.f23069z0 = sdkInitializationListener;
                this.f23020a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f23022b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.f23041l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                o7.a((Runnable) new u(2, this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(boolean z2) {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (x().i() || (sdkInitializationListener = this.f23069z0) == null) {
            return;
        }
        if (C0()) {
            this.f23069z0 = null;
            this.f22994A0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f22994A0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(y4.f23873p)).booleanValue()) {
                this.f23069z0 = null;
            } else {
                this.f22994A0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", C0());
        JsonUtils.putBoolean(jSONObject, "timeout", z2);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f23050p0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f23028e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f23061v.d(d2.f21321i, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new w(this, sdkInitializationListener, 1), Math.max(0L, ((Long) a(y4.f23882q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f23067y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f23067y0);
    }

    public void a(boolean z2) {
        synchronized (this.f23044m0) {
            this.f23052q0 = false;
            this.f23054r0 = z2;
        }
        if (z2) {
            List listA = w3.a(this);
            if (listA.isEmpty()) {
                r0().h();
                N0();
                return;
            }
            Long l10 = (Long) a(r3.f22723t7);
            s6 s6Var = new s6(this, true, "timeoutInitAdapters", new x(0, this));
            O();
            if (o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l10 + "ms...");
            }
            r0().a(s6Var, e6.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public List b(y4 y4Var) {
        return p0().b(y4Var);
    }

    public void b(a5 a5Var, Object obj) {
        q0().b(a5Var, obj);
    }

    public Object b(a5 a5Var) {
        return q0().a(a5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r12.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r15.v0 = (java.lang.String) r13.getValue();
        O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (com.applovin.impl.sdk.o.a() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        O().a("AppLovinSdk", "Detected mediation provider: " + r15.v0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    public void a(k3 k3Var) {
        if (r0().g()) {
            return;
        }
        List listA = w3.a(this);
        if (listA.size() <= 0 || !S().a().containsAll(listA)) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        r0().h();
        N0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f23042l0;
        return (list == null || list.size() <= 0 || this.f23042l0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) q0().a(a5.f20954g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < o7.g(str)) {
                o.h("AppLovinSdk", AbstractC3256n.h(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public Object a(y4 y4Var) {
        return p0().a(y4Var);
    }

    public boolean a(y4 y4Var, MaxAdFormat maxAdFormat) {
        return b(y4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(Uri uri) {
        B().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        q0().a(str, obj, editor);
    }

    public Object a(a5 a5Var) {
        return a(a5Var, (Object) null);
    }

    public Object a(a5 a5Var, Object obj) {
        return q0().a(a5Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return b5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        q0().a(sharedPreferences);
    }
}
