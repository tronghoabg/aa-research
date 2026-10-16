package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class zzgue extends zzgsy {
    final CharSequence zzb;
    final zzgtf zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public zzgue(zzgug zzgugVar, CharSequence charSequence) {
        this.zzc = zzgugVar.zzi();
        this.zzd = zzgugVar.zzj();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int iZzd;
        int i5 = this.zze;
        while (true) {
            int i10 = this.zze;
            if (i10 == -1) {
                zzb();
                return null;
            }
            iZzc = zzc(i10);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i5) {
                int i11 = iZzd + 1;
                this.zze = i11;
                if (i11 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                while (i5 < iZzc && this.zzc.zzb(this.zzb.charAt(i5))) {
                    i5++;
                }
                while (iZzc > i5) {
                    int i12 = iZzc - 1;
                    if (!this.zzc.zzb(this.zzb.charAt(i12))) {
                        break;
                    }
                    iZzc = i12;
                }
                if (!this.zzd || i5 != iZzc) {
                    break;
                }
                i5 = this.zze;
            }
        }
        int i13 = this.zzf;
        if (i13 == 1) {
            CharSequence charSequence = this.zzb;
            int length = charSequence.length();
            this.zze = -1;
            while (length > i5) {
                int i14 = length - 1;
                if (!this.zzc.zzb(charSequence.charAt(i14))) {
                    break;
                }
                length = i14;
            }
            iZzc = length;
        } else {
            this.zzf = i13 - 1;
        }
        return this.zzb.subSequence(i5, iZzc).toString();
    }

    public abstract int zzc(int i5);

    public abstract int zzd(int i5);
}
