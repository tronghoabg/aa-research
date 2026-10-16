package com.google.android.gms.internal.ads;

import Va.M6;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhoh {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzhoh(zzhoe zzhoeVar, byte[] bArr) {
        this.zza = new HashMap(zzhoeVar.zze());
        this.zzb = new HashMap(zzhoeVar.zzf());
        this.zzc = new HashMap(zzhoeVar.zzg());
        this.zzd = new HashMap(zzhoeVar.zzh());
    }

    public final boolean zza(zzhod zzhodVar) {
        return this.zzb.containsKey(new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null));
    }

    public final zzhdz zzb(zzhod zzhodVar, zzhey zzheyVar) throws GeneralSecurityException {
        zzhof zzhofVar = new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhofVar)) {
            return ((zzhme) map.get(zzhofVar)).zza(zzhodVar, zzheyVar);
        }
        String string = zzhofVar.toString();
        throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final zzhod zzc(zzhdz zzhdzVar, Class cls, zzhey zzheyVar) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzhdzVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhogVar)) {
            return ((zzhmh) map.get(zzhogVar)).zza(zzhdzVar, zzheyVar);
        }
        String string = zzhogVar.toString();
        throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final boolean zzd(zzhod zzhodVar) {
        return this.zzd.containsKey(new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null));
    }

    public final zzheq zze(zzhod zzhodVar) throws GeneralSecurityException {
        zzhof zzhofVar = new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhofVar)) {
            return ((zzhni) map.get(zzhofVar)).zza(zzhodVar);
        }
        String string = zzhofVar.toString();
        throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final zzhod zzf(zzheq zzheqVar, Class cls) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzheqVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhogVar)) {
            return ((zzhnl) map.get(zzhogVar)).zza(zzheqVar);
        }
        String string = zzhogVar.toString();
        throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }

    public final /* synthetic */ Map zzg() {
        return this.zza;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
