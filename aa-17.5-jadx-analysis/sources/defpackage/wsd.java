package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wsd extends wsh {
    public static final /* synthetic */ int h = 0;
    private static final emn q = new wsc();
    public final wsk a;
    public final wsi b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final emp r;
    private boolean s;
    private final ValueAnimator t;

    public wsd(Context context, wrp wrpVar, wsk wskVar) {
        super(context, wrpVar);
        this.s = false;
        this.a = wskVar;
        wsi wsiVar = new wsi();
        this.b = wsiVar;
        wsiVar.h = true;
        emp empVar = new emp(this, q);
        this.r = empVar;
        emq emqVar = new emq();
        emqVar.c(1.0f);
        emqVar.e(50.0f);
        empVar.s = emqVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ocf(this, wrpVar, 5));
        if (wrpVar.c(true) && wrpVar.m != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        wrp wrpVar = this.j;
        float f = i;
        if (f < wrpVar.o * 10000.0f || f > wrpVar.p * 10000.0f) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.o)) {
            canvas.save();
            wsk wskVar = this.a;
            wskVar.h(canvas, getBounds(), f(), k(), j());
            wsi wsiVar = this.b;
            wsiVar.f = g();
            Paint paint = this.m;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            wrp wrpVar = this.j;
            wsiVar.c = wrpVar.e[0];
            int i = wrpVar.i;
            if (i > 0) {
                if (!(wskVar instanceof wsn)) {
                    i = (int) ((i * dlz.i(b(), BitmapDescriptorFactory.HUE_RED, 0.01f)) / 0.01f);
                }
                wskVar.f(canvas, paint, b(), 1.0f, wrpVar.f, this.n, i);
            } else {
                wskVar.f(canvas, paint, BitmapDescriptorFactory.HUE_RED, 1.0f, wrpVar.f, this.n, 0);
            }
            wskVar.e(canvas, paint, wsiVar, this.n);
            wskVar.d(canvas, paint, wrpVar.e[0], this.n);
            canvas.restore();
        }
    }

    @Override // defpackage.wsh
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        float fE = wpq.e(this.i.getContentResolver());
        if (fE == BitmapDescriptorFactory.HUE_RED) {
            this.s = true;
            return zE;
        }
        this.s = false;
        this.r.s.e(50.0f / fE);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.wsh, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.r.l();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        float fA = a(i);
        if (this.s) {
            this.r.l();
            d(f / 10000.0f);
            c(fA);
            return true;
        }
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0) {
            boolean z = this.a instanceof wsn;
            emp empVar = this.r;
            if (z) {
                empVar.i(10000.0f / iWidth);
            } else {
                empVar.i((float) (10000.0d / (Math.min(iHeight, iWidth) * 3.141592653589793d)));
            }
        }
        emp empVar2 = this.r;
        empVar2.j(b() * 10000.0f);
        empVar2.k(f);
        return true;
    }
}
