package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa extends yo {
    public int moa = 0;

    /* renamed from: oa, reason: collision with root package name */
    public long f25959oa;
    public long uef;
    public int yo;

    public void oa(long j8) {
        this.f25959oa = j8;
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
            jSONObject.put("total_duration", this.uef);
            jSONObject.put("buffers_time", this.f25959oa);
            jSONObject.put("break_reason", this.yo);
            jSONObject.put("video_backup", this.moa);
        } catch (Throwable th) {
            dhk.yo("FeedBreakModel", th.getMessage());
        }
    }
}
