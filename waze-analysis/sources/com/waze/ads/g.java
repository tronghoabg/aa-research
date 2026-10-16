package com.waze.ads;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.Advertisement;
import com.waze.jni.protos.PinAdDisplay;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class g {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAdInfo$default(g gVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAdInfo");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        gVar.fetchAdInfo(str, lVar);
    }

    static final byte[] fetchAdInfo$lambda$0(g gVar, String str) {
        x.d(gVar, "null cannot be cast to non-null type com.waze.ads.AdsNativeManager");
        return ((AdsNativeManager) gVar).fetchAdInfoNTV(str);
    }

    static final void fetchAdInfo$lambda$1(h.g.a.l lVar, byte[] bArr) {
        PinAdDisplay pinAdDisplay = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                pinAdDisplay = (PinAdDisplay) PinAdDisplay.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(pinAdDisplay);
            }
        }
    }

    static final void handleExternalPoiFailedLoadingJNI$lambda$0(g gVar) {
        x.d(gVar, "null cannot be cast to non-null type com.waze.ads.AdsNativeManager");
        ((AdsNativeManager) gVar).handleExternalPoiFailedLoading$third_party_waze_client_android_project_waze_src_main_waze();
    }

    static final void showAdInfoJNI$lambda$0(g gVar, String str) {
        x.d(gVar, "null cannot be cast to non-null type com.waze.ads.AdsNativeManager");
        ((AdsNativeManager) gVar).showAdInfo$third_party_waze_client_android_project_waze_src_main_waze(str);
    }

    static final void showAdvertisementTakeoverJNI$lambda$0(g gVar, Advertisement advertisement) {
        x.d(gVar, "null cannot be cast to non-null type com.waze.ads.AdsNativeManager");
        x.c(advertisement);
        ((AdsNativeManager) gVar).showAdvertisementTakeover$third_party_waze_client_android_project_waze_src_main_waze(advertisement);
    }

    public void fetchAdInfo(final String str, h.g.a.l<? super PinAdDisplay, ab> lVar) {
        x.f(str, "adId");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.ads.d
            @Override // com.waze.hw
            public final Object a() {
                return g.fetchAdInfo$lambda$0(this.f13992a, str);
            }
        }, new j(lVar, 1));
    }

    protected final void handleExternalPoiFailedLoadingJNI() {
        NativeManager.runMainThreadTask(new f(this, 0));
    }

    protected final void showAdInfoJNI(String str) {
        x.f(str, "adId");
        NativeManager.runMainThreadTask(new e(this, str, 1));
    }

    protected final void showAdvertisementTakeoverJNI(byte[] bArr) {
        x.f(bArr, "advertisement");
        try {
            NativeManager.runMainThreadTask(new e(this, (Advertisement) Advertisement.parser().c(bArr), 0));
        } catch (eu unused) {
        }
    }

    public final void fetchAdInfo(String str) {
        x.f(str, "adId");
        fetchAdInfo$default(this, str, null, 2, null);
    }
}
