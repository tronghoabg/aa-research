package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private e f21083a;

    /* renamed from: b, reason: collision with root package name */
    private int f21084b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f21083a = eVarA;
        addView(eVarA);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f21083a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f21083a.getLayoutParams();
        removeView(this.f21083a);
        e eVarA = e.a(aVar, getContext());
        this.f21083a = eVarA;
        addView(eVarA);
        this.f21083a.setLayoutParams(layoutParams);
        this.f21083a.a(this.f21084b);
    }

    public void a(int i5, int i10, int i11, int i12) {
        this.f21084b = i5;
        int i13 = i10 + i5 + i11;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i13;
            layoutParams.width = i13;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i5, i12);
        layoutParams2.setMargins(i11, i11, i11, 0);
        this.f21083a.setLayoutParams(layoutParams2);
        this.f21083a.a(i5);
    }
}
