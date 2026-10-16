package com.bytedance.sdk.openadsdk.wrv.uef;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.km;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class orq extends com.bytedance.sdk.component.uef.sy<JSONObject, JSONObject> {
    public static final HashSet<String> uef = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.cz.ivm f26187oa;
    private oyt yo;

    public orq(com.bytedance.sdk.component.cz.ivm ivmVar, oyt oytVar, gzw gzwVar) {
        this.f26187oa = ivmVar;
        this.yo = oytVar;
        this.moa = gzwVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, com.bytedance.sdk.component.cz.ivm ivmVar, oyt oytVar, gzw gzwVar) {
        wkVar.uef(uef, new orq(ivmVar, oytVar, gzwVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                gzw gzwVar = this.moa;
                if (gzwVar != null) {
                    jSONObject2.put("visibleState", !km.uef(this.f26187oa, 20, gzwVar.epe(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.orq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (orq.this.f26187oa != null) {
                            orq.this.f26187oa.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) orq.this.f26187oa.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(orq.this.f26187oa);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.f26187oa != null) {
                    jSONObject2.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.orq.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (orq.this.f26187oa != null) {
                                orq.this.f26187oa.setVisibility(0);
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
