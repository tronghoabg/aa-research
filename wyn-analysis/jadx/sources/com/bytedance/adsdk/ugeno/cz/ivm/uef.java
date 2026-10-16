package com.bytedance.adsdk.ugeno.cz.ivm;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.moa;
import com.bytedance.adsdk.ugeno.uef.bcc;
import com.bytedance.adsdk.ugeno.uef.xs;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class uef extends TextView implements IAnimation, xs {
    private float ivm;
    private float lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24702oa;
    private moa uef;
    private float xs;
    private bcc yo;

    public uef(Context context) {
        super(context);
        this.moa = -1.0f;
        this.ivm = 1.0f;
        this.xs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.yo = new bcc(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.oa(canvas);
        }
    }

    public float getBorderRadius() {
        return this.yo.uef();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.uef.xs
    public float getRipple() {
        return this.f24702oa;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getRubIn() {
        return this.yo.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getShine() {
        return this.yo.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getStretch() {
        return this.yo.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.uef(canvas, this);
            this.uef.uef(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.uef(i5, i10, i11, i12);
        }
        if (z2 && this.moa > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uef(((i11 - i5) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i12 - i10) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z2, i5, i10, i11, i12);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i10) {
        moa moaVar = this.uef;
        if (moaVar == null) {
            super.onMeasure(i5, i10);
        } else {
            int[] iArrUef = moaVar.uef(i5, i10);
            super.onMeasure(iArrUef[0], iArrUef[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        this.yo.uef(i5);
    }

    public void setBorderRadius(float f10) {
        bcc bccVar = this.yo;
        if (bccVar != null) {
            bccVar.uef(f10);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.ivm = f11;
        this.xs = f10;
    }

    public void setMinTextSize(float f10) {
        this.moa = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.f24702oa = f10;
        bcc bccVar = this.yo;
        if (bccVar != null) {
            bccVar.oa(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        bcc bccVar = this.yo;
        if (bccVar != null) {
            bccVar.lw(f10);
        }
    }

    public void setShine(float f10) {
        bcc bccVar = this.yo;
        if (bccVar != null) {
            bccVar.yo(f10);
        }
    }

    public void setStretch(float f10) {
        bcc bccVar = this.yo;
        if (bccVar != null) {
            bccVar.moa(f10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.lw = getTextSize();
    }

    public void uef(moa moaVar) {
        this.uef = moaVar;
    }

    private void uef(int i5, int i10) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i10 <= 0 || i5 <= 0 || this.lw == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.lw;
        int iUef = uef(text, paint, i5, fMax);
        while (iUef > i10 && fMax > this.moa) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.moa);
            fMax = Math.max(fMax - 1.0f, this.moa);
            iUef = uef(text, paint, i5, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.xs, this.ivm);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i5, float f10) {
        super.setTextSize(i5, f10);
        this.lw = getTextSize();
    }

    private int uef(CharSequence charSequence, TextPaint textPaint, int i5, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i5, Layout.Alignment.ALIGN_NORMAL, this.ivm, this.xs, true).getHeight();
    }
}
