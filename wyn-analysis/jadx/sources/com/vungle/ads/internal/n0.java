package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33369a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f33370b;

    public n0(Context context) {
        AbstractC3340k.e(context, "context");
        this.f33369a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f33370b = displayMetrics;
        Object systemService = context.getSystemService("window");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && AbstractC3340k.a(this.f33369a, ((n0) obj).f33369a);
    }

    public final int hashCode() {
        return this.f33369a.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("DeviceScreenInfo(context=");
        sbA.append(this.f33369a);
        sbA.append(')');
        return sbA.toString();
    }
}
