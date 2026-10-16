package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.rt;
import com.bytedance.sdk.openadsdk.core.model.ue;
import com.bytedance.sdk.openadsdk.core.orq;
import com.bytedance.sdk.openadsdk.core.wk.yo.uef;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm {
    private static volatile ivm uef;
    private com.bytedance.sdk.component.bcc.oa.yo lw;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f25369oa;
    private final AtomicBoolean yo = new AtomicBoolean(false);
    private final List<yo> moa = DesugarCollections.synchronizedList(new ArrayList());
    private final gr.uef ivm = new gr.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.6
        @Override // com.bytedance.sdk.component.utils.gr.uef
        public void uef(Context context, Intent intent, boolean z2, int i5) {
            if (z2) {
                if (ivm.this.lw == null) {
                    ivm ivmVar = ivm.this;
                    ivmVar.lw = new com.bytedance.sdk.openadsdk.component.reward.yo("fsv net connect task", ivmVar.moa);
                }
                com.bytedance.sdk.component.utils.cz.uef().post(ivm.this.lw);
            }
        }
    };

    public static class oa implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.uef moa;

        /* renamed from: oa, reason: collision with root package name */
        private final AtomicBoolean f25375oa;
        private final PAGInterstitialAdLoadListener uef;
        private final AtomicInteger yo;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
        public void onError(int i5, String str) {
            if (this.yo.decrementAndGet() > 0 || !this.f25375oa.compareAndSet(false, true)) {
                return;
            }
            this.uef.onError(i5, str);
            com.bytedance.sdk.openadsdk.ab.moa.uef("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.oa.1
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", oa.this.moa.yo());
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("choose_ad_load_error").oa(jSONObject.toString());
                }
            });
        }

        private oa(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
            this.f25375oa = new AtomicBoolean(false);
            this.uef = pAGInterstitialAdLoadListener;
            this.moa = uefVar;
            this.yo = new AtomicInteger(uef());
        }

        private int uef() {
            if (!this.moa.ivm()) {
                return 0;
            }
            int i5 = 0;
            for (int i10 = 0; i10 < this.moa.lw().size(); i10++) {
                gzw gzwVar = this.moa.lw().get(i10);
                if (gzwVar != null && !cp.yo(gzwVar) && gzwVar.nj() != null) {
                    i5++;
                }
            }
            return i5;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.yo.decrementAndGet();
            if (this.uef == null || !this.f25375oa.compareAndSet(false, true)) {
                return;
            }
            this.uef.onAdLoaded(pAGInterstitialAd);
        }
    }

    public static class uef implements PAGInterstitialAdLoadListener {
        private final boolean lw;
        private final PAGInterstitialAdLoadListener moa;

        /* renamed from: oa, reason: collision with root package name */
        private final AdSlot f25376oa;
        private final Context uef;
        private final com.bytedance.sdk.openadsdk.core.model.uef yo;

        public uef(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z2) {
            this.uef = context;
            this.f25376oa = adSlot;
            this.yo = uefVar;
            this.moa = pAGInterstitialAdLoadListener;
            this.lw = z2;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
        public void onError(int i5, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.moa;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i5, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            ivm.uef(this.uef).uef(this.f25376oa, this.yo, this.moa, pAGInterstitialAd, this.lw);
        }
    }

    public static class yo extends com.bytedance.sdk.component.bcc.oa.yo {

        /* renamed from: oa, reason: collision with root package name */
        final AdSlot f25377oa;
        final gzw uef;
        final com.bytedance.sdk.openadsdk.core.model.uef yo;

        public yo(gzw gzwVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
            super("Fullscreen Task");
            this.uef = gzwVar;
            this.f25377oa = adSlot;
            this.yo = uefVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            gzw gzwVar = this.uef;
            if (gzwVar == null || gzwVar.nj() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(this.uef.wg()).uef(), this.uef);
            oaVarUef.uef("material_meta", this.uef);
            oaVarUef.uef("ad_slot", this.f25377oa);
            com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.yo.1
                @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
                }

                @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
                    lw lwVarUef = lw.uef(com.bytedance.sdk.openadsdk.core.sy.uef());
                    yo yoVar2 = yo.this;
                    lwVarUef.uef(yoVar2.f25377oa, yoVar2.yo);
                }
            });
        }
    }

    private ivm(Context context) {
        this.f25369oa = context == null ? com.bytedance.sdk.openadsdk.core.sy.uef() : context.getApplicationContext();
        oa();
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.lw != null) {
            try {
                com.bytedance.sdk.component.utils.cz.uef().removeCallbacks(this.lw);
            } catch (Exception unused) {
            }
            this.lw = null;
        }
        yo();
    }

    private void oa(final AdSlot adSlot) {
        ue ueVar = new ue();
        ueVar.yo = 2;
        if (com.bytedance.sdk.openadsdk.core.sy.moa().cq(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            ueVar.cz = 2;
        }
        com.bytedance.sdk.openadsdk.core.sy.yo().uef(adSlot, ueVar, 8, new orq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.1
            boolean uef = false;

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public String uef() {
                return lw.uef(ivm.this.f25369oa).uef(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                boolean zUef = lw.uef(ivm.this.f25369oa).uef(uefVar);
                this.uef = zUef;
                return zUef;
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                if (this.uef || uefVar.lw() == null || uefVar.lw().isEmpty()) {
                    return;
                }
                ivm.this.uef(uefVar, new oib(ivm.this.f25369oa, uefVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(AdSlot adSlot) {
        lw.uef(this.f25369oa).uef(adSlot.getCodeId());
    }

    private void yo() {
        if (this.yo.get()) {
            this.yo.set(false);
            try {
                gr.uef(this.ivm);
            } catch (Exception unused) {
            }
        }
    }

    public static ivm uef(Context context) {
        if (uef == null) {
            synchronized (ivm.class) {
                try {
                    if (uef == null) {
                        uef = new ivm(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    private void oa(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ue ueVar = new ue();
        ueVar.yo = 1;
        if (com.bytedance.sdk.openadsdk.core.sy.moa().cq(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            ueVar.cz = 2;
        }
        com.bytedance.sdk.openadsdk.core.sy.yo().uef(adSlot, ueVar, 8, new orq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.2
            boolean uef = false;

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i5, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                com.bytedance.sdk.openadsdk.core.model.uef uefVar2;
                if (uefVar.lw() != null && !uefVar.lw().isEmpty()) {
                    oib oibVar = new oib(ivm.this.f25369oa, uefVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.orq.uef.moa.uef().uef(uefVar.lw().isEmpty() ? null : uefVar.lw().get(0));
                        com.bytedance.sdk.openadsdk.ab.moa.uef(uefVar.xs(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || com.bytedance.sdk.openadsdk.core.sy.moa().pz() != 0) {
                        uefVar2 = uefVar;
                    } else {
                        ivm.this.uef(adSlot, uefVar, pAGInterstitialAdLoadListener, oibVar.uef(), this.uef);
                        uefVar2 = uefVar;
                    }
                    ivm.this.uef(uefVar2, oibVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.cz.uef(-3));
                    yoVar.uef(-3);
                    yoVar.yo(5);
                    com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public String uef() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strUef = lw.uef(ivm.this.f25369oa).uef(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strUef)) {
                    return null;
                }
                return strUef;
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                boolean zUef = lw.uef(ivm.this.f25369oa).uef(uefVar);
                this.uef = zUef;
                return zUef;
            }
        });
    }

    public void uef() {
        try {
            lw.uef(this.f25369oa).uef();
        } catch (Throwable unused) {
        }
    }

    public void uef(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        oa(adSlot);
    }

    private void oa() {
        if (this.yo.get()) {
            return;
        }
        this.yo.set(true);
        gr.uef(this.ivm, this.f25369oa);
    }

    public void uef(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        oa(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.uef uefVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.3
            @Override // java.lang.Runnable
            public void run() {
                if (z2) {
                    ivm.this.yo(adSlot);
                } else {
                    lw.uef(ivm.this.f25369oa).uef(adSlot, uefVar);
                    ivm.this.yo(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, oib oibVar, AdSlot adSlot, boolean z2, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        oib oibVar2;
        boolean z10;
        if (!z2) {
            com.bytedance.sdk.openadsdk.dz.uef.uef().uef(uefVar.xs());
        }
        AdSlot adSlot2 = adSlot;
        oa oaVar = new oa(new uef(this.f25369oa, adSlot2, uefVar, pAGInterstitialAdLoadListener, false), uefVar);
        uef(uefVar);
        int i5 = 0;
        while (i5 < uefVar.lw().size()) {
            gzw gzwVar = uefVar.lw().get(i5);
            int iWxf = gzwVar.wxf();
            if (i5 == 0 && iWxf == 43) {
                gzwVar.nj().ivm(0);
            }
            if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(gzwVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.oa()) {
                    gzwVar.nj().ivm(0);
                    oibVar2 = oibVar;
                    z10 = z2;
                    AdSlot adSlot3 = adSlot2;
                    uef(uefVar, gzwVar, oibVar2, adSlot3, z10, oaVar);
                    adSlot2 = adSlot3;
                } else {
                    oibVar2 = oibVar;
                    z10 = z2;
                }
            } else {
                oibVar2 = oibVar;
                z10 = z2;
                AdSlot adSlot32 = adSlot2;
                uef(uefVar, gzwVar, oibVar2, adSlot32, z10, oaVar);
                adSlot2 = adSlot32;
            }
            if (uefVar.cz() && gzwVar.wxf() != 43) {
                return;
            }
            i5++;
            oibVar = oibVar2;
            z2 = z10;
        }
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        rt rtVarDj = uefVar.dj();
        int iAb = uefVar.cz() ? 10 : 1;
        if (rtVarDj != null) {
            iAb = rtVarDj.ab();
        }
        for (final int i5 = 0; i5 < uefVar.lw().size() && i5 < iAb; i5++) {
            com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(uefVar.lw().get(i5), new uef.InterfaceC0107uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.4
                @Override // com.bytedance.sdk.openadsdk.core.wk.yo.uef.InterfaceC0107uef
                public void uef(boolean z2) {
                    com.bytedance.sdk.component.utils.dhk.uef("ScreenVideoLoadM", "onCachedResponse: i=" + i5 + ", isSuccess=" + z2);
                }
            });
        }
    }

    private void uef(final com.bytedance.sdk.openadsdk.core.model.uef uefVar, gzw gzwVar, oib oibVar, final AdSlot adSlot, final boolean z2, oa oaVar) {
        final oib oibVar2;
        final oa oaVar2;
        if (z2 && !cp.yo(gzwVar) && gzw.lw(gzwVar) && com.bytedance.sdk.openadsdk.core.sy.moa().ue(adSlot.getCodeId()).moa == 1 && !com.bytedance.sdk.component.utils.sy.moa(this.f25369oa)) {
            uef(new yo(gzwVar, adSlot, uefVar));
            return;
        }
        boolean z10 = false;
        boolean z11 = oaVar != null && com.bytedance.sdk.openadsdk.core.sy.moa().pz() == 1;
        if (cp.yo(gzwVar)) {
            oibVar2 = oibVar;
            oaVar2 = oaVar;
            if (z2) {
                lw.uef(this.f25369oa).uef(adSlot, uefVar);
            }
        } else if (gzw.lw(gzwVar)) {
            if (gzwVar.nj() != null) {
                com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(gzwVar.wg()).uef(), gzwVar);
                oaVarUef.uef("material_meta", gzwVar);
                oaVarUef.uef("ad_slot", adSlot);
                oibVar2 = oibVar;
                oaVar2 = oaVar;
                com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.ivm.5
                    @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                    public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
                        oibVar2.oa();
                        if (z2) {
                            lw.uef(ivm.this.f25369oa).uef(adSlot, uefVar);
                        } else {
                            if (oaVar2 == null || com.bytedance.sdk.openadsdk.core.sy.moa().pz() != 1) {
                                return;
                            }
                            oaVar2.onAdLoaded(oibVar2.uef());
                        }
                    }

                    @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                    public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
                        if (oaVar2 == null || com.bytedance.sdk.openadsdk.core.sy.moa().pz() != 1) {
                            return;
                        }
                        oaVar2.onError(i5, str);
                    }
                });
            } else {
                oibVar2 = oibVar;
                oaVar2 = oaVar;
                z10 = z11;
            }
            z11 = z10;
        } else {
            oibVar2 = oibVar;
            oaVar2 = oaVar;
            if (z2) {
                lw.uef(this.f25369oa).uef(adSlot, uefVar);
            }
        }
        if (z11) {
            oaVar2.onAdLoaded(oibVar2.uef());
        }
    }

    private void uef(yo yoVar) {
        if (yoVar == null) {
            return;
        }
        if (this.moa.size() > 0) {
            this.moa.remove(0);
        }
        this.moa.add(yoVar);
    }

    public void uef(String str, gzw gzwVar) {
        lw.uef(this.f25369oa).uef(str, gzwVar);
    }
}
