package com.waze.view.anim;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SelectorBg extends View {

    /* renamed from: a, reason: collision with root package name */
    private final int f44951a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44952b;

    /* renamed from: c, reason: collision with root package name */
    private Path f44953c;

    /* renamed from: d, reason: collision with root package name */
    private Path f44954d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f44955e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f44956f;

    /* renamed from: g, reason: collision with root package name */
    private final int f44957g;

    /* renamed from: h, reason: collision with root package name */
    private int f44958h;

    /* renamed from: i, reason: collision with root package name */
    private int f44959i;

    /* renamed from: j, reason: collision with root package name */
    private ObjectAnimator f44960j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f44961k;

    public SelectorBg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44957g = 200;
        this.f44958h = 3;
        this.f44961k = false;
        this.f44951a = ContextCompat.getColor(context, R.color.separator_default);
        this.f44952b = ContextCompat.getColor(context, R.color.surface_default);
        this.f44958h = (int) Math.ceil(context.getResources().getDisplayMetrics().density);
    }

    private final void c(Path path, int i2, float f2) {
        path.reset();
        path.moveTo(-1.0f, this.f44958h / 2);
        if (f2 > 0.0f) {
            float f3 = i2 / 2;
            path.lineTo(f3 - f2, this.f44958h / 2);
            path.lineTo(f3, f2);
            path.lineTo(f3 + f2, this.f44958h / 2);
        }
        path.lineTo(i2, this.f44958h / 2);
    }

    public final void a() {
        if (this.f44953c == null) {
            this.f44961k = true;
            return;
        }
        ObjectAnimator objectAnimator = this.f44960j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, TypedValues.CycleType.S_WAVE_OFFSET, 0, getHeight() / 10);
        this.f44960j = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(this.f44957g);
        this.f44960j.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f44960j.start();
    }

    public final void b() {
        ObjectAnimator objectAnimator = this.f44960j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, TypedValues.CycleType.S_WAVE_OFFSET, getHeight() / 10, 0);
        this.f44960j = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(this.f44957g);
        this.f44960j.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f44960j.start();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.drawPath(this.f44953c, this.f44955e);
        canvas.drawPath(this.f44954d, this.f44956f);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6;
        super.onSizeChanged(i2, i3, i4, i5);
        this.f44959i = 0;
        if (isInEditMode()) {
            this.f44959i = i3 / 10;
            i6 = 128;
        } else {
            i6 = 0;
        }
        Path path = new Path();
        this.f44953c = path;
        c(path, i2, this.f44959i);
        float f2 = i3;
        path.lineTo(i2, f2);
        path.lineTo(0.0f, f2);
        path.lineTo(0.0f, this.f44958h);
        Path path2 = new Path();
        this.f44954d = path2;
        c(path2, i2, this.f44959i);
        Paint paint = new Paint();
        this.f44955e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f44955e.setColor(this.f44952b);
        this.f44955e.setAlpha(i6);
        this.f44955e.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f44956f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f44956f.setStrokeWidth(this.f44958h);
        this.f44956f.setColor(this.f44951a);
        this.f44956f.setAntiAlias(true);
        if (this.f44961k) {
            a();
            this.f44961k = false;
        }
    }
}
