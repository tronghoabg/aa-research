package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mrn extends View {
    public Bitmap a;
    public int b;
    private final Paint c;
    private final Matrix d;
    private final Paint e;
    private final int f;
    private Rect g;
    private RectF h;
    private int i;
    private int j;
    private final GradientDrawable k;
    private final ColorDrawable l;
    private final int[] m;

    public mrn(Context context) {
        super(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.k = gradientDrawable;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.l = colorDrawable;
        this.m = new int[2];
        Paint paint = new Paint();
        this.c = paint;
        paint.setFilterBitmap(true);
        this.d = new Matrix();
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(-16777216);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.gearhead_coolwalk_rounded_corner_radius);
        setForeground(colorDrawable);
        setBackground(gradientDrawable);
        this.b = a();
    }

    private final void d() {
        if (this.g == null || this.i == 0 || this.j == 0) {
            this.h = null;
            return;
        }
        this.h = new RectF(r0.left, this.g.top, this.i - this.g.right, this.j - this.g.bottom);
    }

    public final int a() {
        leh.a();
        TypedArray typedArrayObtainStyledAttributes = ksa.d().e(getContext(), true != leh.a().b() ? R.style.ThemeOverlay_Gearhead_Coolwalk_Dark : R.style.ThemeOverlay_Gearhead_Coolwalk_DayNight).obtainStyledAttributes(new int[]{android.R.attr.colorBackground});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    final void b(Bitmap bitmap) {
        wer.c();
        this.a = bitmap;
        invalidate();
    }

    public final void c(Rect rect) {
        if (rect == null) {
            this.g = null;
        } else {
            this.g = new Rect(rect);
        }
        d();
        invalidate();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.b = a();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null || this.h == null) {
            abzz abzzVar = ksa.d().c().a.b().a;
            int[] iArr = this.m;
            iArr[0] = abzzVar.a(60);
            iArr[1] = abzzVar.a(20);
            this.k.setColors(iArr);
            this.l.setAlpha(41);
            if (this.h != null) {
                Paint paint = this.e;
                paint.setColor(this.b);
                RectF rectF = this.h;
                float f = this.f;
                canvas.drawRoundRect(rectF, f, f, paint);
                return;
            }
            return;
        }
        float width = bitmap.getWidth();
        float height = this.a.getHeight();
        this.l.setAlpha(0);
        float fMax = Math.max(this.i / width, this.j / height);
        Matrix matrix = this.d;
        matrix.reset();
        matrix.postTranslate((this.i - (width * fMax)) / 2.0f, (this.j - (height * fMax)) / 2.0f);
        matrix.preScale(fMax, fMax);
        canvas.drawBitmap(this.a, matrix, this.c);
        Paint paint2 = this.e;
        paint2.setColor(this.b);
        RectF rectF2 = this.h;
        float f2 = this.f;
        canvas.drawRoundRect(rectF2, f2, f2, paint2);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.i = i;
        this.j = i2;
        d();
    }
}
