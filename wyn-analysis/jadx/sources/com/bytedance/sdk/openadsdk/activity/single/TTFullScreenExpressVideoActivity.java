package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.Map;

/* loaded from: classes3.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout dxx() {
        return this.f25164oa.gsd.oa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> gb() {
        return this.f25164oa.cz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean gr() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void km() throws NumberFormatException {
        if (gzw.lw(this.f25164oa.f25412oa)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.f25164oa.gsd;
        if (czVar == null || czVar.uef() == null) {
            return;
        }
        this.f25164oa.gsd.uef().setTime("0", 0, 0, false);
        if (this.f25164oa.gsd.cz()) {
            this.f25164oa.dxx.uef("0", "X");
            this.f25164oa.dxx.lw(true);
            this.f25164oa.dxx.yo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void uef(long j8, long j10) throws NumberFormatException {
        int i5 = (int) (j8 / 1000);
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.f25164oa.gsd;
        if (czVar != null && czVar.uef() != null) {
            this.f25164oa.gsd.uef().setTime(String.valueOf(this.lw), i5, 0, false);
            this.f25164oa.gsd.uef().uef(j8, j10);
        }
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar2 = this.f25164oa.gsd;
        if ((czVar2 == null || !czVar2.cz()) && !this.f25164oa.f25412oa.ib()) {
            return;
        }
        uef(i5);
        if (this.lw >= 0) {
            this.f25164oa.dxx.moa(true);
            this.f25164oa.dxx.uef(String.valueOf(this.lw), null);
        }
    }
}
