package com.bytedance.adsdk.oa.yo.uef;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class lw implements cq<PointF, PointF> {
    private final List<com.bytedance.adsdk.oa.xs.uef<PointF>> uef;

    public lw(List<com.bytedance.adsdk.oa.xs.uef<PointF>> list) {
        this.uef = list;
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public boolean oa() {
        return this.uef.size() == 1 && this.uef.get(0).lw();
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uef() {
        return this.uef.get(0).lw() ? new com.bytedance.adsdk.oa.uef.oa.dj(this.uef) : new com.bytedance.adsdk.oa.uef.oa.zjm(this.uef);
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public List<com.bytedance.adsdk.oa.xs.uef<PointF>> yo() {
        return this.uef;
    }
}
