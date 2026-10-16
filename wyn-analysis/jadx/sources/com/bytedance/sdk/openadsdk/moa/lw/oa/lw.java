package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw extends yo {

    /* renamed from: oa, reason: collision with root package name */
    private long f25958oa;
    private long uef;

    public void oa(long j8) {
        this.f25958oa = j8;
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
            jSONObject.put("total_duration", this.f25958oa);
        } catch (Throwable th) {
            dhk.yo("FeedContinueModel", th.getMessage());
        }
    }
}
