package com.bytedance.adsdk.oa.yo.uef;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class cz implements cq<PointF, PointF> {

    /* renamed from: oa, reason: collision with root package name */
    private final oa f24638oa;
    private final oa uef;

    public cz(oa oaVar, oa oaVar2) {
        this.uef = oaVar;
        this.f24638oa = oaVar2;
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public boolean oa() {
        return this.uef.oa() && this.f24638oa.oa();
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uef() {
        return new com.bytedance.adsdk.oa.uef.oa.dz(this.uef.uef(), this.f24638oa.uef());
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public List<com.bytedance.adsdk.oa.xs.uef<PointF>> yo() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
