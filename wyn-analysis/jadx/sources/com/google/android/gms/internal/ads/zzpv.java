package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzpv {
    final /* synthetic */ zzpw zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzxl zze;
    private boolean zzf;
    private boolean zzg;

    public zzpv(zzpw zzpwVar, String str, int i5, zzxl zzxlVar) {
        Objects.requireNonNull(zzpwVar);
        this.zza = zzpwVar;
        this.zzb = str;
        this.zzc = i5;
        this.zzd = zzxlVar == null ? -1L : zzxlVar.zzd;
        if (zzxlVar == null || !zzxlVar.zzb()) {
            return;
        }
        this.zze = zzxlVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i5 = this.zzc;
        if (i5 < zzbfVar.zza()) {
            zzpw zzpwVar = this.zza;
            zzbfVar.zzb(i5, zzpwVar.zzj(), 0L);
            for (int i10 = zzpwVar.zzj().zzn; i10 <= zzpwVar.zzj().zzo; i10++) {
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i10));
                if (iZze != -1) {
                    i5 = zzbfVar2.zzd(iZze, zzpwVar.zzk(), false).zzc;
                    break;
                }
            }
            i5 = -1;
        } else if (i5 >= zzbfVar2.zza()) {
            i5 = -1;
        }
        this.zzc = i5;
        if (i5 == -1) {
            return false;
        }
        zzxl zzxlVar = this.zze;
        return zzxlVar == null || zzbfVar2.zze(zzxlVar.zza) != -1;
    }

    public final boolean zzb(int i5, zzxl zzxlVar) {
        if (zzxlVar != null) {
            long j8 = zzxlVar.zzd;
            if (j8 != -1) {
                zzxl zzxlVar2 = this.zze;
                return zzxlVar2 == null ? !zzxlVar.zzb() && j8 == this.zzd : j8 == zzxlVar2.zzd && zzxlVar.zzb == zzxlVar2.zzb && zzxlVar.zzc == zzxlVar2.zzc;
            }
        }
        return i5 == this.zzc;
    }

    public final void zzc(int i5, zzxl zzxlVar) {
        if (this.zzd == -1 && i5 == this.zzc && zzxlVar != null) {
            zzpw zzpwVar = this.zza;
            long j8 = zzxlVar.zzd;
            if (j8 >= zzpwVar.zzi()) {
                this.zzd = j8;
            }
        }
    }

    public final boolean zzd(zznp zznpVar) {
        zzxl zzxlVar = zznpVar.zzd;
        if (zzxlVar == null) {
            return this.zzc != zznpVar.zzc;
        }
        long j8 = this.zzd;
        if (j8 == -1) {
            return false;
        }
        long j10 = zzxlVar.zzd;
        if (j10 > j8) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zznpVar.zzb;
        int iZze = zzbfVar.zze(zzxlVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzxl zzxlVar2 = this.zze;
        if (j10 < zzxlVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzxlVar.zzb()) {
            int i5 = zzxlVar.zze;
            return i5 == -1 || i5 > zzxlVar2.zzb;
        }
        int i10 = zzxlVar.zzb;
        int i11 = zzxlVar.zzc;
        int i12 = zzxlVar2.zzb;
        if (i10 <= i12) {
            return i10 == i12 && i11 > zzxlVar2.zzc;
        }
        return true;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzxl zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z2) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z2) {
        this.zzg = true;
    }
}
