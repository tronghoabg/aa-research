package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class zzgir extends zzgji {
    public zzgir(zzaxt zzaxtVar, zzgie zzgieVar, zzgqo zzgqoVar) {
        super("StEAvb/iigDIlQhq4PghExfp73gHg8IUtO74V2AuLhqk3CKzmFDPWKX0qTLgtCrl", "a0akqO7gmy+q2qeS0xD9lQHxt87lQ1nAIIevL4sq6Y8=", zzaxtVar, zzgieVar, zzgqoVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzaxtVar) {
            zzaxtVar.zza("E");
            zzaxtVar.zzB(0L);
            zzaxtVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        synchronized (zzaxtVar) {
            zzaxtVar.zza((String) objArr[0]);
            zzaxtVar.zzB(((Long) objArr[1]).longValue());
            zzaxtVar.zzV((String) objArr[2]);
        }
    }
}
