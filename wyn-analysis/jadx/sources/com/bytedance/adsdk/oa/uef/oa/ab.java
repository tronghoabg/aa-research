package com.bytedance.adsdk.oa.uef.oa;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class ab {
    private uef<com.bytedance.adsdk.oa.xs.yo, com.bytedance.adsdk.oa.xs.yo> bcc;
    private uef<?, Float> cq;
    private uef<Float, Float> cz;
    private moa dj;
    private uef<?, Float> dz;
    private uef<PointF, PointF> ivm;
    private final float[] lw;
    private final Matrix moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Matrix f24576oa;
    private final Matrix uef = new Matrix();
    private moa wrv;
    private uef<?, PointF> xs;
    private final Matrix yo;
    private uef<Integer, Integer> zjm;

    public ab(com.bytedance.adsdk.oa.yo.uef.wrv wrvVar) {
        this.ivm = wrvVar.uef() == null ? null : wrvVar.uef().uef();
        this.xs = wrvVar.oa() == null ? null : wrvVar.oa().uef();
        this.bcc = wrvVar.yo() == null ? null : wrvVar.yo().uef();
        this.cz = wrvVar.moa() == null ? null : wrvVar.moa().uef();
        moa moaVar = wrvVar.bcc() == null ? null : (moa) wrvVar.bcc().uef();
        this.dj = moaVar;
        if (moaVar != null) {
            this.f24576oa = new Matrix();
            this.yo = new Matrix();
            this.moa = new Matrix();
            this.lw = new float[9];
        } else {
            this.f24576oa = null;
            this.yo = null;
            this.moa = null;
            this.lw = null;
        }
        this.wrv = wrvVar.cz() == null ? null : (moa) wrvVar.cz().uef();
        if (wrvVar.lw() != null) {
            this.zjm = wrvVar.lw().uef();
        }
        if (wrvVar.ivm() != null) {
            this.cq = wrvVar.ivm().uef();
        } else {
            this.cq = null;
        }
        if (wrvVar.xs() != null) {
            this.dz = wrvVar.xs().uef();
        } else {
            this.dz = null;
        }
    }

    private void lw() {
        for (int i5 = 0; i5 < 9; i5++) {
            this.lw[i5] = 0.0f;
        }
    }

    public Matrix moa() {
        PointF pointFXs;
        PointF pointFXs2;
        this.uef.reset();
        uef<?, PointF> uefVar = this.xs;
        if (uefVar != null && (pointFXs2 = uefVar.xs()) != null) {
            float f10 = pointFXs2.x;
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFXs2.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.uef.preTranslate(f10, pointFXs2.y);
            }
        }
        uef<Float, Float> uefVar2 = this.cz;
        if (uefVar2 != null) {
            float fFloatValue = uefVar2 instanceof bs ? uefVar2.xs().floatValue() : ((moa) uefVar2).cz();
            if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.uef.preRotate(fFloatValue);
            }
        }
        if (this.dj != null) {
            float fCos = this.wrv == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.cz()) + 90.0f));
            float fSin = this.wrv == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.cz()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.cz()));
            lw();
            float[] fArr = this.lw;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f24576oa.setValues(fArr);
            lw();
            float[] fArr2 = this.lw;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.yo.setValues(fArr2);
            lw();
            float[] fArr3 = this.lw;
            fArr3[0] = fCos;
            fArr3[1] = f11;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.moa.setValues(fArr3);
            this.yo.preConcat(this.f24576oa);
            this.moa.preConcat(this.yo);
            this.uef.preConcat(this.moa);
        }
        uef<com.bytedance.adsdk.oa.xs.yo, com.bytedance.adsdk.oa.xs.yo> uefVar3 = this.bcc;
        if (uefVar3 != null) {
            com.bytedance.adsdk.oa.xs.yo yoVarXs = uefVar3.xs();
            if (yoVarXs.uef() != 1.0f || yoVarXs.oa() != 1.0f) {
                this.uef.preScale(yoVarXs.uef(), yoVarXs.oa());
            }
        }
        uef<PointF, PointF> uefVar4 = this.ivm;
        if (uefVar4 != null && (((pointFXs = uefVar4.xs()) != null && pointFXs.x != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || pointFXs.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            this.uef.preTranslate(-pointFXs.x, -pointFXs.y);
        }
        return this.uef;
    }

    public uef<?, Float> oa() {
        return this.cq;
    }

    public void uef(com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        uefVar.uef(this.zjm);
        uefVar.uef(this.cq);
        uefVar.uef(this.dz);
        uefVar.uef(this.ivm);
        uefVar.uef(this.xs);
        uefVar.uef(this.bcc);
        uefVar.uef(this.cz);
        uefVar.uef(this.dj);
        uefVar.uef(this.wrv);
    }

    public uef<?, Float> yo() {
        return this.dz;
    }

    public Matrix oa(float f10) {
        uef<?, PointF> uefVar = this.xs;
        PointF pointFXs = uefVar == null ? null : uefVar.xs();
        uef<com.bytedance.adsdk.oa.xs.yo, com.bytedance.adsdk.oa.xs.yo> uefVar2 = this.bcc;
        com.bytedance.adsdk.oa.xs.yo yoVarXs = uefVar2 == null ? null : uefVar2.xs();
        this.uef.reset();
        if (pointFXs != null) {
            this.uef.preTranslate(pointFXs.x * f10, pointFXs.y * f10);
        }
        if (yoVarXs != null) {
            double d3 = f10;
            this.uef.preScale((float) Math.pow(yoVarXs.uef(), d3), (float) Math.pow(yoVarXs.oa(), d3));
        }
        uef<Float, Float> uefVar3 = this.cz;
        if (uefVar3 != null) {
            float fFloatValue = uefVar3.xs().floatValue();
            uef<PointF, PointF> uefVar4 = this.ivm;
            PointF pointFXs2 = uefVar4 != null ? uefVar4.xs() : null;
            Matrix matrix = this.uef;
            float f11 = fFloatValue * f10;
            float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f13 = pointFXs2 == null ? 0.0f : pointFXs2.x;
            if (pointFXs2 != null) {
                f12 = pointFXs2.y;
            }
            matrix.preRotate(f11, f13, f12);
        }
        return this.uef;
    }

    public void uef(uef.InterfaceC0035uef interfaceC0035uef) {
        uef<Integer, Integer> uefVar = this.zjm;
        if (uefVar != null) {
            uefVar.uef(interfaceC0035uef);
        }
        uef<?, Float> uefVar2 = this.cq;
        if (uefVar2 != null) {
            uefVar2.uef(interfaceC0035uef);
        }
        uef<?, Float> uefVar3 = this.dz;
        if (uefVar3 != null) {
            uefVar3.uef(interfaceC0035uef);
        }
        uef<PointF, PointF> uefVar4 = this.ivm;
        if (uefVar4 != null) {
            uefVar4.uef(interfaceC0035uef);
        }
        uef<?, PointF> uefVar5 = this.xs;
        if (uefVar5 != null) {
            uefVar5.uef(interfaceC0035uef);
        }
        uef<com.bytedance.adsdk.oa.xs.yo, com.bytedance.adsdk.oa.xs.yo> uefVar6 = this.bcc;
        if (uefVar6 != null) {
            uefVar6.uef(interfaceC0035uef);
        }
        uef<Float, Float> uefVar7 = this.cz;
        if (uefVar7 != null) {
            uefVar7.uef(interfaceC0035uef);
        }
        moa moaVar = this.dj;
        if (moaVar != null) {
            moaVar.uef(interfaceC0035uef);
        }
        moa moaVar2 = this.wrv;
        if (moaVar2 != null) {
            moaVar2.uef(interfaceC0035uef);
        }
    }

    public void uef(float f10) {
        uef<Integer, Integer> uefVar = this.zjm;
        if (uefVar != null) {
            uefVar.uef(f10);
        }
        uef<?, Float> uefVar2 = this.cq;
        if (uefVar2 != null) {
            uefVar2.uef(f10);
        }
        uef<?, Float> uefVar3 = this.dz;
        if (uefVar3 != null) {
            uefVar3.uef(f10);
        }
        uef<PointF, PointF> uefVar4 = this.ivm;
        if (uefVar4 != null) {
            uefVar4.uef(f10);
        }
        uef<?, PointF> uefVar5 = this.xs;
        if (uefVar5 != null) {
            uefVar5.uef(f10);
        }
        uef<com.bytedance.adsdk.oa.xs.yo, com.bytedance.adsdk.oa.xs.yo> uefVar6 = this.bcc;
        if (uefVar6 != null) {
            uefVar6.uef(f10);
        }
        uef<Float, Float> uefVar7 = this.cz;
        if (uefVar7 != null) {
            uefVar7.uef(f10);
        }
        moa moaVar = this.dj;
        if (moaVar != null) {
            moaVar.uef(f10);
        }
        moa moaVar2 = this.wrv;
        if (moaVar2 != null) {
            moaVar2.uef(f10);
        }
    }

    public uef<?, Integer> uef() {
        return this.zjm;
    }
}
