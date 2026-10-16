package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zziag implements zziaj {
    private final zzias zza;

    @Override // com.google.android.gms.internal.ads.zziaj
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zziak.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
