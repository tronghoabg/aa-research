package com.carstream.tech.launcher;

import android.content.Context;
import android.provider.Settings;
import defpackage.k1;
import defpackage.l7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class Cau {
    private Cau() {
    }

    public static int doSangHienTai(Context context) {
        try {
            int i = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            if (i < 0) {
                return -1;
            }
            return Math.round((i * 100.0f) / 255.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static l7 mirror() {
        return k1.g;
    }
}
