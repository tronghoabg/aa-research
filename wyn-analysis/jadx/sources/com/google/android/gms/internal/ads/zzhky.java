package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
final class zzhky extends ThreadLocal {
    public static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zziak.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhjo.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
