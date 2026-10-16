package com.google.android.apps.auto.components.ui.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.projection.gearhead.R;
import defpackage.olq;
import defpackage.ome;
import defpackage.omf;
import defpackage.yph;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class CrossfadeImageView extends FrameLayout {
    public final omf a;
    public ImageView b;
    private final ImageView c;
    private final ImageView d;
    private ImageView e;
    private Bitmap f;
    private Integer g;
    private Animation h;
    private Animation i;
    private final Animation.AnimationListener j;

    static {
        yph.c("GH.CrossfadeImageView");
    }

    public CrossfadeImageView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        this.a = new omf(this);
        this.j = new ome(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(context, attributeSet, i, i2);
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundColor(-16777216);
        addView(imageView);
        ImageView imageView2 = new ImageView(context, attributeSet, i, i2);
        this.c = imageView2;
        imageView2.setLayoutParams(layoutParams);
        addView(imageView2);
        ImageView imageView3 = new ImageView(context, attributeSet, i, i2);
        this.d = imageView3;
        imageView3.setLayoutParams(layoutParams);
        addView(imageView3);
        this.e = imageView2;
        this.b = imageView3;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.image_in);
        this.h = animationLoadAnimation;
        animationLoadAnimation.setInterpolator(new olq());
        this.i = AnimationUtils.loadAnimation(context, R.anim.image_out);
    }

    private final void d() {
        this.b.setVisibility(0);
        this.b.startAnimation(this.h);
        this.b.bringToFront();
        this.e.startAnimation(this.i);
        this.i.setAnimationListener(this.j);
        ImageView imageView = this.e;
        ImageView imageView2 = this.c;
        if (imageView == imageView2) {
            this.e = this.d;
            this.b = imageView2;
        } else {
            this.e = imageView2;
            this.b = this.d;
        }
    }

    public final void a(boolean z) {
        omf omfVar = this.a;
        omfVar.b = z;
        omfVar.i();
    }

    public final void b(int i, boolean z) {
        Integer num = this.g;
        if (num != null && num.intValue() == i && Objects.equals(null, null)) {
            return;
        }
        this.f = null;
        this.g = Integer.valueOf(i);
        if (!z) {
            this.e.setImageBitmap(null);
            this.e.setBackgroundColor(i);
            this.e.setColorFilter((ColorFilter) null);
        } else {
            this.b.setImageBitmap(null);
            this.b.setBackgroundColor(i);
            this.b.setColorFilter((ColorFilter) null);
            d();
        }
    }

    public final void c(Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap == null || (bitmap2 = this.f) == null || bitmap2.isRecycled() || !bitmap.sameAs(this.f) || !Objects.equals(null, null)) {
            this.f = bitmap;
            this.g = null;
            this.b.setImageBitmap(bitmap);
            this.b.setColorFilter((ColorFilter) null);
            d();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        b(i, false);
    }

    public CrossfadeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CrossfadeImageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CrossfadeImageView(Context context) {
        this(context, null);
    }
}
