package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bcc implements uef.InterfaceC0035uef, dj, lw {

    /* renamed from: ab, reason: collision with root package name */
    private com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> f24583ab;
    private final Paint bcc;
    private com.bytedance.adsdk.oa.uef.oa.bs bs;
    private final com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> cq;
    private final RectF cz;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> dhk;
    private final com.bytedance.adsdk.oa.yo.oa.xs dj;
    private final com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> dz;
    private final com.bytedance.adsdk.oa.yo.yo.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f24584oa;
    private final int oib;
    private final com.bytedance.adsdk.oa.cz sy;
    private com.bytedance.adsdk.oa.uef.oa.yo tpx;
    float uef;
    private final com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> wk;
    private final com.bytedance.adsdk.oa.uef.oa.uef<com.bytedance.adsdk.oa.yo.oa.moa, com.bytedance.adsdk.oa.yo.oa.moa> wrv;
    private final Path xs;
    private final boolean yo;
    private final List<cq> zjm;
    private final LongSparseArray<LinearGradient> lw = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> ivm = new LongSparseArray<>();

    public bcc(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.lw lwVar) {
        Path path = new Path();
        this.xs = path;
        this.bcc = new com.bytedance.adsdk.oa.uef.uef(1);
        this.cz = new RectF();
        this.zjm = new ArrayList();
        this.uef = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.moa = uefVar;
        this.f24584oa = lwVar.uef();
        this.yo = lwVar.bcc();
        this.sy = czVar;
        this.dj = lwVar.oa();
        path.setFillType(lwVar.yo());
        this.oib = (int) (xsVar.lw() / 32.0f);
        com.bytedance.adsdk.oa.uef.oa.uef<com.bytedance.adsdk.oa.yo.oa.moa, com.bytedance.adsdk.oa.yo.oa.moa> uefVarUef = lwVar.moa().uef();
        this.wrv = uefVarUef;
        uefVarUef.uef(this);
        uefVar.uef(uefVarUef);
        com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVarUef2 = lwVar.lw().uef();
        this.cq = uefVarUef2;
        uefVarUef2.uef(this);
        uefVar.uef(uefVarUef2);
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef3 = lwVar.ivm().uef();
        this.dz = uefVarUef3;
        uefVarUef3.uef(this);
        uefVar.uef(uefVarUef3);
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef4 = lwVar.xs().uef();
        this.wk = uefVarUef4;
        uefVarUef4.uef(this);
        uefVar.uef(uefVarUef4);
        if (uefVar.zjm() != null) {
            com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef5 = uefVar.zjm().uef().uef();
            this.dhk = uefVarUef5;
            uefVarUef5.uef(this);
            uefVar.uef(this.dhk);
        }
        if (uefVar.dj() != null) {
            this.tpx = new com.bytedance.adsdk.oa.uef.oa.yo(this, uefVar, uefVar.dj());
        }
    }

    private int moa() {
        int iRound = Math.round(this.dz.bcc() * this.oib);
        int iRound2 = Math.round(this.wk.bcc() * this.oib);
        int iRound3 = Math.round(this.wrv.bcc() * this.oib);
        int i5 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i5 = i5 * 31 * iRound2;
        }
        return iRound3 != 0 ? i5 * 31 * iRound3 : i5;
    }

    private LinearGradient oa() {
        long jMoa = moa();
        LinearGradient linearGradient = this.lw.get(jMoa);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFXs = this.dz.xs();
        PointF pointFXs2 = this.wk.xs();
        com.bytedance.adsdk.oa.yo.oa.moa moaVarXs = this.wrv.xs();
        LinearGradient linearGradient2 = new LinearGradient(pointFXs.x, pointFXs.y, pointFXs2.x, pointFXs2.y, uef(moaVarXs.oa()), moaVarXs.uef(), Shader.TileMode.CLAMP);
        this.lw.put(jMoa, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient yo() {
        long jMoa = moa();
        RadialGradient radialGradient = this.ivm.get(jMoa);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFXs = this.dz.xs();
        PointF pointFXs2 = this.wk.xs();
        com.bytedance.adsdk.oa.yo.oa.moa moaVarXs = this.wrv.xs();
        int[] iArrUef = uef(moaVarXs.oa());
        float[] fArrUef = moaVarXs.uef();
        float f10 = pointFXs.x;
        float f11 = pointFXs.y;
        float fHypot = (float) Math.hypot(pointFXs2.x - f10, pointFXs2.y - f11);
        if (fHypot <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, fHypot, iArrUef, fArrUef, Shader.TileMode.CLAMP);
        this.ivm.put(jMoa, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        this.sy.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
        for (int i5 = 0; i5 < list2.size(); i5++) {
            yo yoVar = list2.get(i5);
            if (yoVar instanceof cq) {
                this.zjm.add((cq) yoVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(Canvas canvas, Matrix matrix, int i5) {
        Shader shaderYo;
        if (this.yo) {
            return;
        }
        com.bytedance.adsdk.oa.lw.uef("GradientFillContent#draw");
        this.xs.reset();
        for (int i10 = 0; i10 < this.zjm.size(); i10++) {
            this.xs.addPath(this.zjm.get(i10).moa(), matrix);
        }
        this.xs.computeBounds(this.cz, false);
        if (this.dj == com.bytedance.adsdk.oa.yo.oa.xs.LINEAR) {
            shaderYo = oa();
        } else {
            shaderYo = yo();
        }
        shaderYo.setLocalMatrix(matrix);
        this.bcc.setShader(shaderYo);
        com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> uefVar = this.f24583ab;
        if (uefVar != null) {
            this.bcc.setColorFilter(uefVar.xs());
        }
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVar2 = this.dhk;
        if (uefVar2 != null) {
            float fFloatValue = uefVar2.xs().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.bcc.setMaskFilter(null);
            } else if (fFloatValue != this.uef) {
                this.bcc.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.uef = fFloatValue;
        }
        com.bytedance.adsdk.oa.uef.oa.yo yoVar = this.tpx;
        if (yoVar != null) {
            yoVar.uef(this.bcc);
        }
        this.bcc.setAlpha(com.bytedance.adsdk.oa.ivm.lw.uef((int) ((((i5 / 255.0f) * this.cq.xs().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.xs, this.bcc);
        com.bytedance.adsdk.oa.lw.oa("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        this.xs.reset();
        for (int i5 = 0; i5 < this.zjm.size(); i5++) {
            this.xs.addPath(this.zjm.get(i5).moa(), matrix);
        }
        this.xs.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] uef(int[] iArr) {
        if (this.bs == null) {
            return iArr;
        }
        throw null;
    }
}
