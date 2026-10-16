package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class zzamo<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t10);

    public abstract B zza();

    public abstract T zza(T t10, T t11);

    public abstract void zza(B b5, int i5, int i10);

    public abstract void zza(B b5, int i5, long j8);

    public abstract void zza(B b5, int i5, zzaip zzaipVar);

    public abstract void zza(B b5, int i5, T t10);

    public abstract void zza(T t10, zzanf zzanfVar) throws IOException;

    public abstract boolean zza(zzals zzalsVar);

    public final boolean zza(B b5, zzals zzalsVar, int i5) throws IOException {
        int iZzd = zzalsVar.zzd();
        int i10 = iZzd >>> 3;
        int i11 = iZzd & 7;
        if (i11 == 0) {
            zzb(b5, i10, zzalsVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zza((zzamo<T, B>) b5, i10, zzalsVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zza((zzamo<T, B>) b5, i10, zzalsVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzakf.zza();
            }
            zza((zzamo<T, B>) b5, i10, zzalsVar.zzf());
            return true;
        }
        B bZza = zza();
        int i12 = 4 | (i10 << 3);
        int i13 = i5 + 1;
        if (i13 >= zza) {
            throw zzakf.zzh();
        }
        while (zzalsVar.zzc() != Integer.MAX_VALUE && zza((zzamo<T, B>) bZza, zzalsVar, i13)) {
        }
        if (i12 != zzalsVar.zzd()) {
            throw zzakf.zzb();
        }
        zza((zzamo<T, B>) b5, i10, (int) zze(bZza));
        return true;
    }

    public abstract int zzb(T t10);

    public abstract void zzb(B b5, int i5, long j8);

    public abstract void zzb(T t10, zzanf zzanfVar) throws IOException;

    public abstract void zzb(Object obj, B b5);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t10);

    public abstract T zzd(Object obj);

    public abstract T zze(B b5);

    public abstract void zzf(Object obj);
}
