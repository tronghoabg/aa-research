package com.bytedance.adsdk.ugeno.moa.oa;

import com.bytedance.adsdk.ugeno.moa.ivm;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class oa extends uef {
    private List<com.bytedance.adsdk.ugeno.moa.uef.moa> cz;

    public oa(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
        super(yoVar, str, uefVar);
        this.cz = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void uef() {
        Object obj;
        com.bytedance.adsdk.ugeno.moa.uef.yo yoVarUef;
        Map<String, Object> map = this.ivm;
        if (map == null || map.size() <= 0 || (obj = this.ivm.get(MediationMetaData.KEY_NAME)) == null) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        com.bytedance.adsdk.ugeno.moa.uef.uef uefVarSk = this.yo.sk();
        if (uefVarSk == null || (yoVarUef = uefVarSk.uef(strValueOf)) == null) {
            return;
        }
        yoVarUef.uef(strValueOf);
    }
}
