package com.bykv.vk.openvk.uef.uef.oa.oa;

import android.os.Looper;

/* loaded from: classes.dex */
public final class uef {
    public static boolean uef() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
