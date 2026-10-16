package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.xs.moa;
import com.bytedance.sdk.component.bcc.oa.yo;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.bcc.uef;
import com.bytedance.sdk.openadsdk.common.ivm;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.dxx;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.km;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    public interface PAGInitCallback {
        void fail(int i5, String str);

        void success();
    }

    static {
        uef.uef();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && wk.moa() == 0) {
            uef.uef.add(pAGInitCallback);
        }
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.oib.uef.uef();
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (ivm.uef()) {
            biddingTokenCallback.onBiddingTokenCollected("");
        } else {
            km.moa(new yo("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    sy.oa(context);
                    uef.uef(pAGBiddingRequest, new PAGBidCallback() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2.1
                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenCollected(String str) {
                            biddingTokenCallback.onBiddingTokenCollected(str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
                            biddingTokenCallback.onBiddingTokenCollected("");
                        }
                    });
                    com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(false);
                }
            });
        }
    }

    public static String getSDKVersion() {
        return dxx.uef() != null ? dxx.uef().yo() : "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                uef.uef(context, pAGConfig, pAGInitCallback);
            }
        });
        wk.xs();
    }

    public static boolean isInitSuccess() {
        return wk.moa() == 1;
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        orq.uef(str);
        moa.uef(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && sy.moa().sy() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.ab.moa.uef().uef(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z2) {
        ivm.uef(z2);
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (ivm.uef()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, cz.uef(10009)));
        } else {
            km.moa(new yo("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public void run() {
                    sy.oa(context);
                    uef.uef(pAGBiddingRequest, pAGBidCallback);
                    com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(false);
                }
            });
        }
    }
}
