package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cq extends yo {

    /* renamed from: oa, reason: collision with root package name */
    public int f25953oa;
    public long uef;
    public long yo;

    public void oa(long j8) {
        this.yo = j8;
    }

    public void uef(long j8) {
        this.uef = j8;
    }

    public void uef(int i5) {
        this.f25953oa = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.uef);
            jSONObject.put("buffers_count", this.f25953oa);
            jSONObject.put("total_duration", this.yo);
        } catch (Throwable th) {
            dhk.yo("PlayBufferModel", th.getMessage());
        }
    }
}
