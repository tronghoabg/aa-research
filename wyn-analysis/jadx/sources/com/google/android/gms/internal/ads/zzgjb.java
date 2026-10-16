package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zzgjb extends zzgji {
    private final Context zza;

    public zzgjb(zzaxt zzaxtVar, zzgie zzgieVar, Context context, zzgqo zzgqoVar) {
        super("i8dIMUuFazx2QmSkfzNlM975x3JumPrUee1RASXGMNDJH8RWJsPNqbpEpnJFa4Hi", "5davCcWMx5wzne2F0dLFbMr5/cylOtU7FK3CcX7bJPU=", zzaxtVar, zzgieVar, zzgqoVar.zza(119));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaxtVar) {
            zzaxtVar.zzc(((Long) objArr[0]).longValue());
            zzaxtVar.zzP(((Long) objArr[1]).longValue());
        }
    }
}
