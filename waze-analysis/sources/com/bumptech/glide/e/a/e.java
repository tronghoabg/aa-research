package com.bumptech.glide.e.a;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class e extends j {

    /* renamed from: b, reason: collision with root package name */
    private Animatable f2827b;

    public e(ImageView imageView) {
        super(imageView);
    }

    private final void n(Object obj) {
        j(obj);
        if (!(obj instanceof Animatable)) {
            this.f2827b = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f2827b = animatable;
        animatable.start();
    }

    @Override // com.bumptech.glide.e.a.g
    public final void b(Object obj) {
        n(obj);
    }

    @Override // com.bumptech.glide.e.a.j, com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final void c() {
        super.c();
        Animatable animatable = this.f2827b;
        if (animatable != null) {
            animatable.stop();
        }
        n(null);
        k();
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.manager.g
    public final void h() {
        Animatable animatable = this.f2827b;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.manager.g
    public final void i() {
        Animatable animatable = this.f2827b;
        if (animatable != null) {
            animatable.stop();
        }
    }

    protected abstract void j(Object obj);

    public final void k() {
        ((ImageView) this.f2833a).setImageDrawable(null);
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final void l() {
        n(null);
        k();
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final void m() {
        n(null);
        k();
    }
}
