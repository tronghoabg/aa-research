package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzhnb {
    private static final zzhnb zza = new zzhnb();
    private final AtomicReference zzb;

    public zzhnb() {
        byte[] bArr = null;
        this.zzb = new AtomicReference(new zzhnw(new zzhnt(bArr), bArr));
    }

    public static zzhnb zza() {
        return zza;
    }

    public final synchronized void zzb(zzhns zzhnsVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        byte[] bArr = null;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get(), bArr);
        zzhntVar.zza(zzhnsVar);
        atomicReference.set(new zzhnw(zzhntVar, bArr));
    }

    public final synchronized void zzc(zzhny zzhnyVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        byte[] bArr = null;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get(), bArr);
        zzhntVar.zzb(zzhnyVar);
        atomicReference.set(new zzhnw(zzhntVar, bArr));
    }

    public final Object zzd(zzhdz zzhdzVar, Class cls) throws GeneralSecurityException {
        return ((zzhnw) this.zzb.get()).zza(zzhdzVar, cls);
    }

    public final Object zze(zzhel zzhelVar, Class cls) throws GeneralSecurityException {
        return ((zzhnw) this.zzb.get()).zzb(zzhelVar, cls);
    }
}
