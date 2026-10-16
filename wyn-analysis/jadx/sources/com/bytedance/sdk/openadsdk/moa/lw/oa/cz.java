package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cz extends yo {

    /* renamed from: oa, reason: collision with root package name */
    private final long f25954oa;
    private final String uef;

    public cz(String str, long j8) {
        this.uef = str;
        this.f25954oa = j8;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.uef);
            jSONObject.put("preload_size", this.f25954oa);
        } catch (Throwable th) {
            dhk.yo("LoadVideoCancelModel", th.getMessage());
        }
    }
}
