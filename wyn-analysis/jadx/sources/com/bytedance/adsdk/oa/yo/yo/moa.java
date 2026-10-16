package com.bytedance.adsdk.oa.yo.yo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class moa extends uef {
    private final Paint bcc;
    private final Rect cz;
    private com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> dj;
    private com.bytedance.adsdk.oa.uef.oa.uef<Bitmap, Bitmap> wrv;
    protected final com.bytedance.adsdk.oa.zjm xs;
    private final Rect zjm;

    public moa(com.bytedance.adsdk.oa.cz czVar, lw lwVar) {
        super(czVar, lwVar);
        this.bcc = new com.bytedance.adsdk.oa.uef.uef(3);
        this.cz = new Rect();
        this.zjm = new Rect();
        this.xs = czVar.ivm(lwVar.xs());
    }

    private Bitmap wrv() {
        Bitmap bitmapXs;
        com.bytedance.adsdk.oa.uef.oa.uef<Bitmap, Bitmap> uefVar = this.wrv;
        if (uefVar != null && (bitmapXs = uefVar.xs()) != null) {
            return bitmapXs;
        }
        Bitmap bitmapLw = this.f24651oa.lw(this.yo.xs());
        if (bitmapLw != null) {
            return bitmapLw;
        }
        com.bytedance.adsdk.oa.zjm zjmVar = this.xs;
        if (zjmVar != null) {
            return zjmVar.dj();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        super.oa(canvas, matrix, i5);
        Bitmap bitmapWrv = wrv();
        if (bitmapWrv == null || bitmapWrv.isRecycled() || this.xs == null) {
            return;
        }
        float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef();
        this.bcc.setAlpha(i5);
        com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> uefVar = this.dj;
        if (uefVar != null) {
            this.bcc.setColorFilter(uefVar.xs());
        }
        canvas.save();
        canvas.concat(matrix);
        this.cz.set(0, 0, bitmapWrv.getWidth(), bitmapWrv.getHeight());
        if (this.f24651oa.lw()) {
            this.zjm.set(0, 0, (int) (this.xs.uef() * fUef), (int) (this.xs.oa() * fUef));
        } else {
            this.zjm.set(0, 0, (int) (bitmapWrv.getWidth() * fUef), (int) (bitmapWrv.getHeight() * fUef));
        }
        canvas.drawBitmap(bitmapWrv, this.cz, this.zjm, this.bcc);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        super.uef(rectF, matrix, z2);
        if (this.xs != null) {
            float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xs.uef() * fUef, this.xs.oa() * fUef);
            this.uef.mapRect(rectF);
        }
    }
}
