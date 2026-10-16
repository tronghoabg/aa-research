package com.bytedance.sdk.openadsdk.core.cq.oa;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class lw extends com.bytedance.adsdk.ugeno.oa.yo<FrameLayout> {
    public lw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public FrameLayout uef() {
        FrameLayout frameLayout = new FrameLayout(this.f24755oa);
        com.bytedance.sdk.openadsdk.core.model.oa oaVar = new com.bytedance.sdk.openadsdk.core.model.oa();
        oaVar.uef(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.f24755oa);
        pAGLogoView.initData(oaVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }
}
