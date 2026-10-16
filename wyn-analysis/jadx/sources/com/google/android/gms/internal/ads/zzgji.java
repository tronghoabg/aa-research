package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class zzgji implements zzgjh {
    private final String zza;
    private final String zzb;
    private final zzgie zzc;
    private final zzaxt zzd;
    private final zzgqm zze;

    public zzgji(String str, String str2, zzaxt zzaxtVar, zzgie zzgieVar, zzgqm zzgqmVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzaxtVar;
        this.zzc = zzgieVar;
        this.zze = zzgqmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }

    public abstract void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException;
}
