package com.dexterous.flutterlocalnotifications;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel c(int i5, CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, i5);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel e(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannelGroup f(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ void n() {
    }
}
