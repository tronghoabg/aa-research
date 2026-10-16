package com.bytedance.adsdk.oa.yo.yo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class zjm extends moa {
    private Path bcc;
    private int cz;
    private int zjm;

    public zjm(com.bytedance.adsdk.oa.cz czVar, lw lwVar, Context context) {
        super(czVar, lwVar);
        this.bcc = null;
        this.cz = -1;
        this.zjm = -1;
        if (((moa) this).xs != null) {
            float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef();
            this.cz = (int) (((moa) this).xs.uef() * fUef);
            this.zjm = (int) (((moa) this).xs.oa() * fUef);
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.cz, this.zjm);
            Path path = new Path();
            this.bcc = path;
            float f10 = fUef * 40.0f;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        }
    }

    private static void uef(View view, int i5, int i10) {
        view.layout(0, 0, i5, i10);
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.moa, com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        View viewUef = this.f24651oa.uef();
        if (this.cz <= 0 || viewUef == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        uef(i5);
        float fIvm = ivm();
        uef(viewUef, this.cz, this.zjm);
        viewUef.setAlpha(fIvm);
        canvas.clipPath(this.bcc);
        viewUef.draw(canvas);
        canvas.restore();
    }
}
