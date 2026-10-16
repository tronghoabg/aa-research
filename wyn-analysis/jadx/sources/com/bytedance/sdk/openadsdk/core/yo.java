package com.bytedance.sdk.openadsdk.core;

/* loaded from: classes3.dex */
public class yo {
    private static volatile yo uef;

    private yo() {
    }

    public static yo uef() {
        if (uef == null) {
            synchronized (yo.class) {
                try {
                    if (uef == null) {
                        uef = new yo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public String oa(String str, String str2) {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", str, str2);
    }

    public int oa(String str, int i5) {
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("ttopenadsdk", str, i5);
    }

    public Long oa(String str, long j8) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.oib.moa.uef.uef("ttopenadsdk", str, j8));
    }

    public void uef(String str, String str2) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("ttopenadsdk", str, str2);
    }

    public void uef(String str, int i5) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("ttopenadsdk", str, Integer.valueOf(i5));
    }

    public void uef(String str, long j8) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("ttopenadsdk", str, Long.valueOf(j8));
    }

    public void uef(String str) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("ttopenadsdk", str);
    }
}
