package defpackage;

import android.os.Build;

/* loaded from: classes2.dex */
public final class pzf {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/version/ClientInformationUtil");

    public static String a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        return "android:" + str.replace('-', '_') + "-" + str2.replace('-', '_') + "-" + str3.replace('-', '_');
    }
}
