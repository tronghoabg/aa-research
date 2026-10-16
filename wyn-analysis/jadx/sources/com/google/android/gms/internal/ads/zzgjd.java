package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class zzgjd extends zzgji {
    private final Context zza;
    private final Map zzb;

    public zzgjd(zzaxt zzaxtVar, zzgie zzgieVar, Map map, Context context, zzgqo zzgqoVar) {
        super("I4xYlccqZe8KvMWrizW1s/OekBI2YfU7UNZwq9dr0dp7B5I0B1zvHWlOnn7y8ubq", "k7BIphhpl3j5W4f9W8N9gMUD+i5xBlP2tWz8eVUQlQQ=", zzaxtVar, zzgieVar, zzgqoVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l10 = (Long) method.invoke("", this.zza);
                if (l10 == null) {
                    throw null;
                }
                lValueOf = l10;
            } else {
                p8.p pVar = (p8.p) this.zzb.get("gs");
                if (pVar != null && pVar.isDone()) {
                    lValueOf = Long.valueOf(((zzayt) pVar.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzaxtVar) {
            zzaxtVar.zzR(lValueOf.longValue());
        }
    }
}
