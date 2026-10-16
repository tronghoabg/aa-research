package com.bytedance.adsdk.oa.uef.uef;

import N0.a;
import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.bytedance.adsdk.oa.yo.oa.oib;
import com.bytedance.adsdk.oa.yo.oa.zjm;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* loaded from: classes.dex */
public class dz implements uef.InterfaceC0035uef, cq, dj {
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, PointF> bcc;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> cq;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> cz;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> dj;
    private final boolean ivm;
    private final boolean lw;
    private final zjm.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f24586oa;
    private boolean wk;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> wrv;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> xs;
    private final com.bytedance.adsdk.oa.cz yo;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> zjm;
    private final Path uef = new Path();
    private final oa dz = new oa();

    /* renamed from: com.bytedance.adsdk.oa.uef.uef.dz$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[zjm.uef.values().length];
            uef = iArr;
            try {
                iArr[zjm.uef.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[zjm.uef.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public dz(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.zjm zjmVar) {
        this.yo = czVar;
        this.f24586oa = zjmVar.uef();
        zjm.uef uefVarOa = zjmVar.oa();
        this.moa = uefVarOa;
        this.lw = zjmVar.zjm();
        this.ivm = zjmVar.dj();
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef = zjmVar.yo().uef();
        this.xs = uefVarUef;
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef2 = zjmVar.moa().uef();
        this.bcc = uefVarUef2;
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef3 = zjmVar.lw().uef();
        this.cz = uefVarUef3;
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef4 = zjmVar.xs().uef();
        this.dj = uefVarUef4;
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef5 = zjmVar.cz().uef();
        this.cq = uefVarUef5;
        zjm.uef uefVar2 = zjm.uef.STAR;
        if (uefVarOa == uefVar2) {
            this.zjm = zjmVar.ivm().uef();
            this.wrv = zjmVar.bcc().uef();
        } else {
            this.zjm = null;
            this.wrv = null;
        }
        uefVar.uef(uefVarUef);
        uefVar.uef(uefVarUef2);
        uefVar.uef(uefVarUef3);
        uefVar.uef(uefVarUef4);
        uefVar.uef(uefVarUef5);
        if (uefVarOa == uefVar2) {
            uefVar.uef(this.zjm);
            uefVar.uef(this.wrv);
        }
        uefVarUef.uef(this);
        uefVarUef2.uef(this);
        uefVarUef3.uef(this);
        uefVarUef4.uef(this);
        uefVarUef5.uef(this);
        if (uefVarOa == uefVar2) {
            this.zjm.uef(this);
            this.wrv.uef(this);
        }
    }

    private void lw() {
        double d3;
        int iFloor = (int) Math.floor(this.xs.xs().floatValue());
        double radians = Math.toRadians((this.cz == null ? 0.0d : r2.xs().floatValue()) - 90.0d);
        double d5 = iFloor;
        float fFloatValue = this.cq.xs().floatValue() / 100.0f;
        float fFloatValue2 = this.dj.xs().floatValue();
        double d10 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d10);
        float fSin = (float) (Math.sin(radians) * d10);
        this.uef.moveTo(fCos, fSin);
        double d11 = (float) (6.283185307179586d / d5);
        double d12 = radians + d11;
        double dCeil = Math.ceil(d5);
        int i5 = 0;
        while (i5 < dCeil) {
            float fCos2 = (float) (Math.cos(d12) * d10);
            int i10 = i5;
            double d13 = d12;
            float fSin2 = (float) (Math.sin(d12) * d10);
            if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                d3 = dCeil;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f10 = fFloatValue2 * fFloatValue * 0.25f;
                this.uef.cubicTo(fCos - (f10 * fCos3), fSin - (f10 * fSin3), fCos2 + (((float) Math.cos(dAtan22)) * f10), fSin2 + (f10 * ((float) Math.sin(dAtan22))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                d3 = dCeil;
                fCos = fCos2;
                this.uef.lineTo(fCos, fSin);
            }
            d12 = d13 + d11;
            i5 = i10 + 1;
            dCeil = d3;
        }
        PointF pointFXs = this.bcc.xs();
        this.uef.offset(pointFXs.x, pointFXs.y);
        this.uef.close();
    }

    private void oa() {
        this.wk = false;
        this.yo.invalidateSelf();
    }

    private void yo() {
        float f10;
        float f11;
        int i5;
        float fCos;
        float fSin;
        float f12;
        float f13;
        double d3;
        float fB;
        int i10;
        float f14;
        double d5;
        float f15;
        float f16;
        double d10;
        float f17;
        float f18;
        float fFloatValue = this.xs.xs().floatValue();
        double radians = Math.toRadians((this.cz == null ? 0.0d : r2.xs().floatValue()) - 90.0d);
        double d11 = fFloatValue;
        float f19 = (float) (6.283185307179586d / d11);
        if (this.ivm) {
            f19 *= -1.0f;
        }
        float f20 = f19 / 2.0f;
        float f21 = fFloatValue - ((int) fFloatValue);
        int i11 = (f21 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (f21 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f21) * f20;
        }
        float fFloatValue2 = this.dj.xs().floatValue();
        float fFloatValue3 = this.zjm.xs().floatValue();
        com.bytedance.adsdk.oa.uef.oa.uef<?, Float> uefVar = this.wrv;
        float fFloatValue4 = uefVar != null ? uefVar.xs().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.oa.uef.oa.uef<?, Float> uefVar2 = this.cq;
        float fFloatValue5 = uefVar2 != null ? uefVar2.xs().floatValue() / 100.0f : 0.0f;
        if (i11 != 0) {
            fB = a.b(fFloatValue2, fFloatValue3, f21, fFloatValue3);
            f11 = 0.0f;
            i5 = i11;
            double d12 = fB;
            f10 = 2.0f;
            float fCos2 = (float) (Math.cos(radians) * d12);
            fSin = (float) (Math.sin(radians) * d12);
            this.uef.moveTo(fCos2, fSin);
            d3 = radians + ((f19 * f21) / 2.0f);
            f12 = f21;
            fCos = fCos2;
            f13 = f20;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i5 = i11;
            double d13 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d13);
            fSin = (float) (d13 * Math.sin(radians));
            this.uef.moveTo(fCos, fSin);
            f12 = f21;
            f13 = f20;
            d3 = radians + f13;
            fB = 0.0f;
        }
        double dCeil = Math.ceil(d11) * 2.0d;
        int i12 = 0;
        boolean z2 = false;
        double d14 = d3;
        float f22 = fSin;
        float f23 = fCos;
        double d15 = d14;
        while (true) {
            double d16 = i12;
            if (d16 >= dCeil) {
                PointF pointFXs = this.bcc.xs();
                this.uef.offset(pointFXs.x, pointFXs.y);
                this.uef.close();
                return;
            }
            float f24 = z2 ? fFloatValue2 : fFloatValue3;
            if (fB == f11 || d16 != dCeil - 2.0d) {
                i10 = i12;
                f14 = f13;
            } else {
                i10 = i12;
                f14 = (f19 * f12) / f10;
            }
            if (fB == f11 || d16 != dCeil - 1.0d) {
                d5 = d16;
                f15 = f24;
            } else {
                d5 = d16;
                f15 = fB;
            }
            double d17 = f15;
            float fCos3 = (float) (Math.cos(d15) * d17);
            float f25 = f19;
            float fSin2 = (float) (Math.sin(d15) * d17);
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.uef.lineTo(fCos3, fSin2);
                f18 = fCos3;
                f17 = fSin2;
                f16 = f13;
                d10 = d15;
            } else {
                f16 = f13;
                d10 = d15;
                double dAtan2 = (float) (Math.atan2(f22, f23) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f26 = f23;
                float f27 = f22;
                f17 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f28 = z2 ? fFloatValue4 : fFloatValue5;
                float f29 = z2 ? fFloatValue5 : fFloatValue4;
                float f30 = (z2 ? fFloatValue3 : fFloatValue2) * f28 * 0.47829f;
                float f31 = fCos4 * f30;
                float f32 = f30 * fSin3;
                float f33 = (z2 ? fFloatValue2 : fFloatValue3) * f29 * 0.47829f;
                float f34 = fCos5 * f33;
                float f35 = f33 * fSin4;
                if (i5 != 0) {
                    if (i10 == 0) {
                        f31 *= f12;
                        f32 *= f12;
                    } else if (d5 == dCeil - 1.0d) {
                        f34 *= f12;
                        f35 *= f12;
                    }
                }
                f18 = fCos3;
                this.uef.cubicTo(f26 - f31, f27 - f32, fCos3 + f34, f17 + f35, f18, f17);
            }
            d15 = d10 + f14;
            z2 = !z2;
            i12 = i10 + 1;
            f13 = f16;
            f23 = f18;
            f22 = f17;
            f19 = f25;
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.cq
    public Path moa() {
        if (this.wk) {
            return this.uef;
        }
        this.uef.reset();
        if (this.lw) {
            this.wk = true;
            return this.uef;
        }
        int i5 = AnonymousClass1.uef[this.moa.ordinal()];
        if (i5 == 1) {
            yo();
        } else if (i5 == 2) {
            lw();
        }
        this.uef.close();
        this.dz.uef(this.uef);
        this.wk = true;
        return this.uef;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        oa();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            yo yoVar = list.get(i5);
            if (yoVar instanceof tpx) {
                tpx tpxVar = (tpx) yoVar;
                if (tpxVar.oa() == oib.uef.SIMULTANEOUSLY) {
                    this.dz.uef(tpxVar);
                    tpxVar.uef(this);
                }
            }
        }
    }
}
