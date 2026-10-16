package com.waze.main_screen.g;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.waze.R;
import com.waze.ig;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26386a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f26387b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26388c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26389d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26390e;

    /* renamed from: f, reason: collision with root package name */
    private int f26391f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26392g;

    public f(Context context, int i2) throws Resources.NotFoundException {
        int dimensionPixelSize;
        super(context, null, 0);
        this.f26386a = false;
        this.f26389d = true;
        Objects.requireNonNull(this);
        Objects.requireNonNull(this);
        this.f26392g = i2;
        if (f().booleanValue()) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.button_pack_entry_icon_size);
            this.f26390e = dimensionPixelSize;
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.top_right_floating_buttons_image_size);
            this.f26390e = dimensionPixelSize;
        }
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return;
        }
        layoutInflater.inflate(R.layout.compass_button, this);
        ImageView imageView = (ImageView) findViewById(R.id.compassImage);
        this.f26387b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        if (!f().booleanValue()) {
            setOnClickListener(new com.waze.inbox.e(6));
            return;
        }
        this.f26387b.setImageResource(com.waze.design_components.b.d.bZ.b());
        this.f26387b.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        this.f26391f = getResources().getConfiguration().uiMode;
    }

    private final Boolean f() {
        return Boolean.valueOf(this.f26392g == 2);
    }

    public final void b(boolean z) {
        if (z != this.f26388c) {
            this.f26388c = z;
            boolean zBooleanValue = f().booleanValue();
            ImageView imageView = this.f26387b;
            if (zBooleanValue) {
                imageView.setImageResource(this.f26388c ? com.waze.design_components.b.d.ca.b() : com.waze.design_components.b.d.bZ.b());
            } else {
                imageView.setImageResource(true != this.f26388c ? R.drawable.compass_regular : R.drawable.compass_north_always);
            }
        }
    }

    public final void c(float f2, boolean z) {
        if (this.f26387b == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (z) {
            f2 = 360.0f - f2;
        }
        float f3 = this.f26390e / 2.0f;
        matrix.setRotate(f2, f3, f3);
        this.f26387b.setImageMatrix(matrix);
    }

    public final void d() {
        if (!this.f26389d) {
            this.f26389d = true;
            post(new ig(this, 8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        if (isClickable()) {
            int[] drawableState = getDrawableState();
            int length = drawableState.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else {
                    if (drawableState[i2] == 16842919) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.addUpdateListener(new com.waze.design_components.button.timer.b(this, 2));
            if (z) {
                this.f26386a = true;
                valueAnimatorOfFloat.start();
            } else if (this.f26386a) {
                this.f26386a = false;
                valueAnimatorOfFloat.reverse();
            }
        }
    }

    public final void e() {
        if (this.f26391f != getResources().getConfiguration().uiMode) {
            this.f26391f = getResources().getConfiguration().uiMode;
            this.f26387b.setImageResource(this.f26388c ? com.waze.design_components.b.d.ca.b() : com.waze.design_components.b.d.bZ.b());
        }
    }
}
