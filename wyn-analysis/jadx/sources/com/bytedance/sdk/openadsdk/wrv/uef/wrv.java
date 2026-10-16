package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.oyt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wrv extends com.bytedance.sdk.component.uef.sy<JSONObject, JSONObject> {
    private static final HashSet<String> uef = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));

    /* renamed from: oa, reason: collision with root package name */
    private final oyt f26191oa;

    public wrv(oyt oytVar) {
        this.f26191oa = oytVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef(uef, new wrv(oytVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.f26191oa.ab();
                break;
            case "popupShow":
                this.f26191oa.wk();
                break;
            case "popupRenderDidFinish":
                this.f26191oa.sy();
                break;
            case "changeCountdownStatus":
                this.f26191oa.dj(jSONObject);
                break;
        }
        return null;
    }
}
