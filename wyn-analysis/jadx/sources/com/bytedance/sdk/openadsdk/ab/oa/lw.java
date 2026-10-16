package com.bytedance.sdk.openadsdk.ab.oa;

/* loaded from: classes3.dex */
class lw implements yo {
    private static volatile lw uef;

    private lw() {
    }

    @Override // com.bytedance.sdk.openadsdk.ab.oa.yo
    public void uef(com.bytedance.sdk.openadsdk.ab.oa oaVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.ab.oa.yo
    public void uef(com.bytedance.sdk.openadsdk.ab.oa oaVar, boolean z2) {
    }

    public static lw uef() {
        if (uef == null) {
            synchronized (lw.class) {
                try {
                    if (uef == null) {
                        uef = new lw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }
}
