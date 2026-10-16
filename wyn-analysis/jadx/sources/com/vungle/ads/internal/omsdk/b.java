package com.vungle.ads.internal.omsdk;

import Xf.o;
import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.InteractionType;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.adsession.media.Position;
import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.f3;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.C2515C;
import ef.C2530n;
import java.net.URL;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33460a;

    /* renamed from: b, reason: collision with root package name */
    public AdSession f33461b;

    /* renamed from: c, reason: collision with root package name */
    public AdEvents f33462c;

    /* renamed from: d, reason: collision with root package name */
    public MediaEvents f33463d;

    public b(String omSdkData, String omSdkJS, boolean z2) {
        Object objZ;
        AbstractC3340k.e(omSdkData, "omSdkData");
        AbstractC3340k.e(omSdkJS, "omSdkJS");
        this.f33460a = z2;
        o oVarA = Fe.e.a(a.f33459a);
        try {
            AdSessionConfiguration adSessionConfigurationA = z2 ? a(CreativeType.VIDEO) : a(CreativeType.NATIVE_DISPLAY);
            Partner partnerCreatePartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] bArrDecode = Base64.decode(omSdkData, 0);
            f3 f3Var = bArrDecode != null ? (f3) oVarA.a(new String(bArrDecode, Bf.a.f1670a), H.n0(oVarA.f16253b, kotlin.jvm.internal.H.b(f3.class))) : null;
            if ((f3Var != null ? f3Var.c() : null) == null) {
                boolean z10 = u.f33874a;
                t.b("NativeAd-OMTracker", "Invalid OMSDK data: missing vendorURL");
            } else {
                VerificationScriptResource verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(f3Var.b(), new URL(f3Var.c()), f3Var.a());
                AbstractC3340k.d(verificationScriptResource, "verificationScriptResource");
                this.f33461b = AdSession.createAdSession(adSessionConfigurationA, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, omSdkJS, AbstractC3935e.C(verificationScriptResource), null, null));
            }
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z11 = u.f33874a;
            t.a("NativeAd-OMTracker", "error occured when create omsdk adSession:", thA);
        }
    }

    public final void a(View view) {
        Object objZ;
        AbstractC3340k.e(view, "view");
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "start OM tracker");
        try {
            AdSession adSession = this.f33461b;
            if (adSession != null) {
                this.f33462c = AdEvents.createAdEvents(adSession);
                if (this.f33460a) {
                    this.f33463d = MediaEvents.createMediaEvents(adSession);
                }
                adSession.registerAdView(view);
                adSession.start();
                if (this.f33460a) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
                    AdEvents adEvents = this.f33462c;
                    if (adEvents != null) {
                        adEvents.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    }
                } else {
                    AdEvents adEvents2 = this.f33462c;
                    if (adEvents2 != null) {
                        adEvents2.loaded();
                    }
                }
                objZ = Integer.valueOf(t.a("NativeAd-OMTracker", "track event: loaded"));
            } else {
                objZ = null;
            }
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z10 = u.f33874a;
            t.a("NativeAd-OMTracker", "error occured when start omsdk adSession:", thA);
        }
    }

    public final void b() {
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: onStateCompleted");
        try {
            MediaEvents mediaEvents = this.f33463d;
            if (mediaEvents != null) {
                mediaEvents.complete();
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
    }

    public final void c() {
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: onStatePaused");
        try {
            MediaEvents mediaEvents = this.f33463d;
            if (mediaEvents != null) {
                mediaEvents.pause();
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
    }

    public final void d() {
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: onStatePlay");
        try {
            MediaEvents mediaEvents = this.f33463d;
            if (mediaEvents != null) {
                mediaEvents.resume();
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
    }

    public final void e() {
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: onUserInteraction");
        try {
            MediaEvents mediaEvents = this.f33463d;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
    }

    public final void a(float f10, float f11) {
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: onQuartileStart duration=" + f10 + " volume=" + f11);
        try {
            MediaEvents mediaEvents = this.f33463d;
            if (mediaEvents != null) {
                mediaEvents.start(f10, f11);
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
    }

    public final void a(int i5) {
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: onQuartileChanged quartile=" + i5);
        if (i5 == 5) {
            try {
                MediaEvents mediaEvents = this.f33463d;
                if (mediaEvents != null) {
                    mediaEvents.firstQuartile();
                    return;
                }
                return;
            } catch (Throwable th) {
                Fe.e.z(th);
                return;
            }
        }
        if (i5 == 6) {
            try {
                MediaEvents mediaEvents2 = this.f33463d;
                if (mediaEvents2 != null) {
                    mediaEvents2.midpoint();
                    return;
                }
                return;
            } catch (Throwable th2) {
                Fe.e.z(th2);
                return;
            }
        }
        if (i5 != 7) {
            return;
        }
        try {
            MediaEvents mediaEvents3 = this.f33463d;
            if (mediaEvents3 != null) {
                mediaEvents3.thirdQuartile();
            }
        } catch (Throwable th3) {
            Fe.e.z(th3);
        }
    }

    public final void a(boolean z2) {
        boolean z10 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: onMuteChanged muted=" + z2);
        if (z2) {
            try {
                MediaEvents mediaEvents = this.f33463d;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                }
                return;
            } catch (Throwable th) {
                Fe.e.z(th);
                return;
            }
        }
        try {
            MediaEvents mediaEvents2 = this.f33463d;
            if (mediaEvents2 != null) {
                mediaEvents2.volumeChange(1.0f);
            }
        } catch (Throwable th2) {
            Fe.e.z(th2);
        }
    }

    public final void a() {
        boolean z2 = u.f33874a;
        t.a("NativeAd-OMTracker", "track event: impressionOccurred");
        try {
            AdEvents adEvents = this.f33462c;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
    }

    public static AdSessionConfiguration a(CreativeType creativeType) {
        ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
        Owner owner = Owner.NATIVE;
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, creativeType == CreativeType.NATIVE_DISPLAY ? Owner.NONE : owner, false);
        AbstractC3340k.d(adSessionConfigurationCreateAdSessionConfiguration, "createAdSessionConfigura…          false\n        )");
        return adSessionConfigurationCreateAdSessionConfiguration;
    }
}
