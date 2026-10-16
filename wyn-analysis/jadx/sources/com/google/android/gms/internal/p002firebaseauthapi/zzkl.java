package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzkl implements zzpd<zzbn, zzbn> {
    private static final zzkl zza = new zzkl();
    private static final zzor<zznc, zzbn> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkk
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzlv.zza((zznc) zzbpVar);
        }
    }, zznc.class, zzbn.class);

    public static void zzc() throws GeneralSecurityException {
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbn> zza() {
        return zzbn.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbn> zzb() {
        return zzbn.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final /* synthetic */ zzbn zza(zzoz<zzbn> zzozVar) throws GeneralSecurityException {
        return new zzkn(zzozVar);
    }
}
