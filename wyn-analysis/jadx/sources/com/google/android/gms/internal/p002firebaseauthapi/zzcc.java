package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzcc {
    private final zzwa.zza zza;

    private zzcc(zzwa.zza zzaVar) {
        this.zza = zzaVar;
    }

    public final synchronized zzbt zza() throws GeneralSecurityException {
        return zzbt.zza((zzwa) ((zzajy) this.zza.zze()));
    }

    public static zzcc zza(zzbt zzbtVar) {
        return new zzcc(zzbtVar.zzb().zzn());
    }
}
