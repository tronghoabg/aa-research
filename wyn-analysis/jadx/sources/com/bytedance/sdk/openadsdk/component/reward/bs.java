package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
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
public class bs {
    private static volatile bs uef;
    private com.bytedance.sdk.component.bcc.oa.yo lw;

    /* renamed from: oa, reason: collision with root package name */
    private final Context f25353oa;
    private final AtomicBoolean yo = new AtomicBoolean(false);
    private final List<oa> moa = DesugarCollections.synchronizedList(new ArrayList());
    private final gr.uef ivm = new gr.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.6
        @Override // com.bytedance.sdk.component.utils.gr.uef
        public void uef(Context context, Intent intent, boolean z2, int i5) {
            if (z2) {
                if (bs.this.lw == null) {
                    bs bsVar = bs.this;
                    bsVar.lw = new com.bytedance.sdk.openadsdk.component.reward.yo("net connect task", bsVar.moa);
                }
                com.bytedance.sdk.component.utils.cz.uef().post(bs.this.lw);
            }
        }
    };

    public static class oa extends com.bytedance.sdk.component.bcc.oa.yo {

        /* renamed from: oa, reason: collision with root package name */
        final AdSlot f25359oa;
        final gzw uef;
        final com.bytedance.sdk.openadsdk.core.model.uef yo;

        public oa(gzw gzwVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
            super("Reward Task");
            this.uef = gzwVar;
            this.f25359oa = adSlot;
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
            oaVarUef.uef("ad_slot", this.f25359oa);
            com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.oa.1
                @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
                }

                @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
                    ab abVarUef = ab.uef(com.bytedance.sdk.openadsdk.core.sy.uef());
                    oa oaVar = oa.this;
                    abVarUef.uef(oaVar.f25359oa, oaVar.yo);
                }
            });
        }
    }

    public static class uef implements PAGRewardedAdLoadListener {
        private final boolean lw;
        private final PAGRewardedAdLoadListener moa;

        /* renamed from: oa, reason: collision with root package name */
        private final AdSlot f25360oa;
        private final Context uef;
        private final com.bytedance.sdk.openadsdk.core.model.uef yo;

        public uef(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z2) {
            this.uef = context;
            this.f25360oa = adSlot;
            this.yo = uefVar;
            this.moa = pAGRewardedAdLoadListener;
            this.lw = z2;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
        public void onError(int i5, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.moa;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i5, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            bs.uef(this.uef).uef(this.f25360oa, this.yo, this.moa, pAGRewardedAd, this.lw);
        }
    }

    public static class yo implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.uef moa;

        /* renamed from: oa, reason: collision with root package name */
        private final AtomicBoolean f25361oa;
        private final PAGRewardedAdLoadListener uef;
        private final AtomicInteger yo;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
        public void onError(int i5, String str) {
            if (this.yo.decrementAndGet() > 0 || this.uef == null || !this.f25361oa.compareAndSet(false, true)) {
                return;
            }
            this.uef.onError(i5, str);
            com.bytedance.sdk.openadsdk.ab.moa.uef("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.yo.1
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", yo.this.moa.yo());
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("choose_ad_load_error").oa(jSONObject.toString());
                }
            });
        }

        private yo(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
            this.f25361oa = new AtomicBoolean(false);
            this.uef = pAGRewardedAdLoadListener;
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
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.yo.decrementAndGet();
            if (this.uef == null || !this.f25361oa.compareAndSet(false, true)) {
                return;
            }
            this.uef.onAdLoaded(pAGRewardedAd);
        }
    }

    private bs(Context context) {
        this.f25353oa = context == null ? com.bytedance.sdk.openadsdk.core.sy.uef() : context.getApplicationContext();
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
        ueVar.f25711oa = 2;
        if (com.bytedance.sdk.openadsdk.core.sy.moa().cq(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            ueVar.cz = 2;
        }
        com.bytedance.sdk.openadsdk.core.sy.yo().uef(adSlot, ueVar, 7, new orq() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.1
            boolean uef = false;

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public String uef() {
                return ab.uef(bs.this.f25353oa).uef(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                boolean zUef = ab.uef(bs.this.f25353oa).uef(uefVar);
                this.uef = zUef;
                return zUef;
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                if (this.uef || uefVar.lw() == null || uefVar.lw().isEmpty()) {
                    return;
                }
                bs.this.uef(uefVar, new dhk(bs.this.f25353oa, uefVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(AdSlot adSlot) {
        ab.uef(this.f25353oa).uef(adSlot.getCodeId());
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

    public static bs uef(Context context) {
        if (uef == null) {
            synchronized (bs.class) {
                try {
                    if (uef == null) {
                        uef = new bs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    private void oa(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.wk.yo()) {
            com.bykv.vk.openvk.uef.uef.uef.xs.oa.uef(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ue ueVar = new ue();
        ueVar.f25711oa = 1;
        if (com.bytedance.sdk.openadsdk.core.sy.moa().cq(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            ueVar.cz = 2;
        }
        com.bytedance.sdk.openadsdk.core.sy.yo().uef(adSlot, ueVar, 7, new orq() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.2
            boolean uef = false;

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i5, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                com.bytedance.sdk.openadsdk.core.model.uef uefVar2;
                if (uefVar.lw() != null && !uefVar.lw().isEmpty()) {
                    dhk dhkVar = new dhk(bs.this.f25353oa, uefVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.orq.uef.moa.uef().uef(uefVar.lw().isEmpty() ? null : uefVar.lw().get(0));
                        com.bytedance.sdk.openadsdk.ab.moa.uef(uefVar.xs(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || com.bytedance.sdk.openadsdk.core.sy.moa().pz() != 0) {
                        uefVar2 = uefVar;
                    } else {
                        bs.this.uef(adSlot, uefVar, pAGRewardedAdLoadListener, dhkVar.uef(), this.uef);
                        uefVar2 = uefVar;
                    }
                    bs.this.uef(uefVar2, dhkVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.cz.uef(-3));
                    yoVar.uef(-3);
                    yoVar.yo(6);
                    com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public String uef() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strUef = ab.uef(bs.this.f25353oa).uef(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strUef)) {
                    return null;
                }
                return strUef;
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                boolean zUef = ab.uef(bs.this.f25353oa).uef(uefVar);
                this.uef = zUef;
                return zUef;
            }
        });
    }

    public void uef(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        oa(adSlot);
    }

    public void uef(String str, gzw gzwVar) {
        ab.uef(this.f25353oa).uef(str, gzwVar);
    }

    public void uef() {
        try {
            ab.uef(this.f25353oa).uef();
        } catch (Throwable unused) {
        }
    }

    public void uef(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        oa(adSlot, pAGRewardedAdLoadListener);
    }

    private void oa() {
        if (this.yo.get()) {
            return;
        }
        this.yo.set(true);
        gr.uef(this.ivm, this.f25353oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, dhk dhkVar, AdSlot adSlot, boolean z2, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        dhk dhkVar2;
        boolean z10;
        if (!z2) {
            com.bytedance.sdk.openadsdk.dz.uef.uef().uef(uefVar.xs());
        }
        AdSlot adSlot2 = adSlot;
        yo yoVar = new yo(new uef(this.f25353oa, adSlot2, uefVar, pAGRewardedAdLoadListener, false), uefVar);
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
                    dhkVar2 = dhkVar;
                    z10 = z2;
                    AdSlot adSlot3 = adSlot2;
                    uef(uefVar, gzwVar, dhkVar2, adSlot3, z10, yoVar);
                    adSlot2 = adSlot3;
                } else {
                    dhkVar2 = dhkVar;
                    z10 = z2;
                }
            } else {
                dhkVar2 = dhkVar;
                z10 = z2;
                AdSlot adSlot32 = adSlot2;
                uef(uefVar, gzwVar, dhkVar2, adSlot32, z10, yoVar);
                adSlot2 = adSlot32;
            }
            if (uefVar.cz() && iWxf != 43) {
                return;
            }
            i5++;
            dhkVar = dhkVar2;
            z2 = z10;
        }
    }

    private void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        rt rtVarDj = uefVar.dj();
        int iAb = uefVar.cz() ? 10 : 1;
        if (rtVarDj != null) {
            iAb = rtVarDj.ab();
        }
        for (final int i5 = 0; i5 < uefVar.lw().size(); i5++) {
            gzw gzwVar = uefVar.lw().get(i5);
            if (i5 >= iAb) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(gzwVar, new uef.InterfaceC0107uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.3
                @Override // com.bytedance.sdk.openadsdk.core.wk.yo.uef.InterfaceC0107uef
                public void uef(boolean z2) {
                    com.bytedance.sdk.component.utils.dhk.uef("RewardVideoLoadManager", "onCachedResponse: i=" + i5 + ", isSuccess=" + z2);
                }
            });
        }
    }

    private void uef(final com.bytedance.sdk.openadsdk.core.model.uef uefVar, gzw gzwVar, dhk dhkVar, final AdSlot adSlot, final boolean z2, yo yoVar) {
        final dhk dhkVar2;
        final yo yoVar2;
        if (z2 && !cp.yo(gzwVar) && com.bytedance.sdk.openadsdk.core.sy.moa().ue(adSlot.getCodeId()).moa == 1 && !com.bytedance.sdk.component.utils.sy.moa(this.f25353oa)) {
            uef(new oa(gzwVar, adSlot, uefVar));
            return;
        }
        boolean z10 = false;
        boolean z11 = yoVar != null && com.bytedance.sdk.openadsdk.core.sy.moa().pz() == 1;
        if (cp.yo(gzwVar)) {
            dhkVar2 = dhkVar;
            yoVar2 = yoVar;
            if (z2) {
                ab.uef(this.f25353oa).uef(adSlot, uefVar);
            }
        } else {
            if (gzwVar.nj() != null) {
                com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(gzwVar.wg()).uef(), gzwVar);
                oaVarUef.uef("material_meta", gzwVar);
                oaVarUef.uef("ad_slot", adSlot);
                dhkVar2 = dhkVar;
                yoVar2 = yoVar;
                com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.4
                    @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                    public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar3, int i5) {
                        dhkVar2.oa();
                        if (z2) {
                            ab.uef(bs.this.f25353oa).uef(adSlot, uefVar);
                        } else {
                            if (yoVar2 == null || com.bytedance.sdk.openadsdk.core.sy.moa().pz() != 1) {
                                return;
                            }
                            yoVar2.onAdLoaded(dhkVar2.uef());
                        }
                    }

                    @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                    public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar3, int i5, String str) {
                        if (yoVar2 == null || com.bytedance.sdk.openadsdk.core.sy.moa().pz() != 1) {
                            return;
                        }
                        yoVar2.onError(i5, str);
                    }
                });
            } else {
                dhkVar2 = dhkVar;
                yoVar2 = yoVar;
                z10 = z11;
            }
            z11 = z10;
        }
        if (z11) {
            yoVar2.onAdLoaded(dhkVar2.uef());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.uef uefVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bs.5
            @Override // java.lang.Runnable
            public void run() {
                if (z2) {
                    bs.this.yo(adSlot);
                } else {
                    ab.uef(bs.this.f25353oa).uef(adSlot, uefVar);
                    bs.this.yo(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    private void uef(oa oaVar) {
        if (oaVar == null) {
            return;
        }
        if (this.moa.size() > 0) {
            this.moa.remove(0);
        }
        this.moa.add(oaVar);
    }
}
