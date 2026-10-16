package com.vungle.ads.internal.util;

import android.util.Log;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class t {
    public static void a(String message) {
        AbstractC3340k.e(message, "message");
        if (u.f33874a) {
            Log.i("VungleWebClient", u.f33875b.c(message, "xxx.xxx.xxx.xxx"));
        }
    }

    public static void b(String tag, String message) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(message, "message");
        if (u.f33874a) {
            Log.e(tag, u.f33875b.c(message, "xxx.xxx.xxx.xxx"));
        }
    }

    public static void c(String tag, String message) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(message, "message");
        if (u.f33874a) {
            Log.w(tag, u.f33875b.c(message, "xxx.xxx.xxx.xxx"));
        }
    }

    public static int a(String tag, String message) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(message, "message");
        if (u.f33874a) {
            return Log.d(tag, u.f33875b.c(message, "xxx.xxx.xxx.xxx"));
        }
        return -1;
    }

    public static void a(String tag, String message, Throwable throwable) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(message, "message");
        AbstractC3340k.e(throwable, "throwable");
        if (u.f33874a) {
            Log.e(tag, u.f33875b.c(message, "xxx.xxx.xxx.xxx") + "; error: " + throwable.getLocalizedMessage());
        }
    }

    public static void a(String tag, tf.a message) {
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(message, "message");
        if (u.f33874a) {
            String str = (String) message.invoke();
            AbstractC3340k.e(str, "<this>");
            Log.w(tag, u.f33875b.c(str, "xxx.xxx.xxx.xxx"));
        }
    }
}
