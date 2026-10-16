package com.bytedance.sdk.openadsdk.core.dz.uef;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes3.dex */
public enum uef {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(Sdk.SDKError.Reason.MRAID_ERROR_VALUE),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int bcc;

    uef(int i5) {
        this.bcc = i5;
    }

    public String uef() {
        return String.valueOf(this.bcc);
    }
}
