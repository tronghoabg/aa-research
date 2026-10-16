package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zznd extends zznb {
    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ int zza(Object obj) {
        return ((zznc) obj).zza();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ int zzb(Object obj) {
        return ((zznc) obj).zzb();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar != zznc.zzc()) {
            return zzncVar;
        }
        zznc zzncVarZzf = zznc.zzf();
        zzksVar.zzc = zzncVarZzf;
        return zzncVarZzf;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzks) obj).zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zznc.zzc().equals(obj2)) {
            if (zznc.zzc().equals(obj)) {
                return zznc.zze((zznc) obj, (zznc) obj2);
            }
            ((zznc) obj).zzd((zznc) obj2);
        }
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ Object zzf() {
        return zznc.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ Object zzg(Object obj) {
        ((zznc) obj).zzh();
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i5, int i10) {
        ((zznc) obj).zzj((i5 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i5, long j8) {
        ((zznc) obj).zzj((i5 << 3) | 1, Long.valueOf(j8));
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i5, Object obj2) {
        ((zznc) obj).zzj((i5 << 3) | 3, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i5, zziv zzivVar) {
        ((zznc) obj).zzj((i5 << 3) | 2, zzivVar);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i5, long j8) {
        ((zznc) obj).zzj(i5 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final void zzm(Object obj) {
        ((zzks) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzks) obj).zzc = (zznc) obj2;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzks) obj).zzc = (zznc) obj2;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ void zzp(Object obj, zzno zznoVar) throws IOException {
        ((zznc) obj).zzk(zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final /* synthetic */ void zzq(Object obj, zzno zznoVar) throws IOException {
        ((zznc) obj).zzl(zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    public final boolean zzs(zzmj zzmjVar) {
        return false;
    }
}
