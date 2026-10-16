package com.applovin.impl.sdk;

import A7.N0;
import Va.M6;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.AbstractC1659r0;
import com.applovin.impl.C1633e;
import com.applovin.impl.C1645k;
import com.applovin.impl.C1666u;
import com.applovin.impl.Y;
import com.applovin.impl.a5;
import com.applovin.impl.b6;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f6;
import com.applovin.impl.f8;
import com.applovin.impl.j5;
import com.applovin.impl.l7;
import com.applovin.impl.m2;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.C1662a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w1;
import com.applovin.impl.y4;
import com.applovin.impl.z5;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, C1662a.InterfaceC0019a {

    /* renamed from: a, reason: collision with root package name */
    private final k f22791a;

    /* renamed from: b, reason: collision with root package name */
    private final o f22792b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f22793c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f22794d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f22795e = M6.v();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f22796f = new AtomicReference();

    public class b implements m2 {

        /* renamed from: a, reason: collision with root package name */
        private final c f22797a;

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f22791a.i().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f22791a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f22791a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f22797a.f22799a) {
                try {
                    if (!this.f22797a.f22801c) {
                        hashSet = new HashSet(this.f22797a.f22802d);
                        this.f22797a.f22802d.clear();
                    }
                    c cVar = this.f22797a;
                    cVar.f22800b = false;
                    cVar.f22801c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i5) {
            failedToReceiveAdV2(new AppLovinError(i5, ""));
        }

        @Override // com.applovin.impl.m2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f22797a.f22799a) {
                try {
                    if (!this.f22797a.f22801c) {
                        hashSet = new HashSet(this.f22797a.f22802d);
                        this.f22797a.f22802d.clear();
                    }
                    c cVar = this.f22797a;
                    cVar.f22800b = false;
                    cVar.f22801c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private b(c cVar) {
            this.f22797a = cVar;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f22799a;

        /* renamed from: b, reason: collision with root package name */
        boolean f22800b;

        /* renamed from: c, reason: collision with root package name */
        boolean f22801c;

        /* renamed from: d, reason: collision with root package name */
        final Collection f22802d;

        private c() {
            this.f22799a = new Object();
            this.f22802d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f22800b + ", isReloadingExpiredAd=" + this.f22801c + ", pendingAdListeners=" + this.f22802d + '}';
        }
    }

    public AppLovinAdServiceImpl(k kVar) {
        this.f22791a = kVar;
        this.f22792b = kVar.O();
        HashMap map = new HashMap(6);
        this.f22793c = map;
        map.put(C1666u.c(), new c());
        map.put(C1666u.k(), new c());
        map.put(C1666u.j(), new c());
        map.put(C1666u.m(), new c());
        map.put(C1666u.b(), new c());
        map.put(C1666u.h(), new c());
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f22795e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f22791a.A().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(C1666u c1666u) {
        AppLovinAdImpl appLovinAdImplA = this.f22791a.i().a(c1666u);
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + c1666u + "...");
        }
        return appLovinAdImplA;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f22796f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f22795e) {
            map = CollectionUtils.map(this.f22795e);
            this.f22795e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strH = this.f22791a.A().H();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strH) && o.a()) {
            this.f22792b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strH;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(C1666u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            o.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        C1645k c1645k = new C1645k(strTrim, this.f22791a);
        if (c1645k.c() == C1645k.a.REGULAR) {
            if (o.a()) {
                this.f22792b.a("AppLovinAdService", "Loading next ad for token: " + c1645k);
            }
            a(new b6(c1645k, appLovinAdLoadListener, this.f22791a));
            return;
        }
        if (c1645k.c() != C1645k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            o.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        JSONObject jSONObjectA = c1645k.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1645k.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            o.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        AbstractC1659r0.c(jSONObjectA, this.f22791a);
        AbstractC1659r0.b(jSONObjectA, this.f22791a);
        AbstractC1659r0.a(jSONObjectA, this.f22791a);
        this.f22791a.m().a();
        if (JsonUtils.getJSONArray(jSONObjectA, "ads", new JSONArray()).length() <= 0) {
            if (o.a()) {
                this.f22792b.b("AppLovinAdService", "No ad returned from the server for token: " + c1645k);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Rendering ad for token: " + c1645k);
        }
        C1666u c1666uA = o7.a(jSONObjectA, this.f22791a);
        MaxAdFormat maxAdFormatD = c1666uA.d();
        if (((Boolean) this.f22791a.a(y4.f23766c1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f22791a.h().a(c1666uA, new Y(this, appLovinAdLoadListener, jSONObjectA, c1666uA));
        } else {
            a(new f6(jSONObjectA, c1666uA, appLovinAdLoadListener, this.f22791a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(C1666u.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(C1666u.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l10;
        if (((Boolean) this.f22791a.a(y4.f23568C2)).booleanValue() && (l10 = (Long) this.f22791a.b(a5.f20943N)) != null && System.currentTimeMillis() - l10.longValue() <= ((Long) this.f22791a.a(y4.f23599G2)).longValue()) {
            if (((Boolean) this.f22791a.a(y4.f23591F2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<C1633e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<C1633e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.C1662a.InterfaceC0019a
    public void onAdExpired(t1 t1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) t1Var;
        C1666u adZone = appLovinAdImpl.getAdZone();
        if (o.a()) {
            this.f22792b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f22791a.i().b(appLovinAdImpl);
        if (this.f22791a.H0() || !((Boolean) this.f22791a.a(y4.f23816i1)).booleanValue()) {
            return;
        }
        c cVarA = a(adZone);
        synchronized (cVarA.f22799a) {
            try {
                if (!cVarA.f22800b) {
                    this.f22791a.O();
                    if (o.a()) {
                        this.f22791a.O().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    cVarA.f22800b = true;
                    cVarA.f22801c = true;
                    a(adZone, new b(cVarA));
                } else if (o.a()) {
                    this.f22792b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f22796f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f22793c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent) {
        if (bVar == null) {
            if (o.a()) {
                this.f22792b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.a(motionEvent));
        if (this.f22791a.h0() != null) {
            this.f22791a.h0().b(bVar.d(motionEvent, false), motionEvent);
        }
        if (appLovinAdView != null && uri != null) {
            a(bVar, appLovinAdView, aVar, uri);
        } else if (o.a()) {
            this.f22792b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, w1 w1Var, Context context) {
        if (bVar == null) {
            if (o.a()) {
                this.f22792b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.b(motionEvent));
        if (this.f22791a.h0() != null) {
            this.f22791a.h0().b(bVar.d(motionEvent, true), motionEvent);
        }
        a(w1Var.b().getController(), uri, context);
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabShownPostbacks());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j8, List<Long> list, long j10, boolean z2, int i5) {
        if (bVar == null) {
            if (o.a()) {
                this.f22792b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<C1633e> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            if (o.a()) {
                this.f22792b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (C1633e c1633e : listE) {
            String strA = a(c1633e.c(), j8, j10, list, bVar.v(), z2, i5);
            String strA2 = a(c1633e.a(), j8, j10, list, bVar.v(), z2, i5);
            if (StringUtils.isValidString(strA)) {
                a(new C1633e(strA, strA2));
            } else if (o.a()) {
                this.f22792b.b("AppLovinAdService", "Failed to parse url: " + c1633e.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (o.a()) {
                this.f22792b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (o.a()) {
                this.f22792b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.A());
            if (this.f22791a.h0() != null) {
                this.f22791a.h0().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j8, int i5, boolean z2) {
        if (bVar == null) {
            if (o.a()) {
                this.f22792b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<C1633e> listG0 = bVar.g0();
        if (listG0 == null || listG0.isEmpty()) {
            if (o.a()) {
                this.f22792b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (C1633e c1633e : listG0) {
            if (StringUtils.isValidString(c1633e.c())) {
                String strA = a(c1633e.c(), j8, i5, string, z2);
                String strA2 = a(c1633e.a(), j8, i5, string, z2);
                if (strA != null) {
                    a(new C1633e(strA, strA2));
                } else if (o.a()) {
                    this.f22792b.b("AppLovinAdService", "Failed to parse url: " + c1633e.c());
                }
            } else if (o.a()) {
                this.f22792b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new s(this, appLovinError, appLovinAdLoadListener));
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(C1666u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f22791a.O();
            if (o.a()) {
                this.f22791a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f22791a.D().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, C1666u c1666u, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new u(1, appLovinAdLoadListener, bVar));
        } else {
            a(new f6(jSONObject, c1666u, appLovinAdLoadListener, this.f22791a));
        }
    }

    private boolean b() {
        if (!AbstractC1654o0.b()) {
            return true;
        }
        Context contextO = k.o();
        ApplicationExitInfo applicationExitInfoE = N0.e(((ActivityManager) contextO.getSystemService("activity")).getHistoricalProcessExitReasons(contextO.getPackageName(), 0, 1).get(0));
        return applicationExitInfoE.getReason() == 10 || applicationExitInfoE.getReason() == 11;
    }

    private void a(C1666u c1666u, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (c1666u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f22791a.O();
            if (o.a()) {
                this.f22791a.O().a("AppLovinAdService", "Loading next ad of zone {" + c1666u + "}...");
            }
            c cVarA = a(c1666u);
            synchronized (cVarA.f22799a) {
                try {
                    cVarA.f22802d.add(appLovinAdLoadListener);
                    if (!cVarA.f22800b) {
                        cVarA.f22800b = true;
                        a(c1666u, new b(cVarA));
                    } else if (o.a()) {
                        this.f22792b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(j5 j5Var) {
        if (!this.f22791a.C0()) {
            o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f22791a.c();
        this.f22791a.r0().a(j5Var, e6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new s(this, appLovinAdLoadListener, appLovinAd, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            o.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f22791a.D().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            o.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.f22791a.D().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof m2 ? "V2" : ""), th);
        }
    }

    private void a(com.applovin.impl.adview.a aVar, Uri uri, Context context) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        if (l7.a(uri)) {
            a(uri, bVarG, aVar.i(), aVar, context, this.f22791a);
        } else if (bVarG != null && bVarG.isCustomTabsEnabled()) {
            this.f22791a.z().a(uri, aVar, this.f22791a.v0());
        } else {
            l7.b(uri, bVarG, context, this.f22791a);
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f22791a.a(y4.f23933x)).booleanValue() || (context = f8.b(appLovinAdView, this.f22791a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (l7.a(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f22791a);
        } else if (bVar != null && bVar.isCustomTabsEnabled()) {
            this.f22791a.z().a(uri, aVar, this.f22791a.v0());
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j8, int i5, String str2, boolean z2) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i5 < 0 || i5 > 100) {
                i5 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j8)).appendQueryParameter("pv", Integer.toString(i5)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z2)).build().toString();
        } catch (Throwable th) {
            if (o.a()) {
                this.f22792b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f22791a.D().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (l7.b(uri, bVar, context, this.f22791a)) {
            t2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.w();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, "fallbackUrl");
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, kVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, kVar);
            }
            if (aVar != null) {
                aVar.w();
                return;
            }
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.O();
        if (o.a()) {
            kVar.O().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zB = l7.b(uri, bVar, context, kVar);
        if (zB) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.g0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                t2.b(aVar.e(), bVar, appLovinAdView);
                return zB;
            }
        } else {
            kVar.O();
            if (o.a()) {
                kVar.O().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zB;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f22791a.O();
                if (o.a()) {
                    this.f22791a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f22791a.D().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j8, long j10, List list, String str2, boolean z2, int i5) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j8)).appendQueryParameter("vs_ms", Long.toString(j10));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i5 != i.f22975h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z2));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(i.a(i5)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> mapTryToStringMap;
        if (o.a()) {
            this.f22792b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f22791a.b(a5.f20946Q);
        if (TextUtils.isEmpty(str)) {
            if (o.a()) {
                this.f22792b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f22791a.D().d(d2.f21268G0, mapTryToStringMap);
        String str2 = (String) this.f22791a.b(a5.f20945P);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l10 = (Long) this.f22791a.b(a5.f20944O);
            if (l10 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l10));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l10));
            }
            a(new C1633e(string, string2));
            return;
        }
        if (o.a()) {
            this.f22792b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(C1633e c1633e) {
        if (StringUtils.isValidString(c1633e.c())) {
            this.f22791a.f0().e(com.applovin.impl.sdk.network.d.b().d(c1633e.c()).a(StringUtils.isValidString(c1633e.a()) ? c1633e.a() : null).a(c1633e.b()).a(false).b(c1633e.d()).a());
        } else if (o.a()) {
            this.f22792b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final C1666u c1666u, final b bVar) {
        AppLovinAdImpl appLovinAdImplE = this.f22791a.i().e(c1666u);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (o.a()) {
                this.f22792b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + c1666u);
            }
            bVar.adReceived(appLovinAdImplE);
            return;
        }
        MaxAdFormat maxAdFormatD = c1666u.d();
        if (((Boolean) this.f22791a.a(y4.f23766c1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f22791a.h().a(c1666u, new d.a() { // from class: com.applovin.impl.sdk.t
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar2) {
                    this.f23257a.a(bVar, c1666u, bVar2);
                }
            });
        } else {
            a(new z5(c1666u, bVar, this.f22791a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, C1666u c1666u, com.applovin.impl.sdk.ad.b bVar2) {
        if (bVar2 != null) {
            AppLovinSdkUtils.runOnUiThread(new u(0, bVar, bVar2));
        } else {
            a(new z5(c1666u, bVar, this.f22791a));
        }
    }

    private c a(C1666u c1666u) {
        c cVar;
        synchronized (this.f22794d) {
            try {
                cVar = (c) this.f22793c.get(c1666u);
                if (cVar == null) {
                    cVar = new c();
                    this.f22793c.put(c1666u, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
