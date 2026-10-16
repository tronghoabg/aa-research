package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class zzgit extends zzgji {
    private final Context zza;

    public zzgit(zzaxt zzaxtVar, zzgie zzgieVar, Context context, zzgqo zzgqoVar) {
        super("oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS", "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o=", zzaxtVar, zzgieVar, zzgqoVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        int i5 = 1;
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaxtVar) {
            try {
                zzaxtVar.zzO(((Integer) objArr[0]).intValue());
                zzaxtVar.zzd(((Integer) objArr[1]).intValue());
                zzaxtVar.zze(((Integer) objArr[2]).intValue());
                zzaxtVar.zzab(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzaxtVar.zzaf(3);
                } else {
                    zzaxtVar.zzaf(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzaxtVar.zzae(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i5 = 2;
                    }
                    zzaxtVar.zzae(i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
