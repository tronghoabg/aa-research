package com.bytedance.adsdk.ugeno.moa;

import com.bytedance.adsdk.ugeno.moa.ivm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lw implements yo {
    @Override // com.bytedance.adsdk.ugeno.moa.yo
    public List<oa> uef() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new oa("update") { // from class: com.bytedance.adsdk.ugeno.moa.lw.1
            @Override // com.bytedance.adsdk.ugeno.moa.oa
            public com.bytedance.adsdk.ugeno.moa.oa.uef uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
                return new com.bytedance.adsdk.ugeno.moa.oa.lw(yoVar, str, uefVar);
            }
        });
        arrayList.add(new oa("emit") { // from class: com.bytedance.adsdk.ugeno.moa.lw.2
            @Override // com.bytedance.adsdk.ugeno.moa.oa
            public com.bytedance.adsdk.ugeno.moa.oa.uef uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
                return new com.bytedance.adsdk.ugeno.moa.oa.oa(yoVar, str, uefVar);
            }
        });
        arrayList.add(new oa("startAnimate") { // from class: com.bytedance.adsdk.ugeno.moa.lw.3
            @Override // com.bytedance.adsdk.ugeno.moa.oa
            public com.bytedance.adsdk.ugeno.moa.oa.uef uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
                return new com.bytedance.adsdk.ugeno.moa.oa.moa(yoVar, str, uefVar);
            }
        });
        return arrayList;
    }
}
