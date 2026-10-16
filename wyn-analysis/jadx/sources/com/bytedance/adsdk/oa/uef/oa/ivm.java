package com.bytedance.adsdk.oa.uef.oa;

import java.util.List;

/* loaded from: classes.dex */
public class ivm extends xs<Integer> {
    public ivm(List<com.bytedance.adsdk.oa.xs.uef<Integer>> list) {
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
            return com.bytedance.adsdk.oa.ivm.lw.uef(uefVar.bcc(), uefVar.cz(), f10);
        }
        uefVar.xs.getClass();
        moa();
        bcc();
        throw null;
    }
}
