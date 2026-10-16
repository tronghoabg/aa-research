package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dz extends yo {
    private final String lw;
    private final int moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f25956oa;
    private long uef;
    private final int yo;

    public dz(com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar) {
        this.yo = uefVar.uef();
        this.moa = uefVar.oa();
        this.lw = uefVar.yo();
    }

    public void oa(long j8) {
        this.f25956oa = j8;
    }

    public void uef(long j8) {
        this.uef = j8;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.uef);
            jSONObject.put("total_duration", this.f25956oa);
            jSONObject.put("error_code", this.yo);
            jSONObject.put("extra_error_code", this.moa);
            jSONObject.put("error_message", this.lw);
        } catch (Throwable th) {
            dhk.yo("PlayErrorModel", th.getMessage());
        }
    }
}
