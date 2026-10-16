package com.bytedance.sdk.openadsdk.wrv.uef;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.km;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class tpx extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private oyt f26188oa;
    private com.bytedance.sdk.component.cz.ivm uef;
    private gzw yo;

    public tpx(com.bytedance.sdk.component.cz.ivm ivmVar, String str, oyt oytVar, gzw gzwVar) {
        this.uef = ivmVar;
        this.moa = str;
        this.f26188oa = oytVar;
        this.yo = gzwVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, com.bytedance.sdk.component.cz.ivm ivmVar, oyt oytVar, gzw gzwVar) {
        wkVar.uef("closeWebview", new tpx(ivmVar, "closeWebview", oytVar, gzwVar));
        wkVar.uef("makeVisible", new tpx(ivmVar, "makeVisible", oytVar, gzwVar));
        wkVar.uef("getCurrentVisibleState", new tpx(ivmVar, "getCurrentVisibleState", oytVar, gzwVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        String str2 = this.moa;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                gzw gzwVar = this.yo;
                if (gzwVar != null) {
                    jSONObject2.put("visibleState", !km.uef(this.uef, 20, gzwVar.epe(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.tpx.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tpx.this.uef != null) {
                            tpx.this.uef.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) tpx.this.uef.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(tpx.this.uef);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.uef != null) {
                    jSONObject2.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.tpx.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (tpx.this.uef != null) {
                                tpx.this.uef.setVisibility(0);
                            }
                        }
                    });
                    return jSONObject2;
                }
                jSONObject2.put("success", false);
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
