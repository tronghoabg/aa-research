package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wrv extends yo {
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f25964oa;
    private String uef;
    private long yo;

    public void oa(long j8) {
        this.yo = j8;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void yo(long j8) {
        this.moa = j8;
    }

    public void uef(long j8) {
        this.f25964oa = j8;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.uef);
            jSONObject.put("preload_size", this.f25964oa);
            jSONObject.put("load_time", this.yo);
            jSONObject.put("local_cache", this.moa);
        } catch (Throwable th) {
            dhk.yo("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
