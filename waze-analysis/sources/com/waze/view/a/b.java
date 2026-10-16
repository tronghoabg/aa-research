package com.waze.view.a;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.waze.sharedui.views.ProgressAnimation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends com.bumptech.glide.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ProgressAnimation f44943a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageView f44944b;

    b(f fVar, ProgressAnimation progressAnimation, ImageView imageView) {
        this.f44943a = progressAnimation;
        this.f44944b = imageView;
        Objects.requireNonNull(fVar);
    }

    @Override // com.bumptech.glide.e.a.g
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f44943a.setVisibility(8);
        this.f44944b.setImageDrawable((Drawable) obj);
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final void m() {
        this.f44943a.a();
    }
}
