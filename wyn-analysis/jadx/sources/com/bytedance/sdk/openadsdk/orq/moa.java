package com.bytedance.sdk.openadsdk.orq;

/* loaded from: classes3.dex */
public enum moa {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String bcc;

    moa(String str) {
        this.bcc = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.bcc;
    }
}
