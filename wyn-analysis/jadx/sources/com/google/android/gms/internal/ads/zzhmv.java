package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhmv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhma zzc = zzhmu.zza;
    private static final zzhmv zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhmv zza() {
        return zzd;
    }

    private static zzhmv zzd() {
        zzhmv zzhmvVar = new zzhmv();
        try {
            zzhmvVar.zzb(zzc, zzhmn.class);
            return zzhmvVar;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException("unexpected error.", e7);
        }
    }

    private final synchronized zzhdz zze(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        zzhma zzhmaVar;
        zzhmaVar = (zzhma) this.zzb.get(zzheqVar.getClass());
        if (zzhmaVar == null) {
            String string = zzheqVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 86);
            sb2.append("Cannot create a new key for parameters ");
            sb2.append(string);
            sb2.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb2.toString());
        }
        return zzhmaVar.zza(zzheqVar, num);
    }

    public final synchronized void zzb(zzhma zzhmaVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            zzhma zzhmaVar2 = (zzhma) map.get(cls);
            if (zzhmaVar2 != null && !zzhmaVar2.equals(zzhmaVar)) {
                String string = cls.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 60);
                sb2.append("Different key creator for parameters class ");
                sb2.append(string);
                sb2.append(" already inserted");
                throw new GeneralSecurityException(sb2.toString());
            }
            map.put(cls, zzhmaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzhdz zzc(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        return zze(zzheqVar, num);
    }
}
