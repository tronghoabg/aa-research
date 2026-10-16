package com.bytedance.adsdk.oa.yo.yo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class bcc extends uef {
    private final Paint bcc;
    private final float[] cz;
    private final lw dj;
    private com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> wrv;
    private final RectF xs;
    private final Path zjm;

    public bcc(com.bytedance.adsdk.oa.cz czVar, lw lwVar) {
        super(czVar, lwVar);
        this.xs = new RectF();
        com.bytedance.adsdk.oa.uef.uef uefVar = new com.bytedance.adsdk.oa.uef.uef();
        this.bcc = uefVar;
        this.cz = new float[8];
        this.zjm = new Path();
        this.dj = lwVar;
        uefVar.setAlpha(0);
        uefVar.setStyle(Paint.Style.FILL);
        uefVar.setColor(lwVar.ab());
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        super.oa(canvas, matrix, i5);
        int iAlpha = Color.alpha(this.dj.ab());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.moa.uef() == null ? 100 : this.moa.uef().xs().intValue())) / 100.0f) * (i5 / 255.0f) * 255.0f);
        this.bcc.setAlpha(iIntValue);
        com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> uefVar = this.wrv;
        if (uefVar != null) {
            this.bcc.setColorFilter(uefVar.xs());
        }
        if (iIntValue > 0) {
            float[] fArr = this.cz;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.dj.sy();
            float[] fArr2 = this.cz;
            fArr2[3] = 0.0f;
            fArr2[4] = this.dj.sy();
            this.cz[5] = this.dj.bs();
            float[] fArr3 = this.cz;
            fArr3[6] = 0.0f;
            fArr3[7] = this.dj.bs();
            matrix.mapPoints(this.cz);
            this.zjm.reset();
            Path path = this.zjm;
            float[] fArr4 = this.cz;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.zjm;
            float[] fArr5 = this.cz;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.zjm;
            float[] fArr6 = this.cz;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.zjm;
            float[] fArr7 = this.cz;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.zjm;
            float[] fArr8 = this.cz;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.zjm.close();
            canvas.drawPath(this.zjm, this.bcc);
        }
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        super.uef(rectF, matrix, z2);
        this.xs.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.dj.sy(), this.dj.bs());
        this.uef.mapRect(this.xs);
        rectF.set(this.xs);
    }
}
