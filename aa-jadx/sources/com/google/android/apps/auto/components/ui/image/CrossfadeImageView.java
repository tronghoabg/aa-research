package com.google.android.apps.auto.components.ui.image;

/* JADX INFO: loaded from: classes2.dex */
public class CrossfadeImageView extends android.widget.FrameLayout {
    public final defpackage.omy a;
    public android.widget.ImageView b;
    private final android.widget.ImageView c;
    private final android.widget.ImageView d;
    private android.widget.ImageView e;
    private android.graphics.Bitmap f;
    private java.lang.Integer g;
    private android.view.animation.Animation h;
    private android.view.animation.Animation i;
    private final android.view.animation.Animation.AnimationListener j;

    static {
        defpackage.yqm.c("GH.CrossfadeImageView");
    }

    public CrossfadeImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new defpackage.omy(this);
        this.j = new defpackage.omx(this);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.ImageView imageView = new android.widget.ImageView(context, attributeSet, i, i2);
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundColor(-16777216);
        addView(imageView);
        android.widget.ImageView imageView2 = new android.widget.ImageView(context, attributeSet, i, i2);
        this.c = imageView2;
        imageView2.setLayoutParams(layoutParams);
        addView(imageView2);
        android.widget.ImageView imageView3 = new android.widget.ImageView(context, attributeSet, i, i2);
        this.d = imageView3;
        imageView3.setLayoutParams(layoutParams);
        addView(imageView3);
        this.e = imageView2;
        this.b = imageView3;
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.image_in);
        this.h = animationLoadAnimation;
        animationLoadAnimation.setInterpolator(new defpackage.omj());
        this.i = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.image_out);
    }

    private final void d() {
        this.b.setVisibility(0);
        this.b.startAnimation(this.h);
        this.b.bringToFront();
        this.e.startAnimation(this.i);
        this.i.setAnimationListener(this.j);
        android.widget.ImageView imageView = this.e;
        android.widget.ImageView imageView2 = this.c;
        if (imageView == imageView2) {
            this.e = this.d;
            this.b = imageView2;
        } else {
            this.e = imageView2;
            this.b = this.d;
        }
    }

    public final void a(boolean z) {
        defpackage.omy omyVar = this.a;
        omyVar.b = z;
        omyVar.i();
    }

    public final void b(int i, boolean z) {
        java.lang.Integer num = this.g;
        if (num != null && num.intValue() == i && j$.util.Objects.equals(null, null)) {
            return;
        }
        this.f = null;
        this.g = java.lang.Integer.valueOf(i);
        if (!z) {
            this.e.setImageBitmap(null);
            this.e.setBackgroundColor(i);
            this.e.setColorFilter((android.graphics.ColorFilter) null);
        } else {
            this.b.setImageBitmap(null);
            this.b.setBackgroundColor(i);
            this.b.setColorFilter((android.graphics.ColorFilter) null);
            d();
        }
    }

    public final void c(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap bitmap2;
        if (bitmap == null || (bitmap2 = this.f) == null || bitmap2.isRecycled() || !bitmap.sameAs(this.f) || !j$.util.Objects.equals(null, null)) {
            this.f = bitmap;
            this.g = null;
            this.b.setImageBitmap(bitmap);
            this.b.setColorFilter((android.graphics.ColorFilter) null);
            d();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        b(i, false);
    }

    public CrossfadeImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CrossfadeImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CrossfadeImageView(android.content.Context context) {
        this(context, null);
    }
}
