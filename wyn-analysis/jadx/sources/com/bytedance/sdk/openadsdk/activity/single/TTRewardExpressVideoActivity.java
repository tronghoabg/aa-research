package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import java.util.Map;

/* loaded from: classes3.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout dxx() {
        return this.f25164oa.gsd.oa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> gb() {
        return this.f25164oa.cz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean gr() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void sy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean ue() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void uef(long j8, long j10) throws NumberFormatException {
        int iHo = this.f25164oa.f25412oa.ho();
        boolean z2 = this.f25164oa.gsd.cz() && iHo >= 0;
        int i5 = (int) (j8 / 1000);
        yo(j8, j10);
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.f25164oa.gsd;
        if (czVar != null && czVar.uef() != null) {
            this.f25164oa.gsd.uef().setTime(String.valueOf(this.lw), i5, 0, false);
            this.f25164oa.gsd.uef().uef(j8, j10);
        }
        int i10 = this.lw;
        if (i10 > 0) {
            if (!z2) {
                this.f25164oa.dxx.uef(String.valueOf(i10), null);
                return;
            }
            if (i5 < iHo) {
                this.f25164oa.dxx.uef(String.valueOf(i10), null);
                return;
            }
            if (this.f25164oa.f25412oa.wxf() == 5 || this.f25164oa.f25412oa.wxf() == 33) {
                this.f25164oa.dxx.uef(String.valueOf(this.lw), null);
                return;
            }
            this.f25164oa.uef(true);
            this.f25164oa.dxx.uef(String.valueOf(this.lw), TTAdDislikeToast.getSkipText());
            this.f25164oa.dxx.lw(true);
        }
    }
}
