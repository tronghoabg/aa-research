package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public abstract class zzbdm implements Callable {
    protected final zzbbz zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzaxt zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbdm(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10) {
        this.zza = zzbbzVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaxtVar;
        this.zzf = i5;
        this.zzg = i10;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i5;
        try {
            long jNanoTime = System.nanoTime();
            zzbbz zzbbzVar = this.zza;
            Method methodZzo = zzbbzVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo == null) {
                return null;
            }
            zza();
            zzbaq zzbaqVarZzh = zzbbzVar.zzh();
            if (zzbaqVarZzh == null || (i5 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzbaqVarZzh.zza(this.zzg, i5, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
