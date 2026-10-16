package com.waze.sharedui.views;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class CirclePulseFrame extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Paint f39129a;

    /* renamed from: b, reason: collision with root package name */
    boolean f39130b;

    /* renamed from: c, reason: collision with root package name */
    long[] f39131c;

    /* renamed from: d, reason: collision with root package name */
    long f39132d;

    /* renamed from: e, reason: collision with root package name */
    private int f39133e;

    /* renamed from: f, reason: collision with root package name */
    private int f39134f;

    /* renamed from: g, reason: collision with root package name */
    private float f39135g;

    /* renamed from: h, reason: collision with root package name */
    private float f39136h;

    /* renamed from: i, reason: collision with root package name */
    private int f39137i;

    /* renamed from: j, reason: collision with root package name */
    private int f39138j;

    public CirclePulseFrame(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39132d = 0L;
        setWillNotDraw(false);
        this.f39138j = ContextCompat.getColor(getContext(), R.color.alarming);
        if (isInEditMode()) {
            b(true);
        }
    }

    public final void a() {
        this.f39132d = 0L;
        this.f39131c = new long[10];
        forceLayout();
    }

    public final void b(boolean z) {
        this.f39130b = z;
        if (z) {
            if (this.f39129a == null) {
                Paint paint = new Paint();
                this.f39129a = paint;
                paint.setColor(this.f39138j);
                this.f39129a.setAntiAlias(true);
                this.f39129a.setStyle(Paint.Style.STROKE);
                Paint paint2 = this.f39129a;
                float f2 = getResources().getDisplayMetrics().density;
                paint2.setStrokeWidth(f2 + f2);
            }
            if (this.f39131c == null) {
                this.f39131c = new long[10];
                if (isInEditMode()) {
                    this.f39131c[0] = System.currentTimeMillis() - 850;
                }
            }
            invalidate();
        }
    }

    public final void c(int i2) {
        this.f39138j = i2;
        Paint paint = new Paint();
        this.f39129a = paint;
        paint.setColor(this.f39138j);
        this.f39129a.setAntiAlias(true);
        this.f39129a.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.f39129a;
        float f2 = getResources().getDisplayMetrics().density;
        paint2.setStrokeWidth(f2 + f2);
        invalidate();
    }

    public final void d(int i2) {
        this.f39137i = i2;
        this.f39134f = (int) (i2 * 0.9f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r13 = r20.f39132d + 800;
        r20.f39132d = r13;
        r9[r1] = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[PHI: r18
  0x009d: PHI (r18v2 long) = (r18v1 long), (r18v5 long) binds: [B:34:0x009b, B:31:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.views.CirclePulseFrame.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f39133e = Math.min(measuredWidth, measuredHeight) / 2;
        this.f39135g = measuredWidth * 0.5f;
        this.f39136h = measuredHeight * 0.5f;
        this.f39134f = this.f39137i;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                int i7 = measuredWidth / 2;
                int i8 = measuredHeight / 2;
                this.f39134f = Math.max(this.f39134f, Math.min(childAt.getBottom() - i8, Math.min(childAt.getRight() - i7, Math.min(i7 - childAt.getLeft(), i8 - childAt.getTop()))));
            }
        }
        this.f39134f = (int) (this.f39134f * 0.9f);
    }

    public CirclePulseFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CirclePulseFrame(Context context) {
        this(context, null);
    }
}
