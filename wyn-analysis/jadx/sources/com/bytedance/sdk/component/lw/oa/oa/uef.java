package com.bytedance.sdk.component.lw.oa.oa;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.lw.oib;

/* loaded from: classes.dex */
public class uef<T> implements ivm {
    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public boolean uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar, oib oibVar, com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        Bitmap bitmapUef;
        String strBcc = yoVar.bcc();
        yoVar.uef();
        com.bytedance.sdk.component.lw.oa oaVarBs = yoVar.bs();
        com.bytedance.sdk.component.lw.oa.yo.ivm ivmVarAb = yoVar.ab();
        if (oaVarBs == null || ivmVarAb == null || !oaVarBs.lw() || !uef(yoVar) || (bitmapUef = ivmVarAb.uef(oaVarBs).uef(strBcc)) == null) {
            return true;
        }
        yoVar.uef();
        uefVar.uef(new com.bytedance.sdk.component.lw.oa.yo.moa().uef(yoVar, bitmapUef, null, false));
        return false;
    }

    private boolean uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar) {
        int iDj = yoVar.dj();
        return iDj == 1 || iDj == 2;
    }

    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public String uef() {
        return "bitmap_cache";
    }
}
