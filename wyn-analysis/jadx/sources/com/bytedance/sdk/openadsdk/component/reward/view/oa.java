package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class oa extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    private com.bytedance.sdk.openadsdk.activity.single.bcc ivm;
    private float lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f25448oa;
    private final boolean uef;
    private boolean xs;
    private com.bytedance.sdk.openadsdk.core.ivm.yo yo;

    public oa(Context context, boolean z2, boolean z10, final int i5) {
        super(context);
        this.uef = z2;
        this.f25448oa = z10;
        if (z2) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oa.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i5);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.yo = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.yo, layoutParams);
        this.yo.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.oa.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i5);
            }
        });
        this.yo.setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd;
        super.onAttachedToWindow();
        if (this.xs || (bccVar = this.ivm) == null || (oaVarGsd = bccVar.gsd()) == null) {
            return;
        }
        oaVarGsd.gr.oa(true);
        this.xs = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd;
        super.onDetachedFromWindow();
        if (!this.xs || (bccVar = this.ivm) == null || (oaVarGsd = bccVar.gsd()) == null) {
            return;
        }
        oaVarGsd.gr.oa(false);
        this.xs = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ivm.yo, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.f25448oa) {
            float f10 = this.moa;
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int iMax = Math.max(0, (size - ((int) (size2 * f10))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f11 = this.lw;
                if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f11))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.uef) {
            float f12 = this.moa;
            if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i10 = View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824);
            } else {
                float f13 = this.lw;
                if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f13), 1073741824);
                }
            }
        } else {
            float f14 = this.moa;
            if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f14))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f15 = this.lw;
                if (f15 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f15))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i5, i10);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd;
        super.onWindowFocusChanged(z2);
        if (this.xs == z2 || (bccVar = this.ivm) == null || (oaVarGsd = bccVar.gsd()) == null) {
            return;
        }
        oaVarGsd.gr.oa(z2);
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.single.bcc bccVar) {
        this.ivm = bccVar;
    }

    public void setWidthAndHeightRatio(float f10) {
        this.moa = f10;
    }

    public void setWidthOrHeightInParentRatio(float f10) {
        this.lw = f10;
    }

    public void uef(bcc bccVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = this.yo;
        if (yoVar != null) {
            yoVar.addView(bccVar, layoutParams);
        } else {
            addView(bccVar, layoutParams);
        }
    }

    public void uef() {
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = this.yo;
        if (yoVar != null) {
            yoVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
