package com.applovin.adview;

import C6.l;
import Ef.H;
import android.os.HandlerThread;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1663b;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.network.b;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.timepicker.e;
import com.moloco.sdk.acm.eventprocessing.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2138x;
import com.qonversion.android.sdk.internal.QUserPropertiesManager;
import com.qonversion.android.sdk.internal.logger.QExceptionManager;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.view.ScarBannerContainer;
import eb.c;
import f8.d;
import f8.j;
import i2.C2843c;
import io.flutter.plugin.platform.q;
import java.io.IOException;
import java.util.ArrayList;
import t1.C4075d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20726b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f20725a = i5;
        this.f20726b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f20725a) {
            case 0:
                ((AppLovinFullscreenActivity) this.f20726b).c();
                return;
            case 1:
                AppLovinBroadcastManager.sendBroadcastSync((CommunicatorMessageImpl) this.f20726b, null);
                return;
            case 2:
                ((MaxFullscreenAdImpl) this.f20726b).c();
                return;
            case 3:
                ((MaxFullscreenAdImpl.b) this.f20726b).a();
                return;
            case 4:
                ((C1663b) this.f20726b).c();
                return;
            case 5:
                ((f) this.f20726b).i();
                return;
            case 6:
                ((b) this.f20726b).e();
                return;
            case 7:
                ((MaxNativeAdView) this.f20726b).a();
                return;
            case 8:
                ((MaxAdPlacer) this.f20726b).b();
                return;
            case 9:
                ((e) this.f20726b).m();
                return;
            case 10:
                l lVar = (l) this.f20726b;
                H.D((Kd.a) lVar.f1847d, null, new h(lVar, null), 3);
                return;
            case 11:
                ((C2138x) this.f20726b).destroy();
                return;
            case 12:
                QUserPropertiesManager.sendPropertiesWithDelay$lambda$1((QUserPropertiesManager) this.f20726b);
                return;
            case 13:
                QExceptionManager.sendCrashReportsInBackground$lambda$2((QExceptionManager) this.f20726b);
                return;
            case 14:
                UnityAdsImplementation.lambda$load$2((InternalLoadListener) this.f20726b);
                return;
            case 15:
                ((BiddingBaseManager) this.f20726b).lambda$fetchSignals$1();
                return;
            case 16:
                ((ShowOperationState) this.f20726b).lambda$onUnityAdsShowClick$1();
                return;
            case 17:
                ((BannerView) this.f20726b).lambda$addScarContainer$0();
                return;
            case 18:
                ScarBannerContainer.lambda$destroy$0((ScarBannerContainer) this.f20726b);
                return;
            case 19:
                ((InitializationListener) this.f20726b).onInitializationComplete(null);
                return;
            case 20:
                d2.e eVar = (d2.e) this.f20726b;
                synchronized (eVar.f33972a) {
                    try {
                        if (eVar.f33983m) {
                            return;
                        }
                        long j8 = eVar.f33982l - 1;
                        eVar.f33982l = j8;
                        if (j8 > 0) {
                            return;
                        }
                        if (j8 < 0) {
                            eVar.b(new IllegalStateException());
                            return;
                        } else {
                            eVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 21:
                N7.e eVar2 = (N7.e) this.f20726b;
                eVar2.f8588b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar2.f8591e;
                C4075d c4075d = sideSheetBehavior.f26996i;
                if (c4075d != null && c4075d.f()) {
                    eVar2.f(eVar2.f8589c);
                    return;
                } else {
                    if (sideSheetBehavior.f26995h == 2) {
                        sideSheetBehavior.r(eVar2.f8589c);
                        return;
                    }
                    return;
                }
            case 22:
                c cVar = ((eb.b) this.f20726b).f34597f;
                if (cVar.i0()) {
                    cVar.r();
                    return;
                }
                return;
            case 23:
                ((Wa.h) this.f20726b).f15449c.c();
                return;
            case 24:
                ((d) this.f20726b).t(true);
                return;
            case 25:
                j jVar = (j) this.f20726b;
                boolean zIsPopupShowing = jVar.f35143h.isPopupShowing();
                jVar.t(zIsPopupShowing);
                jVar.f35147m = zIsPopupShowing;
                return;
            case 26:
                ((HandlerThread) this.f20726b).quit();
                return;
            case 27:
                ((C2843c) this.f20726b).u();
                return;
            case 28:
                ((q) this.f20726b).i(false);
                return;
        }
        while (true) {
            jb.e eVar3 = (jb.e) this.f20726b;
            ArrayList arrayList = eVar3.f38710f;
            if (arrayList.isEmpty() || eVar3.f38715l != null) {
                return;
            }
            ((kb.d) arrayList.get(0)).f39448a.run();
            arrayList.remove(0);
        }
    }
}
