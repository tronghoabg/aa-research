package com.waze.reports;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cc implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ImageView f33762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap f33763b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f33764c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bx f33765d;

    cc(cd cdVar, ImageView imageView, Bitmap bitmap, View view, bx bxVar) {
        this.f33762a = imageView;
        this.f33763b = bitmap;
        this.f33764c = view;
        this.f33765d = bxVar;
        Objects.requireNonNull(cdVar);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f33762a.setImageBitmap(this.f33763b);
        View view = this.f33764c;
        bx bxVar = this.f33765d;
        View viewFindViewById = view.findViewById(R.id.placePhotoByFrame);
        String str = bxVar.f33740c;
        if (str == null || str.isEmpty()) {
            return;
        }
        viewFindViewById.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
