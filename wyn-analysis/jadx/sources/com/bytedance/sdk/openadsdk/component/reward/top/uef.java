package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public interface uef<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i5);

    void setListener(oa oaVar);

    void setShowDislike(boolean z2);

    void setShowEndCardNextAd(boolean z2, gzw gzwVar);

    void setShowPlayableNextAd(boolean z2, gzw gzwVar);

    void setShowSkip(boolean z2);

    void setShowSound(boolean z2);

    void setSkipEnable(boolean z2);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z2);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
