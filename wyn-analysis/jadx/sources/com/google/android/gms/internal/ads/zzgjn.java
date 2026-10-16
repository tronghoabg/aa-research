package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class zzgjn extends zzgji {
    private final DisplayMetrics zza;
    private final View zzb;

    public zzgjn(zzaxt zzaxtVar, zzgie zzgieVar, DisplayMetrics displayMetrics, View view, zzgqo zzgqoVar) {
        super("jfdrT3YDVcDOM9UB5LzDpqcbuDp5keVZHqGcg+MV5UCB23uYRRp2NQL5QwO7s7yD", "z81VgQq8DV/RpboX+za4HXvceA1wD9mZ3Lv8nuAqQVE=", zzaxtVar, zzgieVar, zzgqoVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.zza, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzayr zzayrVarZza = zzays.zza();
        zzayrVarZza.zzb(lArr[2].longValue());
        zzayrVarZza.zzc(lArr[1].longValue());
        zzayrVarZza.zzd(lArr[0].longValue());
        zzayrVarZza.zza(lArr[3].longValue());
        zzayrVarZza.zze(lArr[4].longValue());
        zzaxtVar.zzM((zzays) zzayrVarZza.zzbu());
    }
}
