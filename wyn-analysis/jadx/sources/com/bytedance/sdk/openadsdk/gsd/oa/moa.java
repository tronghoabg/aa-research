package com.bytedance.sdk.openadsdk.gsd.oa;

import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa {
    public static void uef(final gzw gzwVar, final uef uefVar, final lw.uef uefVar2) {
        gzwVar.gv();
        km.oa(new com.bytedance.sdk.component.bcc.oa.yo("mrc_report") { // from class: com.bytedance.sdk.openadsdk.gsd.oa.moa.1
            @Override // java.lang.Runnable
            public void run() {
                if (gzwVar.qr()) {
                    if (gzwVar.ib()) {
                        com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(gzwVar.df(), new yo.oa("show_urls", gzwVar));
                    } else {
                        com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar);
                    }
                }
                String strUef = gb.uef(gzwVar);
                final JSONObject jSONObject = new JSONObject();
                uef uefVar3 = uefVar;
                JSONObject jSONObjectUef = null;
                if (uefVar3 != null) {
                    try {
                        jSONObject.put("root_view", uef.uef(uefVar3));
                        lw.uef uefVar4 = uefVar2;
                        if (uefVar4 != null) {
                            int i5 = uefVar4.uef;
                            if (i5 != -1) {
                                jSONObject.put("dynamic_show_type", i5);
                            }
                            int i10 = uefVar2.f25909oa;
                            if (i10 != -1) {
                                jSONObjectUef = com.bytedance.sdk.openadsdk.moa.yo.uef(i10 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject2 = jSONObjectUef;
                com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, strUef, "mrc_show", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.gsd.oa.moa.1.1
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject uef() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject yo() {
                        return jSONObject;
                    }
                });
            }
        });
    }
}
