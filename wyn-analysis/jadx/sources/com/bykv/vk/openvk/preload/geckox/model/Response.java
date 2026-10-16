package com.bykv.vk.openvk.preload.geckox.model;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Response {
    public ComponentModel data;
    public int status;

    public Response fromJson(String str) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("status")) {
                this.status = jSONObject.optInt("status");
            }
            if (jSONObject.has(JsonStorageKeyNames.DATA_KEY) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY)) != null) {
                ComponentModel componentModel = new ComponentModel();
                this.data = componentModel;
                componentModel.fromJson(jSONObjectOptJSONObject);
            }
        } catch (Throwable unused) {
        }
        return this;
    }
}
