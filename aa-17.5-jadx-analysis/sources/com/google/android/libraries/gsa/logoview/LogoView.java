package com.google.android.libraries.gsa.logoview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.PinConfig;
import defpackage.aacq;
import defpackage.ocf;
import defpackage.vbg;
import defpackage.vbh;
import defpackage.vbi;
import defpackage.vbj;
import defpackage.vcm;
import defpackage.vcn;
import defpackage.vco;
import defpackage.vcp;
import defpackage.vcq;
import defpackage.vcr;
import defpackage.vcs;
import defpackage.vct;
import defpackage.vcu;
import defpackage.vcv;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class LogoView extends View implements TimeAnimator.TimeListener, vcm {
    public static final /* synthetic */ int d = 0;
    public final vcr a;
    public int b;
    public int c;
    private final TimeAnimator e;
    private final vcs f;
    private final vcu g;
    private final AnimatorSet h;
    private final Paint i;
    private final Paint j;
    private float k;
    private vcn l;
    private boolean m;

    static {
        new vbg();
        new vbh();
    }

    public LogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 255;
        this.m = true;
        this.h = new AnimatorSet();
        this.f = new vcs();
        this.g = new vcu();
        this.i = new Paint();
        this.j = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vbj.a);
        vcr vcrVar = new vcr(e(typedArrayObtainStyledAttributes.getColor(0, -12483341)), e(typedArrayObtainStyledAttributes.getColor(2, PinConfig.DEFAULT_PIN_BACKGROUND_COLOR)), e(typedArrayObtainStyledAttributes.getColor(3, -279547)), e(typedArrayObtainStyledAttributes.getColor(1, -13326253)), e(typedArrayObtainStyledAttributes.getColor(0, -12483341)), e(typedArrayObtainStyledAttributes.getColor(2, PinConfig.DEFAULT_PIN_BACKGROUND_COLOR)), new aacq(new vco(), new vcp(80.0f), (char[]) null), new vcp(1000.0f));
        this.a = vcrVar;
        this.e = new TimeAnimator();
        this.l = new vcn(vcrVar, new TimeAnimator(), this);
        g();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float c() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final float d() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private static vcq e(int i) {
        return new vcq(new vcp(80.0f), new vco(), new vcp(80.0f), new vcp(320.0f), new vcp(160.0f), new vcp(1000.0f), new vcp(160.0f), new vcp(160.0f), new vcp(320.0f), i);
    }

    private final void f(Canvas canvas, vcv vcvVar) {
        Paint paint = this.i;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(vcvVar.g);
        paint.setStrokeWidth(vcvVar.e);
        canvas.drawPath(vcvVar.c, paint);
        paint.setStrokeWidth(vcvVar.f);
        canvas.drawPath(vcvVar.d, paint);
    }

    private final void g() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new ocf(this, valueAnimatorOfInt, 2));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.setDuration(100L);
        valueAnimatorOfInt2.addUpdateListener(new ocf(this, valueAnimatorOfInt2, 3));
        Animator[] animatorArr = {valueAnimatorOfInt, valueAnimatorOfInt2};
        AnimatorSet animatorSet = this.h;
        animatorSet.playSequentially(animatorArr);
        animatorSet.addListener(new vbi());
        this.i.setAntiAlias(true);
        this.j.setFilterBitmap(true);
        this.e.setTimeListener(this);
    }

    private final void h(boolean z) {
        TimeAnimator timeAnimator = this.e;
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
            TimeAnimator timeAnimator2 = this.l.a;
            if (timeAnimator2.isStarted()) {
                timeAnimator2.resume();
            } else {
                timeAnimator2.start();
            }
        }
        timeAnimator.setTimeListener(this);
    }

    private final void i() {
        vcr vcrVar = this.a;
        this.k = Math.min(d() / vcrVar.j, c() / vcrVar.k);
    }

    @Override // defpackage.vcm
    public final void a() {
        TimeAnimator timeAnimator = this.e;
        if (timeAnimator.isStarted() || !this.m) {
            return;
        }
        timeAnimator.start();
    }

    public final void b(float f, float f2) {
        if (f <= BitmapDescriptorFactory.HUE_RED || f2 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Width and height cannot be 0 or below");
        }
        vcr vcrVar = this.a;
        vcrVar.j = f;
        vcrVar.k = f2;
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
    protected final void onDraw(Canvas canvas) {
        float f;
        Iterator<vcq> it;
        float f2;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f3 = 2.0f;
        canvas2.translate(getPaddingLeft() + (d() / 2.0f), getPaddingTop() + (c() / 2.0f));
        vcr vcrVar = this.a;
        Iterator<vcq> it2 = vcrVar.iterator();
        while (it2.hasNext()) {
            vcq next = it2.next();
            Paint paint = this.i;
            paint.setColor(next.f);
            paint.setAlpha(255);
            float f4 = next.g.c;
            float f5 = ((vcp) vcrVar.l.b).c + next.a.c;
            float f6 = next.i.c;
            float f7 = next.j.c;
            double d2 = f5;
            float fCos = (((float) Math.cos(d2)) * f4) + f6;
            float fSin = (f4 * ((float) Math.sin(d2))) + f7;
            float f8 = next.e.c;
            if (f8 > 0.001f) {
                vcu vcuVar = this.g;
                vcuVar.d();
                if (next == vcrVar.b) {
                    vcuVar.a(vcuVar.c, vct.a, 7.0f, -1.0f, f8);
                    vcuVar.e = f8 + f8 + 4.0f;
                    vcuVar.g = Paint.Cap.ROUND;
                } else if (next == vcrVar.c) {
                    vcuVar.a(vcuVar.c, vct.b, 14.0f, -1.0f, f8);
                    vcuVar.e = (f8 * (-2.0f)) + 4.0f;
                    vcuVar.g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (next == vcrVar.d) {
                    vcuVar.a(vcuVar.c, vct.c, 5.0f, -1.0f, f8);
                    vcuVar.e = (f8 * (-2.0f)) + 4.0f;
                    vcuVar.g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (next == vcrVar.e) {
                    vcuVar.a(vcuVar.c, vct.d, 4.0f, 10.0f, f8);
                    vcuVar.e = (f8 * (-2.0f)) + 4.0f;
                    vcuVar.g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                }
                vcuVar.e(fCos, fSin, this.k);
                f(canvas2, vcuVar);
            } else {
                float f9 = next.d.c;
                if (f9 > 0.001f) {
                    float fB = next.b();
                    vcs vcsVar = this.f;
                    vcsVar.d();
                    f = f3;
                    if (next == vcrVar.b) {
                        float fB2 = vcs.b(f9);
                        float f10 = fB * ((f9 * 3.725f) + 1.0f);
                        float f11 = ((0.66999996f * f9) + 1.0f) * f10;
                        float fC = vcs.c(f11, f9);
                        float f12 = fC + (((fC * 1.08f) - fC) * f9);
                        vcsVar.e = f12;
                        vcsVar.g = Paint.Cap.BUTT;
                        float f13 = (f10 - f11) + (((fC - f12) / f) * f9);
                        if (fB2 > BitmapDescriptorFactory.HUE_RED) {
                            RectF rectF = vcsVar.a;
                            float f14 = -f11;
                            float f15 = f11 * 0.97f;
                            rectF.set(-f15, f14, f15, f11);
                            rectF.offset(BitmapDescriptorFactory.HUE_RED, f13);
                            Path path = vcsVar.c;
                            path.addArc(rectF, 88.0f, 184.0f);
                            rectF.set(f14, f14, f11, f11);
                            f2 = fSin;
                            rectF.offset(BitmapDescriptorFactory.HUE_RED, f13);
                            path.addArc(rectF, 88.0f, 184.0f);
                            float f16 = f11 + f13;
                            path.moveTo(BitmapDescriptorFactory.HUE_RED, f16);
                            path.cubicTo(f11 * 0.83f, f16, f11 * 0.99f, (0.3f * f11) + f13, f11 * 0.93f, ((-0.05f) * f11) + f13);
                            rectF.set(f14, f14, f11, f11);
                            rectF.offset(BitmapDescriptorFactory.HUE_RED, f13);
                            path.addArc(rectF, 270.0f, 90.0f - (46.0f * fB2));
                            float f17 = 1.06f * f11 * fB2;
                            float f18 = f11 * 1.08f;
                            float f19 = f13 + 0.42f;
                            path.moveTo(f18 - f17, f19);
                            path.lineTo(f18, f19);
                        } else {
                            f2 = fSin;
                            vcsVar.c.addCircle(BitmapDescriptorFactory.HUE_RED, f13, f11, Path.Direction.CW);
                        }
                    } else {
                        f2 = fSin;
                        if (next == vcrVar.c || next == vcrVar.d) {
                            vcsVar.a(f9, fB);
                        } else if (next == vcrVar.f) {
                            float fB3 = vcs.b(f9);
                            float f20 = fB * ((f9 * 3.725f) + 1.0f);
                            float fC2 = vcs.c(f20, f9);
                            vcsVar.g = Paint.Cap.BUTT;
                            vcsVar.e = fC2;
                            if (fB3 > BitmapDescriptorFactory.HUE_RED) {
                                float f21 = -f20;
                                vcsVar.e = fC2 / f;
                                RectF rectF2 = vcsVar.a;
                                float f22 = f20 * 0.92f;
                                rectF2.set(-f22, f21, f22, f20);
                                float f23 = fC2 / 4.0f;
                                rectF2.inset(f23, f23);
                                Path path2 = vcsVar.c;
                                path2.addOval(rectF2, Path.Direction.CW);
                                float f24 = (fC2 * (-2.0f)) / 4.0f;
                                rectF2.inset(f24 * 0.9f, f24);
                                rectF2.offset(-0.4f, BitmapDescriptorFactory.HUE_RED);
                                path2.addOval(rectF2, Path.Direction.CW);
                                rectF2.offset(0.5f, BitmapDescriptorFactory.HUE_RED);
                                path2.addArc(rectF2, 88.0f, 184.0f);
                                float fMin = Math.min(fB3 / 0.1f, 1.0f);
                                float f25 = fB3 - 0.1f;
                                vcsVar.f = fC2 * 1.05f;
                                if (fMin > BitmapDescriptorFactory.HUE_RED) {
                                    float f26 = f20 * 0.9f;
                                    float f27 = (-1.17f) * f20 * fMin;
                                    float f28 = 1.21f * f20 * fMin;
                                    Path path3 = vcsVar.d;
                                    path3.moveTo(f26, f27);
                                    path3.lineTo(f26, f28);
                                }
                                float f29 = f25 / 0.9f;
                                if (f29 > BitmapDescriptorFactory.HUE_RED) {
                                    float f30 = 0.925f * f20;
                                    rectF2.set(-f30, f21, f30, f20);
                                    rectF2.offset(-0.14f, f20 * 1.15f);
                                    vcsVar.d.addArc(rectF2, -2.0f, f29 * 158.0f);
                                }
                            } else {
                                vcsVar.c.addCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f20, Path.Direction.CW);
                            }
                        } else if (next == vcrVar.e) {
                            vcsVar.e = fB * 4.0f * (((-0.35000002f) * f9) + 1.0f);
                            if (f9 > 0.66f) {
                                vcsVar.g = Paint.Cap.SQUARE;
                            } else {
                                vcsVar.g = Paint.Cap.ROUND;
                            }
                            Path path4 = vcsVar.c;
                            path4.moveTo(BitmapDescriptorFactory.HUE_RED, (-10.46f) * f9);
                            path4.lineTo(BitmapDescriptorFactory.HUE_RED, 4.19f * f9);
                        } else {
                            if (next == vcrVar.g) {
                                float fB4 = vcs.b(f9);
                                float f31 = fB * ((f9 * 3.725f) + 1.0f);
                                vcsVar.e = vcs.c(f31, f9);
                                vcsVar.g = Paint.Cap.BUTT;
                                if (fB4 > BitmapDescriptorFactory.HUE_RED) {
                                    float f32 = f31 * 0.9f;
                                    float f33 = -f31;
                                    RectF rectF3 = vcsVar.a;
                                    rectF3.set(-f32, f33, f32, f31);
                                    Path path5 = vcsVar.c;
                                    path5.addArc(rectF3, 88.0f, 184.0f);
                                    float f34 = 0.94f * f31;
                                    rectF3.set(-f34, f33, f34, f31);
                                    path5.addArc(rectF3, 88.0f, 184.0f);
                                    float f35 = f31 * 1.05f;
                                    rectF3.set(-f35, f33, f35, f31);
                                    path5.addArc(rectF3, 33.0f, 57.0f);
                                    float f36 = 0.89f * f31;
                                    rectF3.set(-f36, f33, f36, f31);
                                    path5.addArc(rectF3, 270.0f, (-270.0f) + (393.0f - (48.0f * fB4)));
                                    float radians = (float) Math.toRadians(((-173.0f) + r3) - 11.0f);
                                    float radians2 = (float) Math.toRadians(r3 - 11.0f);
                                    double d3 = radians;
                                    double d4 = f31 * 1.15f;
                                    it = it2;
                                    double dCos = d4 * Math.cos(d3);
                                    double dSin = Math.sin(d3) * d4;
                                    double d5 = radians2;
                                    double dCos2 = d4 * Math.cos(d5);
                                    double dSin2 = d4 * Math.sin(d5);
                                    Path path6 = vcsVar.d;
                                    path6.moveTo((float) dCos, (float) dSin);
                                    path6.lineTo((float) dCos2, (float) dSin2);
                                    vcsVar.f = vcsVar.e * 0.85f;
                                } else {
                                    it = it2;
                                    vcsVar.c.addCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f31, Path.Direction.CW);
                                }
                            }
                            vcsVar.e(fCos, f2 + (f9 * 0.6f), this.k);
                            f(canvas2, vcsVar);
                        }
                    }
                    it = it2;
                    vcsVar.e(fCos, f2 + (f9 * 0.6f), this.k);
                    f(canvas2, vcsVar);
                } else {
                    f = f3;
                    it = it2;
                    vcp vcpVar = next.b;
                    float f37 = vcpVar.c;
                    if (f37 < -0.001f || f37 > 0.001f) {
                        paint.setStrokeWidth(next.a() * this.k);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        float f38 = vcpVar.c;
                        float f39 = this.k;
                        float f40 = fCos * f39;
                        canvas2.drawLine(f40, (fSin - f38) * f39, f40, (fSin + f38) * f39, paint);
                        canvas2 = canvas;
                    } else {
                        float fA = next.a() * next.b();
                        paint.setStyle(Paint.Style.FILL);
                        float f41 = this.k;
                        canvas2.drawCircle(fCos * f41, fSin * f41, (fA / f) * f41, paint);
                    }
                }
                it2 = it;
                f3 = f;
            }
        }
        setAlpha(vcrVar.h.c);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        vcr vcrVar;
        long jMin = Math.min(100L, j2);
        while (true) {
            vcrVar = this.a;
            if (jMin <= 0) {
                break;
            }
            long jMin2 = Math.min(jMin, 10L);
            Iterator<vcq> it = vcrVar.iterator();
            while (it.hasNext()) {
                vcq next = it.next();
                next.g.e(jMin2);
                next.a.e(jMin2);
                next.h.e(jMin2);
                next.i.e(jMin2);
                next.j.e(jMin2);
                next.b.e(jMin2);
                next.d.e(jMin2);
                next.e.e(jMin2);
                next.c.e(jMin2);
            }
            ((vcp) vcrVar.l.b).e(jMin2);
            vcrVar.h.e(jMin2);
            jMin -= 10;
        }
        Iterator<vcq> it2 = vcrVar.iterator();
        while (true) {
            if (it2.hasNext()) {
                vcq next2 = it2.next();
                if (!next2.g.e || !next2.a.e || !next2.h.e || !next2.i.e || !next2.j.e || !next2.b.e || !next2.d.e || !next2.e.e || !next2.c.e) {
                    break;
                }
            } else if (!((vcp) vcrVar.l.b).e || !vcrVar.h.e) {
                break;
            } else {
                this.e.end();
            }
        }
        this.h.cancel();
        this.c = 255;
        this.b = 0;
        invalidate();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        h(isShown());
    }

    public LogoView(Context context) {
        this(context, null);
    }

    LogoView(Context context, AttributeSet attributeSet, AnimatorSet animatorSet, vcs vcsVar, vcu vcuVar, Paint paint, Paint paint2, vcr vcrVar, TimeAnimator timeAnimator, vcn vcnVar) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 255;
        this.m = true;
        this.h = animatorSet;
        this.f = vcsVar;
        this.g = vcuVar;
        this.i = paint;
        this.j = paint2;
        this.a = vcrVar;
        this.e = timeAnimator;
        this.l = vcnVar;
        g();
    }
}
