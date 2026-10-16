package com.waze.ads;

import android.os.Parcelable;
import com.waze.R;
import com.waze.ab.o;
import com.waze.cf;
import com.waze.jni.protos.Advertisement;
import com.waze.jni.protos.PinAdDisplay;
import com.waze.main_screen.ab.a.m;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class AdsNativeManager extends g {
    public static final int $stable = 8;
    private final bm<String> _adIdsToShow;
    private final kotlinx.coroutines.b.k<String> adIdsToShow;
    private final com.waze.shared_infra.i.e logger;
    private final h.f popupsBridgeCompat$delegate;
    private final com.waze.shared_infra.o.a stringProvider;

    public AdsNativeManager(com.waze.shared_infra.o.a aVar, com.waze.shared_infra.i.e eVar, com.waze.main_screen.ab.h hVar) {
        x.f(aVar, "stringProvider");
        x.f(eVar, "logger");
        x.f(hVar, "popupsBridgeCompatFactory");
        this.stringProvider = aVar;
        this.logger = eVar;
        this.popupsBridgeCompat$delegate = h.g.a(new b(hVar, 0));
        bm<String> bmVarE = bu.e(0, 1, null, 5);
        this._adIdsToShow = bmVarE;
        this.adIdsToShow = ai.S(bmVarE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final ab fetchAdInfo$lambda$0(AdsNativeManager adsNativeManager, CompletableDeferred completableDeferred, String str, PinAdDisplay pinAdDisplay) {
        Object fVar = null;
        if (pinAdDisplay != null) {
            Parcelable.Creator<com.waze.ads.a.f> creator = com.waze.ads.a.f.CREATOR;
            x.f(pinAdDisplay, "proto");
            String adId = pinAdDisplay.getAdId();
            x.e(adId, "getAdId(...)");
            com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(pinAdDisplay.getPosition().getLatitude(), pinAdDisplay.getPosition().getLongitude());
            String placeId = pinAdDisplay.getPlaceId();
            x.e(placeId, "getPlaceId(...)");
            String businessName = pinAdDisplay.getBusinessName();
            String adText = pinAdDisplay.getAdText();
            String adBody = pinAdDisplay.getAdBody();
            String ctaMessage = pinAdDisplay.getCtaMessage();
            String clickUrl = pinAdDisplay.getClickUrl();
            String visibleUrl = pinAdDisplay.getVisibleUrl();
            String logoImageUrl = pinAdDisplay.getLogoImageUrl();
            Float fValueOf = pinAdDisplay.hasRating() ? Float.valueOf(pinAdDisplay.getRating()) : null;
            PinAdDisplay.OpenStatus openStatus = pinAdDisplay.getOpenStatus();
            if (openStatus != null) {
                int iOrdinal = openStatus.ordinal();
                if (iOrdinal == 0) {
                    fVar = com.waze.ads.a.e.f13915a;
                } else if (iOrdinal == 1) {
                    fVar = com.waze.ads.a.e.f13916b;
                } else if (iOrdinal == 2) {
                    fVar = com.waze.ads.a.e.f13917c;
                } else if (iOrdinal == 3) {
                    fVar = com.waze.ads.a.e.f13918d;
                } else if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw new h.i();
                    }
                    fVar = com.waze.ads.a.e.f13915a;
                } else {
                    fVar = com.waze.ads.a.e.f13919e;
                }
            }
            fVar = new com.waze.ads.a.f(adId, cVar, placeId, pinAdDisplay.getIsTest(), businessName, adText, adBody, ctaMessage, clickUrl, visibleUrl, logoImageUrl, pinAdDisplay.getPinIconUrl(), pinAdDisplay.getAboutThisAdUrl(), fValueOf, fVar, pinAdDisplay.getTrackAddStopUrl());
        } else {
            adsNativeManager.logger.g("could not find ad for id ".concat(String.valueOf(str)));
        }
        completableDeferred.a(fVar);
        return ab.f48028a;
    }

    static /* synthetic */ Object fetchAdInfo$suspendImpl(AdsNativeManager adsNativeManager, String str, h.c.e<? super com.waze.ads.a.f> eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        adsNativeManager.fetchAdInfo(str, new c(adsNativeManager, completableDeferredJ, str, 0));
        return completableDeferredJ.c(eVar);
    }

    private final m getPopupsBridgeCompat() {
        return (m) this.popupsBridgeCompat$delegate.getValue();
    }

    public Object fetchAdInfo(String str, h.c.e<? super com.waze.ads.a.f> eVar) {
        return fetchAdInfo$suspendImpl(this, str, eVar);
    }

    public final native byte[] fetchAdInfoNTV(String str);

    public kotlinx.coroutines.b.k<String> getAdIdsToShow() {
        return this.adIdsToShow;
    }

    public final void handleExternalPoiFailedLoading$third_party_waze_client_android_project_waze_src_main_waze() {
        getPopupsBridgeCompat().a(null);
        o oVar = new o();
        oVar.Q(this.stringProvider.c(R.string.CRISIS_RESPONSE_LOAD_FAILED_MESSAGE, new Object[0]));
        oVar.M(this.stringProvider.c(R.string.CRISIS_RESPONSE_LOAD_FAILED_BUTTON, new Object[0]));
        com.waze.z.a.d.ai.q(oVar);
    }

    public final native void initNativeLayerNTV();

    public final void showAdInfo$third_party_waze_client_android_project_waze_src_main_waze(String str) {
        x.f(str, "adId");
        this._adIdsToShow.c(str);
    }

    public final void showAdvertisementTakeover$third_party_waze_client_android_project_waze_src_main_waze(Advertisement advertisement) {
        x.f(advertisement, "advertisement");
        String channel = advertisement.getChannel();
        x.e(channel, "getChannel(...)");
        getPopupsBridgeCompat().b(new com.waze.main_screen.ab.d(null, cf.c(channel), advertisement.getVenueData()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdsNativeManager(com.waze.shared_infra.o.a aVar, com.waze.shared_infra.i.e eVar, com.waze.main_screen.ab.h hVar, int i2, h.g.b.o oVar) {
        if ((i2 & 2) != 0) {
            eVar = com.waze.shared_infra.i.a.d("AdsNativeManager");
            x.e(eVar, "create(...)");
        }
        this(aVar, eVar, hVar);
    }
}
