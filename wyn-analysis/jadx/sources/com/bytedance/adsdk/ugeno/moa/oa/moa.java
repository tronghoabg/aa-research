package com.bytedance.adsdk.ugeno.moa.oa;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* loaded from: classes.dex */
public class moa extends uef {
    public moa(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
        super(yoVar, str, uefVar);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void oa() {
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void uef() {
        Object obj;
        com.bytedance.adsdk.ugeno.oa.yo yoVar;
        com.bytedance.adsdk.ugeno.oa.yo yoVarOa;
        com.bytedance.adsdk.ugeno.oa.yo yoVarBcc;
        com.bytedance.adsdk.ugeno.uef.uef uefVarWrv;
        Map<String, Object> map = this.ivm;
        if (map == null || map.size() <= 0 || (obj = this.ivm.get(MediationMetaData.KEY_NAME)) == null) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf) || (yoVarOa = (yoVar = this.yo).oa(yoVar)) == null || (yoVarBcc = yoVarOa.bcc(strValueOf)) == null || (uefVarWrv = yoVarBcc.wrv(strValueOf)) == null) {
            return;
        }
        uefVarWrv.oa();
        uefVarWrv.uef(new com.bytedance.adsdk.ugeno.uef.oa() { // from class: com.bytedance.adsdk.ugeno.moa.oa.moa.1
            @Override // com.bytedance.adsdk.ugeno.uef.oa
            public void oa() {
                moa.this.yo();
            }

            @Override // com.bytedance.adsdk.ugeno.uef.oa
            public void uef() {
            }
        });
    }
}
