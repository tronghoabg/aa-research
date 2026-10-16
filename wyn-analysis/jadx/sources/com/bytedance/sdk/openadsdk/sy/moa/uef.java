package com.bytedance.sdk.openadsdk.sy.moa;

/* loaded from: classes3.dex */
public class uef {
    public static long uef() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % 86400000);
    }

    public static boolean uef(long j8) {
        return j8 - (j8 % 86400000) == uef();
    }
}
