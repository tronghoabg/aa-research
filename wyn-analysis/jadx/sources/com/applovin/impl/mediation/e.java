package com.applovin.impl.mediation;

import R8.v;
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
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22171a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f22172b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f22173c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f22174d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f22175e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f22176f = DesugarCollections.synchronizedMap(new HashMap(4));

    /* renamed from: g, reason: collision with root package name */
    private final Map f22177g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f22178h = new Object();

    public class a implements q5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f22179a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f22180b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22181c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f22182d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f22183e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0014a f22184f;

        public a(long j8, Map map, String str, a3 a3Var, Context context, a.InterfaceC0014a interfaceC0014a) {
            this.f22179a = j8;
            this.f22180b = map;
            this.f22181c = str;
            this.f22182d = a3Var;
            this.f22183e = context;
            this.f22184f = interfaceC0014a;
        }

        @Override // com.applovin.impl.q5.b
        public void a(JSONArray jSONArray) {
            this.f22180b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f22179a));
            this.f22180b.put("calfc", Integer.valueOf(e.this.b(this.f22181c)));
            w5 w5Var = new w5(this.f22182d, jSONArray, this.f22183e, e.this.f22171a, this.f22184f);
            if (((Boolean) e.this.f22171a.a(r3.f22724t8)).booleanValue()) {
                e.this.f22171a.r0().a((j5) w5Var, e6.b.MEDIATION);
            } else {
                e.this.f22171a.r0().a(w5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0014a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f22186a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f22187b;

        /* renamed from: c, reason: collision with root package name */
        private final e f22188c;

        /* renamed from: d, reason: collision with root package name */
        private final c f22189d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f22190e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f22191f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f22192g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f22193h;

        /* renamed from: i, reason: collision with root package name */
        private final int f22194i;

        /* renamed from: j, reason: collision with root package name */
        private long f22195j;
        private long k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j8, long j10, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j8, j10, eVar, kVar, context);
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
            this.f22188c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22195j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f22186a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z2 = maxError2.getCode() == -5603 && o7.c(this.f22186a) && ((Boolean) this.f22186a.a(y4.f23564B6)).booleanValue();
            if (this.f22186a.a(r3.f22715n8, this.f22190e) && this.f22189d.f22198c < this.f22194i && !z2) {
                c.e(this.f22189d);
                int iPow = (int) Math.pow(2.0d, this.f22189d.f22198c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new l(this, iPow, str, 1), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f22189d.f22198c = 0;
            this.f22189d.f22197b.set(false);
            if (this.f22189d.f22199d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f22189d.f22196a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f22189d.f22199d, str, maxError2);
                this.f22189d.f22199d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f22189d.f22196a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f22195j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f22186a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.k, y2Var.getRequestLatencyMillis());
            }
            this.f22188c.a(maxAd.getAdUnitId());
            this.f22189d.f22198c = 0;
            if (this.f22189d.f22199d == null) {
                this.f22188c.a(y2Var);
                this.f22189d.f22197b.set(false);
                int iJ = y2Var.J();
                synchronized (this.f22188c.f22175e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f22188c.f22174d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iJ) {
                    int i5 = sizeSafely + 1;
                    this.f22186a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f22186a.O().a("MediationAdLoadManagerV2", v.e(i5, iJ, "Preloading waterfall ", " of "));
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(this.f22189d.f22199d);
            this.f22189d.f22199d.onAdLoaded(y2Var);
            this.f22188c.f22176f.put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.M().endsWith("load")) {
                this.f22189d.f22199d.onAdRevenuePaid(y2Var);
            }
            this.f22189d.f22199d = null;
            if ((!this.f22186a.c(r3.f22711i8).contains(maxAd.getAdUnitId()) && !this.f22186a.a(r3.f22710h8, maxAd.getFormat())) || this.f22186a.t0().c() || this.f22186a.t0().d()) {
                this.f22189d.f22197b.set(false);
                return;
            }
            int iJ2 = y2Var.J();
            this.f22186a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f22186a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iJ2);
            }
            a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j8, long j10, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f22186a = kVar;
            this.f22187b = new WeakReference(context);
            this.f22188c = eVar;
            this.f22189d = cVar;
            this.f22190e = maxAdFormat;
            this.f22192g = map2;
            this.f22191f = map;
            this.f22193h = map3;
            this.f22195j = j8;
            this.k = j10;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f22194i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f22194i = Math.min(2, ((Integer) kVar.a(r3.f22714m8)).intValue());
            } else {
                this.f22194i = ((Integer) kVar.a(r3.f22714m8)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f22187b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f22195j = SystemClock.elapsedRealtime();
            this.k = System.currentTimeMillis();
            this.f22193h.put("art", EnumC1641i.SEQUENTIAL_OR_PRECACHE.b());
            this.f22188c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f22191f, this.f22192g, this.f22193h, context, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i5, String str) {
            this.f22192g.put("retry_delay_sec", Integer.valueOf(i5));
            this.f22192g.put("retry_attempt", Integer.valueOf(this.f22189d.f22198c));
            Context contextO = (Context) this.f22187b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f22193h.put("art", EnumC1641i.EXPONENTIAL_RETRY.b());
            this.f22193h.put("era", Integer.valueOf(this.f22189d.f22198c));
            this.k = System.currentTimeMillis();
            this.f22188c.a(str, this.f22190e, this.f22191f, this.f22192g, this.f22193h, context, this);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f22196a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f22197b;

        /* renamed from: c, reason: collision with root package name */
        private int f22198c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0014a f22199d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i5 = cVar.f22198c;
            cVar.f22198c = i5 + 1;
            return i5;
        }

        private c(String str) {
            this.f22197b = new AtomicBoolean();
            this.f22196a = str;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f22171a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbJ = N0.a.j(str);
        sbJ.append(str2 != null ? "-".concat(str2) : "");
        return sbJ.toString();
    }

    private y2 f(String str) {
        synchronized (this.f22175e) {
            try {
                Queue queue = (Queue) this.f22174d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (y2) queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(String str) {
        boolean z2;
        synchronized (this.f22175e) {
            z2 = !CollectionUtils.isEmpty((Queue) this.f22174d.get(str));
        }
        return z2;
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f22176f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.f22173c) {
            try {
                Queue queue = (Queue) this.f22174d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f22178h) {
            try {
                this.f22171a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22171a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f22177g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f22177g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1641i enumC1641i, Map map, Map map2, Context context, a.InterfaceC0014a interfaceC0014a) {
        y2 y2VarF = (this.f22171a.t0().d() || o7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (y2VarF != null) {
            y2VarF.i(str2);
            y2VarF.A().c().a(interfaceC0014a);
            interfaceC0014a.onAdLoaded(y2VarF);
            this.f22176f.put(str, y2VarF);
            if (y2VarF.M().endsWith("load")) {
                interfaceC0014a.onAdRevenuePaid(y2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f22197b.compareAndSet(false, true)) {
            if (cVarA.f22199d != null && cVarA.f22199d != interfaceC0014a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f22199d = interfaceC0014a;
            return;
        }
        if (y2VarF == null) {
            cVarA.f22199d = interfaceC0014a;
        }
        Map mapV = M6.v();
        mapV.put("art", enumC1641i.b());
        if (StringUtils.isValidString(str2)) {
            mapV.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapV, context, new b(map, map2, mapV, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f22171a, context, null));
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f22178h) {
            try {
                Integer num = (Integer) this.f22177g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void c(String str, String str2) {
        synchronized (this.f22173c) {
            this.f22172b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0014a interfaceC0014a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f22171a.r0().a((j5) new q5(a3Var, context, this.f22171a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0014a)), e6.b.MEDIATION);
    }

    private C1639h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f22171a.a(y4.f23654N4)).booleanValue()) {
            u3 u3VarY = this.f22171a.Y();
            s3 s3Var = s3.f22767e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f22171a.Y().a(s3Var, t3.a(maxAdFormat));
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
        synchronized (this.f22175e) {
            try {
                Queue arrayDeque = (Queue) this.f22174d.get(y2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f22174d.put(y2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(y2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f22173c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f22172b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f22172b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f22178h) {
            try {
                this.f22171a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22171a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f22177g.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
