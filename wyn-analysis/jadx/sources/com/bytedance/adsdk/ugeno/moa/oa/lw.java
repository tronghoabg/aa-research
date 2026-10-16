package com.bytedance.adsdk.ugeno.moa.oa;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.moa.ivm;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class lw extends uef {
    public lw(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
        super(yoVar, str, uefVar);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void uef() throws JSONException {
        Map<String, Object> map = this.ivm;
        if (map == null || map.size() <= 0) {
            return;
        }
        Object obj = this.ivm.get("id");
        if (obj == null) {
            uef(this.yo);
            return;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            uef(this.yo);
            return;
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.yo;
        com.bytedance.adsdk.ugeno.oa.yo yoVarOa = yoVar.oa(yoVar);
        if (yoVarOa == null) {
            return;
        }
        uef(yoVarOa.lw(strValueOf));
    }

    private void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) throws JSONException {
        Object obj;
        if (yoVar == null) {
            return;
        }
        for (String str : this.ivm.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id") && (obj = this.ivm.get(str)) != null) {
                yoVar.uef(str, String.valueOf(obj));
            }
        }
        yoVar.uef(this.ivm.containsKey("width"), this.ivm.containsKey("height"));
        yoVar.oa();
    }
}
