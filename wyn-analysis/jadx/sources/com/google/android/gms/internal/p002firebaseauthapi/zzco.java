package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzco {
    static {
        Logger.getLogger(zzco.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbg.class);
        hashSet.add(zzbl.class);
        hashSet.add(zzcq.class);
        hashSet.add(zzbn.class);
        hashSet.add(zzbo.class);
        hashSet.add(zzci.class);
        hashSet.add(zzrq.class);
        hashSet.add(zzcm.class);
        hashSet.add(zzcl.class);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    private zzco() {
    }

    @Deprecated
    public static zzvq zza(String str, zzaip zzaipVar) throws GeneralSecurityException {
        zzbs<?> zzbsVarZza = zzmt.zza().zza(str);
        if (zzbsVarZza instanceof zzcj) {
            return ((zzcj) zzbsVarZza).zzc(zzaipVar);
        }
        throw new GeneralSecurityException(AbstractC0279p0.l("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static Class<?> zza(Class<?> cls) {
        try {
            return zzoc.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P zza(zzvq zzvqVar, Class<P> cls) throws GeneralSecurityException {
        String strZzf = zzvqVar.zzf();
        return zzmt.zza().zza(strZzf, cls).zzb(zzvqVar.zze());
    }

    public static <B, P> P zza(zzoz<B> zzozVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzoc.zza().zza(zzozVar, cls);
    }
}
