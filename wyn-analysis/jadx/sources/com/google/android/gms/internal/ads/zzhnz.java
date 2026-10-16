package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhnz implements zzhod {
    private final String zza;
    private final zzibk zzb;
    private final zzidl zzc;
    private final zzhta zzd;
    private final zzhtx zze;
    private final Integer zzf;

    private zzhnz(String str, zzibk zzibkVar, zzidl zzidlVar, zzhta zzhtaVar, zzhtx zzhtxVar, zzhes zzhesVar, zzhet zzhetVar, Integer num) {
        this.zza = str;
        this.zzb = zzibkVar;
        this.zzc = zzidlVar;
        this.zzd = zzhtaVar;
        this.zze = zzhtxVar;
        this.zzf = num;
    }

    public static zzhnz zza(String str, zzidl zzidlVar, zzhta zzhtaVar, zzhtx zzhtxVar, Integer num) throws GeneralSecurityException {
        zzhes zzhesVar;
        zzhet zzhetVar;
        if (zzhtxVar == zzhtx.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        zzibk zzibkVarZzb = zzhok.zzb(str);
        int iOrdinal = zzhtaVar.ordinal();
        if (iOrdinal == 0) {
            zzhesVar = zzhes.zza;
        } else if (iOrdinal == 1) {
            zzhesVar = zzhes.zzb;
        } else if (iOrdinal == 2) {
            zzhesVar = zzhes.zzc;
        } else if (iOrdinal == 3) {
            zzhesVar = zzhes.zzd;
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unknown KeyMaterialType ".concat(String.valueOf(zzhtaVar)));
            }
            zzhesVar = zzhes.zze;
        }
        int iOrdinal2 = zzhtxVar.ordinal();
        if (iOrdinal2 == 0) {
            zzhetVar = zzhet.zza;
        } else if (iOrdinal2 == 1) {
            zzhetVar = zzhet.zzb;
        } else if (iOrdinal2 == 2) {
            zzhetVar = zzhet.zzc;
        } else if (iOrdinal2 == 3) {
            zzhetVar = zzhet.zzd;
        } else if (iOrdinal2 == 4) {
            zzhetVar = zzhet.zze;
        } else {
            if (iOrdinal2 != 5) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(String.valueOf(zzhtxVar)));
            }
            zzhetVar = zzhet.zzf;
        }
        return new zzhnz(str, zzibkVarZzb, zzidlVar, zzhtaVar, zzhtxVar, zzhesVar, zzhetVar, num);
    }

    public final zzidl zzb() {
        return this.zzc;
    }

    public final zzhta zzc() {
        return this.zzd;
    }

    public final zzhtx zzd() {
        return this.zze;
    }

    public final Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhod
    public final zzibk zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zza;
    }
}
