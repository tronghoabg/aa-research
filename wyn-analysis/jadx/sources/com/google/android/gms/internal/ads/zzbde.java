package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbde extends zzbdm {
    private final StackTraceElement[] zzh;

    public zzbde(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, StackTraceElement[] stackTraceElementArr) {
        super(zzbbzVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzaxtVar, i5, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzbbq zzbbqVar = new zzbbq((String) this.zze.invoke(null, stackTraceElementArr));
            zzaxt zzaxtVar = this.zzd;
            synchronized (zzaxtVar) {
                try {
                    zzaxtVar.zzC(zzbbqVar.zza.longValue());
                    if (zzbbqVar.zzb.booleanValue()) {
                        zzaxtVar.zzag(true != zzbbqVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzaxtVar.zzag(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
