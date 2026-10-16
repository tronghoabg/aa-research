package com.google.android.material.timepicker;

import T0.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.S;

/* loaded from: classes4.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final c f27087A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f27088B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f27089C;

    /* renamed from: D, reason: collision with root package name */
    public final int f27090D;

    /* renamed from: E, reason: collision with root package name */
    public final int f27091E;

    /* renamed from: F, reason: collision with root package name */
    public final int f27092F;

    /* renamed from: G, reason: collision with root package name */
    public final int f27093G;

    /* renamed from: H, reason: collision with root package name */
    public final String[] f27094H;

    /* renamed from: I, reason: collision with root package name */
    public float f27095I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f27096J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f27097v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f27098w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f27099x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f27100y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f27101z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27098w = new Rect();
        this.f27099x = new RectF();
        this.f27100y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f27101z = sparseArray;
        this.f27089C = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I7.a.f5401c, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListW = Ba.c.w(context, typedArrayObtainStyledAttributes, 1);
        this.f27096J = colorStateListW;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f27097v = clockHandView;
        this.f27090D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListW.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListW.getDefaultColor());
        this.f27088B = new int[]{colorForState, colorForState, colorStateListW.getDefaultColor()};
        clockHandView.f27104c.add(this);
        int defaultColor = Y0.e.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListW2 = Ba.c.w(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListW2 != null ? colorStateListW2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f27087A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f27094H = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i5 = 0; i5 < Math.max(this.f27094H.length, size); i5++) {
            TextView textView = (TextView) sparseArray.get(i5);
            if (i5 >= this.f27094H.length) {
                removeView(textView);
                sparseArray.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i5, textView);
                    addView(textView);
                }
                textView.setText(this.f27094H[i5]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i5));
                int i10 = (i5 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z2 = i10 > 1 ? true : z2;
                S.m(textView, this.f27087A);
                textView.setTextColor(this.f27096J);
            }
        }
        ClockHandView clockHandView2 = this.f27097v;
        if (clockHandView2.f27103b && !z2) {
            clockHandView2.f27113m = 1;
        }
        clockHandView2.f27103b = z2;
        clockHandView2.invalidate();
        this.f27091E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f27092F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f27093G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        m mVar = new m();
        mVar.b(this);
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!map.containsKey(i10)) {
                    map.put(i10, new ArrayList());
                }
                ((List) map.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f27120t * 0.66f) : this.f27120t;
            Iterator it = list.iterator();
            float size = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                HashMap map2 = mVar.f11342c;
                if (!map2.containsKey(Integer.valueOf(id2))) {
                    map2.put(Integer.valueOf(id2), new T0.h());
                }
                T0.i iVar = ((T0.h) map2.get(Integer.valueOf(id2))).f11241d;
                iVar.f11309z = R.id.circle_center;
                iVar.f11245A = iRound;
                iVar.f11246B = size;
                size += 360.0f / list.size();
            }
        }
        mVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f27101z;
            if (i11 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i11)).setVisibility(0);
            i11++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f27097v.f27108g;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i5 = 0;
        while (true) {
            sparseArray = this.f27101z;
            int size = sparseArray.size();
            rectF = this.f27099x;
            rect = this.f27098w;
            if (i5 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i5);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i5++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f27100y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f27088B, this.f27089C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f27094H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i5, int i10) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f27093G / Math.max(Math.max(this.f27091E / displayMetrics.heightPixels, this.f27092F / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
