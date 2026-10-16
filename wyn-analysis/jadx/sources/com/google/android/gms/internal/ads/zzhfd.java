package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final /* synthetic */ class zzhfd implements zzhnx {
    static final /* synthetic */ zzhfd zza = new zzhfd();

    private /* synthetic */ zzhfd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhnx
    public final /* synthetic */ Object zza(zzhei zzheiVar) throws GeneralSecurityException {
        zzhdz zzhdzVarZza = zzheiVar.zza();
        if (zzhdzVarZza instanceof zzhfl) {
            return zziaf.zzb((zzhfl) zzhdzVarZza);
        }
        if (zzhdzVarZza instanceof zzhgd) {
            return zzhzs.zzb((zzhgd) zzhdzVarZza);
        }
        if (zzhdzVarZza instanceof zzhgm) {
            return zzhla.zzb((zzhgm) zzhdzVarZza);
        }
        if (zzhdzVarZza instanceof zzhfv) {
            return zzhzr.zzb((zzhfv) zzhdzVarZza);
        }
        if (zzhdzVarZza instanceof zzhgu) {
            zzhgu zzhguVar = (zzhgu) zzhdzVarZza;
            return zzhju.zzd() ? zzhju.zzb(zzhguVar) : zzhzx.zzb(zzhguVar);
        }
        if (zzhdzVarZza instanceof zzhip) {
            zzhip zzhipVar = (zzhip) zzhdzVarZza;
            return zzhju.zzd() ? zzhks.zzb(zzhipVar) : zzibj.zzb(zzhipVar);
        }
        if (zzhdzVarZza instanceof zzhij) {
            return zzhkm.zzb((zzhij) zzhdzVarZza);
        }
        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzhdzVarZza.getClass())));
    }
}
