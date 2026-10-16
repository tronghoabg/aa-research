package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import com.google.android.gms.internal.p002firebaseauthapi.zzft;
import java.security.GeneralSecurityException;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class zzfp extends zzcu {
    private final zzft zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    private zzfp(zzft zzftVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzftVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }

    public static zzfp zza(zzft zzftVar, zzze zzzeVar, Integer num) throws GeneralSecurityException {
        zzzc zzzcVarZzb;
        zzft.zza zzaVarZzc = zzftVar.zzc();
        zzft.zza zzaVar = zzft.zza.zzb;
        if (zzaVarZzc != zzaVar && num == null) {
            throw new GeneralSecurityException(AbstractC0279p0.l("For given Variant ", String.valueOf(zzftVar.zzc()), " the value of idRequirement must be non-null"));
        }
        if (zzftVar.zzc() == zzaVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException(AbstractC3256n.g(zzzeVar.zza(), "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (zzftVar.zzc() == zzaVar) {
            zzzcVarZzb = zzog.zza;
        } else {
            if (zzftVar.zzc() != zzft.zza.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzftVar.zzc())));
            }
            zzzcVarZzb = zzog.zzb(num.intValue());
        }
        return new zzfp(zzftVar, zzzeVar, zzzcVarZzb, num);
    }

    public final zzft zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzc;
    }

    public final zzze zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzd;
    }
}
