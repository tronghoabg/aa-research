package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhoe {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzhoe() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzhoe zza(zzhmh zzhmhVar) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzhmhVar.zzb(), zzhmhVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhogVar)) {
            map.put(zzhogVar, zzhmhVar);
            return this;
        }
        zzhmh zzhmhVar2 = (zzhmh) map.get(zzhogVar);
        if (zzhmhVar2.equals(zzhmhVar) && zzhmhVar.equals(zzhmhVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhogVar.toString()));
    }

    public final zzhoe zzb(zzhme zzhmeVar) throws GeneralSecurityException {
        zzhof zzhofVar = new zzhof(zzhmeVar.zzc(), zzhmeVar.zzb(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzhofVar)) {
            map.put(zzhofVar, zzhmeVar);
            return this;
        }
        zzhme zzhmeVar2 = (zzhme) map.get(zzhofVar);
        if (zzhmeVar2.equals(zzhmeVar) && zzhmeVar.equals(zzhmeVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhofVar.toString()));
    }

    public final zzhoe zzc(zzhnl zzhnlVar) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzhnlVar.zzb(), zzhnlVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzhogVar)) {
            map.put(zzhogVar, zzhnlVar);
            return this;
        }
        zzhnl zzhnlVar2 = (zzhnl) map.get(zzhogVar);
        if (zzhnlVar2.equals(zzhnlVar) && zzhnlVar.equals(zzhnlVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhogVar.toString()));
    }

    public final zzhoe zzd(zzhni zzhniVar) throws GeneralSecurityException {
        zzhof zzhofVar = new zzhof(zzhniVar.zzc(), zzhniVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzhofVar)) {
            map.put(zzhofVar, zzhniVar);
            return this;
        }
        zzhni zzhniVar2 = (zzhni) map.get(zzhofVar);
        if (zzhniVar2.equals(zzhniVar) && zzhniVar.equals(zzhniVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhofVar.toString()));
    }

    public final /* synthetic */ Map zze() {
        return this.zza;
    }

    public final /* synthetic */ Map zzf() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzg() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzd;
    }

    public zzhoe(zzhoh zzhohVar) {
        this.zza = new HashMap(zzhohVar.zzg());
        this.zzb = new HashMap(zzhohVar.zzh());
        this.zzc = new HashMap(zzhohVar.zzi());
        this.zzd = new HashMap(zzhohVar.zzj());
    }
}
