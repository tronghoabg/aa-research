package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.cq;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.util.Map;

/* loaded from: classes3.dex */
class zjm extends PAGRewardedAd {
    private final cq lw;
    private final String moa = ue.uef();

    /* renamed from: oa, reason: collision with root package name */
    private final AdSlot f25476oa;
    private final com.bytedance.sdk.openadsdk.core.model.uef uef;
    private com.bytedance.sdk.openadsdk.uef.lw.uef yo;

    public zjm(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar, AdSlot adSlot) {
        this.uef = uefVar;
        this.f25476oa = adSlot;
        this.lw = new cq(context, uefVar, "rewarded_video", new cq.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.zjm.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public Intent uef(Context context2, gzw gzwVar, Activity activity) {
                return com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(gzwVar) ? new Intent(context2, (Class<?>) TTRewardWebActivity.class) : gzwVar.gem() ? new Intent(context2, (Class<?>) TTAdActivity.class) : gzwVar.ivm() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public void uef(Intent intent, Activity activity, gzw gzwVar, boolean z2) {
                com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(intent, activity, zjm.this.lw.yo(), zjm.this.uef, zjm.this.moa);
                intent.putExtra("media_extra", zjm.this.f25476oa.getMediaExtra());
                intent.putExtra("user_id", zjm.this.f25476oa.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public void uef(boolean z2) {
                if (zjm.this.yo == null) {
                    return;
                }
                if (z2) {
                    cp.uef().uef(zjm.this.moa, (String) zjm.this.yo);
                } else {
                    cp.uef().uef(zjm.this.yo);
                }
                zjm.this.yo = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.cq.uef
            public void uef(gzw gzwVar) {
                oa.uef(gzwVar, zjm.this.lw.yo(), true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.lw.uef(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.lw.oa();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d3, String str, String str2) {
        this.lw.uef(d3, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.yo = new dj(pAGRewardedAdInteractionCallback, this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.yo = new dj(pAGRewardedAdInteractionListener, this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        this.lw.uef(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d3) {
        this.lw.uef(d3);
    }

    public void uef() {
        this.lw.uef();
    }
}
