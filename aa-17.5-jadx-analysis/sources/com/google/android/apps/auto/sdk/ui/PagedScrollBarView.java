package com.google.android.apps.auto.sdk.ui;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.nt;
import defpackage.oez;
import defpackage.oxj;
import defpackage.oxk;
import defpackage.oxl;

/* loaded from: classes2.dex */
public class PagedScrollBarView extends FrameLayout implements View.OnClickListener, View.OnLongClickListener {
    public final View a;
    public final View b;
    public final ImageView c;
    public final ImageView d;
    public final int e;
    public final ImageView f;
    public final ViewGroup g;
    public final View h;
    public final boolean i;
    public oxk j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    private int p;
    private final Handler q;
    private final Runnable r;
    private final Interpolator s;
    private final int t;
    private final int u;
    private Float v;
    private final ValueAnimator w;

    public PagedScrollBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.q = new Handler(Looper.getMainLooper());
        this.r = new oez(this, 16);
        this.s = new AccelerateDecelerateInterpolator();
        this.o = 1;
        this.m = Alert.DURATION_SHOW_INDEFINITELY;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oxl.e, i, i2);
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.i = z;
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.gearhead_sdk_paged_scrollbar_buttons, (ViewGroup) this, true);
            this.c = (ImageView) findViewById(R.id.page_up);
            View viewFindViewById = findViewById(R.id.page_up_container);
            this.a = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            viewFindViewById.setOnLongClickListener(this);
            this.d = (ImageView) findViewById(R.id.page_down);
            View viewFindViewById2 = findViewById(R.id.page_down_container);
            this.b = viewFindViewById2;
            viewFindViewById2.setOnClickListener(this);
            viewFindViewById2.setOnLongClickListener(this);
            this.e = context.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_pagination_button_elevation);
            ImageView imageView = (ImageView) findViewById(R.id.scrollbar_moving_thumb);
            this.f = imageView;
            if (z) {
                imageView.setVisibility(8);
            }
            this.h = findViewById(R.id.filler);
            this.g = (ViewGroup) findViewById(R.id.action_button_parent);
            this.t = getResources().getDimensionPixelSize(R.dimen.min_thumb_height);
            this.u = getResources().getDimensionPixelSize(R.dimen.max_thumb_height);
            if (!context.getResources().getBoolean(R.bool.gearhead_sdk_true_for_touch)) {
                viewFindViewById.setVisibility(8);
                viewFindViewById2.setVisibility(8);
                if (Log.isLoggable("PagedScrollBarView", 2)) {
                    Log.v("PagedScrollBarView", "Hide pagination buttons for non-touch.");
                }
            }
            ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.scroll_bar_thumb_elements_fade);
            this.w = valueAnimator;
            if (z) {
                return;
            }
            valueAnimator.addUpdateListener(new nt(this, 10, null));
            valueAnimator.addListener(new oxj(this));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final void m(View view) {
        view.setVisibility(0);
        view.setFocusable(view.isEnabled());
        view.setDefaultFocusHighlightEnabled(false);
    }

    private final void n(View view) {
        oxk oxkVar = this.j;
        if (oxkVar == null) {
            return;
        }
        oxkVar.a(view.getId() == R.id.page_up_container ? 0 : 1);
    }

    private final void o(View view, boolean z) {
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
            color = getContext().getColor(R.color.gearhead_sdk_tint);
            color2 = getContext().getColor(R.color.gearhead_sdk_scrollbar_thumb);
            i = R.drawable.gearhead_sdk_pagination_background;
        } else if (i3 != 1) {
            color = getContext().getColor(R.color.gearhead_sdk_tint_night);
            color2 = getContext().getColor(R.color.gearhead_sdk_scrollbar_thumb_night);
            i = R.drawable.gearhead_sdk_pagination_background_night;
        } else {
            color = getContext().getColor(R.color.gearhead_sdk_tint_inverse);
            color2 = getContext().getColor(R.color.gearhead_sdk_scrollbar_thumb_inverse);
            i = R.drawable.gearhead_sdk_pagination_background_inverse;
        }
        this.f.setBackgroundColor(color2);
        if (this.i && (i2 = this.m) != Integer.MAX_VALUE) {
            color = i2;
        }
        ImageView imageView = this.c;
        imageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        imageView.setBackgroundResource(i);
        ImageView imageView2 = this.d;
        imageView2.setColorFilter(color, PorterDuff.Mode.SRC_IN);
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
        Float f;
        View view = this.h;
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        int iMax = Math.max(Math.min((i3 * height) / i, this.u), this.t);
        int i4 = height - iMax;
        if (this.b.isEnabled()) {
            i4 = (i4 * i2) / i;
        }
        ImageView imageView = this.f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams.height != iMax) {
            layoutParams.height = iMax;
            imageView.requestLayout();
        }
        float f2 = i4;
        imageView.animate().y(f2).setDuration(true != z ? 0 : 200).setInterpolator(this.s).start();
        if (!this.l) {
            i(false);
        } else if (f2 > BitmapDescriptorFactory.HUE_RED && ((f = this.v) == null || f.floatValue() != f2)) {
            i(true);
        }
        this.v = Float.valueOf(f2);
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
        ValueAnimator valueAnimator = this.w;
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
        Handler handler = this.q;
        Runnable runnable = this.r;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 1000L);
        int i = this.o;
        if (i != 1) {
            if (i == 3 || i == 2) {
                this.w.reverse();
            }
            ValueAnimator valueAnimator = this.w;
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
        ViewGroup viewGroup = this.g;
        viewGroup.setVisibility(i);
        if (this.i) {
            viewGroup.setAlpha(true != this.l ? BitmapDescriptorFactory.HUE_RED : 1.0f);
        } else {
            this.f.setVisibility(true != this.l ? 0 : 8);
        }
    }

    final boolean k() {
        return this.g.hasFocus();
    }

    @ResultIgnorabilityUnspecified
    final boolean l() {
        return this.g.requestFocus(17);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n(view);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        n(view);
        return true;
    }

    public static class TouchStealingFrameLayout extends FrameLayout {
        public TouchStealingFrameLayout(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public TouchStealingFrameLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public TouchStealingFrameLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public TouchStealingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    public PagedScrollBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PagedScrollBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
