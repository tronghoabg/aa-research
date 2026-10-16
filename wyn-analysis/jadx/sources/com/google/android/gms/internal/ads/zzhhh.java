package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhhh extends zzhfg {
    private final zzhhj zza;
    private final zzibk zzb;
    private final Integer zzc;

    private zzhhh(zzhhj zzhhjVar, zzibk zzibkVar, Integer num) {
        this.zza = zzhhjVar;
        this.zzb = zzibkVar;
        this.zzc = num;
    }

    public static zzhhh zzd(zzhhj zzhhjVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZza;
        if (zzhhjVar.zzd() == zzhhi.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzibkVarZza = zzibk.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhhjVar.zzd() != zzhhi.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhhjVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzibkVarZza = zzibk.zza(new byte[0]);
        }
        return new zzhhh(zzhhjVar, zzibkVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    public final zzibk zzc() {
        return this.zzb;
    }

    public final zzhhj zze() {
        return this.zza;
    }
}
