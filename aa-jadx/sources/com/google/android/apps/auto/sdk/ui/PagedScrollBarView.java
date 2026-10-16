package com.google.android.apps.auto.sdk.ui;

/* JADX INFO: loaded from: classes2.dex */
public class PagedScrollBarView extends android.widget.FrameLayout implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    public final android.view.View a;
    public final android.view.View b;
    public final android.widget.ImageView c;
    public final android.widget.ImageView d;
    public final int e;
    public final android.widget.ImageView f;
    public final android.view.ViewGroup g;
    public final android.view.View h;
    public final boolean i;
    public defpackage.oyh j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    private int p;
    private final android.os.Handler q;
    private final java.lang.Runnable r;
    private final android.view.animation.Interpolator s;
    private final int t;
    private final int u;
    private java.lang.Float v;
    private final android.animation.ValueAnimator w;

    public PagedScrollBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.q = new android.os.Handler(android.os.Looper.getMainLooper());
        this.r = new defpackage.osa(this, 4);
        this.s = new android.view.animation.AccelerateDecelerateInterpolator();
        this.o = 1;
        this.m = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.oyi.e, i, i2);
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.i = z;
            typedArrayObtainStyledAttributes.recycle();
            ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.google.android.projection.gearhead.R.layout.gearhead_sdk_paged_scrollbar_buttons, (android.view.ViewGroup) this, true);
            this.c = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.page_up);
            android.view.View viewFindViewById = findViewById(com.google.android.projection.gearhead.R.id.page_up_container);
            this.a = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            viewFindViewById.setOnLongClickListener(this);
            this.d = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.page_down);
            android.view.View viewFindViewById2 = findViewById(com.google.android.projection.gearhead.R.id.page_down_container);
            this.b = viewFindViewById2;
            viewFindViewById2.setOnClickListener(this);
            viewFindViewById2.setOnLongClickListener(this);
            this.e = context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_sdk_pagination_button_elevation);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.scrollbar_moving_thumb);
            this.f = imageView;
            if (z) {
                imageView.setVisibility(8);
            }
            this.h = findViewById(com.google.android.projection.gearhead.R.id.filler);
            this.g = (android.view.ViewGroup) findViewById(com.google.android.projection.gearhead.R.id.action_button_parent);
            this.t = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.min_thumb_height);
            this.u = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.max_thumb_height);
            if (!context.getResources().getBoolean(com.google.android.projection.gearhead.R.bool.gearhead_sdk_true_for_touch)) {
                viewFindViewById.setVisibility(8);
                viewFindViewById2.setVisibility(8);
                if (android.util.Log.isLoggable("PagedScrollBarView", 2)) {
                    android.util.Log.v("PagedScrollBarView", "Hide pagination buttons for non-touch.");
                }
            }
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) android.animation.AnimatorInflater.loadAnimator(context, com.google.android.projection.gearhead.R.animator.scroll_bar_thumb_elements_fade);
            this.w = valueAnimator;
            if (z) {
                return;
            }
            valueAnimator.addUpdateListener(new defpackage.nv(this, 10, null));
            valueAnimator.addListener(new defpackage.oyg(this));
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final void m(android.view.View view) {
        view.setVisibility(0);
        view.setFocusable(view.isEnabled());
        view.setDefaultFocusHighlightEnabled(false);
    }

    private final void n(android.view.View view) {
        defpackage.oyh oyhVar = this.j;
        if (oyhVar == null) {
            return;
        }
        oyhVar.a(view.getId() == com.google.android.projection.gearhead.R.id.page_up_container ? 0 : 1);
    }

    private final void o(android.view.View view, boolean z) {
        view.setEnabled(z);
        if (this.k) {
            view.setFocusable(z);
        }
    }

    public final void a() {
        if (this.l) {
            h(false);
        }
    }

    public final void b() {
        int color;
        int color2;
        int i;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            color = getContext().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_tint);
            color2 = getContext().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_scrollbar_thumb);
            i = com.google.android.projection.gearhead.R.drawable.gearhead_sdk_pagination_background;
        } else if (i3 != 1) {
            color = getContext().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_tint_night);
            color2 = getContext().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_scrollbar_thumb_night);
            i = com.google.android.projection.gearhead.R.drawable.gearhead_sdk_pagination_background_night;
        } else {
            color = getContext().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_tint_inverse);
            color2 = getContext().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_scrollbar_thumb_inverse);
            i = com.google.android.projection.gearhead.R.drawable.gearhead_sdk_pagination_background_inverse;
        }
        this.f.setBackgroundColor(color2);
        if (this.i && (i2 = this.m) != Integer.MAX_VALUE) {
            color = i2;
        }
        android.widget.ImageView imageView = this.c;
        imageView.setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_IN);
        imageView.setBackgroundResource(i);
        android.widget.ImageView imageView2 = this.d;
        imageView2.setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_IN);
        imageView2.setBackgroundResource(i);
    }

    public final void c(int i) {
        this.p = i;
        b();
    }

    public final void d(boolean z) {
        o(this.b, z);
        this.d.setImageAlpha(true != z ? 118 : 255);
    }

    public final void e(int i, int i2, int i3, boolean z) {
        java.lang.Float f;
        android.view.View view = this.h;
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        int iMax = java.lang.Math.max(java.lang.Math.min((i3 * height) / i, this.u), this.t);
        int i4 = height - iMax;
        if (this.b.isEnabled()) {
            i4 = (i4 * i2) / i;
        }
        android.widget.ImageView imageView = this.f;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams.height != iMax) {
            layoutParams.height = iMax;
            imageView.requestLayout();
        }
        float f2 = i4;
        imageView.animate().y(f2).setDuration(true != z ? 0 : 200).setInterpolator(this.s).start();
        if (!this.l) {
            i(false);
        } else if (f2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && ((f = this.v) == null || f.floatValue() != f2)) {
            i(true);
        }
        this.v = java.lang.Float.valueOf(f2);
    }

    public final void f(int i) {
        if (this.n) {
            return;
        }
        this.m = i;
    }

    public final void g(boolean z) {
        o(this.a, z);
        this.c.setImageAlpha(true != z ? 118 : 255);
        if (z || !this.l) {
            return;
        }
        h(false);
    }

    public final void h(boolean z) {
        int i;
        this.q.removeCallbacks(this.r);
        if (!this.l || (i = this.o) == 3) {
            return;
        }
        if (i == 1) {
            this.w.start();
        } else if (i == 4) {
            this.w.reverse();
        }
        android.animation.ValueAnimator valueAnimator = this.w;
        if (valueAnimator.isStarted()) {
            this.o = 2;
        }
        if (z || !valueAnimator.isStarted()) {
            return;
        }
        valueAnimator.end();
    }

    public final void i(boolean z) {
        if (this.i) {
            return;
        }
        android.os.Handler handler = this.q;
        java.lang.Runnable runnable = this.r;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 1000L);
        int i = this.o;
        if (i != 1) {
            if (i == 3 || i == 2) {
                this.w.reverse();
            }
            android.animation.ValueAnimator valueAnimator = this.w;
            if (valueAnimator.isStarted()) {
                this.o = 4;
            }
            if (z || !valueAnimator.isStarted()) {
                return;
            }
            valueAnimator.end();
        }
    }

    public final void j() {
        int i = true != this.l ? 8 : 0;
        android.view.ViewGroup viewGroup = this.g;
        viewGroup.setVisibility(i);
        if (this.i) {
            viewGroup.setAlpha(true != this.l ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : 1.0f);
        } else {
            this.f.setVisibility(true != this.l ? 0 : 8);
        }
    }

    final boolean k() {
        return this.g.hasFocus();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final boolean l() {
        return this.g.requestFocus(17);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        n(view);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        n(view);
        return true;
    }

    public static class TouchStealingFrameLayout extends android.widget.FrameLayout {
        public TouchStealingFrameLayout(android.content.Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
            return true;
        }

        public TouchStealingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public TouchStealingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public TouchStealingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    public PagedScrollBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PagedScrollBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
