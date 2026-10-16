package com.applovin.impl;

import A7.AbstractC0279p0;
import Va.M6;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import cb.AbstractC1593a;
import com.applovin.impl.e6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g6 extends j5 {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f21599o = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final a3 f21600g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f21601h;

    /* renamed from: i, reason: collision with root package name */
    private final List f21602i;

    /* renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0014a f21603j;
    private final WeakReference k;

    /* renamed from: l, reason: collision with root package name */
    private final String f21604l;

    /* renamed from: m, reason: collision with root package name */
    private long f21605m;

    /* renamed from: n, reason: collision with root package name */
    private final List f21606n;

    public class b extends j5 {

        /* renamed from: g, reason: collision with root package name */
        private final long f21607g;

        /* renamed from: h, reason: collision with root package name */
        private final int f21608h;

        /* renamed from: i, reason: collision with root package name */
        private final y2 f21609i;

        /* renamed from: j, reason: collision with root package name */
        private final List f21610j;

        public class a extends i3 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f21611b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f21612c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.InterfaceC0014a interfaceC0014a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0014a);
                this.f21611b = maxAdFormat;
                this.f21612c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f21607g;
                com.applovin.impl.sdk.o unused = b.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f21768c;
                    String str2 = b.this.f21767b;
                    StringBuilder sbU = M6.u(jElapsedRealtime, "Ad failed to load in ", " ms for ");
                    sbU.append(this.f21611b.getLabel());
                    sbU.append(" ad unit ");
                    sbU.append(str);
                    sbU.append(" with error: ");
                    sbU.append(maxError);
                    oVar.a(str2, sbU.toString());
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f21609i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f21608h >= b.this.f21610j.size() - 1) {
                    g6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f21766a.r0().a((j5) new b(bVar2.f21608h + 1, b.this.f21610j), e6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f21607g;
                com.applovin.impl.sdk.o unused = b.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f21768c;
                    String str = b.this.f21767b;
                    StringBuilder sbU = M6.u(jElapsedRealtime, "Ad loaded in ", "ms for ");
                    AbstractC1593a.r(this.f21611b, sbU, " ad unit ");
                    AbstractC1593a.w(sbU, this.f21612c, oVar, str);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i5 = b.this.f21608h;
                while (true) {
                    i5++;
                    if (i5 >= b.this.f21610j.size()) {
                        g6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.f21610j.get(i5), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = g6.this.f21600g.b();
            MaxAdFormat maxAdFormatA = g6.this.f21600g.a();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f21768c;
                String str = this.f21767b;
                StringBuilder sb2 = new StringBuilder("Loading ad ");
                sb2.append(this.f21608h + 1);
                sb2.append(" of ");
                sb2.append(this.f21610j.size());
                sb2.append(" from ");
                sb2.append(this.f21609i.c());
                sb2.append(" for ");
                sb2.append(maxAdFormatA.getLabel());
                sb2.append(" ad unit ");
                AbstractC1593a.w(sb2, strB, oVar, str);
            }
            b("started to load ad");
            Context context = (Context) g6.this.k.get();
            Activity activityV0 = context instanceof Activity ? (Activity) context : this.f21766a.v0();
            this.f21766a.a0().b(this.f21609i);
            this.f21766a.X().loadThirdPartyMediatedAd(strB, this.f21609i, activityV0, new a(g6.this.f21603j, maxAdFormatA, strB));
        }

        private b(int i5, List list) {
            super(g6.this.f21767b, g6.this.f21766a, g6.this.f21600g.b());
            this.f21607g = SystemClock.elapsedRealtime();
            this.f21608h = i5;
            this.f21609i = (y2) list.get(i5);
            this.f21610j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j8, MaxError maxError) {
            g6.this.f21606n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.T(), j8, y2Var.B(), maxError));
        }
    }

    public g6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0014a interfaceC0014a) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.f21600g = a3Var;
        this.f21601h = jSONObject;
        this.f21603j = interfaceC0014a;
        this.k = new WeakReference(context);
        this.f21604l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArrayM = AbstractC1593a.m("ads", jSONObject);
        this.f21602i = new ArrayList(jSONArrayM.length());
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            this.f21602i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null), jSONObject, kVar));
        }
        this.f21606n = new ArrayList(this.f21602i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f21605m = SystemClock.elapsedRealtime();
        int i5 = 0;
        if (this.f21601h.optBoolean("is_testing", false) && !this.f21766a.t0().c() && f21599o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new D0(this, 8));
        }
        String strB = this.f21600g.b();
        MaxAdFormat maxAdFormatA = this.f21600g.a();
        if (this.f21602i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f21602i.size() + " ad(s)...");
            }
            this.f21766a.r0().a(new b(i5, this.f21602i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.k(this.f21767b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        o7.a(strB, maxAdFormatA, this.f21601h, this.f21766a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f21601h, "settings", new JSONObject());
        long j8 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.f21601h, strB, this.f21766a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, AbstractC0279p0.l("Ad Unit ID ", strB, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (o7.c(this.f21766a) && ((Boolean) this.f21766a.a(y4.f23564B6)).booleanValue()) {
                j8 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j8 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j8);
        F f10 = new F(7, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            C1638g0.a(millis, this.f21766a, f10);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(f10, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        o7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f21766a.v0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f21766a.a0().c(y2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21605m;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f21768c;
            String str = this.f21767b;
            StringBuilder sbU = M6.u(jElapsedRealtime, "Waterfall loaded in ", "ms from ");
            sbU.append(y2Var.c());
            sbU.append(" for ");
            sbU.append(this.f21600g.a().getLabel());
            sbU.append(" ad unit ");
            sbU.append(this.f21600g.b());
            oVar.d(str, sbU.toString());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, jElapsedRealtime, this.f21606n, this.f21604l));
        t2.f(this.f21603j, y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f21606n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f21606n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
            int i5 = 0;
            while (i5 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i5);
                i5++;
                sb2.append(i5);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.f21600g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21605m;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f21768c;
            String str = this.f21767b;
            StringBuilder sbU = M6.u(jElapsedRealtime, "Waterfall failed in ", "ms for ");
            sbU.append(this.f21600g.a().getLabel());
            sbU.append(" ad unit ");
            sbU.append(strB);
            sbU.append(" with error: ");
            sbU.append(maxError);
            oVar.d(str, sbU.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f21601h, "waterfall_name", ""), JsonUtils.getString(this.f21601h, "waterfall_test_name", ""), jElapsedRealtime, this.f21606n, this.f21600g, JsonUtils.optList(JsonUtils.getJSONArray(this.f21601h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f21604l, JsonUtils.getString(this.f21601h, "event_id", "")));
        t2.a(this.f21603j, strB, maxError);
    }
}
