package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.carstream.tech.core.speed.SpeedBubble;
import com.carstream.tech.phone.MainActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ic extends View {
    public static final /* synthetic */ int v = 0;
    public final Context a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Paint h;
    public final Paint i;
    public final RectF j;
    public SpeedBubble k;
    public int l;
    public int m;
    public final int n;
    public float o;
    public float p;
    public int q;
    public int r;
    public boolean s;
    public final boolean t;
    public final c1 u;

    public ic(MainActivity mainActivity, int i, int i2, boolean z) {
        super(mainActivity);
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.i = paint2;
        this.j = new RectF();
        this.u = new c1(this, 11);
        this.t = z;
        this.a = mainActivity;
        this.b = i;
        this.c = i2;
        this.n = ViewConfiguration.get(mainActivity).getScaledTouchSlop();
        paint.setColor(d8.j(100));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(k1.g(mainActivity, 1.0f));
        paint2.setColor(d8.j(400));
        a();
        e();
        int iMax = Math.max(0, i - this.d);
        int iMax2 = Math.max(0, i2 - this.e);
        int i3 = xc.l(mainActivity).getInt(xc.h(c("speedX")), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int i4 = xc.l(mainActivity).getInt(xc.h(c("speedY")), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        if (i3 == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE) {
            int iG = k1.g(mainActivity, 12.0f);
            int i5 = xc.l(mainActivity).getInt(xc.h("speedX"), Math.max(0, iMax - iG));
            i4 = xc.l(mainActivity).getInt(xc.h("speedY"), iG);
            i3 = i5;
        }
        this.f = b(i3, iMax);
        this.g = b(i4, iMax2);
    }

    public static int b(int i, int i2) {
        return Math.max(0, Math.min(i, Math.max(0, i2)));
    }

    public final void a() {
        Context context = this.a;
        String strG = xc.g(context, "speedStyle", "pill");
        int i = xc.l(context).getInt(xc.h("speedScale"), 100);
        boolean z = xc.l(context).getBoolean(xc.h("speedSignsOnly"), false);
        int i2 = xc.l(context).getInt(xc.h("speedAlpha"), 100);
        SpeedBubble speedBubbleH = w1.h(context, strG);
        speedBubbleH.B(i / 100.0f);
        speedBubbleH.z(z);
        float fMax = Math.max(0.0f, Math.min(1.0f, i2 / 100.0f));
        if (fMax != speedBubbleH.s) {
            speedBubbleH.s = fMax;
            speedBubbleH.invalidate();
        }
        speedBubbleH.D(52);
        speedBubbleH.A(50);
        speedBubbleH.B = true;
        speedBubbleH.requestLayout();
        speedBubbleH.invalidate();
        speedBubbleH.C(null, new ArrayList());
        speedBubbleH.E();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        speedBubbleH.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.k = speedBubbleH;
        this.l = Math.max(1, speedBubbleH.getMeasuredWidth());
        int iMax = Math.max(1, this.k.getMeasuredHeight());
        this.m = iMax;
        this.k.layout(0, 0, this.l, iMax);
    }

    public final String c(String str) {
        return str + "_" + this.b + "x" + this.c;
    }

    public final void d() {
        String strC = c("speedX");
        int i = this.f;
        Context context = this.a;
        xc.n(i, context, strC);
        xc.n(this.g, context, c("speedY"));
        xc.n(this.f, context, "speedX");
        xc.n(this.g, context, "speedY");
    }

    public final void e() {
        String str = this.t ? "carFullDensity" : "carDensity";
        Context context = this.a;
        int iF = xc.f(0, context, str);
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = (iF <= 0 || f <= 0.0f) ? 0.0f : (iF / 1000.0f) / f;
        if (f2 > 0.0f) {
            this.d = Math.max(1, Math.round(this.l * f2));
            this.e = Math.max(1, Math.round(this.m * f2));
        } else {
            int iRound = Math.round(this.b * 0.14f);
            this.d = iRound;
            this.e = Math.round((this.m / this.l) * iRound);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        za.h = this.u;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (za.h == this.u) {
            za.h = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fG = k1.g(this.a, 12.0f);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.j;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, fG, fG, this.h);
        canvas.drawRoundRect(rectF, fG, fG, this.i);
        float width2 = getWidth() / this.b;
        if (width2 <= 0.0f) {
            return;
        }
        float f = (this.d * width2) / this.l;
        int iSave = canvas.save();
        canvas.translate(this.f * width2, this.g * width2);
        canvas.scale(f, f);
        this.k.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, Math.round((this.c / this.b) * size));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r2 != 3) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
