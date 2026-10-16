package com.google.android.libraries.vision.visionkit.pipeline;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class AndroidAssetUtil {
    public static synchronized boolean a(Context context) {
        return nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}
