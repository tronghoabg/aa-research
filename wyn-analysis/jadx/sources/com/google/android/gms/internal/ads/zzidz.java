package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzidz {
    static final zzidz zza = new zzidz(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzidz zzd = null;
    private static volatile int zzf = 1;
    private final Map zze;

    public zzidz() {
        this.zze = new HashMap();
    }

    public static boolean zza() {
        return false;
    }

    public static zzidz zzb() {
        int i5 = zzicy.zza;
        return zza;
    }

    public static zzidz zzc() {
        zzidz zzidzVar = zzd;
        if (zzidzVar != null) {
            return zzidzVar;
        }
        synchronized (zzidz.class) {
            try {
                zzidz zzidzVar2 = zzd;
                if (zzidzVar2 != null) {
                    return zzidzVar2;
                }
                int i5 = zzicy.zza;
                zzidz zzidzVarZzb = zzieh.zzb(zzidz.class);
                zzd = zzidzVarZzb;
                return zzidzVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzien zzd(zzifz zzifzVar, int i5) {
        return (zzien) this.zze.get(new zzidy(zzifzVar, i5));
    }

    public zzidz(boolean z2) {
        this.zze = Collections.EMPTY_MAP;
    }
}
