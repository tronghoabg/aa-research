package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class cz {
    private static volatile Handler uef;

    public static Handler oa() {
        if (uef == null) {
            synchronized (cz.class) {
                try {
                    if (uef == null) {
                        uef = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public static Handler uef() {
        return com.bytedance.sdk.component.bcc.uef.uef.uef().oa();
    }
}
