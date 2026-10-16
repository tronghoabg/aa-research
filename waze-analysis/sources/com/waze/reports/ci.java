package com.waze.reports;

import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ci implements ViewPager.OnPageChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cm f33777a;

    ci(cm cmVar) {
        Objects.requireNonNull(cmVar);
        this.f33777a = cmVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i2, float f2, int i3) {
        this.f33777a.f33781a.onPageScrolled(i2, f2, i3);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i2) {
        cm cmVar = this.f33777a;
        if (cmVar.f33789i != null) {
            cmVar.f33789i.c(i2);
        }
    }
}
