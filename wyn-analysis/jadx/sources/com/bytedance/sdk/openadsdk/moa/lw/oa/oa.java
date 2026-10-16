package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa extends yo {
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f25960oa;
    private long uef;
    private int yo;

    public void oa(long j8) {
        this.f25960oa = j8;
    }

    public void uef(long j8) {
        this.uef = j8;
    }

    public void oa(int i5) {
        this.moa = i5;
    }

    public void uef(int i5) {
        this.yo = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.uef);
            jSONObject.put("total_duration", this.f25960oa);
            jSONObject.put("vbtt_skip_type", this.yo);
            jSONObject.put("skip_reason", this.moa);
        } catch (Throwable th) {
            dhk.yo("EndcardSkipModel", th.getMessage());
        }
    }
}
