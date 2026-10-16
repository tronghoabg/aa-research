package com.bytedance.adsdk.ugeno.moa.yo;

import android.content.res.Resources;
import com.bytedance.adsdk.ugeno.moa.ivm;

/* loaded from: classes.dex */
public class yo extends com.bytedance.adsdk.ugeno.moa.oa.uef {
    public yo(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
        super(yoVar, str, uefVar);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void uef() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.oa.yo yoVarOa;
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.yo;
        if (yoVar == null || (yoVarOa = yoVar.oa(yoVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVarIvm = yoVarOa.ivm("SwiperView");
        if (yoVarIvm instanceof com.bytedance.adsdk.ugeno.oa) {
            ((com.bytedance.adsdk.ugeno.oa) yoVarIvm).moa();
        }
    }
}
