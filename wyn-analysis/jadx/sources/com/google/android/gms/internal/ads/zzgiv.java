package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class zzgiv extends zzgji {
    private final zzgdq zza;

    public zzgiv(zzaxt zzaxtVar, zzgie zzgieVar, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        super("4x2Hh5iTg/qW5xffP7XUVyyhNVEHgfMgXZN24VVA9KHUAzifkbImBn58u0wzbVSZ", "gKocIG5D8c3aRlaOl/4axnWoyxTZtkz2guMC88wPwLk=", zzaxtVar, zzgieVar, zzgqoVar.zza(116));
        this.zza = zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzd());
        objArr.getClass();
        synchronized (zzaxtVar) {
            zzaxtVar.zzb((String) objArr[0]);
            zzaxtVar.zzaa((String) objArr[1]);
        }
    }
}
