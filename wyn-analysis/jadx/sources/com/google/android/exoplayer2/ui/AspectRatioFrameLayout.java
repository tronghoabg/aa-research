package com.google.android.exoplayer2.ui;

import A7.Y0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import s6.AbstractC4018e;
import s6.InterfaceC4014a;

/* loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26263d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y0 f26264a;

    /* renamed from: b, reason: collision with root package name */
    public float f26265b;

    /* renamed from: c, reason: collision with root package name */
    public int f26266c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26266c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC4018e.f45172a, 0, 0);
            try {
                this.f26266c = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f26264a = new Y0(this);
    }

    public int getResizeMode() {
        return this.f26266c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        float f10;
        float f11;
        super.onMeasure(i5, i10);
        if (this.f26265b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f26265b / (f12 / f13)) - 1.0f;
        float fAbs = Math.abs(f14);
        Y0 y02 = this.f26264a;
        if (fAbs <= 0.01f) {
            if (y02.f758b) {
                return;
            }
            y02.f758b = true;
            ((AspectRatioFrameLayout) y02.f759c).post(y02);
            return;
        }
        int i11 = this.f26266c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f10 = this.f26265b;
                } else if (i11 == 4) {
                    if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f10 = this.f26265b;
                    } else {
                        f11 = this.f26265b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f26265b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f11 = this.f26265b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f26265b;
            measuredWidth = (int) (f13 * f10);
        }
        if (!y02.f758b) {
            y02.f758b = true;
            ((AspectRatioFrameLayout) y02.f759c).post(y02);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f26265b != f10) {
            this.f26265b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i5) {
        if (this.f26266c != i5) {
            this.f26266c = i5;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC4014a interfaceC4014a) {
    }
}
