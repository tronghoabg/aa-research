package com.bytedance.adsdk.ugeno.cz.oa;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.moa;
import java.util.Map;

/* loaded from: classes.dex */
public class uef extends FrameLayout {

    /* renamed from: oa, reason: collision with root package name */
    private Map<Integer, cq> f24715oa;
    private moa uef;

    public uef(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, cq> map = this.f24715oa;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.ivm();
        }
        super.onLayout(z2, i5, i10, i11, i12);
        moa moaVar2 = this.uef;
        if (moaVar2 != null) {
            moaVar2.uef(i5, i10, i11, i12);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        moa moaVar = this.uef;
        if (moaVar != null) {
            int[] iArrUef = moaVar.uef(i5, i10);
            super.onMeasure(iArrUef[0], iArrUef[1]);
        } else {
            super.onMeasure(i5, i10);
        }
        moa moaVar2 = this.uef;
        if (moaVar2 != null) {
            moaVar2.lw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void setEventMap(Map<Integer, cq> map) {
        this.f24715oa = map;
    }

    public void uef(moa moaVar) {
        this.uef = moaVar;
    }
}
