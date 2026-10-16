package com.waze.ui.navbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static Bitmap f43092a;

    /* renamed from: b, reason: collision with root package name */
    private static Rect f43093b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f43094c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f43095d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f43096e;

    /* renamed from: f, reason: collision with root package name */
    private float f43097f;

    /* renamed from: g, reason: collision with root package name */
    private float f43098g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f43099h;

    /* renamed from: i, reason: collision with root package name */
    private final c f43100i;

    /* renamed from: j, reason: collision with root package name */
    private final int f43101j;

    /* renamed from: k, reason: collision with root package name */
    private final int f43102k;

    /* renamed from: l, reason: collision with root package name */
    private final float f43103l;
    private final float m;

    public a(c cVar, Context context) {
        this.f43100i = cVar;
        int color = ContextCompat.getColor(context, R.color.LanesSelectedColor);
        this.f43101j = color;
        int color2 = ContextCompat.getColor(context, R.color.LanesPassiveColor);
        this.f43102k = color2;
        this.f43103l = context.getResources().getDimension(R.dimen.lane_set_drawable_min_stroke_width);
        this.m = context.getResources().getDimension(R.dimen.lane_set_drawable_max_stroke_width);
        Paint paint = new Paint();
        this.f43094c = paint;
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f43095d = paint2;
        paint2.setColor(color2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f43096e = new Paint(3);
        if (f43092a == null) {
            f43092a = BitmapFactory.decodeResource(context.getResources(), R.drawable.direction_arrow_head);
            f43093b = new Rect(0, 0, f43092a.getWidth(), f43092a.getHeight());
        }
    }

    private static ColorFilter a(int i2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, 1.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    private final void b(Canvas canvas, b bVar, float f2, float f3, float f4, float f5) {
        boolean z = bVar.f43105b;
        Paint paint = z ? this.f43094c : this.f43095d;
        float f6 = 0.45f * f4;
        float f7 = bVar.f43104a + 90.0f;
        double d2 = (f7 / 180.0d) * 3.141592653589793d;
        float fCos = f2 - (((float) Math.cos(d2)) * f6);
        float fSin = f3 - (((float) Math.sin(d2)) * f6);
        float fCos2 = f2 - (((float) Math.cos(d2)) * f4);
        float fSin2 = f3 - (f4 * ((float) Math.sin(d2)));
        Path path = new Path();
        path.moveTo(f2, f5 + f3);
        path.lineTo(f2, f6 + f3);
        path.quadTo(f2, f3, fCos, fSin);
        path.lineTo(fCos2, fSin2);
        canvas.drawPath(path, paint);
        canvas.save();
        canvas.translate(fCos2 - (this.f43097f / 2.0f), fSin2 - (this.f43098g / 2.0f));
        canvas.rotate(f7 - 90.0f, this.f43097f / 2.0f, this.f43098g / 2.0f);
        Paint paint2 = this.f43096e;
        paint2.setColorFilter(a(z ? this.f43101j : this.f43102k));
        canvas.drawBitmap(f43092a, f43093b, this.f43099h, paint2);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b9  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.navbar.a.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
