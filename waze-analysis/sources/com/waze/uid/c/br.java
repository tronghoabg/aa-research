package com.waze.uid.c;

import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class br implements ViewPager.OnPageChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bt f44299a;

    br(bt btVar) {
        Objects.requireNonNull(btVar);
        this.f44299a = btVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                bt.n(this.f44299a);
                bt.K(7);
                return;
            }
            return;
        }
        bt btVar = this.f44299a;
        int count = btVar.f44305e.getCount() - 1;
        int currentItem = btVar.f44306f.getCurrentItem();
        if (currentItem == 0) {
            btVar.f44306f.setCurrentItem(count, false);
        } else if (currentItem == count) {
            btVar.f44306f.setCurrentItem(0, false);
        }
        bt.l(btVar);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i2, float f2, int i3) {
        bt.q(this.f44299a, i2, f2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i2) {
    }
}
