package com.waze.reports;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class by implements ViewPager.PageTransformer {
    public by(bz bzVar) {
        Objects.requireNonNull(bzVar);
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public final void transformPage(View view, float f2) {
        if (f2 >= -1.0f && f2 <= 1.0f) {
            float fMax = Math.max(0.85f, 1.0f - Math.abs(f2));
            view.setScaleX(fMax);
            view.setScaleY(fMax);
        }
    }
}
