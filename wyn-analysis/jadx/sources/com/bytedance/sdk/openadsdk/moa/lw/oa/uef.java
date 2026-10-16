package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.openadsdk.core.model.gzw;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private boolean ivm = false;
    private yo lw;
    private JSONObject moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25961oa;
    private gzw uef;
    private JSONObject yo;

    public uef(gzw gzwVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.uef = gzwVar;
        this.f25961oa = str;
        this.yo = jSONObject;
        this.moa = jSONObject2;
    }

    public boolean ivm() {
        return this.ivm;
    }

    public yo lw() {
        return this.lw;
    }

    public JSONObject moa() {
        if (this.moa == null) {
            this.moa = new JSONObject();
        }
        return this.moa;
    }

    public String oa() {
        return this.f25961oa;
    }

    public gzw uef() {
        return this.uef;
    }

    public void xs() {
        yo yoVar = this.lw;
        if (yoVar != null) {
            yoVar.uef(this);
        }
    }

    public JSONObject yo() {
        if (this.yo == null) {
            this.yo = new JSONObject();
        }
        return this.yo;
    }

    public void uef(yo yoVar) {
        this.lw = yoVar;
    }

    public void uef(boolean z2) {
        this.ivm = z2;
    }
}
