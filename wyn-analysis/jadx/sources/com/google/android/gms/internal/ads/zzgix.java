package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zzgix extends zzgji {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzgix(zzaxt zzaxtVar, zzgie zzgieVar, zzgqo zzgqoVar) {
        super("yqnoA3qkrpGdV0UDHfD7DkNdKz4CD4Omw8LwQ+mqDfnJnY5wPxLFUyGI2UEZc+9I", "QVM5zcLU6Zl19Cag2KVJanZ3HUWi7v3pEqNBU6r5voo=", zzaxtVar, zzgieVar, zzgqoVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l10 = (Long) method.invoke("", new Object[0]);
                        if (l10 == null) {
                            throw null;
                        }
                        zza = l10;
                    }
                } finally {
                }
            }
        }
        synchronized (zzaxtVar) {
            try {
                if (zza != null) {
                    zzaxtVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
