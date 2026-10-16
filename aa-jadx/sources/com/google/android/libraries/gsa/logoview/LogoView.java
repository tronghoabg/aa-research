package com.google.android.libraries.gsa.logoview;

/* JADX INFO: loaded from: classes3.dex */
public class LogoView extends android.view.View implements android.animation.TimeAnimator.TimeListener, defpackage.vdj {
    public static final /* synthetic */ int d = 0;
    public final defpackage.vdo a;
    public int b;
    public int c;
    private final android.animation.TimeAnimator e;
    private final defpackage.vdp f;
    private final defpackage.vdr g;
    private final android.animation.AnimatorSet h;
    private final android.graphics.Paint i;
    private final android.graphics.Paint j;
    private float k;
    private defpackage.vdk l;
    private boolean m;

    static {
        new defpackage.vcd();
        new defpackage.vce();
    }

    public LogoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 255;
        this.m = true;
        this.h = new android.animation.AnimatorSet();
        this.f = new defpackage.vdp();
        this.g = new defpackage.vdr();
        this.i = new android.graphics.Paint();
        this.j = new android.graphics.Paint();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.vcg.a);
        defpackage.vdo vdoVar = new defpackage.vdo(e(typedArrayObtainStyledAttributes.getColor(0, -12483341)), e(typedArrayObtainStyledAttributes.getColor(2, com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_BACKGROUND_COLOR)), e(typedArrayObtainStyledAttributes.getColor(3, -279547)), e(typedArrayObtainStyledAttributes.getColor(1, -13326253)), e(typedArrayObtainStyledAttributes.getColor(0, -12483341)), e(typedArrayObtainStyledAttributes.getColor(2, com.google.android.libraries.maps.model.PinConfig.DEFAULT_PIN_BACKGROUND_COLOR)), new defpackage.wep(new defpackage.vdl(), new defpackage.vdm(80.0f)), new defpackage.vdm(1000.0f));
        this.a = vdoVar;
        this.e = new android.animation.TimeAnimator();
        this.l = new defpackage.vdk(vdoVar, new android.animation.TimeAnimator(), this);
        g();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float c() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final float d() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private static defpackage.vdn e(int i) {
        return new defpackage.vdn(new defpackage.vdm(80.0f), new defpackage.vdl(), new defpackage.vdm(80.0f), new defpackage.vdm(320.0f), new defpackage.vdm(160.0f), new defpackage.vdm(1000.0f), new defpackage.vdm(160.0f), new defpackage.vdm(160.0f), new defpackage.vdm(320.0f), i);
    }

    private final void f(android.graphics.Canvas canvas, defpackage.vds vdsVar) {
        android.graphics.Paint paint = this.i;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(vdsVar.g);
        paint.setStrokeWidth(vdsVar.e);
        canvas.drawPath(vdsVar.c, paint);
        paint.setStrokeWidth(vdsVar.f);
        canvas.drawPath(vdsVar.d, paint);
    }

    private final void g() {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new defpackage.oda(this, valueAnimatorOfInt, 2));
        android.animation.ValueAnimator valueAnimatorOfInt2 = android.animation.ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.setDuration(100L);
        valueAnimatorOfInt2.addUpdateListener(new defpackage.oda(this, valueAnimatorOfInt2, 3));
        android.animation.Animator[] animatorArr = {valueAnimatorOfInt, valueAnimatorOfInt2};
        android.animation.AnimatorSet animatorSet = this.h;
        animatorSet.playSequentially(animatorArr);
        animatorSet.addListener(new defpackage.vcf());
        this.i.setAntiAlias(true);
        this.j.setFilterBitmap(true);
        this.e.setTimeListener(this);
    }

    private final void h(boolean z) {
        android.animation.TimeAnimator timeAnimator = this.e;
        if (timeAnimator == null || this.m == z) {
            return;
        }
        this.m = z;
        if (!z) {
            this.h.cancel();
            timeAnimator.setTimeListener(null);
            timeAnimator.end();
            this.l.a.pause();
            return;
        }
        if (this.b != 255 || this.c != 0) {
            android.animation.TimeAnimator timeAnimator2 = this.l.a;
            if (timeAnimator2.isStarted()) {
                timeAnimator2.resume();
            } else {
                timeAnimator2.start();
            }
        }
        timeAnimator.setTimeListener(this);
    }

    private final void i() {
        defpackage.vdo vdoVar = this.a;
        this.k = java.lang.Math.min(d() / vdoVar.j, c() / vdoVar.k);
    }

    @Override // defpackage.vdj
    public final void a() {
        android.animation.TimeAnimator timeAnimator = this.e;
        if (timeAnimator.isStarted() || !this.m) {
            return;
        }
        timeAnimator.start();
    }

    public final void b(float f, float f2) {
        if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || f2 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new java.lang.IllegalArgumentException("Width and height cannot be 0 or below");
        }
        defpackage.vdo vdoVar = this.a;
        vdoVar.j = f;
        vdoVar.k = f2;
        i();
        invalidate();
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h(isShown());
        this.l.b = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h(false);
        this.l.b = null;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        float f;
        float f2;
        android.graphics.Canvas canvas2 = canvas;
        canvas2.save();
        float f3 = 2.0f;
        canvas2.translate(getPaddingLeft() + (d() / 2.0f), getPaddingTop() + (c() / 2.0f));
        defpackage.vdo vdoVar = this.a;
        java.util.Iterator<defpackage.vdn> it = vdoVar.iterator();
        while (it.hasNext()) {
            defpackage.vdn next = it.next();
            android.graphics.Paint paint = this.i;
            paint.setColor(next.f);
            paint.setAlpha(255);
            float f4 = next.g.c;
            float f5 = ((defpackage.vdm) vdoVar.l.a).c + next.a.c;
            float f6 = next.i.c;
            float f7 = next.j.c;
            double d2 = f5;
            float fCos = (((float) java.lang.Math.cos(d2)) * f4) + f6;
            float fSin = (f4 * ((float) java.lang.Math.sin(d2))) + f7;
            float f8 = next.e.c;
            if (f8 > 0.001f) {
                defpackage.vdr vdrVar = this.g;
                vdrVar.d();
                if (next == vdoVar.b) {
                    vdrVar.a(vdrVar.c, defpackage.vdq.a, 7.0f, -1.0f, f8);
                    vdrVar.e = f8 + f8 + 4.0f;
                    vdrVar.g = android.graphics.Paint.Cap.ROUND;
                } else if (next == vdoVar.c) {
                    vdrVar.a(vdrVar.c, defpackage.vdq.b, 14.0f, -1.0f, f8);
                    vdrVar.e = (f8 * (-2.0f)) + 4.0f;
                    vdrVar.g = f8 > 0.5f ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.ROUND;
                } else if (next == vdoVar.d) {
                    vdrVar.a(vdrVar.c, defpackage.vdq.c, 5.0f, -1.0f, f8);
                    vdrVar.e = (f8 * (-2.0f)) + 4.0f;
                    vdrVar.g = f8 > 0.5f ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.ROUND;
                } else if (next == vdoVar.e) {
                    vdrVar.a(vdrVar.c, defpackage.vdq.d, 4.0f, 10.0f, f8);
                    vdrVar.e = (f8 * (-2.0f)) + 4.0f;
                    vdrVar.g = f8 > 0.5f ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.ROUND;
                }
                vdrVar.e(fCos, fSin, this.k);
                f(canvas2, vdrVar);
            } else {
                float f9 = next.d.c;
                if (f9 > 0.001f) {
                    float fB = next.b();
                    defpackage.vdp vdpVar = this.f;
                    vdpVar.d();
                    f = f3;
                    if (next == vdoVar.b) {
                        float fB2 = defpackage.vdp.b(f9);
                        float f10 = fB * ((f9 * 3.725f) + 1.0f);
                        float f11 = ((0.66999996f * f9) + 1.0f) * f10;
                        float fC = defpackage.vdp.c(f11, f9);
                        float f12 = fC + (((fC * 1.08f) - fC) * f9);
                        vdpVar.e = f12;
                        vdpVar.g = android.graphics.Paint.Cap.BUTT;
                        float f13 = (f10 - f11) + (((fC - f12) / f) * f9);
                        if (fB2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                            android.graphics.RectF rectF = vdpVar.a;
                            float f14 = -f11;
                            float f15 = f11 * 0.97f;
                            rectF.set(-f15, f14, f15, f11);
                            rectF.offset(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f13);
                            android.graphics.Path path = vdpVar.c;
                            path.addArc(rectF, 88.0f, 184.0f);
                            rectF.set(f14, f14, f11, f11);
                            f2 = fSin;
                            rectF.offset(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f13);
                            path.addArc(rectF, 88.0f, 184.0f);
                            float f16 = f11 + f13;
                            path.moveTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f16);
                            path.cubicTo(f11 * 0.83f, f16, f11 * 0.99f, (0.3f * f11) + f13, f11 * 0.93f, ((-0.05f) * f11) + f13);
                            rectF.set(f14, f14, f11, f11);
                            rectF.offset(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f13);
                            path.addArc(rectF, 270.0f, 90.0f - (46.0f * fB2));
                            float f17 = 1.06f * f11 * fB2;
                            float f18 = f11 * 1.08f;
                            float f19 = f13 + 0.42f;
                            path.moveTo(f18 - f17, f19);
                            path.lineTo(f18, f19);
                        } else {
                            f2 = fSin;
                            vdpVar.c.addCircle(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f13, f11, android.graphics.Path.Direction.CW);
                        }
                    } else {
                        f2 = fSin;
                        if (next == vdoVar.c || next == vdoVar.d) {
                            vdpVar.a(f9, fB);
                        } else if (next == vdoVar.f) {
                            float fB3 = defpackage.vdp.b(f9);
                            float f20 = fB * ((f9 * 3.725f) + 1.0f);
                            float fC2 = defpackage.vdp.c(f20, f9);
                            vdpVar.g = android.graphics.Paint.Cap.BUTT;
                            vdpVar.e = fC2;
                            if (fB3 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                                float f21 = -f20;
                                vdpVar.e = fC2 / f;
                                android.graphics.RectF rectF2 = vdpVar.a;
                                float f22 = f20 * 0.92f;
                                rectF2.set(-f22, f21, f22, f20);
                                float f23 = fC2 / 4.0f;
                                rectF2.inset(f23, f23);
                                android.graphics.Path path2 = vdpVar.c;
                                path2.addOval(rectF2, android.graphics.Path.Direction.CW);
                                float f24 = (fC2 * (-2.0f)) / 4.0f;
                                rectF2.inset(f24 * 0.9f, f24);
                                rectF2.offset(-0.4f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                                path2.addOval(rectF2, android.graphics.Path.Direction.CW);
                                rectF2.offset(0.5f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                                path2.addArc(rectF2, 88.0f, 184.0f);
                                float fMin = java.lang.Math.min(fB3 / 0.1f, 1.0f);
                                float f25 = fB3 - 0.1f;
                                vdpVar.f = fC2 * 1.05f;
                                if (fMin > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                                    float f26 = f20 * 0.9f;
                                    float f27 = (-1.17f) * f20 * fMin;
                                    float f28 = 1.21f * f20 * fMin;
                                    android.graphics.Path path3 = vdpVar.d;
                                    path3.moveTo(f26, f27);
                                    path3.lineTo(f26, f28);
                                }
                                float f29 = f25 / 0.9f;
                                if (f29 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                                    float f30 = 0.925f * f20;
                                    rectF2.set(-f30, f21, f30, f20);
                                    rectF2.offset(-0.14f, f20 * 1.15f);
                                    vdpVar.d.addArc(rectF2, -2.0f, f29 * 158.0f);
                                }
                            } else {
                                vdpVar.c.addCircle(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f20, android.graphics.Path.Direction.CW);
                            }
                        } else if (next == vdoVar.e) {
                            vdpVar.e = fB * 4.0f * (((-0.35000002f) * f9) + 1.0f);
                            if (f9 > 0.66f) {
                                vdpVar.g = android.graphics.Paint.Cap.SQUARE;
                            } else {
                                vdpVar.g = android.graphics.Paint.Cap.ROUND;
                            }
                            android.graphics.Path path4 = vdpVar.c;
                            path4.moveTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (-10.46f) * f9);
                            path4.lineTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 4.19f * f9);
                        } else {
                            if (next == vdoVar.g) {
                                float fB4 = defpackage.vdp.b(f9);
                                float f31 = fB * ((f9 * 3.725f) + 1.0f);
                                vdpVar.e = defpackage.vdp.c(f31, f9);
                                vdpVar.g = android.graphics.Paint.Cap.BUTT;
                                if (fB4 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                                    float f32 = f31 * 0.9f;
                                    float f33 = -f31;
                                    android.graphics.RectF rectF3 = vdpVar.a;
                                    rectF3.set(-f32, f33, f32, f31);
                                    android.graphics.Path path5 = vdpVar.c;
                                    path5.addArc(rectF3, 88.0f, 184.0f);
                                    float f34 = 0.94f * f31;
                                    rectF3.set(-f34, f33, f34, f31);
                                    path5.addArc(rectF3, 88.0f, 184.0f);
                                    float f35 = f31 * 1.05f;
                                    rectF3.set(-f35, f33, f35, f31);
                                    path5.addArc(rectF3, 33.0f, 57.0f);
                                    float f36 = 0.89f * f31;
                                    rectF3.set(-f36, f33, f36, f31);
                                    float f37 = 393.0f - (48.0f * fB4);
                                    path5.addArc(rectF3, 270.0f, (-270.0f) + f37);
                                    float radians = (float) java.lang.Math.toRadians(((-173.0f) + f37) - 11.0f);
                                    float radians2 = (float) java.lang.Math.toRadians(f37 - 11.0f);
                                    double d3 = radians;
                                    double d4 = f31 * 1.15f;
                                    double dCos = d4 * java.lang.Math.cos(d3);
                                    double dSin = java.lang.Math.sin(d3) * d4;
                                    double d5 = radians2;
                                    double dCos2 = d4 * java.lang.Math.cos(d5);
                                    double dSin2 = d4 * java.lang.Math.sin(d5);
                                    android.graphics.Path path6 = vdpVar.d;
                                    path6.moveTo((float) dCos, (float) dSin);
                                    path6.lineTo((float) dCos2, (float) dSin2);
                                    vdpVar.f = vdpVar.e * 0.85f;
                                } else {
                                    vdpVar.c.addCircle(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f31, android.graphics.Path.Direction.CW);
                                }
                            }
                            vdpVar.e(fCos, f2 + (f9 * 0.6f), this.k);
                            f(canvas2, vdpVar);
                        }
                    }
                    vdpVar.e(fCos, f2 + (f9 * 0.6f), this.k);
                    f(canvas2, vdpVar);
                } else {
                    f = f3;
                    it = it;
                    defpackage.vdm vdmVar = next.b;
                    float f38 = vdmVar.c;
                    if (f38 < -0.001f || f38 > 0.001f) {
                        paint.setStrokeWidth(next.a() * this.k);
                        paint.setStyle(android.graphics.Paint.Style.STROKE);
                        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                        float f39 = vdmVar.c;
                        float f40 = this.k;
                        float f41 = fCos * f40;
                        canvas2.drawLine(f41, (fSin - f39) * f40, f41, (fSin + f39) * f40, paint);
                        canvas2 = canvas;
                    } else {
                        float fA = next.a() * next.b();
                        paint.setStyle(android.graphics.Paint.Style.FILL);
                        float f42 = this.k;
                        canvas2.drawCircle(fCos * f42, fSin * f42, (fA / f) * f42, paint);
                    }
                }
                it = it;
                f3 = f;
            }
        }
        setAlpha(vdoVar.h.c);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(android.animation.TimeAnimator timeAnimator, long j, long j2) {
        defpackage.vdo vdoVar;
        defpackage.vdn next;
        long jMin = java.lang.Math.min(100L, j2);
        while (true) {
            vdoVar = this.a;
            if (jMin <= 0) {
                break;
            }
            long jMin2 = java.lang.Math.min(jMin, 10L);
            for (defpackage.vdn vdnVar : vdoVar) {
                vdnVar.g.e(jMin2);
                vdnVar.a.e(jMin2);
                vdnVar.h.e(jMin2);
                vdnVar.i.e(jMin2);
                vdnVar.j.e(jMin2);
                vdnVar.b.e(jMin2);
                vdnVar.d.e(jMin2);
                vdnVar.e.e(jMin2);
                vdnVar.c.e(jMin2);
            }
            ((defpackage.vdm) vdoVar.l.a).e(jMin2);
            vdoVar.h.e(jMin2);
            jMin -= 10;
        }
        java.util.Iterator<defpackage.vdn> it = vdoVar.iterator();
        do {
            if (!it.hasNext()) {
                if (!((defpackage.vdm) vdoVar.l.a).e || !vdoVar.h.e) {
                    break;
                } else {
                    this.e.end();
                }
                invalidate();
            }
            next = it.next();
            if (!next.g.e || !next.a.e || !next.h.e || !next.i.e || !next.j.e || !next.b.e || !next.d.e || !next.e.e) {
                break;
            }
        } while (next.c.e);
        this.h.cancel();
        this.c = 255;
        this.b = 0;
        invalidate();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        h(isShown());
    }

    public LogoView(android.content.Context context) {
        this(context, null);
    }

    LogoView(android.content.Context context, android.util.AttributeSet attributeSet, android.animation.AnimatorSet animatorSet, defpackage.vdp vdpVar, defpackage.vdr vdrVar, android.graphics.Paint paint, android.graphics.Paint paint2, defpackage.vdo vdoVar, android.animation.TimeAnimator timeAnimator, defpackage.vdk vdkVar) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 255;
        this.m = true;
        this.h = animatorSet;
        this.f = vdpVar;
        this.g = vdrVar;
        this.i = paint;
        this.j = paint2;
        this.a = vdoVar;
        this.e = timeAnimator;
        this.l = vdkVar;
        g();
    }
}
