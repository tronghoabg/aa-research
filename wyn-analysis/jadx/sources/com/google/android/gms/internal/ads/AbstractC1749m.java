package com.google.android.gms.internal.ads;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* renamed from: com.google.android.gms.internal.ads.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1749m {
    public static /* synthetic */ NotificationChannel b(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i() {
        return new AudioFocusRequest.Builder(1);
    }
}
