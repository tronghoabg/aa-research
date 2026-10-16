package com.unity3d.services.ads.gmascar;

import A.C0230x;
import A7.AbstractC0279p0;
import a.AbstractC1304a;
import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.e;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import nb.InterfaceC3612a;
import nb.c;
import nb.d;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridgeBase _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private e _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(@Nullable MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge, WebViewErrorHandler webViewErrorHandler, ScarAdapterFactory scarAdapterFactory, GMAEventSender gMAEventSender) {
        this._initializationStatusBridge = initializationStatusBridge;
        this._initializationListenerBridge = initializeListenerBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = webViewErrorHandler;
        this._scarAdapterFactory = scarAdapterFactory;
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._gmaEventSender = gMAEventSender;
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge, gMAEventSender);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridgeBase, presenceDetector, gMAInitializer, gMAEventSender);
    }

    private e getScarAdapterObject() {
        MobileAdsBridgeBase mobileAdsBridgeBase;
        if (this._scarAdapter == null && (mobileAdsBridgeBase = this._mobileAdsBridge) != null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(mobileAdsBridgeBase.getAdapterVersion(this._scarVersionFinder.getVersionCode()), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(b.f32707v, b.f32708w, b.f32709x, b.f32710y)), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(c cVar) {
        this._scarAdapter.a(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.f41004e), this._gmaEventSender));
    }

    private void loadRewardedAd(c cVar) {
        this._scarAdapter.c(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.f41004e), this._gmaEventSender));
    }

    public void getSCARBiddingSignals(List<d> list, BiddingSignalsHandler biddingSignalsHandler) {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase == null || !mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
            return;
        }
        e scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        AbstractC1304a abstractC1304a = (AbstractC1304a) ((Ca.d) scarAdapterObject).f1970a;
        abstractC1304a.getClass();
        C0230x c0230x = new C0230x((byte) 0, 13);
        h9.c cVar = new h9.c();
        for (d dVar : list) {
            c0230x.v();
            abstractC1304a.w(applicationContext, dVar, c0230x, cVar);
        }
        L7.b bVar = new L7.b(23, biddingSignalsHandler, cVar);
        c0230x.f188c = bVar;
        if (c0230x.f187b <= 0) {
            bVar.run();
        }
    }

    public void getSCARSignal(String str, d dVar) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler(this._gmaEventSender);
        e eVar = this._scarAdapter;
        if (eVar == null) {
            this._webViewErrorHandler.handleError((h) new a(b.f32696j, "Could not create SCAR adapter object", "Could not create SCAR adapter object"));
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        AbstractC1304a abstractC1304a = (AbstractC1304a) ((Ca.d) eVar).f1970a;
        abstractC1304a.getClass();
        C0230x c0230x = new C0230x((byte) 0, 13);
        h9.c cVar = new h9.c();
        c0230x.v();
        abstractC1304a.v(applicationContext, str, dVar, c0230x, cVar);
        L7.b bVar = new L7.b(23, signalsHandler, cVar);
        c0230x.f188c = bVar;
        if (c0230x.f187b <= 0) {
            bVar.run();
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public boolean hasSCARBiddingSupport() {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            e scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                return true;
            }
        }
        return false;
    }

    public void initializeScar() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this._presenceDetector.areGMAClassesPresent()) {
            this._webViewErrorHandler.handleError((h) new a(b.f32688b, null, new Object[0]));
        } else {
            this._gmaEventSender.send(b.f32687a, new Object[0]);
            this._gmaInitializer.initializeGMA();
        }
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z2, String str, String str2, String str3, String str4, int i5) {
        c cVar = new c(str, str2, str4, str3, Integer.valueOf(i5));
        e scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((h) new a(b.f32699n, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
        } else if (z2) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void loadBanner(Context context, BannerView bannerView, String str, c cVar, UnityBannerSize unityBannerSize) {
        this._scarAdapter = getScarAdapterObject();
        ScarBannerAdHandler scarBannerAdHandler = new ScarBannerAdHandler(this._gmaEventSender, str);
        e eVar = this._scarAdapter;
        if (eVar != null) {
            eVar.b(context, bannerView, cVar, unityBannerSize.getWidth(), unityBannerSize.getHeight(), scarBannerAdHandler);
        } else {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, str);
        }
    }

    public void show(String str, String str2) {
        boolean z2 = false;
        e scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((h) new a(b.f32703r, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
            return;
        }
        Activity activity = ClientProperties.getActivity();
        Ca.d dVar = (Ca.d) scarAdapterObject;
        InterfaceC3612a interfaceC3612a = (InterfaceC3612a) ((ConcurrentHashMap) dVar.f1971b).get(str);
        if (interfaceC3612a == null) {
            String strL = AbstractC0279p0.l("Could not find ad for placement '", str, "'.");
            ((com.unity3d.scar.adapter.common.c) dVar.f1973d).handleError(new a(b.f32701p, strL, str, str2, strL));
        } else {
            dVar.f1972c = interfaceC3612a;
            Fe.e.Q(new L7.b(dVar, z2, activity, 16));
        }
    }

    public void getSCARBiddingSignals(boolean z2, BiddingSignalsHandler biddingSignalsHandler) {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            e scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                Context applicationContext = ClientProperties.getApplicationContext();
                AbstractC1304a abstractC1304a = (AbstractC1304a) ((Ca.d) scarAdapterObject).f1970a;
                abstractC1304a.getClass();
                C0230x c0230x = new C0230x((byte) 0, 13);
                h9.c cVar = new h9.c();
                c0230x.v();
                abstractC1304a.w(applicationContext, d.f41006b, c0230x, cVar);
                c0230x.v();
                abstractC1304a.w(applicationContext, d.f41007c, c0230x, cVar);
                if (z2) {
                    c0230x.v();
                    abstractC1304a.w(applicationContext, d.f41008d, c0230x, cVar);
                }
                L7.b bVar = new L7.b(23, biddingSignalsHandler, cVar);
                c0230x.f188c = bVar;
                if (c0230x.f187b <= 0) {
                    bVar.run();
                    return;
                }
                return;
            }
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }
}
