package com.bumptech.glide.load.c.c;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.g.r;
import com.bumptech.glide.load.a.aw;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final AnimatedImageDrawable f3388a;

    a(AnimatedImageDrawable animatedImageDrawable) {
        this.f3388a = animatedImageDrawable;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final int a() {
        AnimatedImageDrawable animatedImageDrawable = this.f3388a;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight() * r.c(Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Class b() {
        return Drawable.class;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final /* synthetic */ Object c() {
        return this.f3388a;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final void e() {
        AnimatedImageDrawable animatedImageDrawable = this.f3388a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
