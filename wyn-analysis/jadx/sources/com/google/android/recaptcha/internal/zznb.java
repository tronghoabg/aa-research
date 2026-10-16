package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
abstract class zznb {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i5, int i10);

    public abstract void zzi(Object obj, int i5, long j8);

    public abstract void zzj(Object obj, int i5, Object obj2);

    public abstract void zzk(Object obj, int i5, zziv zzivVar);

    public abstract void zzl(Object obj, int i5, long j8);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzno zznoVar) throws IOException;

    public abstract void zzq(Object obj, zzno zznoVar) throws IOException;

    public final boolean zzr(Object obj, zzmj zzmjVar) throws IOException {
        int iZzd = zzmjVar.zzd();
        int i5 = iZzd >>> 3;
        int i10 = iZzd & 7;
        if (i10 == 0) {
            zzl(obj, i5, zzmjVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zzi(obj, i5, zzmjVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zzk(obj, i5, zzmjVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzlc.zza();
            }
            zzh(obj, i5, zzmjVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i11 = i5 << 3;
        while (zzmjVar.zzc() != Integer.MAX_VALUE && zzr(objZzf, zzmjVar)) {
        }
        if ((4 | i11) != zzmjVar.zzd()) {
            throw zzlc.zzb();
        }
        zzg(objZzf);
        zzj(obj, i5, objZzf);
        return true;
    }

    public abstract boolean zzs(zzmj zzmjVar);
}
