package com.bytedance.adsdk.oa.uef.oa;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class cz extends com.bytedance.adsdk.oa.xs.uef<PointF> {
    private final com.bytedance.adsdk.oa.xs.uef<PointF> dj;
    private Path zjm;

    public cz(com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.xs.uef<PointF> uefVar) {
        super(xsVar, uefVar.uef, uefVar.f24604oa, uefVar.yo, uefVar.moa, uefVar.lw, uefVar.ivm, uefVar.xs);
        this.dj = uefVar;
        uef();
    }

    public Path oa() {
        return this.zjm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void uef() {
        T t10;
        T t11;
        T t12 = this.f24604oa;
        boolean z2 = (t12 == 0 || (t11 = this.uef) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.uef;
        if (t13 == 0 || (t10 = this.f24604oa) == 0 || z2) {
            return;
        }
        com.bytedance.adsdk.oa.xs.uef<PointF> uefVar = this.dj;
        this.zjm = com.bytedance.adsdk.oa.ivm.ivm.uef((PointF) t13, (PointF) t10, uefVar.bcc, uefVar.cz);
    }
}
