package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nyn extends Drawable {
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final Path d;
    private final Path e;
    private final Path f;
    private final Path g;
    private final RectF h;
    private final RectF i;
    private final Matrix j;
    private final Path k;
    private final Path l;
    private final Path m;
    private final Path n;
    private final Path o;
    private final int p;
    private final int q;
    private boolean r;
    private final int s;
    private boolean t;
    private boolean u;
    private int v;
    private final Paint w;
    private final Paint x;
    private final Paint y;
    private final Paint z;

    public nyn(Context context, boolean z, Integer num) throws Resources.NotFoundException {
        this.a = context;
        this.b = z;
        this.c = !z;
        Path path = new Path();
        this.d = path;
        this.e = new Path();
        Path path2 = new Path();
        this.f = path2;
        this.g = new Path();
        RectF rectF = new RectF();
        this.h = rectF;
        this.i = new RectF();
        this.j = new Matrix();
        Path path3 = new Path();
        this.k = path3;
        this.l = new Path();
        Path path4 = new Path();
        this.m = path4;
        this.n = new Path();
        Path path5 = new Path();
        this.o = path5;
        int iIntValue = num != null ? num.intValue() : spu.aO(context, R.attr.colorOnSurface);
        this.s = iIntValue;
        Paint paint = new Paint(1);
        paint.setColor(iIntValue);
        paint.setAlpha(255);
        paint.setDither(true);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeMiter(3.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(BlendMode.SRC);
        }
        this.w = paint;
        Paint paint2 = new Paint(1);
        paint2.setDither(true);
        paint2.setColor(spu.aO(context, R.attr.colorSurface));
        paint2.setStrokeWidth(3.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeMiter(3.0f);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        if (Build.VERSION.SDK_INT >= 29) {
            paint2.setBlendMode(BlendMode.CLEAR);
        }
        this.x = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(iIntValue);
        paint3.setAlpha(255);
        paint3.setDither(true);
        paint3.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.y = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(iIntValue);
        paint4.setAlpha(89);
        paint4.setDither(true);
        paint4.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
        this.z = paint4;
        float f = context.getResources().getDisplayMetrics().density;
        this.p = (int) (20.0f * f);
        this.q = (int) (f * 12.0f);
        Resources resources = context.getResources();
        int i = R.string.samsung_battery_meter_perimeter_path;
        String string = resources.getString(true != z ? R.string.battery_meter_perimeter_path : R.string.samsung_battery_meter_perimeter_path);
        string.getClass();
        path.set(dtd.b(string));
        path.computeBounds(new RectF(), true);
        String string2 = context.getResources().getString(true != z ? R.string.battery_meter_fill_mask : i);
        string2.getClass();
        path2.set(dtd.b(string2));
        path2.computeBounds(rectF, true);
        if (z) {
            rectF.top = rectF.bottom * 0.2f;
            rectF.bottom *= 0.9f;
        }
        String string3 = context.getResources().getString(true != z ? R.string.battery_meter_bolt_path : R.string.samsung_battery_meter_bolt_path);
        string3.getClass();
        path3.set(dtd.b(string3));
        String string4 = context.getResources().getString(R.string.battery_meter_powersave_path);
        string4.getClass();
        path4.set(dtd.b(string4));
        String string5 = context.getResources().getString(R.string.battery_meter_exclamation_path);
        string5.getClass();
        path5.set(dtd.b(string5));
    }

    private final int d(int i) {
        if (i <= 15) {
            return -704968;
        }
        return this.s;
    }

    public final void a(int i) {
        boolean z = true;
        if (!this.b && i < 67) {
            z = i <= 33 ? false : this.r;
        }
        this.r = z;
        this.v = i;
        invalidateSelf();
    }

    public final void b(boolean z) {
        this.t = z;
        invalidateSelf();
    }

    public final void c(boolean z) {
        this.u = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        boolean z = this.t;
        int iD = z ? this.s : (!this.b && this.u) ? this.s : d(this.v);
        boolean z2 = this.b;
        int i = (z2 || z || !this.u) ? this.s : -704968;
        Paint paint = this.y;
        paint.setColor(i);
        canvas.saveLayer(null, null);
        RectF rectF = this.i;
        rectF.set(this.h);
        if (z2) {
            Path path = new Path();
            path.addPath(this.e);
            if (this.t) {
                path.op(this.l, Path.Op.DIFFERENCE);
            }
            canvas.drawPath(path, this.z);
        }
        Path path2 = new Path();
        Path path3 = new Path();
        int i2 = this.v;
        if (i2 <= 4 && !this.t) {
            if (this.c) {
                canvas.drawPath(this.e, paint);
            }
            paint.setColor(-704968);
            canvas.drawPath(this.o, paint);
            return;
        }
        rectF.top = (float) Math.floor(i2 >= 95 ? r6.top : (r6.height() * (1.0f - (i2 / 100.0f))) + r6.top);
        path3.addRect(rectF, Path.Direction.CCW);
        if (z2) {
            path2.addPath(path3);
            path2.op(this.e, Path.Op.INTERSECT);
        } else {
            path2.addPath(this.e);
            path2.op(path3, Path.Op.UNION);
        }
        if (this.t) {
            Path path4 = this.l;
            path2.op(path4, Path.Op.DIFFERENCE);
            if (!this.r) {
                canvas.drawPath(path4, paint);
            }
        }
        if (true == z2) {
            i = iD;
        }
        paint.setColor(i);
        canvas.drawPath(path2, paint);
        if (this.t) {
            Path path5 = this.l;
            canvas.clipOutPath(path5);
            if (this.c) {
                if (this.r) {
                    canvas.drawPath(path5, this.w);
                } else {
                    canvas.drawPath(path5, this.x);
                }
            }
        } else if (this.c) {
            paint.setColor(iD);
            canvas.save();
            canvas.clipPath(this.g);
            canvas.drawPath(path3, paint);
            canvas.restore();
            if (this.u) {
                paint.setColor(-704968);
                canvas.drawPath(this.n, paint);
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        boolean zIsEmpty = rect.isEmpty();
        Matrix matrix = this.j;
        if (zIsEmpty) {
            matrix.setScale(1.0f, 1.0f);
        } else {
            matrix.setScale(rect.right / 12.0f, rect.bottom / 20.0f);
        }
        Path path = this.d;
        Matrix matrix2 = this.j;
        path.transform(matrix2, this.e);
        Path path2 = this.f;
        Path path3 = this.g;
        path2.transform(matrix2, path3);
        path3.computeBounds(this.h, true);
        this.k.transform(matrix2, this.l);
        this.m.transform(matrix2, this.n);
        float f = (rect.right / 12.0f) * 3.0f;
        this.w.setStrokeWidth(f);
        this.x.setStrokeWidth(f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
        this.y.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
