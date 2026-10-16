package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes3.dex */
final class zzaov {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzaoo zzr;
    private String zzt;
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final Layout.Alignment zzA() {
        return this.zzp;
    }

    public final zzaov zzB(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final zzaov zzD(boolean z2) {
        this.zzq = z2 ? 1 : 0;
        return this;
    }

    public final zzaoo zzE() {
        return this.zzr;
    }

    public final zzaov zzF(zzaoo zzaooVar) {
        this.zzr = zzaooVar;
        return this;
    }

    public final zzaov zzG(float f10) {
        this.zzk = f10;
        return this;
    }

    public final zzaov zzH(int i5) {
        this.zzj = i5;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final zzaov zzK(String str) {
        this.zzt = str;
        return this;
    }

    public final String zzL() {
        return this.zzt;
    }

    public final zzaov zzM(String str) {
        this.zzu = str;
        return this;
    }

    public final String zzN() {
        return this.zzu;
    }

    public final int zza() {
        int i5 = this.zzh;
        if (i5 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i5 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final zzaov zzc(boolean z2) {
        this.zzf = z2 ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final zzaov zze(boolean z2) {
        this.zzg = z2 ? 1 : 0;
        return this;
    }

    public final zzaov zzf(boolean z2) {
        this.zzh = z2 ? 1 : 0;
        return this;
    }

    public final zzaov zzg(boolean z2) {
        this.zzi = z2 ? 1 : 0;
        return this;
    }

    public final String zzh() {
        return this.zza;
    }

    public final zzaov zzi(String str) {
        this.zza = str;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final zzaov zzk(int i5) {
        this.zzb = i5;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final zzaov zzn(int i5) {
        this.zzd = i5;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final zzaov zzp(float f10) {
        this.zzs = f10;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final zzaov zzr(zzaov zzaovVar) {
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzaovVar != null) {
            if (!this.zzc && zzaovVar.zzc) {
                zzk(zzaovVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzaovVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzaovVar.zzi;
            }
            if (this.zza == null && (str = zzaovVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzaovVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzaovVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzaovVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzaovVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzaovVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzaovVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzaovVar.zzj;
                this.zzk = zzaovVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzaovVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzaovVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzaovVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzaovVar.zzu;
            }
            if (!this.zze && zzaovVar.zze) {
                zzn(zzaovVar.zzd);
            }
            if (this.zzm == -1 && (i5 = zzaovVar.zzm) != -1) {
                this.zzm = i5;
            }
        }
        return this;
    }

    public final zzaov zzs(String str) {
        this.zzl = str;
        return this;
    }

    public final String zzt() {
        return this.zzl;
    }

    public final zzaov zzu(int i5) {
        this.zzm = i5;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final zzaov zzw(int i5) {
        this.zzn = i5;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    public final Layout.Alignment zzy() {
        return this.zzo;
    }

    public final zzaov zzz(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
