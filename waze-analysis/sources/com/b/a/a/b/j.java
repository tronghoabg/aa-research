package com.b.a.a.b;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f2570a = {"com.spotify.music.debug", "com.spotify.music.canary", "com.spotify.music.partners", "com.spotify.music"};

    public static final String a(Context context) {
        String[] strArr = f2570a;
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            if (context.getPackageManager().getLaunchIntentForPackage(str) != null) {
                return str;
            }
        }
        return null;
    }

    public static final boolean b(Context context) {
        return a(context) != null;
    }
}
