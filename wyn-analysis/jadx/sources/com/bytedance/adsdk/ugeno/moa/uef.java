package com.bytedance.adsdk.ugeno.moa;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class uef implements bcc {
    @Override // com.bytedance.adsdk.ugeno.moa.bcc
    public List<xs> uef() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xs("slide") { // from class: com.bytedance.adsdk.ugeno.moa.uef.1
            @Override // com.bytedance.adsdk.ugeno.moa.xs
            public com.bytedance.adsdk.ugeno.moa.moa.yo uef(Context context) {
                return new com.bytedance.adsdk.ugeno.moa.moa.lw(context);
            }
        });
        arrayList.add(new xs("tap") { // from class: com.bytedance.adsdk.ugeno.moa.uef.2
            @Override // com.bytedance.adsdk.ugeno.moa.xs
            public com.bytedance.adsdk.ugeno.moa.moa.yo uef(Context context) {
                return new com.bytedance.adsdk.ugeno.moa.moa.cz(context);
            }
        });
        arrayList.add(new xs("timer") { // from class: com.bytedance.adsdk.ugeno.moa.uef.3
            @Override // com.bytedance.adsdk.ugeno.moa.xs
            public com.bytedance.adsdk.ugeno.moa.moa.yo uef(Context context) {
                return new com.bytedance.adsdk.ugeno.moa.moa.zjm(context);
            }
        });
        arrayList.add(new xs("touchStart") { // from class: com.bytedance.adsdk.ugeno.moa.uef.4
            @Override // com.bytedance.adsdk.ugeno.moa.xs
            public com.bytedance.adsdk.ugeno.moa.moa.yo uef(Context context) {
                return new com.bytedance.adsdk.ugeno.moa.moa.wrv(context);
            }
        });
        arrayList.add(new xs("touchEnd") { // from class: com.bytedance.adsdk.ugeno.moa.uef.5
            @Override // com.bytedance.adsdk.ugeno.moa.xs
            public com.bytedance.adsdk.ugeno.moa.moa.yo uef(Context context) {
                return new com.bytedance.adsdk.ugeno.moa.moa.dj(context);
            }
        });
        arrayList.add(new xs("animateState") { // from class: com.bytedance.adsdk.ugeno.moa.uef.6
            @Override // com.bytedance.adsdk.ugeno.moa.xs
            public com.bytedance.adsdk.ugeno.moa.moa.yo uef(Context context) {
                return new com.bytedance.adsdk.ugeno.moa.moa.oa(context);
            }
        });
        return arrayList;
    }
}
