package com.bytedance.sdk.openadsdk.component.oa;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.xs;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.model.ue;
import com.bytedance.sdk.openadsdk.core.model.yo;
import com.bytedance.sdk.openadsdk.core.orq;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk.uef.oa;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.pu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class uef {
    private static volatile uef uef;

    /* renamed from: oa, reason: collision with root package name */
    private final gzw f25349oa = sy.yo();

    private uef() {
    }

    public static uef uef() {
        if (uef == null) {
            synchronized (uef.class) {
                try {
                    if (uef == null) {
                        uef = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public void uef(final Context context, final AdSlot adSlot, final xs xsVar) {
        final pu puVarOa = pu.oa();
        this.f25349oa.uef(adSlot, new ue(), 5, new orq() { // from class: com.bytedance.sdk.openadsdk.component.oa.uef.1
            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
                xsVar.onError(i5, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, yo yoVar) {
                uef.this.uef(uefVar, yoVar, context, adSlot, xsVar, puVarOa);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, yo yoVar, Context context, AdSlot adSlot, xs xsVar, pu puVar) {
        if (uefVar.lw() != null && !uefVar.lw().isEmpty()) {
            List<com.bytedance.sdk.openadsdk.core.model.gzw> listLw = uefVar.lw();
            ArrayList arrayList = new ArrayList(listLw.size());
            for (com.bytedance.sdk.openadsdk.core.model.gzw gzwVar : listLw) {
                if (com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar) || (gzwVar != null && gzwVar.ln())) {
                    PAGNativeAd pAGNativeAdUef = uef(context, gzwVar, adSlot);
                    if (xsVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(pAGNativeAdUef);
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar) && gzwVar.nj() != null && gzwVar.nj().dj() != null) {
                    if (sy.moa().lw(String.valueOf(gzwVar.jnk())) && sy.moa().hg()) {
                        if (gzwVar.nj() != null) {
                            gzwVar.nj().ivm(1);
                        }
                        if (gzwVar.hq() != null) {
                            gzwVar.hq().ivm(1);
                        }
                        oa oaVarUef = com.bytedance.sdk.openadsdk.core.model.gzw.uef(CacheDirFactory.getICacheDir(gzwVar.wg()).yo(), gzwVar);
                        oaVarUef.uef("material_meta", gzwVar);
                        oaVarUef.uef("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, null);
                    }
                    IPBroadcastReceiver.oa(context, gzwVar);
                }
            }
            boolean z2 = xsVar instanceof PAGNativeAdLoadListener;
            if (z2 && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    moa.uef(listLw.get(0), puVar.moa());
                }
                if (z2) {
                    ((PAGNativeAdLoadListener) xsVar).onAdLoaded(arrayList.get(0));
                }
                if (yoVar.lw() == null || yoVar.lw().isEmpty()) {
                    return;
                }
                yoVar.yo(4);
                yo.uef(yoVar);
                return;
            }
            xsVar.onError(-4, cz.uef(-4));
            yoVar.uef(-4);
            yoVar.yo(4);
            yo.uef(yoVar);
            return;
        }
        xsVar.onError(-3, cz.uef(-3));
        yoVar.uef(-3);
        yoVar.yo(4);
        yo.uef(yoVar);
    }

    private PAGNativeAd uef(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot) {
        if (gzwVar.ggp() != 2) {
            return new com.bytedance.sdk.openadsdk.uef.oa.oa(context, gzwVar, 5, adSlot);
        }
        if (gzwVar.nj() != null) {
            return new com.bytedance.sdk.openadsdk.uef.oa.uef.oa(context, gzwVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.uef.oa.uef.yo(context, gzwVar, adSlot);
    }
}
