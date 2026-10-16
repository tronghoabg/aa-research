package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.bs;

/* loaded from: classes3.dex */
public class yo extends View implements uef<yo> {
    private uef<yo> uef;

    public yo(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void clickSkip() {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void clickSound(String str) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.clickSound(str);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public View getCloseButton() {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.uef;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setCountDownFor1InN(CharSequence charSequence, int i5) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setCountDownFor1InN(charSequence, i5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setListener(oa oaVar) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setListener(oaVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowDislike(boolean z2) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setShowDislike(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowEndCardNextAd(boolean z2, gzw gzwVar) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setShowEndCardNextAd(z2, gzwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowPlayableNextAd(boolean z2, gzw gzwVar) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setShowPlayableNextAd(z2, gzwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowSkip(boolean z2) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setShowSkip(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowSound(boolean z2) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setShowSound(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSkipEnable(boolean z2) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setSkipEnable(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSkipInvisiable() {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSkipText(CharSequence charSequence) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSoundMute(boolean z2) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setSoundMute(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void showCloseButton() {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void showCountDownText() {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void showSkipButton() {
        uef<yo> uefVar = this.uef;
        if (uefVar != null) {
            uefVar.showSkipButton();
        }
    }

    public yo uef(gzw gzwVar) {
        if (this.uef == null) {
            TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(gzwVar);
            this.uef = topLayoutDislike2Load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                uef(topLayoutDislike2Load, (ViewGroup) parent);
            }
        }
        return this;
    }

    public yo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public yo(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void uef(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(bs.qr);
        }
    }
}
