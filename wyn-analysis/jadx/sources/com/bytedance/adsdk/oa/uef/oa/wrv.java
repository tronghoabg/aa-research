package com.bytedance.adsdk.oa.uef.oa;

import java.util.List;

/* loaded from: classes.dex */
public class wrv extends xs<com.bytedance.adsdk.oa.xs.yo> {
    private final com.bytedance.adsdk.oa.xs.yo moa;

    public wrv(List<com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.xs.yo>> list) {
        super(list);
        this.moa = new com.bytedance.adsdk.oa.xs.yo();
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oa.xs.yo uef(com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.xs.yo> uefVar, float f10) {
        com.bytedance.adsdk.oa.xs.yo yoVar;
        com.bytedance.adsdk.oa.xs.yo yoVar2 = uefVar.uef;
        if (yoVar2 == null || (yoVar = uefVar.f24604oa) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.oa.xs.yo yoVar3 = yoVar2;
        com.bytedance.adsdk.oa.xs.yo yoVar4 = yoVar;
        if (this.yo == null) {
            this.moa.uef(com.bytedance.adsdk.oa.ivm.lw.uef(yoVar3.uef(), yoVar4.uef(), f10), com.bytedance.adsdk.oa.ivm.lw.uef(yoVar3.oa(), yoVar4.oa(), f10));
            return this.moa;
        }
        uefVar.xs.getClass();
        moa();
        bcc();
        throw null;
    }
}
