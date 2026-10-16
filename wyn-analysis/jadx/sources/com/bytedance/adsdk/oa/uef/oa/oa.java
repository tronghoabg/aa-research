package com.bytedance.adsdk.oa.uef.oa;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* loaded from: classes.dex */
public class oa extends xs<Integer> {
    public oa(List<com.bytedance.adsdk.oa.xs.uef<Integer>> list) {
        super(list);
    }

    public int cz() {
        return yo(yo(), lw());
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public Integer uef(com.bytedance.adsdk.oa.xs.uef<Integer> uefVar, float f10) {
        return Integer.valueOf(yo(uefVar, f10));
    }

    public int yo(com.bytedance.adsdk.oa.xs.uef<Integer> uefVar, float f10) {
        if (uefVar.uef == null || uefVar.f24604oa == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.yo == null) {
            return com.bytedance.adsdk.oa.ivm.oa.uef(com.bytedance.adsdk.oa.ivm.lw.oa(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), uefVar.uef.intValue(), uefVar.f24604oa.intValue());
        }
        uefVar.xs.getClass();
        moa();
        bcc();
        throw null;
    }
}
