package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.activity.TTFullWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.cq;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.util.Map;

/* loaded from: classes3.dex */
class bcc extends PAGInterstitialAd {
    private final cq moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.uef.yo.oa f25352oa;
    private final com.bytedance.sdk.openadsdk.core.model.uef uef;
    private final String yo = ue.uef();

    public bcc(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.uef = uefVar;
        this.moa = new cq(context, uefVar, "fullscreen_interstitial_ad", new cq.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.bcc.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public Intent uef(Context context2, gzw gzwVar, Activity activity) {
                return com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(gzwVar) ? new Intent(context2, (Class<?>) TTFullWebActivity.class) : gzwVar.gem() ? new Intent(context2, (Class<?>) TTAdActivity.class) : gzwVar.ivm() ? new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public void uef(Intent intent, Activity activity, gzw gzwVar, boolean z2) {
                com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(intent, activity, bcc.this.moa.yo(), bcc.this.uef, bcc.this.yo);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public void uef(boolean z2) {
                if (bcc.this.f25352oa == null) {
                    return;
                }
                if (z2) {
                    cp.uef().uef(bcc.this.yo, (String) bcc.this.f25352oa);
                } else {
                    cp.uef().uef(bcc.this.f25352oa);
                }
                bcc.this.f25352oa = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public void uef(gzw gzwVar) {
                oa.uef(gzwVar, bcc.this.moa.yo(), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.moa.uef(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.moa.oa();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d3, String str, String str2) {
        this.moa.uef(d3, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.f25352oa = new com.bytedance.sdk.openadsdk.component.yo.uef(pAGInterstitialAdInteractionCallback, this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.f25352oa = new com.bytedance.sdk.openadsdk.component.yo.uef(pAGInterstitialAdInteractionListener, this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.moa.uef(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d3) {
        this.moa.uef(d3);
    }

    public void uef() {
        this.moa.uef();
    }
}
