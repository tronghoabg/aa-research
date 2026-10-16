package com.bytedance.adsdk.uef.uef;

/* loaded from: classes.dex */
public class oa extends RuntimeException {
    public oa(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
