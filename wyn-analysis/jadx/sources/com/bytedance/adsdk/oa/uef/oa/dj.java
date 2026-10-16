package com.bytedance.adsdk.oa.uef.oa;

import N0.a;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class dj extends xs<PointF> {
    private final PointF moa;

    public dj(List<com.bytedance.adsdk.oa.xs.uef<PointF>> list) {
        super(list);
        this.moa = new PointF();
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public PointF uef(com.bytedance.adsdk.oa.xs.uef<PointF> uefVar, float f10) {
        return uef(uefVar, f10, f10, f10);
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public PointF uef(com.bytedance.adsdk.oa.xs.uef<PointF> uefVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = uefVar.uef;
        if (pointF2 == null || (pointF = uefVar.f24604oa) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.yo != null) {
            uefVar.xs.getClass();
            moa();
            bcc();
            throw null;
        }
        PointF pointF5 = this.moa;
        float f13 = pointF3.x;
        float fB = a.b(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF5.set(fB, a.b(pointF4.y, f14, f12, f14));
        return this.moa;
    }
}
