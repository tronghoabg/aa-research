package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class a {
    public static void a(b listener) {
        AbstractC3340k.e(listener, "listener");
        d.a(d.f33838f, listener);
    }

    public static void b(b listener) {
        AbstractC3340k.e(listener, "listener");
        d.f33838f.a(listener);
    }

    public static void a(Context context) {
        AbstractC3340k.e(context, "context");
        d.a(d.f33838f, context);
    }

    public static boolean a() {
        return d.a(d.f33838f);
    }

    public static boolean a(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        AbstractC3340k.e(context, "context");
        d dVar = d.f33838f;
        if (!d.a(dVar)) {
            dVar.f33842d = new c(new WeakReference(context), intent, intent2, mVar);
            return false;
        }
        return d.a(dVar, context, intent, intent2, mVar);
    }
}
