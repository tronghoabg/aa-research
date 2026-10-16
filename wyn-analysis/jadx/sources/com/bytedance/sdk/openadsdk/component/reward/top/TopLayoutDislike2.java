package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.ivm.bcc;
import com.bytedance.sdk.openadsdk.core.ivm.lw;
import com.bytedance.sdk.openadsdk.core.ivm.moa;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.rt;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.ivm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dj;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class TopLayoutDislike2 extends lw implements uef<TopLayoutDislike2> {
    lw container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private moa mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private lw mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private oa mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        moa moaVar = new moa(getContext());
        int iOa = af.oa(getContext(), 5.0f);
        moaVar.setPadding(iOa, iOa, iOa, iOa);
        moaVar.setScaleType(ImageView.ScaleType.CENTER);
        moaVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
        return moaVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.oa(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(TopLayoutDislike2.this.mSkipIV != null ? TopLayoutDislike2.this.mIsSoundMute ? orq.yo(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : orq.yo(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute") : TopLayoutDislike2.this.mIsSoundMute ? dj.uef(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : dj.uef(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper"));
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.uef(view2, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.uef(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.uef(view2);
                        }
                    }
                });
            }
        }
        moa moaVar = this.mCloseBtn;
        if (moaVar != null) {
            moaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.yo(view2);
                    }
                }
            });
        }
        lw lwVar = this.mPlayableNextAd;
        if (lwVar != null) {
            lwVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.moa(view2);
                    }
                }
            });
        }
    }

    private void initProgressBar(gzw gzwVar) {
        rt rtVarDj;
        rt.oa oaVarBs;
        if (gzwVar == null || gzwVar.moa() == null || gzwVar.moa().dj() == null || (rtVarDj = gzwVar.moa().dj()) == null || rtVarDj.bs() == null || (oaVarBs = rtVarDj.bs()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(oaVarBs.oa())) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.xs.uef.uef(oaVarBs.oa());
        }
        if (!TextUtils.isEmpty(oaVarBs.yo())) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.xs.uef.uef(oaVarBs.yo());
        }
        if (oaVarBs.moa() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.mProgressSize = af.oa(getContext(), 1.0f);
        } else {
            this.mProgressSize = af.oa(getContext(), oaVarBs.moa());
        }
        if (oaVarBs.lw() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.mProgressRadiusSize = af.oa(getContext(), oaVarBs.lw());
        }
        this.mProgressType = oaVarBs.uef();
    }

    private void initView(gzw gzwVar) {
        lw lwVar = new lw(getContext());
        this.container = lwVar;
        lwVar.setOrientation(0);
        int iOa = af.oa(getContext(), 16.0f);
        int iOa2 = af.oa(getContext(), 12.0f);
        int iOa3 = af.oa(getContext(), 24.0f);
        int iOa4 = af.oa(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOa4, iOa4);
        layoutParams.topMargin = iOa3;
        layoutParams.leftMargin = iOa;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iOa4, iOa4);
        layoutParams2.leftMargin = iOa2;
        layoutParams2.topMargin = iOa3;
        this.mImgSound.setId(bs.xvd);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        bcc bccVar = new bcc(getContext());
        this.mTextViewCountDown = bccVar;
        bccVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.oa());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, af.oa(getContext(), 28.0f));
        layoutParams4.topMargin = iOa3;
        layoutParams4.rightMargin = iOa;
        this.mTextViewCountDown.setPadding(iOa2, 0, iOa2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        lw lwVar2 = new lw(getContext());
        this.mPlayableNextAd = lwVar2;
        lwVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iOa4);
        layoutParams5.topMargin = iOa3;
        if (gzwVar == null || !gzwVar.nl()) {
            layoutParams5.rightMargin = iOa;
        } else {
            layoutParams5.rightMargin = af.oa(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.oa());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new bcc(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, af.oa(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iOa2, 0, 0, 0);
        String strOrq = cp.orq(gzwVar);
        if (TextUtils.isEmpty(strOrq)) {
            this.mNextAdTextTv.setText(orq.oa(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strOrq);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        moa moaVar = new moa(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iOa2, iOa2);
        layoutParams7.rightMargin = iOa2;
        moaVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        moaVar.setLayoutParams(layoutParams7);
        moaVar.setImageResource(orq.moa(sy.uef(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(moaVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iOa4, iOa4);
        layoutParams8.topMargin = iOa3;
        layoutParams8.rightMargin = iOa;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        moa moaVarOa = ivm.oa(getContext());
        this.mCloseBtn = moaVarOa;
        moaVarOa.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = iOa3;
        layoutParams9.rightMargin = iOa3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(orq.uef(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(af.oa(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(iOa4, iOa4);
            layoutParams10.topMargin = iOa3;
            layoutParams10.rightMargin = iOa;
            this.mProgressRing.setLayoutParams(layoutParams10);
            this.mProgressRing.uef("ring").uef(this.mProgressSize).uef(this.mProgressColor).oa(this.mProgressBgColor).oa(this.mProgressRadiusSize);
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(getContext());
        yoVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef uefVar = this.mProgressRing;
        if (uefVar != null) {
            yoVar.addView(uefVar);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.mProgressBar.uef("line").uef(this.mProgressSize).uef(this.mProgressColor).oa(this.mProgressBgColor).oa(this.mProgressRadiusSize);
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            yoVar.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(yoVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef uefVar2 = this.mProgressBar;
        if (uefVar2 != null) {
            addView(uefVar2);
        }
        addView(this.container);
    }

    private void updateTime(boolean z2) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z2) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setCountDownFor1InN(CharSequence charSequence, int i5) {
        int i10 = this.mProgressType;
        if (i10 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            if (i5 < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i5);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            if (i5 < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i5);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setListener(oa oaVar) {
        this.mTopListener = oaVar;
    }

    public void setShouldShowSkipTime(boolean z2) {
        this.shouldShowSkipTime = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowDislike(boolean z2) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z2 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowEndCardNextAd(boolean z2, gzw gzwVar) {
        lw lwVar = this.mPlayableNextAd;
        if (lwVar != null) {
            lwVar.setVisibility(z2 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z2 || gzwVar == null || gzwVar.hzk() == null) {
                return;
            }
            String strYo = gzwVar.hzk().yo();
            if (TextUtils.isEmpty(strYo)) {
                return;
            }
            this.mNextAdTextTv.setText(strYo);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowPlayableNextAd(boolean z2, gzw gzwVar) {
        lw lwVar = this.mPlayableNextAd;
        if (lwVar != null) {
            lwVar.setVisibility(z2 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z2) {
                return;
            }
            String strOrq = cp.orq(gzwVar);
            if (TextUtils.isEmpty(strOrq)) {
                this.mNextAdTextTv.setText(orq.oa(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strOrq);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowSkip(boolean z2) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z2) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z2;
        this.mSkipIV.setVisibility((z2 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z2 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setShowSound(boolean z2) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSkipEnable(boolean z2) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z2);
            this.mSkipIV.setClickable(z2);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z2);
            this.mTextViewCountDown.setClickable(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setSoundMute(boolean z2) {
        this.mIsSoundMute = z2;
        this.mImgSound.setImageDrawable(this.mSkipIV != null ? z2 ? orq.yo(getContext(), "tt_reward_full_mute") : orq.yo(getContext(), "tt_reward_full_unmute") : z2 ? dj.uef(getContext(), "tt_mute_wrapper") : dj.uef(getContext(), "tt_unmute_wrapper"));
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i5 = this.skipTime;
            int i10 = i5 == 0 ? Integer.parseInt(str) : i5 - (this.videoDuration - Integer.parseInt(str));
            if (i10 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i10 + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef uefVar = this.mProgressRing;
        if (uefVar != null) {
            uefVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef uefVar2 = this.mProgressBar;
        if (uefVar2 != null) {
            uefVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.uef
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef uefVar = this.mProgressRing;
        if (uefVar != null) {
            uefVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.cq.oa.moa.uef uefVar2 = this.mProgressBar;
        if (uefVar2 != null) {
            uefVar2.setVisibility(8);
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2 load(com.bytedance.sdk.openadsdk.core.model.gzw r7) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.load(com.bytedance.sdk.openadsdk.core.model.gzw):com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2");
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.xs.uef.uef("#FFD813");
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.xs.uef.uef("rgba(0, 0, 0, 0.5)");
        setOrientation(1);
    }
}
