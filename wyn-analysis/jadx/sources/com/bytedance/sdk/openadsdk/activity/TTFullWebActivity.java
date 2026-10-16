package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.ivm.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.ivm.oa;

/* loaded from: classes3.dex */
public class TTFullWebActivity extends TTUnifyWebActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.moa != null) {
            oa.uef().uef("videoForceBreak", this.lw);
        }
        com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.ab();
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public void oa() {
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public boolean uef() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public com.bytedance.sdk.openadsdk.component.reward.yo.oa uef(Activity activity, Context context, gzw gzwVar, String str, yo yoVar, String str2) {
        return new com.bytedance.sdk.openadsdk.component.reward.yo.yo(activity, context, gzwVar, str, yoVar, str2);
    }
}
