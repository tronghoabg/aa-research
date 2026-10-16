package com.bytedance.adsdk.ugeno.yoga.oa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.moa;
import com.bytedance.adsdk.ugeno.uef.bcc;
import com.bytedance.adsdk.ugeno.uef.xs;
import com.bytedance.adsdk.ugeno.yoga.cq;
import com.bytedance.adsdk.ugeno.yoga.cz;
import com.bytedance.adsdk.ugeno.yoga.dj;
import com.bytedance.adsdk.ugeno.yoga.dz;
import com.bytedance.adsdk.ugeno.yoga.ivm;
import com.bytedance.adsdk.ugeno.yoga.lw;
import com.bytedance.adsdk.ugeno.yoga.zjm;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class yo extends ViewGroup implements com.bytedance.adsdk.ugeno.oa.oa, xs {
    private bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private final zjm f24795oa;
    private final Map<View, zjm> uef;
    private moa yo;

    public yo(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        zjm zjmVarUef;
        this.f24795oa.uef((com.bytedance.adsdk.ugeno.yoga.xs) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.oa.oa) {
            throw null;
        }
        super.addView(view, i5, layoutParams);
        if (this.uef.containsKey(view)) {
            return;
        }
        if (view instanceof yo) {
            zjmVarUef = ((yo) view).getYogaNode();
        } else {
            zjmVarUef = this.uef.containsKey(view) ? this.uef.get(view) : dj.uef();
            zjmVarUef.uef(view);
            zjmVarUef.uef((com.bytedance.adsdk.ugeno.yoga.xs) new oa());
        }
        uef((uef) view.getLayoutParams(), zjmVarUef, view);
        this.uef.put(view, zjmVarUef);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.f24795oa.uef()));
        } else {
            zjm zjmVar = this.f24795oa;
            zjmVar.uef(zjmVarUef, zjmVar.uef());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof uef;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.oa(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new uef(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new uef(layoutParams);
    }

    public float getBorderRadius() {
        return this.moa.uef();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getRipple() {
        return this.moa.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getRubIn() {
        return this.moa.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getShine() {
        return this.moa.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getStretch() {
        return this.moa.getStretch();
    }

    public zjm getYogaNode() {
        return this.f24795oa;
    }

    public void moa(View view, int i5) {
        int iUef;
        view.setVisibility(i5);
        try {
            zjm zjmVar = this.uef.get(view);
            Object tag = view.getTag(151060224);
            if (i5 != 0) {
                if (i5 != 8 || (iUef = this.f24795oa.uef(zjmVar)) == -1) {
                    return;
                }
                this.f24795oa.oa(iUef);
                view.setTag(151060224, Integer.valueOf(iUef));
                uef(this.f24795oa);
                return;
            }
            if (tag == null || this.f24795oa.uef(zjmVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.f24795oa.uef()) {
                this.f24795oa.uef(this.uef.get(view), iIntValue);
            } else {
                this.f24795oa.uef(this.uef.get(view), this.f24795oa.uef());
            }
            uef(this.f24795oa);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.oa
    public void oa(int i5) {
        zjm zjmVar = this.f24795oa;
        if (zjmVar != null) {
            oa(zjmVar, i5);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.uef(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.ivm();
        }
        if (!(getParent() instanceof yo)) {
            uef(View.MeasureSpec.makeMeasureSpec(i11 - i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824));
        }
        uef(this.f24795oa, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        moa moaVar2 = this.yo;
        if (moaVar2 != null) {
            moaVar2.uef(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        if (!(getParent() instanceof yo)) {
            uef(i5, i10);
        }
        moa moaVar = this.yo;
        if (moaVar != null) {
            int[] iArrUef = moaVar.uef(i5, i10);
            setMeasuredDimension(iArrUef[0], iArrUef[1]);
        } else {
            setMeasuredDimension(Math.round(this.f24795oa.bcc()), Math.round(this.f24795oa.cz()));
        }
        moa moaVar2 = this.yo;
        if (moaVar2 != null) {
            moaVar2.lw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            uef(getChildAt(i5), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            uef(getChildAt(i5), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        uef(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i5) {
        uef(getChildAt(i5), false);
        super.removeViewAt(i5);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        uef(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i5, int i10) {
        for (int i11 = i5; i11 < i5 + i10; i11++) {
            uef(getChildAt(i11), false);
        }
        super.removeViews(i5, i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i5, int i10) {
        for (int i11 = i5; i11 < i5 + i10; i11++) {
            uef(getChildAt(i11), true);
        }
        super.removeViewsInLayout(i5, i10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        this.moa.uef(i5);
    }

    public void setBorderRadius(float f10) {
        this.moa.uef(f10);
    }

    public void setRipple(float f10) {
        bcc bccVar = this.moa;
        if (bccVar != null) {
            bccVar.oa(f10);
        }
    }

    public void setRubIn(float f10) {
        bcc bccVar = this.moa;
        if (bccVar != null) {
            bccVar.lw(f10);
        }
    }

    public void setShine(float f10) {
        bcc bccVar = this.moa;
        if (bccVar != null) {
            bccVar.yo(f10);
        }
    }

    public void setStretch(float f10) {
        bcc bccVar = this.moa;
        if (bccVar != null) {
            bccVar.moa(f10);
        }
    }

    public zjm uef(View view) {
        return this.uef.get(view);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.oa
    public void yo(View view, int i5) {
        moa(view, i5);
    }

    public yo(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.moa = new bcc(this);
        zjm zjmVarUef = dj.uef();
        this.f24795oa = zjmVarUef;
        this.uef = new HashMap();
        zjmVarUef.uef(this);
        zjmVarUef.uef((com.bytedance.adsdk.ugeno.yoga.xs) new oa());
        uef((uef) generateDefaultLayoutParams(), zjmVarUef, this);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.oa
    public void uef(int i5) {
        zjm zjmVar = this.f24795oa;
        if (zjmVar != null) {
            uef(zjmVar, i5);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.oa
    public void oa(View view, int i5) {
        zjm zjmVarUef;
        if (view == null || (zjmVarUef = uef(view)) == null) {
            return;
        }
        oa(zjmVarUef, i5);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.oa.oa
    public void uef(View view, int i5) {
        zjm zjmVarUef;
        if (view == null || (zjmVarUef = uef(view)) == null) {
            return;
        }
        uef(zjmVarUef, i5);
        view.requestLayout();
    }

    private void oa(zjm zjmVar, int i5) {
        if (i5 == -1) {
            zjmVar.xs(100.0f);
        } else if (i5 == -2) {
            zjmVar.lw();
        } else {
            zjmVar.ivm(i5);
        }
    }

    private void uef(zjm zjmVar, int i5) {
        if (i5 == -1) {
            zjmVar.lw(100.0f);
        } else if (i5 == -2) {
            zjmVar.moa();
        } else {
            zjmVar.moa(i5);
        }
    }

    public static class oa implements com.bytedance.adsdk.ugeno.yoga.xs {
        @Override // com.bytedance.adsdk.ugeno.yoga.xs
        public long uef(zjm zjmVar, float f10, com.bytedance.adsdk.ugeno.yoga.bcc bccVar, float f11, com.bytedance.adsdk.ugeno.yoga.bcc bccVar2) {
            View view = (View) zjmVar.zjm();
            if (view == null || (view instanceof yo)) {
                return cz.uef(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, uef(bccVar)), View.MeasureSpec.makeMeasureSpec((int) f11, uef(bccVar2)));
            return cz.uef(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int uef(com.bytedance.adsdk.ugeno.yoga.bcc bccVar) {
            if (bccVar == com.bytedance.adsdk.ugeno.yoga.bcc.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return bccVar == com.bytedance.adsdk.ugeno.yoga.bcc.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class uef extends ViewGroup.LayoutParams {

        /* renamed from: ab, reason: collision with root package name */
        private float f24796ab;
        private float bcc;
        private float bs;
        private float cq;
        private float cz;
        private float dj;
        private float dz;
        private float ivm;
        private float lw;
        private float moa;

        /* renamed from: oa, reason: collision with root package name */
        SparseArray<String> f24797oa;
        private float oib;
        private float sy;
        SparseArray<Float> uef;
        private float wk;
        private float wrv;
        private float xs;
        private float yo;
        private float zjm;

        public uef(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof uef) {
                uef uefVar = (uef) layoutParams;
                this.uef = uefVar.uef.clone();
                this.f24797oa = uefVar.f24797oa.clone();
                return;
            }
            this.uef = new SparseArray<>();
            this.f24797oa = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.uef.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.uef.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void ab(float f10) {
            this.sy = f10;
            this.uef.put(27, Float.valueOf(f10));
        }

        public void bcc(float f10) {
            this.dz = f10;
            this.uef.put(11, Float.valueOf(f10));
        }

        public void bs(float f10) {
            this.oib = f10;
            this.uef.put(28, Float.valueOf(f10));
        }

        public void cq(float f10) {
            this.lw = f10;
            this.uef.put(19, Float.valueOf(f10));
        }

        public void cz(float f10) {
            this.wk = f10;
            this.uef.put(12, Float.valueOf(f10));
        }

        public void dj(float f10) {
            this.yo = f10;
            this.uef.put(17, Float.valueOf(f10));
        }

        public void dz(float f10) {
            this.ivm = f10;
            this.uef.put(20, Float.valueOf(f10));
        }

        public void ivm(float f10) {
            this.wrv = f10;
            this.uef.put(14, Float.valueOf(f10));
        }

        public void lw(float f10) {
            this.dj = f10;
            this.uef.put(9, Float.valueOf(f10));
        }

        public void moa(float f10) {
            this.zjm = f10;
            this.uef.put(8, Float.valueOf(f10));
        }

        public void oa(float f10) {
            this.bcc = f10;
            this.uef.put(6, Float.valueOf(f10));
        }

        public void uef(float f10) {
            this.xs = f10;
            this.uef.put(5, Float.valueOf(f10));
        }

        public void wk(float f10) {
            this.bs = f10;
            this.uef.put(25, Float.valueOf(f10));
        }

        public void wrv(float f10) {
            this.moa = f10;
            this.uef.put(18, Float.valueOf(f10));
        }

        public void xs(float f10) {
            this.cq = f10;
            this.uef.put(10, Float.valueOf(f10));
        }

        public void yo(float f10) {
            this.cz = f10;
            this.uef.put(7, Float.valueOf(f10));
        }

        public void zjm(float f10) {
            this.f24796ab = f10;
            this.uef.put(13, Float.valueOf(f10));
        }

        public uef(int i5, int i10) {
            super(i5, i10);
            this.uef = new SparseArray<>();
            this.f24797oa = new SparseArray<>();
            if (i5 == -2 || i5 == -1 || i5 >= 0) {
                this.uef.put(15, Float.valueOf(i5));
            }
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.uef.put(16, Float.valueOf(i10));
            }
        }
    }

    private void uef(zjm zjmVar) {
        if (zjmVar.oa() != null) {
            uef(zjmVar.oa());
        } else {
            zjmVar.uef(Float.NaN, Float.NaN);
        }
    }

    private void uef(View view, boolean z2) {
        try {
            zjm zjmVar = this.uef.get(view);
            if (zjmVar == null) {
                return;
            }
            zjm zjmVarOa = zjmVar.oa();
            int i5 = 0;
            while (true) {
                if (i5 >= zjmVarOa.uef()) {
                    break;
                }
                if (zjmVarOa.uef(i5).equals(zjmVar)) {
                    zjmVarOa.oa(i5);
                    break;
                }
                i5++;
            }
            zjmVar.uef((Object) null);
            this.uef.remove(view);
            if (z2) {
                this.f24795oa.uef(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void uef(zjm zjmVar, float f10, float f11) {
        View view = (View) zjmVar.zjm();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(zjmVar.ivm() + f10);
            int iRound2 = Math.round(zjmVar.xs() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(zjmVar.bcc()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(zjmVar.cz()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iUef = zjmVar.uef();
        for (int i5 = 0; i5 < iUef; i5++) {
            if (equals(view)) {
                uef(zjmVar.uef(i5), f10, f11);
            } else if (!(view instanceof yo)) {
                uef(zjmVar.uef(i5), zjmVar.ivm() + f10, zjmVar.xs() + f11);
            }
        }
    }

    private void uef(int i5, int i10) {
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == 1073741824) {
            this.f24795oa.ivm(size2);
        }
        if (mode == 1073741824) {
            this.f24795oa.moa(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f24795oa.dj(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f24795oa.zjm(size);
        }
        this.f24795oa.uef(Float.NaN, Float.NaN);
    }

    public static void uef(uef uefVar, zjm zjmVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            zjmVar.uef(com.bytedance.adsdk.ugeno.yoga.yo.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.LEFT, r0.left);
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.TOP, r0.top);
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.RIGHT, r0.right);
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.BOTTOM, r0.bottom);
            }
        }
        for (int i5 = 0; i5 < uefVar.uef.size(); i5++) {
            int iKeyAt = uefVar.uef.keyAt(i5);
            float fFloatValue = uefVar.uef.valueAt(i5).floatValue();
            if (iKeyAt == 4) {
                zjmVar.yo(com.bytedance.adsdk.ugeno.yoga.uef.uef(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                zjmVar.uef(com.bytedance.adsdk.ugeno.yoga.uef.uef(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.uef.uef(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                zjmVar.wrv(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    zjmVar.yo();
                } else {
                    zjmVar.yo(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                zjmVar.uef(lw.uef(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                zjmVar.uef(fFloatValue);
            } else if (iKeyAt == 7) {
                zjmVar.oa(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    zjmVar.xs(100.0f);
                } else if (fFloatValue == -2.0f) {
                    zjmVar.lw();
                } else {
                    zjmVar.ivm(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                zjmVar.uef(com.bytedance.adsdk.ugeno.yoga.moa.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                zjmVar.uef(ivm.uef(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                zjmVar.uef(com.bytedance.adsdk.ugeno.yoga.moa.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                zjmVar.uef(com.bytedance.adsdk.ugeno.yoga.moa.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                zjmVar.uef(com.bytedance.adsdk.ugeno.yoga.moa.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                zjmVar.cz(fFloatValue);
            } else if (iKeyAt == 27) {
                zjmVar.bcc(fFloatValue);
            } else if (iKeyAt == 22) {
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                zjmVar.oa(com.bytedance.adsdk.ugeno.yoga.moa.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                zjmVar.yo(com.bytedance.adsdk.ugeno.yoga.moa.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                zjmVar.yo(com.bytedance.adsdk.ugeno.yoga.moa.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                zjmVar.yo(com.bytedance.adsdk.ugeno.yoga.moa.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                zjmVar.yo(com.bytedance.adsdk.ugeno.yoga.moa.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                zjmVar.uef(cq.uef(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    zjmVar.lw(100.0f);
                } else if (fFloatValue == -2.0f) {
                    zjmVar.moa();
                } else {
                    zjmVar.moa(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                zjmVar.uef(dz.uef(Math.round(fFloatValue)));
            }
        }
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        this.yo = yoVar;
    }
}
