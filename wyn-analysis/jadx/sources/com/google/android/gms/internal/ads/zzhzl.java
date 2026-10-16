package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzhzl implements zzhev {
    private final zzhnp zza;

    public zzhzl(zzhnp zzhnpVar, zzhmq zzhmqVar) {
        this.zza = zzhnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.zza.zza(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((zzhzm) it.next()).zza.zza(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
