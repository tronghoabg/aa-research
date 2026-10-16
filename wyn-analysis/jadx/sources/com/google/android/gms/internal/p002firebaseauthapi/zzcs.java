package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import com.google.android.gms.internal.p002firebaseauthapi.zzwd;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzcs {
    static {
        Charset.forName("UTF-8");
    }

    public static zzwd zza(zzwa zzwaVar) {
        zzwd.zza zzaVarZza = zzwd.zza().zza(zzwaVar.zzb());
        for (zzwa.zzb zzbVar : zzwaVar.zze()) {
            zzaVarZza.zza((zzwd.zzb) ((zzajy) zzwd.zzb.zza().zza(zzbVar.zzb().zzf()).zza(zzbVar.zzc()).zza(zzbVar.zzf()).zza(zzbVar.zza()).zze()));
        }
        return (zzwd) ((zzajy) zzaVarZza.zze());
    }

    public static void zzb(zzwa zzwaVar) throws GeneralSecurityException {
        int iZzb = zzwaVar.zzb();
        int i5 = 0;
        boolean z2 = false;
        boolean z10 = true;
        for (zzwa.zzb zzbVar : zzwaVar.zze()) {
            if (zzbVar.zzc() == zzvv.ENABLED) {
                if (!zzbVar.e_()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzf() == zzws.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzc() == zzvv.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zza() == iZzb) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                if (zzbVar.zzb().zzb() != zzvq.zzb.ASYMMETRIC_PUBLIC) {
                    z10 = false;
                }
                i5++;
            }
        }
        if (i5 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
