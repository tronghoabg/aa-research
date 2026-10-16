package com.bytedance.sdk.openadsdk.core.dz;

import com.bytedance.sdk.openadsdk.core.dz.yo.uef;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa extends yo {
    private long dj;
    private long zjm;

    public oa(int i5, int i10, long j8, long j10, uef.EnumC0097uef enumC0097uef, uef.oa oaVar, String str, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list2, String str2) {
        super(i5, i10, enumC0097uef, oaVar, str, list, list2, str2);
        this.zjm = j8;
        this.dj = j10;
        this.cz = "icon_click";
    }

    public static oa uef(JSONObject jSONObject) {
        yo yoVarOa = yo.oa(jSONObject);
        if (yoVarOa == null) {
            return null;
        }
        return new oa(yoVarOa.uef, yoVarOa.f25600oa, jSONObject.optLong(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, -1L), jSONObject.optLong("duration", -1L), yoVarOa.yo, yoVarOa.moa, yoVarOa.lw, yoVarOa.ivm, yoVarOa.xs, yoVarOa.bcc);
    }
}
