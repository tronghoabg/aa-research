package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
abstract class zzihd {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i5, long j8);

    public abstract void zzb(Object obj, int i5, int i10);

    public abstract void zzc(Object obj, int i5, long j8);

    public abstract void zzd(Object obj, int i5, zzidl zzidlVar);

    public abstract void zze(Object obj, int i5, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzigm zzigmVar, int i5) throws IOException {
        int iZzc = zzigmVar.zzc();
        int i10 = iZzc >>> 3;
        int i11 = iZzc & 7;
        if (i11 == 0) {
            zza(obj, i10, zzigmVar.zzh());
            return true;
        }
        if (i11 == 1) {
            zzc(obj, i10, zzigmVar.zzj());
            return true;
        }
        if (i11 == 2) {
            zzd(obj, i10, zzigmVar.zzq());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                if (i5 != 0) {
                    return false;
                }
                throw new zzifh("Protocol message end-group tag did not match expected tag.");
            }
            if (i11 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i10, zzigmVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i12 = i10 << 3;
        int i13 = i5 + 1;
        if (i13 >= zza) {
            throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzigmVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzigmVar, i13)) {
        }
        if ((i12 | 4) != zzigmVar.zzc()) {
            throw new zzifh("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i10, zzg(objZzf));
        return true;
    }
}
