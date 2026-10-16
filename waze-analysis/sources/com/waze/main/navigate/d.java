package com.waze.main.navigate;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f25493a;

    d(e eVar) {
        Objects.requireNonNull(eVar);
        this.f25493a = eVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            e eVar = this.f25493a;
            viewGroup.addView(eVar.f25500g);
            return eVar.f25500g;
        }
        if (i2 != 1) {
            return null;
        }
        e eVar2 = this.f25493a;
        viewGroup.addView(eVar2.f25505l);
        return eVar2.f25505l;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
