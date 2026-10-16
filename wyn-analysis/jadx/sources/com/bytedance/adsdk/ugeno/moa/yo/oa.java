package com.bytedance.adsdk.ugeno.moa.yo;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.moa.ivm;

/* loaded from: classes.dex */
public class oa extends com.bytedance.adsdk.ugeno.moa.oa.uef {
    public oa(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
        super(yoVar, str, uefVar);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void uef() throws Resources.NotFoundException {
        if (this.yo == null) {
            return;
        }
        Object obj = this.ivm.get("position");
        int iUef = obj != null ? com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj), 0) : 0;
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.yo;
        com.bytedance.adsdk.ugeno.oa.yo yoVarOa = yoVar.oa(yoVar);
        if (yoVarOa == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVarIvm = yoVarOa.ivm("SwiperView");
        if (yoVarIvm instanceof com.bytedance.adsdk.ugeno.oa) {
            ((com.bytedance.adsdk.ugeno.oa) yoVarIvm).uef(iUef);
        }
    }
}
