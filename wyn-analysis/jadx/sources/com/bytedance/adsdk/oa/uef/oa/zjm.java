package com.bytedance.adsdk.oa.uef.oa;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class zjm extends xs<PointF> {
    private final PathMeasure ivm;
    private final float[] lw;
    private final PointF moa;
    private cz xs;

    public zjm(List<? extends com.bytedance.adsdk.oa.xs.uef<PointF>> list) {
        super(list);
        this.moa = new PointF();
        this.lw = new float[2];
        this.ivm = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public PointF uef(com.bytedance.adsdk.oa.xs.uef<PointF> uefVar, float f10) {
        cz czVar = (cz) uefVar;
        Path pathOa = czVar.oa();
        if (pathOa == null) {
            return uefVar.uef;
        }
        if (this.yo != null) {
            czVar.xs.getClass();
            moa();
            bcc();
            throw null;
        }
        if (this.xs != czVar) {
            this.ivm.setPath(pathOa, false);
            this.xs = czVar;
        }
        PathMeasure pathMeasure = this.ivm;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.lw, null);
        PointF pointF = this.moa;
        float[] fArr = this.lw;
        pointF.set(fArr[0], fArr[1]);
        return this.moa;
    }
}
