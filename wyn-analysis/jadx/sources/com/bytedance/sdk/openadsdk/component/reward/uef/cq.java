package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class cq {
    private boolean ivm;
    private boolean lw = false;
    private final oa moa;

    /* renamed from: oa, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.moa f25397oa;
    com.bytedance.sdk.openadsdk.component.reward.top.yo uef;
    private final Activity yo;

    public cq(oa oaVar) {
        this.yo = oaVar.pu;
        this.moa = oaVar;
    }

    public void lw(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.setSkipEnable(z2);
    }

    public void moa(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.setShowSkip(z2);
    }

    public void oa(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.setSoundMute(z2);
        }
        com.bytedance.sdk.component.adexpress.dynamic.moa moaVar = this.f25397oa;
        if (moaVar != null) {
            moaVar.setSoundMute(z2);
        }
    }

    public void uef() {
        if (this.lw) {
            return;
        }
        this.lw = true;
        oa oaVar = this.moa;
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = oaVar.ggp;
        if (yoVar != null) {
            this.uef = yoVar;
            this.ivm = true;
        } else {
            this.uef = (com.bytedance.sdk.openadsdk.component.reward.top.yo) oaVar.km.findViewById(com.bytedance.sdk.openadsdk.utils.bs.uz);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar2 = this.uef;
        if (yoVar2 != null) {
            yoVar2.uef(this.moa.f25412oa);
            if (this.moa.f25412oa.ebe()) {
                uef(false);
            } else {
                uef(this.moa.f25412oa.lox());
            }
        }
    }

    public void yo(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.setShowSound(z2);
    }

    public void lw() {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.setSkipInvisiable();
    }

    public void moa() {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.clickSkip();
        }
    }

    public void yo() {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.showSkipButton();
    }

    public void oa() {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.showCountDownText();
    }

    public void uef(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.setShowDislike(z2);
    }

    public void uef(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.setTime(String.valueOf(str), charSequence);
    }

    public void uef(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar;
        if (this.ivm || (yoVar = this.uef) == null) {
            return;
        }
        yoVar.setSkipText(charSequence);
    }

    public void uef(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.clickSound(str);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.top.oa oaVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.uef;
        if (yoVar != null) {
            yoVar.setListener(oaVar);
        }
    }

    public void uef(com.bytedance.sdk.component.adexpress.dynamic.moa moaVar) {
        this.f25397oa = moaVar;
    }

    public void uef(int i5) {
        View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.yo yoVar = this.uef;
        if (yoVar == null || yoVar.getITopLayout() == null || i5 == 0 || (viewFindViewById = this.uef.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i5 - (viewFindViewById.getWidth() + iArr[0]);
        if (width < af.oa(this.yo, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin = (af.oa(this.yo, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin;
            viewFindViewById.requestLayout();
        }
    }
}
