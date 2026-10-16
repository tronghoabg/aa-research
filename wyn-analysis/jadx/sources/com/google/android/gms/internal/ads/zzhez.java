package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhez {
    public static zzhek zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhtk zzhtkVarZze = zzhtk.zze(zzhdy.zza(str).zzb().zzaN(), zzidz.zzb());
                    for (zzhtj zzhtjVar : zzhtkVarZze.zzb()) {
                        if (zzhtjVar.zzb().zzc() == zzhta.UNKNOWN_KEYMATERIAL || zzhtjVar.zzb().zzc() == zzhta.SYMMETRIC || zzhtjVar.zzb().zzc() == zzhta.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException("keyset contains key material of type " + zzhtjVar.zzb().zzc().name() + " for type url " + zzhtjVar.zzb().zza());
                        }
                    }
                    return zzhek.zza(zzhtkVarZze);
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzifh unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
