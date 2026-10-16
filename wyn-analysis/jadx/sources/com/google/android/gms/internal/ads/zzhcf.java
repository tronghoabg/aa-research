package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzhcf extends zzhch {
    public static p8.p zza(Object obj) {
        return obj == null ? zzhcj.zza : new zzhcj(obj);
    }

    public static p8.p zzb() {
        return zzhcj.zza;
    }

    public static p8.p zzc(Throwable th) {
        th.getClass();
        return new zzhci(th);
    }

    public static p8.p zzd(Callable callable, Executor executor) {
        zzhde zzhdeVar = new zzhde(callable);
        executor.execute(zzhdeVar);
        return zzhdeVar;
    }

    public static p8.p zze(Runnable runnable, Executor executor) {
        zzhde zzhdeVarZze = zzhde.zze(runnable, null);
        executor.execute(zzhdeVarZze);
        return zzhdeVarZze;
    }

    public static p8.p zzf(zzhbm zzhbmVar, Executor executor) {
        zzhde zzhdeVar = new zzhde(zzhbmVar);
        executor.execute(zzhdeVar);
        return zzhdeVar;
    }

    public static p8.p zzg(p8.p pVar, Class cls, zzgti zzgtiVar, Executor executor) {
        int i5 = zzhax.zzd;
        zzhaw zzhawVar = new zzhaw(pVar, cls, zzgtiVar);
        pVar.addListener(zzhawVar, zzhcw.zzd(executor, zzhawVar));
        return zzhawVar;
    }

    public static p8.p zzh(p8.p pVar, Class cls, zzhbn zzhbnVar, Executor executor) {
        int i5 = zzhax.zzd;
        zzhav zzhavVar = new zzhav(pVar, cls, zzhbnVar);
        pVar.addListener(zzhavVar, zzhcw.zzd(executor, zzhavVar));
        return zzhavVar;
    }

    public static p8.p zzi(p8.p pVar, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return pVar.isDone() ? pVar : zzhdb.zze(pVar, j8, timeUnit, scheduledExecutorService);
    }

    public static p8.p zzj(p8.p pVar, zzhbn zzhbnVar, Executor executor) {
        int i5 = zzhbe.zzc;
        zzhbc zzhbcVar = new zzhbc(pVar, zzhbnVar);
        pVar.addListener(zzhbcVar, zzhcw.zzd(executor, zzhbcVar));
        return zzhbcVar;
    }

    public static p8.p zzk(p8.p pVar, zzgti zzgtiVar, Executor executor) {
        int i5 = zzhbe.zzc;
        zzhbd zzhbdVar = new zzhbd(pVar, zzgtiVar);
        pVar.addListener(zzhbdVar, zzhcw.zzd(executor, zzhbdVar));
        return zzhbdVar;
    }

    @SafeVarargs
    public static p8.p zzl(p8.p... pVarArr) {
        return new zzhbo(zzgwt.zzr(pVarArr), true);
    }

    public static p8.p zzm(Iterable iterable) {
        return new zzhbo(zzgwt.zzp(iterable), true);
    }

    public static zzhce zzn(Iterable iterable) {
        return new zzhce(false, zzgwt.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzhce zzo(p8.p... pVarArr) {
        return new zzhce(true, zzgwt.zzr(pVarArr), null);
    }

    public static zzhce zzp(Iterable iterable) {
        return new zzhce(true, zzgwt.zzp(iterable), null);
    }

    @SafeVarargs
    public static p8.p zzq(p8.p... pVarArr) {
        return new zzhbo(zzgwt.zzr(pVarArr), false);
    }

    public static void zzr(p8.p pVar, zzhcc zzhccVar, Executor executor) {
        zzhccVar.getClass();
        pVar.addListener(new zzhcd(pVar, zzhccVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhdg.zza(future);
        }
        throw new IllegalStateException(zzgui.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhdg.zza(future);
        } catch (ExecutionException e7) {
            if (e7.getCause() instanceof Error) {
                throw new zzhbv((Error) e7.getCause());
            }
            throw new zzhdf(e7.getCause());
        }
    }
}
