package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm extends yo {
    private String ivm;
    private String lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f25966oa;
    private String uef;
    private long yo;

    public void oa(long j8) {
        this.yo = j8;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void yo(String str) {
        this.ivm = str;
    }

    public void oa(String str) {
        this.lw = str;
    }

    public void uef(long j8) {
        this.f25966oa = j8;
    }

    public void uef(int i5) {
        this.moa = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.uef);
            jSONObject.put("preload_size", this.f25966oa);
            jSONObject.put("load_time", this.yo);
            jSONObject.put("error_code", this.moa);
            jSONObject.put("error_message", this.lw);
            jSONObject.put("error_message_server", this.ivm);
        } catch (Throwable th) {
            dhk.yo("LoadVideoErrorModel", th.getMessage());
        }
    }
}
