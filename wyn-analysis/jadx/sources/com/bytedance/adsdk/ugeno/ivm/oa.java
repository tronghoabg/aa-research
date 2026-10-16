package com.bytedance.adsdk.ugeno.ivm;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public class oa extends uef<com.bytedance.adsdk.ugeno.oa.yo> {
    private com.bytedance.adsdk.ugeno.moa moa;

    public oa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ivm.uef
    public View dj(int i5) {
        return ((com.bytedance.adsdk.ugeno.oa.yo) this.uef.get(i5)).dj();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.ivm();
        }
        super.onLayout(z2, i5, i10, i11, i12);
        com.bytedance.adsdk.ugeno.moa moaVar2 = this.moa;
        if (moaVar2 != null) {
            moaVar2.uef(i5, i10, i11, i12);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        com.bytedance.adsdk.ugeno.moa moaVar = this.moa;
        if (moaVar != null) {
            int[] iArrUef = moaVar.uef(i5, i10);
            super.onMeasure(iArrUef[0], iArrUef[1]);
        } else {
            super.onMeasure(i5, i10);
        }
        com.bytedance.adsdk.ugeno.moa moaVar2 = this.moa;
        if (moaVar2 != null) {
            moaVar2.lw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        com.bytedance.adsdk.ugeno.moa moaVar = this.moa;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void uef(com.bytedance.adsdk.ugeno.moa moaVar) {
        this.moa = moaVar;
    }
}
