package com.waze.view.map;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SpeedometerColoredView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    private final int f45034a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f45035b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f45036c;

    /* renamed from: d, reason: collision with root package name */
    private float f45037d;

    /* renamed from: e, reason: collision with root package name */
    private int f45038e;

    /* renamed from: f, reason: collision with root package name */
    private int f45039f;

    /* renamed from: g, reason: collision with root package name */
    private int f45040g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f45041h;

    /* renamed from: i, reason: collision with root package name */
    private RectF f45042i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f45043j;

    /* renamed from: k, reason: collision with root package name */
    private final Path f45044k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45045l;

    public SpeedometerColoredView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        int color = getResources().getColor(R.color.RedSweet);
        this.f45034a = color;
        this.f45037d = 0.0f;
        this.f45043j = new Path();
        this.f45044k = new Path();
        this.f45045l = false;
        Paint paint = new Paint();
        this.f45035b = paint;
        new BitmapFactory.Options().inSampleSize = 4;
        paint.setAntiAlias(true);
        paint.setColor(color);
        Paint paint2 = new Paint();
        this.f45036c = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-1715550260);
        if (isInEditMode()) {
            this.f45037d = 120.0f;
        }
    }

    public final void a(int i2) {
        if (i2 == 2) {
            this.f45035b.setColor(this.f45034a);
        } else if (i2 == 1) {
            this.f45035b.setColor(-1715550260);
        }
    }

    public final void b(boolean z, int i2) {
        this.f45045l = z;
        if (z) {
            if (i2 == 2) {
                this.f45036c.setColor(this.f45034a);
            } else if (i2 == 1) {
                this.f45036c.setColor(-1715550260);
            }
        }
    }

    public final void c(float f2) {
        this.f45037d = f2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != this.f45038e || getHeight() != this.f45039f) {
            this.f45038e = getWidth();
            int height = getHeight();
            this.f45039f = height;
            int iMin = Math.min(this.f45038e, height) - 6;
            this.f45040g = iMin;
            int i2 = this.f45038e - iMin;
            int i3 = (this.f45039f - iMin) / 2;
            int i4 = i2 / 2;
            this.f45041h = new RectF(i4, i3, i4 + iMin, i3 + iMin);
            int i5 = iMin / 16;
            int i6 = i3 + i5;
            int i7 = i4 + i5;
            this.f45042i = new RectF(i7, i6, r3 + i7, i6 + (this.f45040g - (i5 + i5)));
        }
        if (this.f45041h == null || this.f45042i == null) {
            return;
        }
        Paint paint = this.f45036c;
        if (this.f45045l) {
            Path path = this.f45044k;
            path.reset();
            path.addOval(this.f45041h, Path.Direction.CW);
            path.addOval(this.f45042i, Path.Direction.CCW);
            path.close();
            canvas.drawPath(path, paint);
        }
        Paint paint2 = this.f45035b;
        Path path2 = this.f45043j;
        path2.reset();
        path2.arcTo(this.f45041h, 90.0f, this.f45037d);
        RectF rectF = this.f45042i;
        float f2 = this.f45037d;
        path2.arcTo(rectF, 90.0f + f2, -f2);
        path2.close();
        canvas.drawPath(path2, paint2);
    }
}
