package com.google.android.apps.auto.components.system.dashboard.media.switcher;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ?2\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006@"}, d2 = {"Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/PageIndicator;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "queuedPositions", "Ljava/util/ArrayList;", "", "pageIndicatorWidth", "pageIndicatorHeight", "pageDotWidth", "tint", "Landroid/content/res/ColorStateList;", "animating", "", "animationCallback", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "value", "position", "setPosition", "(I)V", "numPages", "getNumPages", "()I", "setNumPages", "color", "tintList", "getTintList", "()Landroid/content/res/ColorStateList;", "setTintList", "(Landroid/content/res/ColorStateList;)V", "setLocation", "", "location", "", "isVisibleToUser", "()Z", "setIndex", "index", "animate", "from", "to", "getAlpha", "isMajor", "playAnimation", "imageView", "Landroid/widget/ImageView;", "res", "getTransition", "fromMiddle", "includesStart", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "l", "t", "r", "b", "Companion", "java.com.google.android.apps.auto.components.system.dashboard.media.switcher_switcher"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PageIndicator extends android.view.ViewGroup {
    public static final defpackage.yqm a = defpackage.yqm.c("PageIndicator");
    public final java.util.ArrayList b;
    public final int c;
    public final int d;
    public final android.content.res.ColorStateList e;
    public boolean f;
    public int g;
    private final int h;
    private final android.graphics.drawable.Animatable2.AnimationCallback i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = new java.util.ArrayList();
        this.i = new defpackage.nbz(this);
        this.g = -1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.tint}, 0, 0);
        this.e = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getColorStateList(0) : defpackage.sqs.bS(context, android.R.attr.colorAccent);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.dash_page_indicator_width);
        this.c = dimensionPixelSize;
        this.d = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.dash_page_indicator_height);
        this.h = (int) (((double) dimensionPixelSize) * 0.4d);
    }

    private final void d(android.widget.ImageView imageView, int i) {
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(i);
        drawable.getClass();
        android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) drawable;
        imageView.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.registerAnimationCallback(this.i);
        animatedVectorDrawable.start();
    }

    private static final boolean e(android.view.View view) {
        if (view.getAlpha() > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return (android.os.Build.VERSION.SDK_INT > 29 && view.getTransitionAlpha() <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) || view.getVisibility() != 0;
        }
        return true;
    }

    private static final float f(boolean z) {
        return z ? 1.0f : 0.24f;
    }

    private static final int g(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z3) {
            if (z) {
                i = com.google.android.projection.gearhead.R.drawable.major_b_c_animation;
                i2 = com.google.android.projection.gearhead.R.drawable.major_b_a_animation;
            } else {
                i = com.google.android.projection.gearhead.R.drawable.major_c_b_animation;
                i2 = com.google.android.projection.gearhead.R.drawable.major_a_b_animation;
            }
        } else if (z) {
            i = com.google.android.projection.gearhead.R.drawable.minor_b_a_animation;
            i2 = com.google.android.projection.gearhead.R.drawable.minor_b_c_animation;
        } else {
            i = com.google.android.projection.gearhead.R.drawable.minor_a_b_animation;
            i2 = com.google.android.projection.gearhead.R.drawable.minor_c_b_animation;
        }
        return z2 ? i2 : i;
    }

    public final void a(int i) {
        java.util.Iterator itA = defpackage.ebm.b(this).a();
        int i2 = 0;
        while (itA.hasNext()) {
            java.lang.Object next = itA.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                defpackage.afga.ai();
            }
            android.view.View view = (android.view.View) next;
            view.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            if (view instanceof android.widget.ImageView) {
                ((android.widget.ImageView) view).setImageResource(com.google.android.projection.gearhead.R.drawable.major_a_b);
            }
            view.setAlpha(f(i2 == i));
            i2 = i3;
        }
    }

    public final void b(float f) {
        int iIntValue;
        java.util.ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            iIntValue = this.g;
        } else {
            java.lang.Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            iIntValue = ((java.lang.Number) obj).intValue();
        }
        int i = (int) f;
        int i2 = (f == ((float) i) ? 0 : 1) | (i + i);
        if (i2 == iIntValue) {
            return;
        }
        if (this.f) {
            arrayList.add(java.lang.Integer.valueOf(i2));
        } else {
            c(i2);
        }
    }

    public final void c(int i) {
        int i2 = i >> 1;
        if (!isAttachedToWindow() || getWindowVisibility() != 0 || e(this)) {
            a(i2);
            break;
        }
        java.util.Iterator itA = defpackage.ebn.b(this).a();
        while (true) {
            if (!itA.hasNext()) {
                if (!getGlobalVisibleRect(new android.graphics.Rect()) || java.lang.Math.abs(this.g - i) != 1) {
                    break;
                }
                int i3 = this.g;
                int i4 = i3 >> 1;
                a(i4);
                int i5 = i3 & 1;
                boolean z = i5 == 0 ? i3 < i : i3 > i;
                int iMin = java.lang.Math.min(i4, i2);
                int iMax = java.lang.Math.max(i4, i2);
                if (iMax == iMin) {
                    iMax++;
                }
                android.view.View childAt = getChildAt(iMin);
                android.widget.ImageView imageView = childAt instanceof android.widget.ImageView ? (android.widget.ImageView) childAt : null;
                android.view.View childAt2 = getChildAt(iMax);
                android.widget.ImageView imageView2 = childAt2 instanceof android.widget.ImageView ? (android.widget.ImageView) childAt2 : null;
                if (imageView != null && imageView2 != null) {
                    boolean z2 = 1 == i5;
                    imageView2.setTranslationX(imageView.getX() - imageView2.getX());
                    d(imageView, g(z2, z, false));
                    imageView.setAlpha(f(false));
                    d(imageView2, g(z2, z, true));
                    imageView2.setAlpha(f(true));
                    this.f = true;
                    break;
                }
                break;
                break;
            }
            java.lang.Object obj = (android.view.ViewParent) itA.next();
            if (!(obj instanceof android.view.View) || !e((android.view.View) obj)) {
            }
            a(i2);
            break;
        }
        this.g = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            return;
        }
        java.util.Iterator itA = defpackage.ebm.b(this).a();
        int i5 = 0;
        while (itA.hasNext()) {
            java.lang.Object next = itA.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                defpackage.afga.ai();
            }
            int i7 = this.c;
            int i8 = (i7 - this.h) * i5;
            ((android.view.View) next).layout(i8, 0, i7 + i8, this.d);
            i5 = i6;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = this.c;
        int i4 = this.d;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        java.util.Iterator itA = defpackage.ebm.b(this).a();
        while (itA.hasNext()) {
            ((android.view.View) itA.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        int i5 = this.h;
        setMeasuredDimension(((i3 - i5) * (getChildCount() - 1)) + i5, i4);
    }
}
