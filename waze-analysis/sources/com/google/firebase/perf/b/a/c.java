package com.google.firebase.perf.b.a;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f10287a;

    public static a a() {
        return new a();
    }

    public static boolean b(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        com.google.firebase.perf.c.a.a().b("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f10287a == null) {
            f10287a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f10287a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
