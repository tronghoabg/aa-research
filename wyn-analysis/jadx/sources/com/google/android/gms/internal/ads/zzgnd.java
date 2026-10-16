package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class zzgnd {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzhev zzb = null;
    private zzhev zzc = null;

    public final boolean zza(zzbdt zzbdtVar) throws GeneralSecurityException {
        zzhev zzhevVar;
        byte[] bArrZzA = zzbdtVar.zza().zzb().zzb().zzA();
        byte[] bArrZzA2 = zzbdtVar.zza().zzd().zzA();
        try {
            try {
                if (!this.zza.getAndSet(true)) {
                    try {
                        zzhxs.zza();
                        this.zzb = (zzhev) zzhez.zza(new String(zzgel.zzb("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).zzh(zzhex.zza(), zzhev.class);
                        this.zzc = (zzhev) zzhez.zza(new String(zzgel.zzb("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).zzh(zzhex.zza(), zzhev.class);
                    } catch (Exception e7) {
                        throw new GeneralSecurityException("Failed to verify program", e7);
                    }
                }
                zzhevVar = this.zzb;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            zzhev zzhevVar2 = this.zzc;
            if (zzhevVar2 != null) {
                zzhevVar2.zza(bArrZzA, bArrZzA2);
            }
            return false;
        }
        if (zzhevVar == null) {
            throw new GeneralSecurityException();
        }
        zzhevVar.zza(bArrZzA, bArrZzA2);
        return true;
    }
}
