package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class v {
    public static String a(zzfzv zzfzvVar, File file, String str) {
        return b(file, str, zzfzz.zza);
    }

    public static String b(File file, String str, zzfzz zzfzzVar) {
        return new File(file, str).getPath();
    }
}
