package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c8.C1583g;
import c8.C1584h;
import c8.C1586j;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final com.applovin.adview.a f27119s;

    /* renamed from: t, reason: collision with root package name */
    public int f27120t;

    /* renamed from: u, reason: collision with root package name */
    public final C1583g f27121u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C1583g c1583g = new C1583g();
        this.f27121u = c1583g;
        C1584h c1584h = new C1584h(0.5f);
        C1586j c1586jE = c1583g.f19729a.f19713a.e();
        c1586jE.f19755e = c1584h;
        c1586jE.f19756f = c1584h;
        c1586jE.f19757g = c1584h;
        c1586jE.f19758h = c1584h;
        c1583g.setShapeAppearanceModel(c1586jE.a());
        this.f27121u.j(ColorStateList.valueOf(-1));
        C1583g c1583g2 = this.f27121u;
        WeakHashMap weakHashMap = S.f38779a;
        setBackground(c1583g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I7.a.f5416s, R.attr.materialClockStyle, 0);
        this.f27120t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f27119s = new com.applovin.adview.a(this, 9);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = S.f38779a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            com.applovin.adview.a aVar = this.f27119s;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            com.applovin.adview.a aVar = this.f27119s;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i5) {
        this.f27121u.j(ColorStateList.valueOf(i5));
    }
}
