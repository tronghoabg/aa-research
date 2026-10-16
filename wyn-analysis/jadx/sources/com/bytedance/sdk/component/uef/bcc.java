package com.bytedance.sdk.component.uef;

/* loaded from: classes.dex */
class bcc {
    private static boolean uef;

    public static void uef(RuntimeException runtimeException) {
        if (uef) {
            throw runtimeException;
        }
    }
}
