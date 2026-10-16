package com.applovin.impl.mediation;

import Va.M6;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.C1639h;
import com.applovin.impl.EnumC1641i;
import com.applovin.impl.a3;
import com.applovin.impl.e6;
import com.applovin.impl.j5;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o7;
import com.applovin.impl.q5;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.w5;
import com.applovin.impl.y2;
import com.applovin.impl.y4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22106a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f22107b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f22108c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f22109d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f22110e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f22111f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Object f22112g = new Object();

    public class a implements q5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f22113a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f22114b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22115c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f22116d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f22117e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0014a f22118f;

        public a(long j8, Map map, String str, a3 a3Var, Context context, a.InterfaceC0014a interfaceC0014a) {
            this.f22113a = j8;
            this.f22114b = map;
            this.f22115c = str;
            this.f22116d = a3Var;
            this.f22117e = context;
            this.f22118f = interfaceC0014a;
        }

        @Override // com.applovin.impl.q5.b
        public void a(JSONArray jSONArray) {
            this.f22114b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f22113a));
            this.f22114b.put("calfc", Integer.valueOf(d.this.b(this.f22115c)));
            w5 w5Var = new w5(this.f22116d, jSONArray, this.f22117e, d.this.f22106a, this.f22118f);
            if (((Boolean) d.this.f22106a.a(r3.f22724t8)).booleanValue()) {
                d.this.f22106a.r0().a((j5) w5Var, e6.b.MEDIATION);
            } else {
                d.this.f22106a.r0().a(w5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0014a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f22120a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f22121b;

        /* renamed from: c, reason: collision with root package name */
        private final d f22122c;

        /* renamed from: d, reason: collision with root package name */
        private final c f22123d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f22124e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f22125f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f22126g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f22127h;

        /* renamed from: i, reason: collision with root package name */
        private final int f22128i;

        /* renamed from: j, reason: collision with root package name */
        private long f22129j;
        private long k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j8, long j10, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j8, j10, dVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f22122c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22129j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f22120a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z2 = maxError2.getCode() == -5603 && o7.c(this.f22120a) && ((Boolean) this.f22120a.a(y4.f23564B6)).booleanValue();
            if (this.f22120a.a(r3.f22715n8, this.f22124e) && this.f22123d.f22132c < this.f22128i && !z2) {
                c.e(this.f22123d);
                int iPow = (int) Math.pow(2.0d, this.f22123d.f22132c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new l(this, iPow, str, 0), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f22123d.f22132c = 0;
            this.f22123d.f22131b.set(false);
            if (this.f22123d.f22133d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f22123d.f22130a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f22123d.f22133d, str, maxError2);
                this.f22123d.f22133d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f22123d.f22130a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f22129j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f22120a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.k, y2Var.getRequestLatencyMillis());
            }
            this.f22122c.a(maxAd.getAdUnitId());
            this.f22123d.f22132c = 0;
            if (this.f22123d.f22133d == null) {
                this.f22122c.a(y2Var);
                this.f22123d.f22131b.set(false);
                return;
            }
            y2Var.A().c().a(this.f22123d.f22133d);
            this.f22123d.f22133d.onAdLoaded(y2Var);
            if (y2Var.M().endsWith("load")) {
                this.f22123d.f22133d.onAdRevenuePaid(y2Var);
            }
            this.f22123d.f22133d = null;
            if (((Boolean) this.f22120a.a(r3.f22712k8)).booleanValue() || !this.f22122c.a(maxAd)) {
                this.f22123d.f22131b.set(false);
                return;
            }
            Context contextO = (Context) this.f22121b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f22129j = SystemClock.elapsedRealtime();
            this.k = System.currentTimeMillis();
            this.f22127h.put("art", EnumC1641i.SEQUENTIAL_OR_PRECACHE.b());
            this.f22122c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f22125f, this.f22126g, this.f22127h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j8, long j10, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f22120a = kVar;
            this.f22121b = new WeakReference(context);
            this.f22122c = dVar;
            this.f22123d = cVar;
            this.f22124e = maxAdFormat;
            this.f22126g = map2;
            this.f22125f = map;
            this.f22127h = map3;
            this.f22129j = j8;
            this.k = j10;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f22128i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f22128i = Math.min(2, ((Integer) kVar.a(r3.f22714m8)).intValue());
            } else {
                this.f22128i = ((Integer) kVar.a(r3.f22714m8)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i5, String str) {
            this.f22126g.put("retry_delay_sec", Integer.valueOf(i5));
            this.f22126g.put("retry_attempt", Integer.valueOf(this.f22123d.f22132c));
            Context contextO = (Context) this.f22121b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f22127h.put("art", EnumC1641i.EXPONENTIAL_RETRY.b());
            this.f22127h.put("era", Integer.valueOf(this.f22123d.f22132c));
            this.k = System.currentTimeMillis();
            this.f22122c.a(str, this.f22124e, this.f22125f, this.f22126g, this.f22127h, context, this);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f22130a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f22131b;

        /* renamed from: c, reason: collision with root package name */
        private int f22132c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0014a f22133d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i5 = cVar.f22132c;
            cVar.f22132c = i5 + 1;
            return i5;
        }

        private c(String str) {
            this.f22131b = new AtomicBoolean();
            this.f22130a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f22106a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbJ = N0.a.j(str);
        sbJ.append(str2 != null ? "-".concat(str2) : "");
        return sbJ.toString();
    }

    private y2 e(String str) {
        y2 y2Var;
        synchronized (this.f22110e) {
            y2Var = (y2) this.f22109d.get(str);
            this.f22109d.remove(str);
        }
        return y2Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f22108c) {
            this.f22107b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z2;
        synchronized (this.f22110e) {
            z2 = this.f22109d.get(str) != null;
        }
        return z2;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1641i enumC1641i, Map map, Map map2, Context context, a.InterfaceC0014a interfaceC0014a) {
        y2 y2VarE = (this.f22106a.t0().d() || o7.h(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (y2VarE != null) {
            y2VarE.i(str2);
            y2VarE.A().c().a(interfaceC0014a);
            interfaceC0014a.onAdLoaded(y2VarE);
            if (y2VarE.M().endsWith("load")) {
                interfaceC0014a.onAdRevenuePaid(y2VarE);
            }
            if (((Boolean) this.f22106a.a(r3.f22712k8)).booleanValue() && a((MaxAd) y2VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f22131b.compareAndSet(false, true)) {
            if (cVarA.f22133d != null && cVarA.f22133d != interfaceC0014a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f22133d = interfaceC0014a;
            return;
        }
        if (y2VarE == null) {
            cVarA.f22133d = interfaceC0014a;
        }
        Map mapV = M6.v();
        mapV.put("art", enumC1641i.b());
        if (StringUtils.isValidString(str2)) {
            mapV.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapV, context, new b(map, map2, mapV, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f22106a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f22112g) {
            try {
                this.f22106a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22106a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f22111f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f22111f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f22112g) {
            try {
                Integer num = (Integer) this.f22111f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0014a interfaceC0014a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f22106a.r0().a((j5) new q5(a3Var, context, this.f22106a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0014a)), e6.b.MEDIATION);
    }

    private C1639h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f22106a.a(y4.f23654N4)).booleanValue()) {
            u3 u3VarY = this.f22106a.Y();
            s3 s3Var = s3.f22767e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f22106a.Y().a(s3Var, t3.a(maxAdFormat));
            return new C1639h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new C1639h(-1, -1, -1, -1);
    }

    private int a(Map map, s3.a aVar) {
        Long l10;
        if (map == null || (l10 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l10.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        synchronized (this.f22110e) {
            try {
                if (this.f22109d.containsKey(y2Var.getAdUnitId())) {
                    com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + y2Var.getAdUnitId());
                }
                this.f22109d.put(y2Var.getAdUnitId(), y2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f22108c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f22107b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f22107b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f22112g) {
            try {
                this.f22106a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22106a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f22111f.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f22106a.c(r3.f22711i8).contains(maxAd.getAdUnitId()) && !this.f22106a.a(r3.f22710h8, maxAd.getFormat())) || this.f22106a.t0().c() || this.f22106a.t0().d()) ? false : true;
    }
}
