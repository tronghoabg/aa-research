package com.google.android.gms.internal.common;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzj {
    public static Object zza(Class cls, String str, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z2, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i5 = 0; i5 < zziVarArr.length; i5++) {
            zzi zziVar = zziVarArr[i5];
            zziVar.getClass();
            clsArr[i5] = zziVar.zzc();
            objArr[i5] = zziVarArr[i5].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
