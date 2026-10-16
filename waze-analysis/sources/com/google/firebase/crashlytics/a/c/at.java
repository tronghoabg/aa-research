package com.google.firebase.crashlytics.a.c;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private String f9150a;

    final synchronized String a(Context context) {
        String str;
        str = this.f9150a;
        if (str == null) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName == null) {
                installerPackageName = "";
            }
            str = installerPackageName;
            this.f9150a = str;
        }
        if ("".equals(str)) {
            return null;
        }
        return str;
    }
}
