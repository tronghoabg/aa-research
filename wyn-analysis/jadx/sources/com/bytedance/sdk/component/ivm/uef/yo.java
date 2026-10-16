package com.bytedance.sdk.component.ivm.uef;

/* loaded from: classes.dex */
public class yo {
    public static void uef(Object obj, String str) {
        if (obj == null) {
            uef(str);
        }
    }

    public static void uef(String str) {
        throw new IllegalArgumentException(str);
    }
}
