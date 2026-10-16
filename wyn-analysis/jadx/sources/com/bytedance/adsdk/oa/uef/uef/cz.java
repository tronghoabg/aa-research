package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* loaded from: classes.dex */
public class cz extends uef {
    private final RectF bcc;
    private final com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> cq;
    private final com.bytedance.adsdk.oa.yo.oa.xs cz;
    private final com.bytedance.adsdk.oa.uef.oa.uef<com.bytedance.adsdk.oa.yo.oa.moa, com.bytedance.adsdk.oa.yo.oa.moa> dj;
    private com.bytedance.adsdk.oa.uef.oa.bs dz;
    private final LongSparseArray<LinearGradient> ivm;
    private final boolean lw;
    private final String moa;
    private final com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> wrv;
    private final LongSparseArray<RadialGradient> xs;
    private final int zjm;

    public cz(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.ivm ivmVar) {
        super(czVar, uefVar, ivmVar.bcc().uef(), ivmVar.cz().uef(), ivmVar.wrv(), ivmVar.moa(), ivmVar.xs(), ivmVar.zjm(), ivmVar.dj());
        this.ivm = new LongSparseArray<>();
        this.xs = new LongSparseArray<>();
        this.bcc = new RectF();
        this.moa = ivmVar.uef();
        this.cz = ivmVar.oa();
        this.lw = ivmVar.cq();
        this.zjm = (int) (czVar.gr().lw() / 32.0f);
        com.bytedance.adsdk.oa.uef.oa.uef<com.bytedance.adsdk.oa.yo.oa.moa, com.bytedance.adsdk.oa.yo.oa.moa> uefVarUef = ivmVar.yo().uef();
        this.dj = uefVarUef;
        uefVarUef.uef(this);
        uefVar.uef(uefVarUef);
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef2 = ivmVar.lw().uef();
        this.wrv = uefVarUef2;
        uefVarUef2.uef(this);
        uefVar.uef(uefVarUef2);
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef3 = ivmVar.ivm().uef();
        this.cq = uefVarUef3;
        uefVarUef3.uef(this);
        uefVar.uef(uefVarUef3);
    }

    private int moa() {
        int iRound = Math.round(this.wrv.bcc() * this.zjm);
        int iRound2 = Math.round(this.cq.bcc() * this.zjm);
        int iRound3 = Math.round(this.dj.bcc() * this.zjm);
        int i5 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i5 = i5 * 31 * iRound2;
        }
        return iRound3 != 0 ? i5 * 31 * iRound3 : i5;
    }

    private LinearGradient oa() {
        long jMoa = moa();
        LinearGradient linearGradient = this.ivm.get(jMoa);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFXs = this.wrv.xs();
        PointF pointFXs2 = this.cq.xs();
        com.bytedance.adsdk.oa.yo.oa.moa moaVarXs = this.dj.xs();
        LinearGradient linearGradient2 = new LinearGradient(pointFXs.x, pointFXs.y, pointFXs2.x, pointFXs2.y, uef(moaVarXs.oa()), moaVarXs.uef(), Shader.TileMode.CLAMP);
        this.ivm.put(jMoa, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient yo() {
        long jMoa = moa();
        RadialGradient radialGradient = this.xs.get(jMoa);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFXs = this.wrv.xs();
        PointF pointFXs2 = this.cq.xs();
        com.bytedance.adsdk.oa.yo.oa.moa moaVarXs = this.dj.xs();
        int[] iArrUef = uef(moaVarXs.oa());
        float[] fArrUef = moaVarXs.uef();
        RadialGradient radialGradient2 = new RadialGradient(pointFXs.x, pointFXs.y, (float) Math.hypot(pointFXs2.x - r7, pointFXs2.y - r8), iArrUef, fArrUef, Shader.TileMode.CLAMP);
        this.xs.put(jMoa, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(Canvas canvas, Matrix matrix, int i5) {
        if (this.lw) {
            return;
        }
        uef(this.bcc, matrix, false);
        Shader shaderOa = this.cz == com.bytedance.adsdk.oa.yo.oa.xs.LINEAR ? oa() : yo();
        shaderOa.setLocalMatrix(matrix);
        this.f24592oa.setShader(shaderOa);
        super.uef(canvas, matrix, i5);
    }

    private int[] uef(int[] iArr) {
        if (this.dz == null) {
            return iArr;
        }
        throw null;
    }
}
