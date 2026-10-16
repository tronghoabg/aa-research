package com.bytedance.sdk.component.bcc;

/* loaded from: classes.dex */
public class uef {
    private static com.bytedance.sdk.component.uef uef;

    public static void uef(com.bytedance.sdk.component.uef uefVar) {
        uef = uefVar;
    }

    public static void uef(Runnable runnable) {
        com.bytedance.sdk.component.uef uefVar = uef;
        if (uefVar == null) {
            return;
        }
        uefVar.uef(runnable);
    }
}
