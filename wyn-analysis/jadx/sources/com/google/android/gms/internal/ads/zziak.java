package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zziak {
    public static final zziak zza = new zziak(new zzial());
    public static final zziak zzb = new zziak(new zziap());
    public static final zziak zzc = new zziak(new zziar());
    public static final zziak zzd = new zziak(new zziaq());
    public static final zziak zze;
    public static final zziak zzf;
    private final zziaj zzg;

    static {
        new zziak(new zziam());
        zze = new zziak(new zziao());
        zzf = new zziak(new zzian());
    }

    public zziak(zzias zziasVar) {
        this.zzg = !zzhlf.zza() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zziag(zziasVar, null) : new zziah(zziasVar, null) : new zziai(zziasVar, null);
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zzb(String str) throws GeneralSecurityException {
        return this.zzg.zza(str);
    }
}
