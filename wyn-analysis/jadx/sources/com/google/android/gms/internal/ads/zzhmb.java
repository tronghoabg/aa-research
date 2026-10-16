package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhmb {
    private static final Logger zza = Logger.getLogger(zzhmb.class.getName());
    private static final zzhmb zzd = new zzhmb();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhmb zza() {
        return zzd;
    }

    private final synchronized zzhea zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (zzhea) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhea zzheaVar, boolean z2, boolean z10) throws GeneralSecurityException {
        try {
            String strZzb = zzheaVar.zzb();
            if (z10) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhea zzheaVar2 = (zzhea) concurrentMap2.get(strZzb);
            if (zzheaVar2 != null && !zzheaVar2.getClass().equals(zzheaVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzheaVar2.getClass().getName() + ", cannot be re-registered with " + zzheaVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(strZzb, zzheaVar);
            this.zzc.put(strZzb, Boolean.valueOf(z10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzhea zzheaVar, boolean z2) throws GeneralSecurityException {
        zzf(zzheaVar, 1, z2);
    }

    public final zzhea zzc(String str, Class cls) throws GeneralSecurityException {
        zzhea zzheaVarZzg = zzg(str);
        if (zzheaVarZzg.zzc().equals(cls)) {
            return zzheaVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzheaVarZzg.getClass());
        String string = zzheaVarZzg.zzc().toString();
        StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(name.length() + 53, 23, strValueOf) + string.length());
        AbstractC3256n.p(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(wg.b.c(sb2, ", which only supports: ", string));
    }

    public final zzhea zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhea zzheaVar, int i5, boolean z2) throws GeneralSecurityException {
        if (!zzhle.zza(i5)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzheaVar, false, z2);
    }
}
