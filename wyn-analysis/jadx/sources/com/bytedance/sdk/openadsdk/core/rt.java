package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class rt implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene uef;

    public rt(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.uef = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i5) {
        gr.uef(1, this.uef, i5);
        return com.bytedance.sdk.component.utils.uef.uef(jSONObject);
    }
}
