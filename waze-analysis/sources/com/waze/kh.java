package com.waze;

import androidx.viewpager.widget.ViewPager;
import com.waze.view.pages.LinePageIndicator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class kh implements ViewPager.OnPageChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LinePageIndicator f25038a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kj f25039b;

    kh(kj kjVar, LinePageIndicator linePageIndicator) {
        this.f25038a = linePageIndicator;
        Objects.requireNonNull(kjVar);
        this.f25039b = kjVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i2) {
        if (i2 == 1) {
            this.f25039b.f25045f = false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i2, float f2, int i3) {
        this.f25038a.onPageScrolled(i2, f2, i3);
        kj kjVar = this.f25039b;
        if (kjVar.f25042c[i2] != null) {
            kjVar.f25042c[i2].bH(true, f2);
        }
        if (i2 < kjVar.f25040a - 1) {
            int i4 = i2 + 1;
            if (kjVar.f25042c[i4] != null) {
                kjVar.f25042c[i4].bH(false, 1.0f - f2);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i2) {
        kj kjVar = this.f25039b;
        if (kjVar.f25047h == -1) {
            return;
        }
        int iF = kjVar.f();
        if (i2 != kjVar.f25047h && kjVar.f25047h >= 0) {
            kjVar.o(1, kjVar.f25047h, iF, 3);
        }
        kjVar.o(0, i2, 0, 3);
        kjVar.K(i2);
        kjVar.f25044e = i2;
    }
}
