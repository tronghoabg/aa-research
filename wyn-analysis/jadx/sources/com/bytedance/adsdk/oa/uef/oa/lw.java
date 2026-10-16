package com.bytedance.adsdk.oa.uef.oa;

import java.util.List;

/* loaded from: classes.dex */
public class lw extends xs<com.bytedance.adsdk.oa.yo.oa.moa> {
    private final com.bytedance.adsdk.oa.yo.oa.moa moa;

    public lw(List<com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.moa>> list) {
        super(list);
        com.bytedance.adsdk.oa.yo.oa.moa moaVar = list.get(0).uef;
        int iYo = moaVar != null ? moaVar.yo() : 0;
        this.moa = new com.bytedance.adsdk.oa.yo.oa.moa(new float[iYo], new int[iYo]);
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oa.yo.oa.moa uef(com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.moa> uefVar, float f10) {
        this.moa.uef(uefVar.uef, uefVar.f24604oa, f10);
        return this.moa;
    }
}
