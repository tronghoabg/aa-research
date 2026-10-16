package com.waze.view.timer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class TimerCircle extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f45387a;

    /* renamed from: b, reason: collision with root package name */
    private float f45388b;

    /* renamed from: c, reason: collision with root package name */
    private int f45389c;

    /* renamed from: d, reason: collision with root package name */
    private int f45390d;

    /* renamed from: e, reason: collision with root package name */
    private int f45391e;

    /* renamed from: f, reason: collision with root package name */
    private RectF f45392f;

    /* renamed from: g, reason: collision with root package name */
    private RectF f45393g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f45394h;

    public TimerCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45388b = 1.0f;
        this.f45394h = new Path();
        Paint paint = new Paint();
        this.f45387a = paint;
        paint.setColor(context.getResources().getColor(R.color.primary));
        paint.setAntiAlias(true);
        this.f45388b = true != isInEditMode() ? 0.9999f : 0.6666f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != this.f45389c || getHeight() != this.f45390d) {
            this.f45389c = getWidth();
            int height = getHeight();
            this.f45390d = height;
            int iMin = Math.min(this.f45389c, height) - 6;
            this.f45391e = iMin;
            int i2 = this.f45389c - iMin;
            int i3 = (this.f45390d - iMin) / 2;
            int i4 = i2 / 2;
            this.f45392f = new RectF(i4, i3, i4 + iMin, i3 + iMin);
            int i5 = iMin / 9;
            int i6 = i3 + i5;
            int i7 = i4 + i5;
            this.f45393g = new RectF(i7, i6, r3 + i7, i6 + (this.f45391e - (i5 + i5)));
        }
        Paint paint = this.f45387a;
        Path path = this.f45394h;
        path.reset();
        float f2 = this.f45388b * (-360.0f);
        path.arcTo(this.f45392f, 270.0f, -f2);
        path.arcTo(this.f45393g, 270.0f - f2, f2);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
    }
}
