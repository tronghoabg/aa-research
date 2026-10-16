package com.waze.view.pages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class LinePageIndicator extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private ViewPager f45120a;

    /* renamed from: b, reason: collision with root package name */
    private int f45121b;

    /* renamed from: c, reason: collision with root package name */
    private int f45122c;

    /* renamed from: d, reason: collision with root package name */
    private float f45123d;

    /* renamed from: e, reason: collision with root package name */
    private float f45124e;

    /* renamed from: f, reason: collision with root package name */
    private float f45125f;

    /* renamed from: g, reason: collision with root package name */
    private final Interpolator f45126g;

    /* renamed from: h, reason: collision with root package name */
    private final Interpolator f45127h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f45128i;

    /* renamed from: j, reason: collision with root package name */
    private Paint f45129j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f45130k;

    public LinePageIndicator(Context context) {
        super(context);
        this.f45121b = 0;
        this.f45122c = 0;
        this.f45126g = new AccelerateInterpolator(0.75f);
        this.f45127h = new DecelerateInterpolator(0.75f);
        this.f45130k = new RectF();
        b(context);
    }

    private final void b(Context context) {
        int color = ResourcesCompat.getColor(context.getResources(), R.color.hairline, null);
        Paint paint = new Paint(1);
        this.f45128i = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f45128i.setColor(color);
        int color2 = ResourcesCompat.getColor(context.getResources(), R.color.hairline_strong, null);
        Paint paint2 = new Paint(1);
        this.f45129j = paint2;
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f45129j.setColor(color2);
    }

    private final void c() {
        if (this.f45120a == null || this.f45121b == 0 || this.f45122c == 0) {
            return;
        }
        this.f45123d = this.f45121b / r0.getAdapter().getCount();
    }

    public final void a(ViewPager viewPager) {
        this.f45120a = viewPager;
        c();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f45130k;
        rectF.left = 0.0f;
        rectF.right = this.f45121b;
        rectF.top = 0.0f;
        rectF.bottom = this.f45122c;
        float f2 = this.f45122c / 2;
        canvas.drawRoundRect(rectF, f2, f2, this.f45128i);
        rectF.left = this.f45124e;
        rectF.right = this.f45125f;
        float f3 = this.f45122c / 2;
        canvas.drawRoundRect(rectF, f3, f3, this.f45129j);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i2, float f2, int i3) {
        float f3 = this.f45123d;
        float f4 = i2 * f3;
        this.f45124e = f4;
        this.f45125f = (i2 + 1) * f3;
        this.f45124e = f4 + (this.f45126g.getInterpolation(f2) * this.f45123d);
        this.f45125f += this.f45127h.getInterpolation(f2) * this.f45123d;
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i2) {
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f45121b = i2;
        this.f45122c = i3;
        c();
        if (isInEditMode()) {
            float f2 = this.f45121b / 5.0f;
            this.f45124e = f2;
            this.f45125f = f2 + f2;
        }
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45121b = 0;
        this.f45122c = 0;
        this.f45126g = new AccelerateInterpolator(0.75f);
        this.f45127h = new DecelerateInterpolator(0.75f);
        this.f45130k = new RectF();
        b(context);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f45121b = 0;
        this.f45122c = 0;
        this.f45126g = new AccelerateInterpolator(0.75f);
        this.f45127h = new DecelerateInterpolator(0.75f);
        this.f45130k = new RectF();
        b(context);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f45121b = 0;
        this.f45122c = 0;
        this.f45126g = new AccelerateInterpolator(0.75f);
        this.f45127h = new DecelerateInterpolator(0.75f);
        this.f45130k = new RectF();
        b(context);
    }
}
