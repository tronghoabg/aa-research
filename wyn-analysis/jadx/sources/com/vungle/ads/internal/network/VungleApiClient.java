package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import cg.C1618g;
import com.applovin.sdk.AppLovinEventTypes;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.a3;
import com.vungle.ads.internal.model.b3;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.model.g1;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.j1;
import com.vungle.ads.internal.model.l0;
import com.vungle.ads.internal.model.m1;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.s1;
import com.vungle.ads.internal.model.t0;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.w0;
import com.vungle.ads.internal.model.z0;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "com/vungle/ads/internal/network/u", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class VungleApiClient {

    @Keep
    @NotNull
    private static final String BASE_URL = "https://config.ads.vungle.com/";

    @Keep
    private static final boolean interceptorEnabled = false;

    /* renamed from: a, reason: collision with root package name */
    public final Context f33375a;

    /* renamed from: b, reason: collision with root package name */
    public final com.vungle.ads.internal.platform.f f33376b;

    /* renamed from: c, reason: collision with root package name */
    public final FilePreferences f33377c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f33378d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f33379e;

    /* renamed from: f, reason: collision with root package name */
    public b3 f33380f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f33381g;

    /* renamed from: h, reason: collision with root package name */
    public l0 f33382h;

    /* renamed from: i, reason: collision with root package name */
    public String f33383i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f33384j;
    public final InterfaceC2525i k;

    /* renamed from: l, reason: collision with root package name */
    public ConcurrentHashMap f33385l;

    /* renamed from: m, reason: collision with root package name */
    public Interceptor f33386m;

    @Keep
    @NotNull
    private static final Set<Interceptor> networkInterceptors = new HashSet();

    @Keep
    @NotNull
    private static final Set<Interceptor> logInterceptors = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public static final Xf.c f33374n = Fe.e.a(s.f33448a);

    public VungleApiClient(Context applicationContext, com.vungle.ads.internal.platform.f platform, FilePreferences filePreferences) {
        AbstractC3340k.e(applicationContext, "applicationContext");
        AbstractC3340k.e(platform, "platform");
        AbstractC3340k.e(filePreferences, "filePreferences");
        this.f33375a = applicationContext;
        this.f33376b = platform;
        this.f33377c = filePreferences;
        this.f33383i = System.getProperty("http.agent");
        this.k = Fe.c.y(EnumC2526j.f34667a, new a0(applicationContext));
        this.f33385l = new ConcurrentHashMap();
        this.f33386m = new Interceptor() { // from class: Db.a
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return VungleApiClient.a(this.f2624a, chain);
            }
        };
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.b(60L, timeUnit);
        builder.a(60L, timeUnit);
        Interceptor interceptor = this.f33386m;
        AbstractC3340k.e(interceptor, "interceptor");
        ArrayList arrayList = builder.f42344c;
        arrayList.add(interceptor);
        v vVar = new v();
        if (!vVar.equals(builder.f42353m)) {
            builder.f42341A = null;
        }
        builder.f42353m = vVar;
        if (interceptorEnabled) {
            for (Interceptor interceptor2 : logInterceptors) {
                AbstractC3340k.e(interceptor2, "interceptor");
                arrayList.add(interceptor2);
            }
            for (Interceptor interceptor3 : networkInterceptors) {
                AbstractC3340k.e(interceptor3, "interceptor");
                builder.f42345d.add(interceptor3);
            }
        }
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        arrayList.add(new u());
        OkHttpClient okHttpClient2 = new OkHttpClient(builder);
        this.f33379e = new c0(okHttpClient);
        this.f33378d = new c0(okHttpClient2);
    }

    public static final Response a(VungleApiClient this$0, Interceptor.Chain chain) throws NumberFormatException {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(chain, "chain");
        Request request = chain.getF42647e();
        try {
            try {
                Response responseA = chain.a(request);
                String strA = responseA.f42400f.a(CommonGatewayClient.HEADER_RETRY_AFTER);
                if (strA != null && strA.length() != 0) {
                    try {
                        long j8 = Long.parseLong(strA);
                        if (j8 > 0) {
                            String strB = request.f42376a.b();
                            long jCurrentTimeMillis = (j8 * 1000) + System.currentTimeMillis();
                            if (Bf.r.b0(strB, "ads", false)) {
                                String strA2 = a(request.f42379d);
                                if (strA2.length() > 0) {
                                    this$0.f33385l.put(strA2, Long.valueOf(jCurrentTimeMillis));
                                }
                            }
                        }
                    } catch (Exception unused) {
                        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                        com.vungle.ads.internal.util.t.a("VungleApiClient", "Retry-After value is not an valid value");
                    }
                }
                return responseA;
            } catch (OutOfMemoryError unused2) {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("OOM for ");
                sbA.append(request.f42376a);
                com.vungle.ads.internal.util.t.b("VungleApiClient", sbA.toString());
                ResponseBody.INSTANCE.getClass();
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1C = ResponseBody.Companion.c(new byte[0], null);
                Response.Builder builder = new Response.Builder();
                builder.f42408a = request;
                builder.f42410c = 500;
                builder.f42409b = Protocol.HTTP_1_1;
                builder.f42411d = "OOM";
                builder.f42414g = responseBody$Companion$asResponseBody$1C;
                return builder.a();
            }
        } catch (Exception e7) {
            boolean z11 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Exception: ");
            sbA2.append(e7.getMessage());
            sbA2.append(" for ");
            sbA2.append(request.f42376a);
            com.vungle.ads.internal.util.t.b("VungleApiClient", sbA2.toString());
            Response.Builder builder2 = new Response.Builder();
            builder2.f42408a = request;
            builder2.f42410c = 500;
            builder2.f42409b = Protocol.HTTP_1_1;
            builder2.f42411d = "Server is busy";
            ResponseBody.Companion companion = ResponseBody.INSTANCE;
            MediaType.f42292d.getClass();
            MediaType mediaTypeB = MediaType.Companion.b("application/json");
            companion.getClass();
            builder2.f42414g = ResponseBody.Companion.b("{\"Error\":\"Server is busy\"}", mediaTypeB);
            return builder2.a();
        }
    }

    public final long b(String placementID) {
        AbstractC3340k.e(placementID, "placementID");
        Long l10 = (Long) this.f33385l.get(placementID);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final synchronized void c(String appId) {
        PackageInfo packageInfo;
        try {
            AbstractC3340k.e(appId, "appId");
            d0.a(appId);
            String str = "1.0";
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = this.f33375a.getPackageManager().getPackageInfo(this.f33375a.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    AbstractC3340k.d(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.f33375a.getPackageManager().getPackageInfo(this.f33375a.getPackageName(), 0);
                    AbstractC3340k.d(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str2 = packageInfo.versionName;
                AbstractC3340k.d(str2, "packageInfo.versionName");
                str = str2;
            } catch (Exception unused) {
            }
            d0.b(str);
            this.f33380f = a(this.f33375a);
            String packageName = this.f33375a.getPackageName();
            AbstractC3340k.d(packageName, "applicationContext.packageName");
            this.f33382h = new l0(packageName, str, appId);
            this.f33384j = d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Boolean d() {
        Boolean boolValueOf;
        boolean z2;
        try {
            try {
                d7.f fVar = d7.f.f34129b;
                AbstractC3340k.d(fVar, "getInstance()");
                z2 = fVar.d(this.f33375a, d7.f.f34128a) == 0;
                boolValueOf = Boolean.valueOf(z2);
            } catch (NoClassDefFoundError unused) {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Play services Not available");
                boolValueOf = Boolean.FALSE;
                try {
                    this.f33377c.a(false, "isPlaySvcAvailable").b();
                } catch (Exception unused2) {
                    boolean z11 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.c("VungleApiClient", "Failure to write GPS availability to DB");
                }
                return boolValueOf;
            }
            try {
                this.f33377c.a(z2, "isPlaySvcAvailable").b();
                return boolValueOf;
            } catch (Exception unused3) {
                boolean z12 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Unexpected exception from Play services lib.");
                return boolValueOf;
            }
        } catch (Exception unused4) {
            boolValueOf = null;
        }
    }

    public final m1 b(boolean z2) {
        String strA;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.f33377c.getString("config_extension");
        }
        if (z2) {
            try {
                strA = ((com.vungle.ads.internal.signals.j) this.k.getValue()).a();
            } catch (Exception e7) {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Couldn't convert signals for sending. Error: ");
                sbA.append(e7.getMessage());
                com.vungle.ads.internal.util.t.b("VungleApiClient", sbA.toString());
            }
        } else {
            strA = null;
        }
        if ((configExtension == null || configExtension.length() == 0) && (strA == null || strA.length() == 0)) {
            return null;
        }
        ConfigManager.INSTANCE.getClass();
        return new m1(configExtension, strA, Long.valueOf(ConfigManager.a()));
    }

    public final void d(String adMarkup) {
        AbstractC3340k.e(adMarkup, "adMarkup");
        c0 c0Var = this.f33379e;
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType.f42292d.getClass();
        MediaType mediaTypeB = MediaType.Companion.b("application/json");
        companion.getClass();
        c0Var.a(RequestBody.Companion.a(adMarkup, mediaTypeB)).a(new z());
    }

    public final String b() {
        if (Y0.e.checkSelfPermission(this.f33375a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.f33375a.getSystemService("connectivity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return "MOBILE";
            }
            if (type == 1 || type == 6) {
                return "WIFI";
            }
            if (type == 7) {
                return "BLUETOOTH";
            }
            if (type != 9) {
                return "UNKNOWN";
            }
            return "ETHERNET";
        }
        return "NONE";
    }

    public static s1 c(boolean z2) {
        String value;
        s1 s1Var = new s1(null, null, null, null, null);
        PrivacyManager.INSTANCE.getClass();
        String strB = PrivacyManager.b();
        String str = PrivacyManager.f33587e;
        if (str == null) {
            str = "no_interaction";
        }
        String str2 = str;
        String str3 = PrivacyManager.f33588f;
        String str4 = str3 == null ? "" : str3;
        Long l10 = PrivacyManager.f33589g;
        s1Var.f33309a = new g1(l10 != null ? l10.longValue() : 0L, strB, str2, str4);
        PrivacyConsent privacyConsent = PrivacyManager.f33590h;
        if (privacyConsent == null || (value = privacyConsent.getValue()) == null) {
            value = PrivacyConsent.UNKNOWN.getValue();
        }
        s1Var.f33310b = new w0(value);
        if (PrivacyManager.c() != COPPA.COPPA_NOTSET) {
            s1Var.f33311c = new z0(PrivacyManager.c().getValue());
        }
        if (PrivacyManager.f()) {
            SharedPreferences sharedPreferences = PrivacyManager.f33592j;
            String string = sharedPreferences != null ? sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : null;
            s1Var.f33313e = new j1(string != null ? string : "");
        }
        if (z2) {
            s1Var.f33312d = VungleAds.firstPartyData;
        }
        return s1Var;
    }

    public final String c() {
        if (Y0.e.checkSelfPermission(this.f33375a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.f33375a.getSystemService("connectivity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 1) {
            return "gprs";
        }
        if (subtype == 2) {
            return "edge";
        }
        if (subtype == 20) {
            return "5g";
        }
        switch (subtype) {
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                switch (subtype) {
                }
        }
        return "unknown";
    }

    public static String a(RequestBody requestBody) {
        String utf8;
        List listA;
        C1618g c1618g;
        try {
            Xf.c cVar = f33374n;
            try {
                c1618g = new C1618g();
            } catch (Exception unused) {
            }
            if (requestBody != null) {
                requestBody.writeTo(c1618g);
                utf8 = c1618g.readUtf8();
            } else {
                utf8 = "";
            }
            p1 p1VarC = ((t1) cVar.a(utf8, H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(t1.class)))).c();
            if (p1VarC == null || (listA = p1VarC.a()) == null) {
                return "";
            }
            String str = (String) listA.get(0);
            return str == null ? "" : str;
        } catch (Exception unused2) {
            return "";
        }
    }

    public final boolean a(String placementID) {
        AbstractC3340k.e(placementID, "placementID");
        Long l10 = (Long) this.f33385l.get(placementID);
        if ((l10 != null ? l10.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.f33385l.remove(placementID);
        return false;
    }

    public final m a() {
        l0 l0Var = this.f33382h;
        if (l0Var == null) {
            return null;
        }
        t1 t1Var = new t1(a(true), l0Var, c(false));
        m1 m1VarB = b(false);
        if (m1VarB != null) {
            t1Var.a(m1VarB);
        }
        com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.f33857a;
        String strConcat = BASE_URL;
        if (!com.vungle.ads.internal.util.n.a(strConcat)) {
            strConcat = "https://config.ads.vungle.com/";
        }
        if (!Bf.r.b0(strConcat, "/", false)) {
            strConcat = strConcat.concat("/");
        }
        return this.f33379e.b(d0.d(), strConcat + "config", t1Var);
    }

    public final m a(String placement, VungleAdSize vungleAdSize) {
        AbstractC3340k.e(placement, "placement");
        String adsEndpoint = ConfigManager.INSTANCE.getAdsEndpoint();
        t1 t1VarA = a(!ConfigManager.r(), ConfigManager.b());
        p1 p1Var = new p1(AbstractC3935e.C(placement), (Long) null, (String) null, (String) null, (String) null, (c1) null, 126);
        if (vungleAdSize != null) {
            p1Var.a(new t0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        t1VarA.a(p1Var);
        return this.f33378d.a(d0.d(), adsEndpoint, t1VarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.vungle.ads.internal.network.m a(java.lang.String r14, com.vungle.ads.VungleAdSize r15, com.vungle.ads.VungleCSBData r16) {
        /*
            r13 = this;
            java.lang.String r0 = "placement"
            kotlin.jvm.internal.AbstractC3340k.e(r14, r0)
            com.vungle.ads.internal.ConfigManager r0 = com.vungle.ads.internal.ConfigManager.INSTANCE
            r0.getClass()
            java.lang.String r0 = com.vungle.ads.internal.ConfigManager.c()
            boolean r1 = com.vungle.ads.internal.ConfigManager.r()
            r1 = r1 ^ 1
            boolean r2 = com.vungle.ads.internal.ConfigManager.b()
            com.vungle.ads.internal.model.t1 r1 = r13.a(r1, r2)
            r2 = 0
            if (r16 == 0) goto L96
            java.util.Map r3 = r16.getExtras()
            if (r3 == 0) goto L6f
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 == 0) goto L6f
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L69
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            kotlinx.serialization.json.d r5 = Xf.j.b(r5)
            java.lang.String r7 = "key"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r7)
            java.lang.String r7 = "element"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r7)
            java.lang.Object r5 = r4.put(r6, r5)
            kotlinx.serialization.json.b r5 = (kotlinx.serialization.json.b) r5
            goto L3c
        L69:
            kotlinx.serialization.json.c r3 = new kotlinx.serialization.json.c
            r3.<init>(r4)
            goto L70
        L6f:
            r3 = r2
        L70:
            com.vungle.ads.internal.model.c1 r4 = new com.vungle.ads.internal.model.c1
            double r5 = r16.getBidFloor()
            int r7 = r16.getPhase()
            boolean r8 = r16.getIsVXWinner()
            java.lang.String r9 = r16.getAuctionId()
            java.lang.String r10 = r16.getCreativeId()
            java.lang.String r11 = r16.getCom.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID java.lang.String()
            if (r3 == 0) goto L90
            java.lang.String r2 = r3.toString()
        L90:
            r12 = r2
            r4.<init>(r5, r7, r8, r9, r10, r11, r12)
            r11 = r4
            goto L97
        L96:
            r11 = r2
        L97:
            com.vungle.ads.internal.model.p1 r5 = new com.vungle.ads.internal.model.p1
            java.util.List r6 = r7.AbstractC3935e.C(r14)
            r10 = 0
            r12 = 62
            r7 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            if (r15 == 0) goto Lb8
            com.vungle.ads.internal.model.t0 r14 = new com.vungle.ads.internal.model.t0
            int r2 = r15.getWidth()
            int r3 = r15.getHeight()
            r14.<init>(r2, r3)
            r5.a(r14)
        Lb8:
            r1.a(r5)
            com.vungle.ads.internal.network.c0 r14 = r13.f33378d
            java.lang.String r2 = com.vungle.ads.internal.network.d0.d()
            com.vungle.ads.internal.network.m r14 = r14.a(r2, r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.VungleApiClient.a(java.lang.String, com.vungle.ads.VungleAdSize, com.vungle.ads.VungleCSBData):com.vungle.ads.internal.network.m");
    }

    public final m a(p1 request) {
        l0 l0Var;
        AbstractC3340k.e(request, "request");
        ConfigManager.INSTANCE.getClass();
        String strM = ConfigManager.m();
        if (strM == null || strM.length() == 0 || (l0Var = this.f33382h) == null) {
            return null;
        }
        t1 t1Var = new t1(a(false), l0Var, c(false));
        t1Var.a(request);
        m1 m1VarB = b(false);
        if (m1VarB != null) {
            t1Var.a(m1VarB);
        }
        return this.f33379e.c(d0.d(), strM, t1Var);
    }

    public final c3 a(String url, Map map, String str, g requestType, com.vungle.ads.internal.util.s sVar) {
        boolean zIsCleartextTrafficPermitted;
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A;
        Response responseE;
        AbstractC3340k.e(url, "url");
        AbstractC3340k.e(requestType, "requestType");
        if (!com.vungle.ads.internal.util.n.a(url)) {
            return new c3("Invalid URL", true, false, 4);
        }
        try {
            String host = new URL(url).getHost();
            if (Build.VERSION.SDK_INT >= 24) {
                zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
            } else {
                zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            if (!zIsCleartextTrafficPermitted && URLUtil.isHttpUrl(url)) {
                return new c3("Clear Text Traffic is blocked", false, false, 6);
            }
            try {
                String str2 = this.f33383i;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                if (str != null) {
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    MediaType.f42292d.getClass();
                    MediaType mediaTypeB = MediaType.Companion.b("application/json");
                    companion.getClass();
                    requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(str, mediaTypeB);
                } else {
                    requestBody$Companion$toRequestBody$2A = null;
                }
                o oVarA = this.f33379e.a(str3, url, requestType, map, requestBody$Companion$toRequestBody$2A).a();
                if (oVarA != null && oVarA.c()) {
                    return null;
                }
                Integer numValueOf = (oVarA == null || (responseE = oVarA.e()) == null) ? null : Integer.valueOf(responseE.f42398d);
                if (ff.o.k0(AbstractC3935e.D(Integer.valueOf(Sdk.SDKError.Reason.MRAID_ERROR_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), 307, 308), numValueOf)) {
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, sVar, url, 2);
                    return null;
                }
                boolean z2 = numValueOf != null && new zf.g(500, 599, 1).a(numValueOf.intValue());
                StringBuilder sb2 = new StringBuilder("unsuccessful response, error code: ");
                sb2.append(numValueOf);
                sb2.append(", message: ");
                sb2.append(oVarA != null ? oVarA.d() : null);
                return new c3(sb2.toString(), false, z2, 2);
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new c3(localizedMessage, false, true, 2);
            }
        } catch (MalformedURLException e7) {
            String localizedMessage2 = e7.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new c3(localizedMessage2, true, false, 4);
        }
    }

    public final void a(LinkedBlockingQueue metrics, com.vungle.ads.internal.y requestListener) {
        AbstractC3340k.e(metrics, "metrics");
        AbstractC3340k.e(requestListener, "requestListener");
        ConfigManager.INSTANCE.getClass();
        String strL = ConfigManager.l();
        if (strL.length() == 0) {
            requestListener.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = metrics.iterator();
        while (it.hasNext()) {
            Sdk.SDKMetric.Builder builder = (Sdk.SDKMetric.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 i3VarA = ConfigManager.a(placementReferenceId);
            if (i3VarA != null) {
                String strC = i3VarA.c();
                if (strC == null) {
                    strC = "";
                }
                builder.setPlacementType(strC);
            }
            String strB = b();
            if (strB != null) {
                builder.setConnectionType(strB);
            }
            String strC2 = c();
            if (strC2 != null) {
                builder.setConnectionTypeDetail(strC2);
            }
            Sdk.SDKMetric sDKMetricBuild = builder.build();
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Sending Metric: ");
            sbA.append(sDKMetricBuild.getType());
            com.vungle.ads.internal.util.t.b("VungleApiClient", sbA.toString());
            linkedBlockingQueue.add(sDKMetricBuild);
        }
        Sdk.MetricBatch metricBatchBuild = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType.f42292d.getClass();
        MediaType mediaTypeB = MediaType.Companion.b(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = metricBatchBuild.toByteArray();
        AbstractC3340k.d(byteArray, "batch.toByteArray()");
        this.f33379e.b(d0.d(), strL, RequestBody.Companion.c(companion, mediaTypeB, byteArray, 0, 12)).a(new y(requestListener));
    }

    public final void a(LinkedBlockingQueue errors, com.vungle.ads.internal.x requestListener) {
        AbstractC3340k.e(errors, "errors");
        AbstractC3340k.e(requestListener, "requestListener");
        ConfigManager.INSTANCE.getClass();
        String strF = ConfigManager.f();
        if (strF.length() == 0) {
            requestListener.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = errors.iterator();
        while (it.hasNext()) {
            Sdk.SDKError.Builder builder = (Sdk.SDKError.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 i3VarA = ConfigManager.a(placementReferenceId);
            if (i3VarA != null) {
                String strC = i3VarA.c();
                if (strC == null) {
                    strC = "";
                }
                builder.setPlacementType(strC);
            }
            String strB = b();
            if (strB != null) {
                builder.setConnectionType(strB);
            }
            String strC2 = c();
            if (strC2 != null) {
                builder.setConnectionTypeDetail(strC2);
            }
            Sdk.SDKError sDKErrorBuild = builder.build();
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Sending Error: ");
            sbA.append(sDKErrorBuild.getReason());
            com.vungle.ads.internal.util.t.b("VungleApiClient", sbA.toString());
            linkedBlockingQueue.add(sDKErrorBuild);
        }
        Sdk.SDKErrorBatch sDKErrorBatchBuild = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        byte[] byteArray = sDKErrorBatchBuild.toByteArray();
        AbstractC3340k.d(byteArray, "batch.toByteArray()");
        MediaType.f42292d.getClass();
        MediaType mediaTypeB = MediaType.Companion.b(CommonGatewayClient.HEADER_PROTOBUF);
        int length = sDKErrorBatchBuild.toByteArray().length;
        companion.getClass();
        this.f33379e.a(d0.d(), strF, RequestBody.Companion.b(mediaTypeB, byteArray, 0, length)).a(new x(requestListener));
    }

    public final b3 a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC3340k.d(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        AbstractC3340k.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC3340k.d(RELEASE, "RELEASE");
        b3 b3Var = new b3(MANUFACTURER, MODEL, RELEASE, com.vungle.ads.internal.platform.a.a(context), "Amazon".equals(MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.f33383i);
        try {
            String strJ = ((com.vungle.ads.internal.platform.c) this.f33376b).j();
            this.f33383i = strJ;
            b3Var.b(strJ);
            n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
            n2Var.e();
            ((com.vungle.ads.internal.platform.c) this.f33376b).a(new w(this, n2Var));
            i0 i0VarA = this.f33381g;
            if (i0VarA == null) {
                i0VarA = ((com.vungle.ads.internal.platform.c) this.f33376b).a();
            }
            this.f33381g = i0VarA;
            return b3Var;
        } catch (Exception e7) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Cannot Get UserAgent. Setting Default Device UserAgent.");
            sbA.append(e7.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("VungleApiClient", sbA.toString());
            return b3Var;
        }
    }

    public final t1 a(boolean z2, boolean z10) {
        t1 t1Var = new t1(a(false), this.f33382h, c(z10), null, null);
        m1 m1VarB = b(z2);
        if (m1VarB != null) {
            t1Var.f33323d = m1VarB;
        }
        return t1Var;
    }

    public final synchronized b3 a(boolean z2) {
        b3 b3VarA;
        String str;
        try {
            b3 b3VarA2 = this.f33380f;
            if (b3VarA2 == null) {
                b3VarA2 = a(this.f33375a);
                this.f33380f = b3VarA2;
            }
            b3VarA = b3.a(b3VarA2);
            a3 a3Var = new a3();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.f33375a.getSystemService("window");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            b3VarA.a(displayMetrics.heightPixels);
            b3VarA.b(displayMetrics.widthPixels);
            i0 i0VarA = this.f33381g;
            if (i0VarA == null) {
                i0VarA = ((com.vungle.ads.internal.platform.c) this.f33376b).a();
            }
            this.f33381g = i0VarA;
            String strA = i0VarA.a();
            i0 i0Var = this.f33381g;
            Boolean boolValueOf = i0Var != null ? Boolean.valueOf(i0Var.b()) : null;
            PrivacyManager.INSTANCE.getClass();
            if (PrivacyManager.e()) {
                if (strA != null) {
                    if ("Amazon".equals(Build.MANUFACTURER)) {
                        a3Var.a(strA);
                    } else {
                        a3Var.f(strA);
                    }
                    b3VarA.a(strA);
                } else {
                    b3VarA.a("");
                }
            }
            if (z2 || !PrivacyManager.e()) {
                b3VarA.a((String) null);
                a3Var.f(null);
                a3Var.a((String) null);
            }
            Boolean bool = Boolean.TRUE;
            boolean zA = AbstractC3340k.a(boolValueOf, bool);
            boolean zHasSystemFeature = false;
            b3VarA.a(zA ? 1 : 0);
            if (this.f33384j == null) {
                this.f33384j = this.f33377c.a("isPlaySvcAvailable");
            }
            if (this.f33384j == null) {
                this.f33384j = d();
            }
            a3Var.a(bool.equals(this.f33384j));
            if (PrivacyManager.a() != 2) {
                String strB = ((com.vungle.ads.internal.platform.c) this.f33376b).b();
                if (strB != null) {
                    a3Var.b(strB);
                }
                Integer numC = ((com.vungle.ads.internal.platform.c) this.f33376b).c();
                if (numC != null) {
                    a3Var.a(Integer.valueOf(numC.intValue()));
                }
            }
            Intent intentRegisterReceiver = this.f33375a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    a3Var.a(intExtra / intExtra2);
                }
                int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 != 2 && intExtra3 != 5) {
                    str = "NOT_CHARGING";
                } else {
                    int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                    if (intExtra4 == 1) {
                        str = "BATTERY_PLUGGED_AC";
                    } else if (intExtra4 == 2) {
                        str = "BATTERY_PLUGGED_USB";
                    } else if (intExtra4 != 4) {
                        str = "BATTERY_PLUGGED_OTHERS";
                    } else {
                        str = "BATTERY_PLUGGED_WIRELESS";
                    }
                }
            } else {
                str = "UNKNOWN";
            }
            a3Var.c(str);
            a3Var.a(((com.vungle.ads.internal.platform.c) this.f33376b).l() ? 1 : 0);
            String strB2 = b();
            if (strB2 != null) {
                a3Var.d(strB2);
            }
            String strC = c();
            if (strC != null) {
                a3Var.e(strC);
            }
            a3Var.i(Locale.getDefault().toString());
            a3Var.h(Locale.getDefault().getLanguage());
            a3Var.j(TimeZone.getDefault().getID());
            a3Var.b(((com.vungle.ads.internal.platform.c) this.f33376b).k());
            a3Var.c(((com.vungle.ads.internal.platform.c) this.f33376b).p() ? 1 : 0);
            if ("Amazon".equals(Build.MANUFACTURER)) {
                zHasSystemFeature = this.f33375a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = this.f33375a.getSystemService("uimode");
                AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    zHasSystemFeature = true;
                }
            }
            a3Var.b(zHasSystemFeature);
            this.f33376b.getClass();
            a3Var.a();
            a3Var.b(((com.vungle.ads.internal.platform.c) this.f33376b).n() ? 1 : 0);
            ConfigManager.INSTANCE.getClass();
            if (ConfigManager.p()) {
                a3Var.d(Long.valueOf(((com.vungle.ads.internal.platform.c) this.f33376b).i()));
                a3Var.b(Long.valueOf(((com.vungle.ads.internal.platform.c) this.f33376b).h()));
                a3Var.c(Long.valueOf(((com.vungle.ads.internal.platform.c) this.f33376b).g()));
                a3Var.a(Long.valueOf(((com.vungle.ads.internal.platform.c) this.f33376b).d()));
            }
            a3Var.g(((com.vungle.ads.internal.platform.c) this.f33376b).f());
            b3VarA.b(this.f33383i);
            b3VarA.a(a3Var);
        } catch (Throwable th) {
            throw th;
        }
        return b3VarA;
    }
}
