package com.waze.main.navigate;

import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements ViewPager.OnPageChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f25489a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.l.b.b f25490b;

    b(e eVar, com.waze.main_screen.l.b.b bVar) {
        this.f25490b = bVar;
        Objects.requireNonNull(eVar);
        this.f25489a = eVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i2, float f2, int i3) {
        if (i2 == 0) {
            e eVar = this.f25489a;
            float f3 = f2 / 2.0f;
            eVar.f25496c.setAlpha(1.0f - f3);
            eVar.f25497d.setAlpha(f3 + 0.5f);
            eVar.f25498e.setAlpha(1.0f - f2);
            eVar.f25499f.setAlpha(f2);
            return;
        }
        if (i2 == 1) {
            e eVar2 = this.f25489a;
            float f4 = f2 / 2.0f;
            eVar2.f25497d.setAlpha(1.0f - f4);
            eVar2.f25496c.setAlpha(f4 + 0.5f);
            eVar2.f25499f.setAlpha(1.0f - f2);
            eVar2.f25498e.setAlpha(f2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i2) {
        if (i2 == 0) {
            this.f25490b.d();
        } else if (i2 == 1) {
            this.f25490b.c();
        }
    }
}
