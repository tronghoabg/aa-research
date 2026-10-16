package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.component.uef.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wk extends com.bytedance.sdk.component.uef.yo<JSONObject, JSONObject> {
    private HashSet<Integer> moa = new HashSet<>();

    /* renamed from: oa, reason: collision with root package name */
    private gzw f26189oa;
    private WeakReference<oyt> uef;
    private long yo;

    public wk(oyt oytVar, gzw gzwVar) {
        this.uef = new WeakReference<>(oytVar);
        this.f26189oa = gzwVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, final oyt oytVar, final gzw gzwVar) {
        wkVar.uef("requestDelayCallback", new yo.oa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.wk.1
            @Override // com.bytedance.sdk.component.uef.yo.oa
            public com.bytedance.sdk.component.uef.yo uef() {
                return new wk(oytVar, gzwVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.uef.yo
    public void uef(JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        oyt oytVar = this.uef.get();
        if (oytVar != null && jSONObject != null) {
            oytVar.uef(new com.bytedance.sdk.openadsdk.cq.oa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.wk.2
                @Override // com.bytedance.sdk.openadsdk.cq.oa
                public void uef(int i5) {
                    wk.this.moa.add(Integer.valueOf(i5));
                    if (wk.this.moa.size() >= wk.this.yo) {
                        try {
                            wk.this.uef((wk) new JSONObject());
                            wk.this.moa.clear();
                        } catch (Exception e7) {
                            e7.getMessage();
                        }
                    }
                }
            });
            if (jSONObject.optInt("delay", -1) < 0) {
                return;
            }
            this.yo = r2 / 1000;
            return;
        }
        yo();
    }
}
