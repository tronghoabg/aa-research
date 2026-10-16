package com.bytedance.adsdk.oa.uef.oa;

import android.graphics.Path;
import com.bytedance.adsdk.oa.uef.uef.oib;
import java.util.List;

/* loaded from: classes.dex */
public class cq extends uef<com.bytedance.adsdk.oa.yo.oa.dz, Path> {
    private List<oib> ivm;
    private final Path lw;
    private final com.bytedance.adsdk.oa.yo.oa.dz moa;

    public cq(List<com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.dz>> list) {
        super(list);
        this.moa = new com.bytedance.adsdk.oa.yo.oa.dz();
        this.lw = new Path();
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public Path uef(com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.dz> uefVar, float f10) {
        this.moa.uef(uefVar.uef, uefVar.f24604oa, f10);
        com.bytedance.adsdk.oa.yo.oa.dz dzVarUef = this.moa;
        List<oib> list = this.ivm;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                dzVarUef = this.ivm.get(size).uef(dzVarUef);
            }
        }
        com.bytedance.adsdk.oa.ivm.lw.uef(dzVarUef, this.lw);
        return this.lw;
    }

    public void uef(List<oib> list) {
        this.ivm = list;
    }
}
