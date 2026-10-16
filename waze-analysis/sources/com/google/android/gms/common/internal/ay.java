package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f4996a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4997b;

    /* renamed from: c, reason: collision with root package name */
    private static int f4998c;

    public static int a(Context context) {
        Bundle bundle;
        synchronized (f4996a) {
            if (!f4997b) {
                f4997b = true;
                try {
                    bundle = com.google.android.gms.common.d.c.b(context).a(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
                if (bundle != null) {
                    bundle.getString("com.google.app.id");
                    f4998c = bundle.getInt("com.google.android.gms.version");
                }
            }
        }
        return f4998c;
    }
}
