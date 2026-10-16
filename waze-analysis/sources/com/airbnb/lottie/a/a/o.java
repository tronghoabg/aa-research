package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class o implements n, com.airbnb.lottie.a.b.a, l {

    /* renamed from: e, reason: collision with root package name */
    private final String f1819e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.s f1820f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1821g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1822h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1823i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1824j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1825k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1826l;
    private final com.airbnb.lottie.a.b.f m;
    private final com.airbnb.lottie.a.b.f n;
    private final com.airbnb.lottie.a.b.f o;
    private boolean q;
    private final int r;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1815a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f1816b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final PathMeasure f1817c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    private final float[] f1818d = new float[2];
    private final c p = new c();

    public o(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.i iVar) {
        this.f1820f = sVar;
        this.f1819e = iVar.i();
        int iL = iVar.l();
        this.r = iL;
        this.f1821g = iVar.j();
        this.f1822h = iVar.k();
        com.airbnb.lottie.a.b.f fVarA = iVar.f().a();
        this.f1823i = fVarA;
        com.airbnb.lottie.a.b.f fVarA2 = iVar.h().a();
        this.f1824j = fVarA2;
        com.airbnb.lottie.a.b.f fVarA3 = iVar.g().a();
        this.f1825k = fVarA3;
        com.airbnb.lottie.a.b.f fVarA4 = iVar.d().a();
        this.m = fVarA4;
        com.airbnb.lottie.a.b.f fVarA5 = iVar.e().a();
        this.o = fVarA5;
        if (iL == 1) {
            this.f1826l = iVar.b().a();
            this.n = iVar.c().a();
        } else {
            this.f1826l = null;
            this.n = null;
        }
        bVar.l(fVarA);
        bVar.l(fVarA2);
        bVar.l(fVarA3);
        bVar.l(fVarA4);
        bVar.l(fVarA5);
        if (iL == 1) {
            bVar.l(this.f1826l);
            bVar.l(this.n);
        }
        fVarA.i(this);
        fVarA2.i(this);
        fVarA3.i(this);
        fVarA4.i(this);
        fVarA5.i(this);
        if (iL == 1) {
            this.f1826l.i(this);
            this.n.i(this);
        }
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        com.airbnb.lottie.a.b.f fVar;
        com.airbnb.lottie.a.b.f fVar2;
        if (obj == x.w) {
            this.f1823i.m(cVar);
            return;
        }
        if (obj == x.x) {
            this.f1825k.m(cVar);
            return;
        }
        if (obj == x.n) {
            this.f1824j.m(cVar);
            return;
        }
        if (obj == x.y && (fVar2 = this.f1826l) != null) {
            fVar2.m(cVar);
            return;
        }
        if (obj == x.z) {
            this.m.m(cVar);
            return;
        }
        if (obj == x.A && (fVar = this.n) != null) {
            fVar.m(cVar);
        } else if (obj == x.B) {
            this.o.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.q = false;
        this.f1820f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            d dVar = (d) list.get(i2);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.i() == 1) {
                    this.p.a(uVar);
                    uVar.e(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1819e;
    }

    @Override // com.airbnb.lottie.a.a.n
    public final Path i() {
        float f2;
        float f3;
        float f4;
        float fSin;
        float f5;
        double d2;
        float fCos;
        float f6;
        double d3;
        float f7;
        float f8;
        int i2;
        float f9;
        boolean z;
        Path path;
        float f10;
        float f11;
        double d4;
        int i3;
        float f12;
        boolean z2 = this.q;
        Path path2 = this.f1815a;
        if (z2) {
            return path2;
        }
        path2.reset();
        if (this.f1821g) {
            this.q = true;
            return path2;
        }
        int i4 = this.r;
        if (i4 == 0) {
            throw null;
        }
        com.airbnb.lottie.a.b.f fVar = this.f1823i;
        int i5 = 0;
        if (i4 != 1) {
            int iFloor = (int) Math.floor(((Float) fVar.f()).floatValue());
            double dFloatValue = ((Float) this.f1825k.f()).floatValue();
            com.airbnb.lottie.a.b.f fVar2 = this.o;
            double radians = Math.toRadians(dFloatValue - 90.0d);
            float fFloatValue = ((Float) fVar2.f()).floatValue() / 100.0f;
            float fFloatValue2 = ((Float) this.m.f()).floatValue();
            double d5 = fFloatValue2;
            float fCos2 = (float) (d5 * Math.cos(radians));
            float fSin2 = (float) (d5 * Math.sin(radians));
            path2.moveTo(fCos2, fSin2);
            double d6 = iFloor;
            double d7 = (float) (6.283185307179586d / d6);
            double dCeil = Math.ceil(d6);
            double d8 = radians + d7;
            int i6 = 0;
            while (true) {
                path = path2;
                double d9 = i6;
                if (d9 >= dCeil) {
                    break;
                }
                double d10 = dCeil - 1.0d;
                int i7 = i6;
                float fCos3 = (float) (d5 * Math.cos(d8));
                float fSin3 = (float) (d5 * Math.sin(d8));
                if (fFloatValue != 0.0f) {
                    d4 = d7;
                    i3 = i7;
                    double dAtan2 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float f13 = fFloatValue2 * fFloatValue * 0.25f;
                    float fSin5 = fSin3 + (((float) Math.sin(dAtan22)) * f13);
                    float f14 = fCos3 + (fCos5 * f13);
                    float f15 = fSin2 - (f13 * fSin4);
                    float f16 = fCos2 - (f13 * fCos4);
                    if (d9 == d10) {
                        Path path3 = this.f1816b;
                        path3.reset();
                        path3.moveTo(fCos2, fSin2);
                        path3.cubicTo(f16, f15, f14, fSin5, fCos3, fSin3);
                        PathMeasure pathMeasure = this.f1817c;
                        pathMeasure.setPath(path3, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f1818d;
                        pathMeasure.getPosTan(length, fArr, null);
                        f11 = fFloatValue2;
                        path2 = path;
                        path2.cubicTo(f16, f15, f14, fSin5, fArr[0], fArr[1]);
                        f10 = fCos3;
                        f12 = fSin3;
                    } else {
                        f10 = fCos3;
                        f12 = fSin3;
                        f11 = fFloatValue2;
                        path2 = path;
                        path2.cubicTo(f16, f15, f14, fSin5, f10, f12);
                    }
                } else {
                    f10 = fCos3;
                    f11 = fFloatValue2;
                    d4 = d7;
                    i3 = i7;
                    f12 = fSin3;
                    path2 = path;
                    if (d9 == d10) {
                        i6 = i3 + 1;
                        fFloatValue2 = f11;
                        fCos2 = f10;
                        fSin2 = f12;
                        d7 = d4;
                    } else {
                        path2.lineTo(f10, f12);
                    }
                }
                d8 += d4;
                i6 = i3 + 1;
                fFloatValue2 = f11;
                fCos2 = f10;
                fSin2 = f12;
                d7 = d4;
            }
            path2 = path;
            PointF pointF = (PointF) this.f1824j.f();
            path2.offset(pointF.x, pointF.y);
            path2.close();
        } else {
            boolean z3 = true;
            float fFloatValue3 = ((Float) fVar.f()).floatValue();
            double dFloatValue2 = ((Float) this.f1825k.f()).floatValue();
            double d11 = fFloatValue3;
            boolean z4 = this.f1822h;
            float f17 = (float) (6.283185307179586d / d11);
            double radians2 = Math.toRadians(dFloatValue2 - 90.0d);
            if (z4) {
                f17 = -f17;
            }
            float f18 = fFloatValue3 - ((int) fFloatValue3);
            int i8 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
            float f19 = f17 / 2.0f;
            if (i8 != 0) {
                f2 = 100.0f;
                f3 = f17;
                radians2 += (1.0f - f18) * f19;
            } else {
                f2 = 100.0f;
                f3 = f17;
            }
            float fFloatValue4 = ((Float) this.m.f()).floatValue();
            float fFloatValue5 = ((Float) this.f1826l.f()).floatValue();
            com.airbnb.lottie.a.b.f fVar3 = this.n;
            float fFloatValue6 = fVar3 != null ? ((Float) fVar3.f()).floatValue() / f2 : 0.0f;
            float fFloatValue7 = ((Float) this.o.f()).floatValue() / f2;
            if (i8 != 0) {
                float f20 = fFloatValue5 + ((fFloatValue4 - fFloatValue5) * f18);
                f4 = 2.0f;
                double d12 = f20;
                double d13 = radians2;
                fCos = (float) (d12 * Math.cos(radians2));
                fSin = (float) (d12 * Math.sin(d13));
                path2.moveTo(fCos, fSin);
                f6 = f20;
                d2 = d13 + ((f3 * f18) / 2.0f);
                f5 = f19;
            } else {
                double d14 = radians2;
                f4 = 2.0f;
                double d15 = fFloatValue4;
                float fCos6 = (float) (Math.cos(d14) * d15);
                fSin = (float) (d15 * Math.sin(d14));
                path2.moveTo(fCos6, fSin);
                f5 = f19;
                d2 = d14 + f5;
                fCos = fCos6;
                f6 = 0.0f;
            }
            double dCeil2 = Math.ceil(d11);
            double d16 = dCeil2 + dCeil2;
            double d17 = d2;
            boolean z5 = false;
            while (true) {
                double d18 = i5;
                if (d18 >= d16) {
                    break;
                }
                float f21 = z3 != z5 ? fFloatValue5 : fFloatValue4;
                float f22 = (f6 == 0.0f || d18 != d16 + (-2.0d)) ? f5 : (f3 * f18) / f4;
                if (f6 == 0.0f || d18 != d16 - 1.0d) {
                    d3 = d18;
                    f7 = f21;
                } else {
                    d3 = d18;
                    f7 = f6;
                }
                double d19 = f7;
                float f23 = f21;
                float f24 = fFloatValue4;
                float fCos7 = (float) (d19 * Math.cos(d17));
                float fSin6 = (float) (d19 * Math.sin(d17));
                if (fFloatValue6 == 0.0f && fFloatValue7 == 0.0f) {
                    path2.lineTo(fCos7, fSin6);
                    z = z5;
                    f8 = f18;
                    i2 = i8;
                    f9 = f5;
                } else {
                    f8 = f18;
                    i2 = i8;
                    f9 = f5;
                    double dAtan23 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin7 = (float) Math.sin(dAtan23);
                    Path path4 = path2;
                    float f25 = fCos;
                    double dAtan24 = (float) (Math.atan2(fSin6, fCos7) - 1.5707963267948966d);
                    float fCos9 = (float) Math.cos(dAtan24);
                    float fSin8 = (float) Math.sin(dAtan24);
                    float f26 = true != z5 ? fFloatValue7 : fFloatValue6;
                    float f27 = true != z5 ? fFloatValue6 : fFloatValue7;
                    float f28 = (true != z5 ? f24 : fFloatValue5) * f26 * 0.47829f;
                    float f29 = fCos8 * f28;
                    float f30 = f28 * fSin7;
                    float f31 = f23 * f27 * 0.47829f;
                    float f32 = fCos9 * f31;
                    float f33 = f31 * fSin8;
                    if (i2 != 0) {
                        if (i5 == 0) {
                            f29 *= f8;
                            f30 *= f8;
                        } else if (d3 == d16 - 1.0d) {
                            f32 *= f8;
                            f33 *= f8;
                        }
                    }
                    z = z5;
                    path2 = path4;
                    path2.cubicTo(f25 - f29, fSin - f30, f32 + fCos7, fSin6 + f33, fCos7, fSin6);
                }
                d17 += f22;
                z5 = !z;
                i5++;
                fCos = fCos7;
                fSin = fSin6;
                fFloatValue4 = f24;
                f18 = f8;
                i8 = i2;
                f5 = f9;
                z3 = true;
            }
            PointF pointF2 = (PointF) this.f1824j.f();
            path2.offset(pointF2.x, pointF2.y);
            path2.close();
        }
        path2.close();
        this.p.b(path2);
        this.q = true;
        return path2;
    }
}
