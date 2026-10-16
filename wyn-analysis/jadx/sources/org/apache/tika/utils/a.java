package org.apache.tika.utils;

import android.app.NotificationChannel;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ NotificationChannel a(String str) {
        return new NotificationChannel("geolocator_channel_01", str, 0);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return BasicFileAttributes.class;
    }

    public static /* synthetic */ Locale.LanguageRange l(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void n() {
    }
}
