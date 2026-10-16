package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzmt {
    private static final Logger zza = Logger.getLogger(zzmt.class.getName());
    private static final zzmt zzb = new zzmt();
    private ConcurrentMap<String, zzbs<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbs<?> zzc(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final <P> zzbs<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzbs<P> zzbsVar = (zzbs<P>) zzc(str);
        if (zzbsVar.zza().equals(cls)) {
            return zzbsVar;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzbsVar.getClass());
        String strValueOf2 = String.valueOf(zzbsVar.zza());
        StringBuilder sbR = AbstractC0279p0.r("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbR.append(strValueOf2);
        throw new GeneralSecurityException(sbR.toString());
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbs<?> zza(String str) throws GeneralSecurityException {
        return zzc(str);
    }

    public static zzmt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbs<?> zzbsVar, boolean z2, boolean z10) throws GeneralSecurityException {
        try {
            String strZzb = zzbsVar.zzb();
            if (z10 && this.zzd.containsKey(strZzb) && !this.zzd.get(strZzb).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZzb);
            }
            zzbs<?> zzbsVar2 = this.zzc.get(strZzb);
            if (zzbsVar2 != null && !zzbsVar2.getClass().equals(zzbsVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + strZzb);
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzbsVar2.getClass().getName() + ", cannot be re-registered with " + zzbsVar.getClass().getName());
            }
            this.zzc.putIfAbsent(strZzb, zzbsVar);
            this.zzd.put(strZzb, Boolean.valueOf(z10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, boolean z2) throws GeneralSecurityException {
        zza(zzbsVar, zzil.zza.zza, z2);
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, zzil.zza zzaVar, boolean z2) throws GeneralSecurityException {
        if (zzaVar.zza()) {
            zza((zzbs<?>) zzbsVar, false, z2);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
