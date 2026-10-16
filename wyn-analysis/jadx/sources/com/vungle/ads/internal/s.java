package com.vungle.ads.internal;

import A7.AbstractC0279p0;
import E5.Q;
import Ef.G;
import android.content.Context;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.InvalidCSBDataError;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class s implements com.vungle.ads.internal.load.a {

    /* renamed from: p, reason: collision with root package name */
    public static final Xf.c f33613p = Fe.e.a(i.f33019a);

    /* renamed from: a, reason: collision with root package name */
    public final Context f33614a;

    /* renamed from: b, reason: collision with root package name */
    public volatile h f33615b;

    /* renamed from: c, reason: collision with root package name */
    public com.vungle.ads.internal.model.h0 f33616c;

    /* renamed from: d, reason: collision with root package name */
    public i3 f33617d;

    /* renamed from: e, reason: collision with root package name */
    public com.vungle.ads.internal.model.p0 f33618e;

    /* renamed from: f, reason: collision with root package name */
    public com.vungle.ads.internal.load.a f33619f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2525i f33620g;

    /* renamed from: h, reason: collision with root package name */
    public com.vungle.ads.internal.load.g f33621h;

    /* renamed from: i, reason: collision with root package name */
    public n2 f33622i;

    /* renamed from: j, reason: collision with root package name */
    public n2 f33623j;
    public final t1 k;

    /* renamed from: l, reason: collision with root package name */
    public final t1 f33624l;

    /* renamed from: m, reason: collision with root package name */
    public com.vungle.ads.internal.util.s f33625m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f33626n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f33627o;

    public s(Context context) {
        AbstractC3340k.e(context, "context");
        this.f33614a = context;
        this.f33615b = h.f33008a;
        this.f33620g = Fe.c.y(EnumC2526j.f34667a, new r(context));
        this.k = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.f33624l = new t1(Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.f33626n = new AtomicBoolean(false);
        this.f33627o = new AtomicBoolean(false);
    }

    public void a(com.vungle.ads.internal.model.h0 advertisement) {
        AbstractC3340k.e(advertisement, "advertisement");
    }

    public abstract boolean a(VungleAdSize vungleAdSize);

    public abstract boolean a(i3 i3Var);

    public abstract VungleAdSize b();

    public void b(com.vungle.ads.internal.model.h0 advertisement) {
        AbstractC3340k.e(advertisement, "advertisement");
    }

    public final com.vungle.ads.internal.model.h0 c() {
        return this.f33616c;
    }

    public final Context d() {
        return this.f33614a;
    }

    public final com.vungle.ads.internal.util.s e() {
        return this.f33625m;
    }

    public final i3 f() {
        return this.f33617d;
    }

    public final t1 g() {
        return this.k;
    }

    public final t1 h() {
        return this.f33624l;
    }

    public final boolean i() {
        return this.f33615b == h.f33011d || this.f33615b == h.f33012e;
    }

    public InvalidAdStateError j() {
        if (this.f33615b == h.f33011d) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
        }
        if (this.f33615b == h.f33012e) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing, impression logged");
        }
        if (this.f33615b == h.f33010c) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.f33615b + " is not READY");
    }

    public final void k() {
        List<String> listR;
        if (!this.f33627o.compareAndSet(false, true)) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Loss URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.h0 h0Var = this.f33616c;
        if (h0Var == null || (listR = h0Var.r()) == null) {
            return;
        }
        InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new p(this.f33614a));
        for (String str : listR) {
            if (com.vungle.ads.internal.util.n.a(str)) {
                ((com.vungle.ads.internal.network.r) interfaceC2525iY.getValue()).a(new com.vungle.ads.internal.network.p(str).d().a(), false);
            } else {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.c("AdInternal", "Invalid loss URL skipped: " + str);
            }
        }
    }

    public final void l() {
        List<String> listW;
        if (!this.f33626n.compareAndSet(false, true)) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Win URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.h0 h0Var = this.f33616c;
        if (h0Var == null || (listW = h0Var.w()) == null) {
            return;
        }
        InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new q(this.f33614a));
        for (String str : listW) {
            if (com.vungle.ads.internal.util.n.a(str)) {
                ((com.vungle.ads.internal.network.r) interfaceC2525iY.getValue()).a(new com.vungle.ads.internal.network.p(str).d().a(), false);
            } else {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.c("AdInternal", "Invalid win URL skipped: " + str);
            }
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public final void onFailure(VungleError error) throws Throwable {
        AbstractC3340k.e(error, "error");
        a(h.f33014g);
        n2 n2Var = this.f33623j;
        if (n2Var != null) {
            n2Var.a(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            n2Var.d();
            AnalyticsClient.INSTANCE.a(n2Var, this.f33625m, error.getCode() + '-' + error.getErrorMessage());
        }
        com.vungle.ads.internal.load.a aVar = this.f33619f;
        if (aVar != null) {
            aVar.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public final void onSuccess(com.vungle.ads.internal.model.h0 advertisement) throws Throwable {
        AbstractC3340k.e(advertisement, "advertisement");
        this.f33616c = advertisement;
        a(h.f33010c);
        a(advertisement);
        b(advertisement);
        com.vungle.ads.internal.load.a aVar = this.f33619f;
        if (aVar != null) {
            aVar.onSuccess(advertisement);
        }
        n2 n2Var = this.f33623j;
        if (n2Var != null) {
            if (!advertisement.b()) {
                n2Var.a(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            n2Var.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, n2Var, this.f33625m, 4);
        }
        n2 n2Var2 = this.f33622i;
        if (n2Var2 != null) {
            if (!advertisement.b()) {
                n2Var2.a(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            n2Var2.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, n2Var2, this.f33625m, 4);
            InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34667a, new o(this.f33614a));
            List listA = com.vungle.ads.internal.model.h0.a(advertisement, "ad.loadDuration", String.valueOf(n2Var2.c()), 4);
            if (listA != null) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((com.vungle.ads.internal.network.r) interfaceC2525iY.getValue()).a(new com.vungle.ads.internal.network.p((String) it.next()).b("ad.loadDuration").a(this.f33625m).a(), false);
                }
            }
        }
    }

    public final void a(h value) {
        com.vungle.ads.internal.model.h0 h0Var;
        String strH;
        AbstractC3340k.e(value, "value");
        if (value.a() && (h0Var = this.f33616c) != null && (strH = h0Var.h()) != null) {
            ((com.vungle.ads.internal.task.s) ((com.vungle.ads.internal.task.h) Fe.c.y(EnumC2526j.f34667a, new j(this.f33614a)).getValue())).a(com.vungle.ads.internal.task.a.a(strH));
        }
        this.f33615b = this.f33615b.b(value);
        com.vungle.ads.internal.util.s sVar = this.f33625m;
        if (sVar == null) {
            return;
        }
        sVar.a(this.f33615b);
    }

    public final VungleError a(boolean z2) {
        VungleError adExpiredError;
        com.vungle.ads.internal.model.i iVarK;
        VungleError vungleErrorJ = j();
        com.vungle.ads.internal.model.h0 h0Var = this.f33616c;
        if (h0Var == null) {
            vungleErrorJ = new AdNotLoadedCantPlay("adv is null on onPlay=" + z2);
        } else if (vungleErrorJ == null) {
            Integer num = null;
            if (!h0Var.x()) {
                return null;
            }
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Ad expiry: ");
            com.vungle.ads.internal.model.h0 h0Var2 = this.f33616c;
            if (h0Var2 != null && (iVarK = h0Var2.k()) != null) {
                num = iVarK.f33201d;
            }
            sbA.append(num);
            sbA.append(", device: ");
            sbA.append(System.currentTimeMillis());
            String string = sbA.toString();
            if (z2) {
                adExpiredError = new AdExpiredOnPlayError(string);
            } else {
                adExpiredError = new AdExpiredError(string);
            }
            vungleErrorJ = adExpiredError;
        }
        if (z2) {
            vungleErrorJ.setLogEntry$vungle_ads_release(this.f33625m).logErrorNoReturnValue$vungle_ads_release();
        }
        return vungleErrorJ;
    }

    public final void a(String placementId, String str, VungleCSBData vungleCSBData, com.vungle.ads.internal.load.a adLoaderCallback) {
        Sdk.SDKError.Reason reason;
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adLoaderCallback, "adLoaderCallback");
        com.vungle.ads.internal.util.s sVar = this.f33625m;
        if (sVar != null) {
            sVar.a(this.f33615b);
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.f33625m, null, 10);
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.f33623j = n2Var;
        n2Var.e();
        this.f33619f = adLoaderCallback;
        if (!VungleAds.INSTANCE.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized("SDK not initialized").setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.getClass();
        i3 i3VarA = ConfigManager.a(placementId);
        if (i3VarA != null) {
            this.f33617d = i3VarA;
            if (!a(i3VarA)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(i3VarA.b()).setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
                return;
            } else if (i3VarA.a() && (str == null || str.length() == 0)) {
                adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
                return;
            }
        } else if (ConfigManager.a() == -1) {
            i3VarA = new i3(placementId);
            this.f33617d = i3VarA;
        } else {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
            return;
        }
        VungleAdSize vungleAdSizeB = b();
        if (!a(vungleAdSizeB)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(vungleAdSizeB != null ? vungleAdSizeB.toString() : null).setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
            return;
        }
        if (this.f33615b != h.f33008a) {
            switch (this.f33615b.ordinal()) {
                case 0:
                    throw new G(1);
                case 1:
                    reason = Sdk.SDKError.Reason.AD_IS_LOADING;
                    break;
                case 2:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 3:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 4:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk.SDKError.Reason.AD_CONSUMED;
                    break;
                case 6:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new Q((byte) 0, 9);
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.f33615b + " state is incorrect for load").setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
            return;
        }
        n2 n2Var2 = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.f33622i = n2Var2;
        n2Var2.e();
        if (str != null && str.length() != 0) {
            try {
                Xf.c cVar = f33613p;
                this.f33618e = (com.vungle.ads.internal.model.p0) cVar.a(str, H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(com.vungle.ads.internal.model.p0.class)));
            } catch (IllegalArgumentException e7) {
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Unable to decode payload into BidPayload object. Error: ");
                sbA.append(e7.getLocalizedMessage());
                adLoaderCallback.onFailure(new AdMarkupInvalidError(sbA.toString()).setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
                return;
            } catch (Throwable th) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
                return;
            }
        }
        a(h.f33009b);
        Context context = this.f33614a;
        EnumC2526j enumC2526j = EnumC2526j.f34667a;
        InterfaceC2525i interfaceC2525iY = Fe.c.y(enumC2526j, new k(context));
        InterfaceC2525i interfaceC2525iY2 = Fe.c.y(enumC2526j, new l(this.f33614a));
        InterfaceC2525i interfaceC2525iY3 = Fe.c.y(enumC2526j, new m(this.f33614a));
        InterfaceC2525i interfaceC2525iY4 = Fe.c.y(enumC2526j, new n(this.f33614a));
        if (vungleCSBData != null) {
            double bidFloor = vungleCSBData.getBidFloor();
            InvalidCSBDataError invalidCSBDataError = bidFloor < 0.0d ? new InvalidCSBDataError("bidFloor must be >= 0, got: " + bidFloor) : null;
            if (invalidCSBDataError == null) {
                int phase = vungleCSBData.getPhase();
                invalidCSBDataError = (1 > phase || phase >= 3) ? new InvalidCSBDataError(AbstractC3256n.g(phase, "phase must be 1 or 2, got: ")) : null;
                if (invalidCSBDataError == null) {
                    invalidCSBDataError = vungleCSBData.getAuctionId().length() > 500 ? new InvalidCSBDataError("auctionId exceeds maximum length of 500") : null;
                    if (invalidCSBDataError == null) {
                        invalidCSBDataError = vungleCSBData.getCreativeId().length() > 500 ? new InvalidCSBDataError("creativeId exceeds maximum length of 500") : null;
                        if (invalidCSBDataError == null) {
                            invalidCSBDataError = vungleCSBData.getCom.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID java.lang.String().length() > 500 ? new InvalidCSBDataError("adUnitId exceeds maximum length of 500") : null;
                        }
                    }
                    if (invalidCSBDataError == null) {
                        Map<String, String> extras = vungleCSBData.getExtras();
                        if (extras == null) {
                            invalidCSBDataError = null;
                        } else if (extras.size() > 50) {
                            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("extras map exceeds maximum of 50 entries, got: ");
                            sbA2.append(extras.size());
                            invalidCSBDataError = new InvalidCSBDataError(sbA2.toString());
                        } else {
                            for (Map.Entry<String, String> entry : extras.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                if (key.length() == 0) {
                                    invalidCSBDataError = new InvalidCSBDataError("extras contains empty key");
                                    break;
                                } else if (key.length() > 100) {
                                    invalidCSBDataError = new InvalidCSBDataError(com.iab.omid.library.vungle.d.a("extras key exceeds maximum length of 100: ", key));
                                    break;
                                } else if (value.length() > 500) {
                                    invalidCSBDataError = new InvalidCSBDataError(AbstractC0279p0.l("extras value for key '", key, "' exceeds maximum length of 500"));
                                    break;
                                }
                            }
                            invalidCSBDataError = null;
                        }
                    }
                }
            }
            if (invalidCSBDataError != null) {
                adLoaderCallback.onFailure(invalidCSBDataError.setLogEntry$vungle_ads_release(this.f33625m).logError$vungle_ads_release());
                return;
            }
            com.vungle.ads.internal.util.s sVar2 = this.f33625m;
            if (sVar2 != null) {
                sVar2.a(vungleCSBData.getPhase() == 2 ? 4L : 3L);
            }
            this.f33621h = new com.vungle.ads.internal.load.h(this.f33614a, (VungleApiClient) this.f33620g.getValue(), (com.vungle.ads.internal.executor.d) interfaceC2525iY2.getValue(), (com.vungle.ads.internal.omsdk.c) interfaceC2525iY.getValue(), (com.vungle.ads.internal.downloader.m) interfaceC2525iY4.getValue(), (PathProvider) interfaceC2525iY3.getValue(), new com.vungle.ads.internal.load.b(i3VarA, null, vungleAdSizeB, vungleCSBData));
        } else if (str != null && str.length() != 0) {
            com.vungle.ads.internal.util.s sVar3 = this.f33625m;
            if (sVar3 != null) {
                sVar3.a((Long) 2L);
            }
            this.f33621h = new com.vungle.ads.internal.load.n(this.f33614a, (VungleApiClient) this.f33620g.getValue(), (com.vungle.ads.internal.executor.d) interfaceC2525iY2.getValue(), (com.vungle.ads.internal.omsdk.c) interfaceC2525iY.getValue(), (com.vungle.ads.internal.downloader.m) interfaceC2525iY4.getValue(), (PathProvider) interfaceC2525iY3.getValue(), new com.vungle.ads.internal.load.b(i3VarA, this.f33618e, vungleAdSizeB, null));
        } else {
            com.vungle.ads.internal.util.s sVar4 = this.f33625m;
            if (sVar4 != null) {
                sVar4.a((Long) 1L);
            }
            this.f33621h = new com.vungle.ads.internal.load.j(this.f33614a, (VungleApiClient) this.f33620g.getValue(), (com.vungle.ads.internal.executor.d) interfaceC2525iY2.getValue(), (com.vungle.ads.internal.omsdk.c) interfaceC2525iY.getValue(), (com.vungle.ads.internal.downloader.m) interfaceC2525iY4.getValue(), (PathProvider) interfaceC2525iY3.getValue(), new com.vungle.ads.internal.load.b(i3VarA, null, vungleAdSizeB, null));
        }
        com.vungle.ads.internal.load.g gVar = this.f33621h;
        if (gVar != null) {
            gVar.a(this.f33625m);
        }
        com.vungle.ads.internal.load.g gVar2 = this.f33621h;
        if (gVar2 != null) {
            gVar2.a(this);
        }
    }

    public final void a() {
        com.vungle.ads.internal.model.h0 h0Var = this.f33616c;
        if (h0Var != null && h0Var.B()) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Skip cancelling download for ads with partial download enabled.");
        } else {
            com.vungle.ads.internal.load.g gVar = this.f33621h;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public final boolean a(int i5) {
        return this.f33615b == h.f33010c && i5 == 304;
    }
}
