package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f33878a = new Handler(Looper.getMainLooper());

    public static boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public static final void b(tf.a tmp0) {
        AbstractC3340k.e(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static void a(tf.a block) {
        AbstractC3340k.e(block, "block");
        if (a()) {
            block.invoke();
        } else {
            f33878a.post(new M0.g(block, 1));
        }
    }
}
