package com.waze.reports;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.waze.R;
import com.waze.sharedui.views.ProgressAnimation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bv extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cl f33735a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bz f33736b;

    bv(bz bzVar, cl clVar) {
        this.f33735a = clVar;
        Objects.requireNonNull(bzVar);
        this.f33736b = bzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b(bx bxVar) {
        bz bzVar = this.f33736b;
        if (bzVar.f33756j.contains(bxVar)) {
            return bzVar.f33756j.indexOf(bxVar);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f33736b.f33756j.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return b((bx) ((View) obj).getTag());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_photo_pager_small_item, viewGroup, false);
        bz bzVar = this.f33736b;
        bx bxVar = (bx) bzVar.f33756j.get(i2);
        ProgressAnimation progressAnimation = (ProgressAnimation) viewInflate.findViewById(R.id.placePhotoProgress);
        String str = bxVar.f33739b;
        if (str == null || str.isEmpty()) {
            str = bxVar.f33738a;
        }
        progressAnimation.a();
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.placePhoto);
        com.waze.utils.n.f44897a.a(str, 1, imageView, progressAnimation, bzVar.f33747a);
        viewInflate.setTag(bxVar);
        viewGroup.addView(viewInflate);
        viewInflate.setScaleX(0.85f);
        viewInflate.setScaleY(0.85f);
        imageView.setOnClickListener(new bu(this, bxVar, this.f33735a));
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
