package com.bytedance.sdk.openadsdk.uef;

import android.text.TextUtils;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.bcc.oa.yo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.dj.oa;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.sy.moa;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import java.util.Map;

/* loaded from: classes3.dex */
public class uef {
    public static boolean uef(PAGLoadListener pAGLoadListener) {
        if (xs.uef()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void uef(final yo yoVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.uef.1
            @Override // java.lang.Runnable
            public void run() {
                if (!wk.lw()) {
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!oa.uef().dj() || !zjm.oa().dj()) {
                    com.bytedance.sdk.openadsdk.sy.yo.uef(new moa() { // from class: com.bytedance.sdk.openadsdk.uef.uef.1.1
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("load_ad");
                            uefVarF.yo(adSlot.getCodeId());
                            uefVarF.moa(gb.yo(adSlot.getDurationSlotType()));
                            uefVarF.uef(BuildConfig.VERSION_NAME);
                            uefVarF.xs(gb.uef(adSlot).toString());
                            return uefVarF;
                        }
                    });
                    km.yo(yoVar);
                } else {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, cz.uef(10004));
                    }
                }
            }
        };
        if (wk.lw()) {
            runnable.run();
        } else {
            wk.oa().post(runnable);
        }
    }

    public static void uef(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!wk.lw() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey("creative_id") && extraInfo.get("creative_id") != null) {
            builder.setCreativeId(extraInfo.get("creative_id").toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean uef(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
