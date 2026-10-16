package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class bcc extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    private final com.bytedance.sdk.openadsdk.component.reward.uef.oa uef;

    public bcc(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        super(oaVar.af);
        this.uef = oaVar;
        if (oaVar.sw != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutXs;
        oaVar.uef(this);
        if (this.uef.uef != 1 && (rFEndCardBackUpLayoutXs = oaVar.xs()) != null) {
            addView(rFEndCardBackUpLayoutXs, new FrameLayout.LayoutParams(-1, -1));
        }
        uef(oaVar.bcc(), this);
        uef(oaVar.cz(), this);
    }

    private void uef(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
