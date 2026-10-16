package com.google.android.gms.internal.ads;

import Va.M6;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhnw {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzhnw(zzhnt zzhntVar, byte[] bArr) {
        this.zza = new HashMap(zzhntVar.zzc());
        this.zzb = new HashMap(zzhntVar.zzd());
    }

    private final Object zzf(zzhdz zzhdzVar, Class cls) throws GeneralSecurityException {
        zzhnu zzhnuVar = new zzhnu(zzhdzVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhnuVar)) {
            return ((zzhns) map.get(zzhnuVar)).zza(zzhdzVar);
        }
        String string = zzhnuVar.toString();
        throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object zza(zzhdz zzhdzVar, Class cls) throws GeneralSecurityException {
        return zzf(zzhdzVar, cls);
    }

    public final Object zzb(zzhel zzhelVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final zzhny zzhnyVar = (zzhny) map.get(cls);
        return zzhnyVar.zzd(zzhelVar, new zzhnx() { // from class: com.google.android.gms.internal.ads.zzhnv
            @Override // com.google.android.gms.internal.ads.zzhnx
            public final /* synthetic */ Object zza(zzhei zzheiVar) {
                return this.zza.zze(zzhnyVar, zzheiVar);
            }
        });
    }

    public final /* synthetic */ Map zzc() {
        return this.zza;
    }

    public final /* synthetic */ Map zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Object zze(zzhny zzhnyVar, zzhei zzheiVar) {
        return zzf(zzheiVar.zza(), zzhnyVar.zzb());
    }
}
