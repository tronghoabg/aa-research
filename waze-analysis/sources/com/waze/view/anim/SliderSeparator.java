package com.waze.view.anim;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.ui.z.as;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SliderSeparator extends View {

    /* renamed from: a, reason: collision with root package name */
    private final int f44962a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f44963b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f44964c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44965d;

    /* renamed from: e, reason: collision with root package name */
    private int f44966e;

    /* renamed from: f, reason: collision with root package name */
    private float f44967f;

    /* renamed from: g, reason: collision with root package name */
    private int f44968g;

    /* renamed from: h, reason: collision with root package name */
    private final int f44969h;

    /* renamed from: i, reason: collision with root package name */
    private ObjectAnimator f44970i;

    public SliderSeparator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44965d = 200;
        this.f44966e = isInEditMode() ? 3 : as.f(1);
        this.f44967f = 0.0f;
        this.f44968g = 0;
        this.f44969h = (int) getResources().getDimension(R.dimen.gasEditSeparatorHeight);
        this.f44962a = ContextCompat.getColor(context, R.color.separator_default);
        this.f44966e = (int) Math.ceil(context.getResources().getDisplayMetrics().density);
        this.f44963b = new Path();
    }

    private final void d() {
        int width = getWidth();
        Path path = this.f44963b;
        path.reset();
        float f2 = this.f44969h;
        path.moveTo(-1.0f, f2);
        int i2 = this.f44968g;
        if (i2 > 0) {
            path.lineTo(this.f44967f - i2, f2);
            path.lineTo(this.f44967f, r2 - this.f44968g);
            path.lineTo(this.f44967f + this.f44968g, f2);
        }
        path.lineTo(width, f2);
    }

    public final void a(float f2) {
        ObjectAnimator objectAnimator = this.f44970i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        float f3 = this.f44967f;
        if (f3 == 0.0f) {
            this.f44967f = f2;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "indent", 0, this.f44969h);
            this.f44970i = objectAnimatorOfInt;
            objectAnimatorOfInt.setDuration(this.f44965d);
            this.f44970i.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f44970i.start();
            return;
        }
        this.f44968g = this.f44969h;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "position", f3, f2);
        this.f44970i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(this.f44965d);
        this.f44970i.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f44970i.start();
    }

    public final void b() {
        this.f44968g = 0;
        d();
        invalidate();
    }

    public final void c() {
        this.f44967f = 0.0f;
        d();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.drawPath(this.f44963b, this.f44964c);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        d();
        Paint paint = new Paint();
        this.f44964c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f44964c.setStrokeWidth(this.f44966e);
        this.f44964c.setColor(this.f44962a);
        this.f44964c.setAntiAlias(true);
    }
}
