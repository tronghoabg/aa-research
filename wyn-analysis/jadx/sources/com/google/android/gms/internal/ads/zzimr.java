package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzimr {
    public static zzimr zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzimm(cls.getSimpleName()) : new zzimo(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
