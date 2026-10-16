package com.waze.reports;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cd implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f33766a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f33767b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f33768c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ImageView f33769d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ cg f33770e;

    cd(cg cgVar, bx bxVar, View view, View view2, ImageView imageView) {
        this.f33766a = bxVar;
        this.f33767b = view;
        this.f33768c = view2;
        this.f33769d = imageView;
        Objects.requireNonNull(cgVar);
        this.f33770e = cgVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        bx bxVar = this.f33766a;
        bxVar.f33746i = bitmap;
        cm cmVar = this.f33770e.f33775a;
        View view = this.f33767b;
        int i2 = bxVar.f33744g;
        int i3 = bxVar.f33745h;
        cm.m(cmVar, view, bxVar);
        View view2 = this.f33768c;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = bxVar.f33745h;
        layoutParams.width = bxVar.f33744g;
        view2.setLayoutParams(layoutParams);
        ScaleAnimation scaleAnimation = new ScaleAnimation(i2 / bxVar.f33744g, 1.0f, i3 / bxVar.f33745h, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setAnimationListener(new cc(this, this.f33769d, bitmap, view, bxVar));
        scaleAnimation.setDuration(200L);
        view.findViewById(R.id.placePhotoFrame).startAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        View viewFindViewById = view.findViewById(R.id.placePhoto);
        viewFindViewById.setVisibility(0);
        viewFindViewById.startAnimation(alphaAnimation);
    }

    @Override // com.waze.utils.h
    public final void b() {
    }
}
