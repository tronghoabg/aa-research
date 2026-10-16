package com.bytedance.sdk.openadsdk.oib.yo;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    public long ivm;
    public long lw;
    public boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    public boolean f26057oa;
    public boolean uef;
    public long xs;
    public boolean yo;

    /* renamed from: com.bytedance.sdk.openadsdk.oib.yo.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0131uef {
        uef ivm();
    }

    public uef moa(boolean z2) {
        this.yo = z2;
        return this;
    }

    public uef oa(boolean z2) {
        this.uef = z2;
        return this;
    }

    public uef uef(boolean z2) {
        this.moa = z2;
        return this;
    }

    public uef yo(boolean z2) {
        this.f26057oa = z2;
        return this;
    }

    public uef oa(long j8) {
        this.ivm = j8;
        return this;
    }

    public uef uef(long j8) {
        this.lw = j8;
        return this;
    }

    public uef yo(long j8) {
        this.xs = j8;
        return this;
    }

    public JSONObject uef() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.uef);
            jSONObject.put("isFromVideoDetailPage", this.f26057oa);
            jSONObject.put("isFromDetailPage", this.yo);
            jSONObject.put("duration", this.lw);
            jSONObject.put("totalPlayDuration", this.ivm);
            jSONObject.put("currentPlayPosition", this.xs);
            jSONObject.put("isAutoPlay", this.moa);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static uef uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        uef uefVar = new uef();
        uefVar.oa(jSONObject.optBoolean("isCompleted"));
        uefVar.yo(jSONObject.optBoolean("isFromVideoDetailPage"));
        uefVar.moa(jSONObject.optBoolean("isFromDetailPage"));
        uefVar.uef(jSONObject.optLong("duration"));
        uefVar.oa(jSONObject.optLong("totalPlayDuration"));
        uefVar.yo(jSONObject.optLong("currentPlayPosition"));
        uefVar.uef(jSONObject.optBoolean("isAutoPlay"));
        return uefVar;
    }
}
