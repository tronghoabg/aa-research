package com.waze.view.popups;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    private int f45320a;

    /* renamed from: b, reason: collision with root package name */
    private final View[] f45321b;

    public k(int i2, View[] viewArr) {
        this.f45320a = i2;
        this.f45321b = viewArr;
    }

    public final void a() {
        this.f45320a = 0;
        View[] viewArr = this.f45321b;
        if (viewArr != null) {
            Arrays.fill(viewArr, (Object) null);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f45320a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        View[] viewArr = this.f45321b;
        if (viewArr != null && (obj instanceof View)) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (obj == viewArr[i2]) {
                    return i2;
                }
            }
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        View[] viewArr = this.f45321b;
        View view = viewArr[i2];
        if (view != null) {
            if (view.getParent() != null) {
                return null;
            }
            viewGroup.addView(viewArr[i2]);
        }
        return viewArr[i2];
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
