package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    Drawable f39223a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f39224b;

    /* renamed from: c, reason: collision with root package name */
    private int f39225c;

    /* renamed from: d, reason: collision with root package name */
    private int f39226d;

    /* renamed from: e, reason: collision with root package name */
    private int f39227e;

    /* renamed from: f, reason: collision with root package name */
    private int f39228f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39229g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39230h;

    /* renamed from: i, reason: collision with root package name */
    private int f39231i;

    /* renamed from: j, reason: collision with root package name */
    private int f39232j;

    /* renamed from: k, reason: collision with root package name */
    private int f39233k;

    /* renamed from: l, reason: collision with root package name */
    private int f39234l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private Path r;
    private Paint s;
    private Paint t;
    private float u;
    private float v;
    private float w;
    private float x;

    d(ViewGroup viewGroup, AttributeSet attributeSet) {
        this.f39231i = com.waze.shared_infra.i.h.r(4);
        this.f39232j = com.waze.shared_infra.i.h.r(4);
        this.f39234l = com.waze.shared_infra.i.h.r(8);
        this.m = com.waze.shared_infra.i.h.r(8);
        this.n = com.waze.shared_infra.i.h.r(8);
        this.o = com.waze.shared_infra.i.h.r(8);
        this.p = -1;
        this.q = -1;
        this.r = new Path();
        this.f39224b = viewGroup;
        e(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39065c);
        this.f39225c = typedArrayObtainStyledAttributes.getColor(1, this.f39225c);
        if (typedArrayObtainStyledAttributes.hasValue(6) || typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f39229g = true;
            this.f39226d = typedArrayObtainStyledAttributes.getColor(6, this.f39226d);
            this.f39227e = typedArrayObtainStyledAttributes.getColor(7, this.f39227e);
            float[] fArr = new float[3];
            if (!typedArrayObtainStyledAttributes.hasValue(6)) {
                ColorUtils.colorToHSL(this.f39227e, fArr);
                fArr[2] = fArr[2] * 0.85f;
                this.f39226d = ColorUtils.HSLToColor(fArr);
            }
            if (!typedArrayObtainStyledAttributes.hasValue(7)) {
                ColorUtils.colorToHSL(this.f39226d, fArr);
                fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
                this.f39227e = ColorUtils.HSLToColor(fArr);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, this.f39231i);
        this.f39231i = dimensionPixelSize;
        this.f39232j = dimensionPixelSize;
        this.f39233k = typedArrayObtainStyledAttributes.getColor(9, this.f39233k);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.f39234l);
        this.f39234l = dimensionPixelSize2;
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize2);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f39234l);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f39234l);
        this.f39228f = typedArrayObtainStyledAttributes.getColor(8, this.f39228f);
        this.f39230h = typedArrayObtainStyledAttributes.getBoolean(0, this.f39230h);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    private final void d(int i2) {
        int i3;
        Paint paint = new Paint(1);
        this.s = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        boolean z = this.f39229g;
        Paint paint2 = this.s;
        if (z) {
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i2, this.f39226d, this.f39227e, Shader.TileMode.CLAMP));
        } else {
            paint2.setColor(this.f39225c);
        }
        this.f39224b.setLayerType(1, null);
        int i4 = this.f39233k;
        if (i4 != 0 && (i3 = this.f39232j) > 0) {
            float f2 = i3;
            this.s.setShadowLayer(f2, 0.0f, f2 / 4.0f, i4);
        }
        if (this.f39228f != 0) {
            Paint paint3 = new Paint(1);
            this.t = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.t.setColor(this.f39228f);
            this.t.setStrokeWidth(com.waze.shared_infra.i.h.r(1));
        }
    }

    private final void e(Context context) {
        int color = ContextCompat.getColor(context, R.color.background_default);
        this.f39225c = color;
        this.f39226d = color;
        this.f39227e = color;
        this.f39233k = ContextCompat.getColor(context, R.color.transparent);
        this.f39228f = ContextCompat.getColor(context, R.color.separator_default);
    }

    final void a() {
        ViewGroup viewGroup = this.f39224b;
        viewGroup.setWillNotDraw(false);
        viewGroup.setPersistentDrawingCache(3);
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        this.f39223a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.f39223a.setCallback(viewGroup);
        d(1);
    }

    protected final void b(Canvas canvas) {
        canvas.drawPath(this.r, this.s);
        Paint paint = this.t;
        if (paint != null) {
            if (this.f39234l == 0 || this.m == 0) {
                float f2 = this.w;
                float f3 = this.u;
                canvas.drawLine(f2, f3, this.x, f3, paint);
            }
        }
    }

    protected final void c(int i2, int i3) {
        if (this.p == i2 && this.q == i3) {
            return;
        }
        this.p = i2;
        this.q = i3;
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        if (this.f39229g || this.s == null) {
            d(i3);
        }
        float f2 = (this.f39234l == 0 && this.m == 0) ? 0.0f : this.f39231i;
        this.u = f2;
        float f3 = i3 - ((this.n == 0 && this.o == 0) ? 0 : this.f39231i);
        this.v = f3;
        float f4 = this.f39230h ? 0.0f : this.f39231i;
        this.w = f4;
        float f5 = i2 - f4;
        this.x = f5;
        Path path = new Path();
        int i4 = this.m;
        float f6 = i4 + i4;
        float f7 = f2 + f6;
        int i5 = this.o;
        float f8 = i5 + i5;
        float f9 = f3 - f8;
        int i6 = this.n;
        float f10 = i6 + i6;
        float f11 = f3 - f10;
        int i7 = this.f39234l;
        float f12 = i7 + i7;
        float f13 = f2 + f12;
        float f14 = f12 + f4;
        path.moveTo(f14, f2);
        float f15 = f5 - f6;
        path.lineTo(f15, f2);
        RectF rectF = new RectF(f15, f2, f5, f7);
        path.arcTo(rectF, 270.0f, 90.0f);
        path.lineTo(f5, f9);
        rectF.set(f5 - f8, f9, f5, f3);
        path.arcTo(rectF, 0.0f, 90.0f);
        float f16 = f10 + f4;
        path.lineTo(f16, f3);
        rectF.set(f4, f11, f16, f3);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.lineTo(f4, f13);
        rectF.set(f4, f2, f14, f13);
        path.arcTo(rectF, 180.0f, 90.0f);
        this.r = path;
        Drawable drawable = this.f39223a;
        if (drawable != null) {
            drawable.setBounds((int) this.w, (int) this.u, (int) this.x, (int) this.v);
        }
        this.f39224b.invalidate();
    }

    d(ViewGroup viewGroup) {
        this.f39231i = com.waze.shared_infra.i.h.r(4);
        this.f39232j = com.waze.shared_infra.i.h.r(4);
        this.f39234l = com.waze.shared_infra.i.h.r(8);
        this.m = com.waze.shared_infra.i.h.r(8);
        this.n = com.waze.shared_infra.i.h.r(8);
        this.o = com.waze.shared_infra.i.h.r(8);
        this.p = -1;
        this.q = -1;
        this.r = new Path();
        this.f39224b = viewGroup;
        e(viewGroup.getContext());
        a();
    }
}
