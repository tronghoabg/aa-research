package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

/* loaded from: classes3.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = f.API_PRIORITY_OTHER;

    public zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
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
                if (i5 < iZzc) {
                    this.zzb.charAt(i5);
                }
                if (i5 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                if (!this.zzd || i5 != iZzc) {
                    break;
                }
                i5 = this.zze;
            }
        }
        int i12 = this.zzf;
        if (i12 == 1) {
            CharSequence charSequence = this.zzb;
            int length = charSequence.length();
            this.zze = -1;
            if (length > i5) {
                charSequence.charAt(length - 1);
            }
            iZzc = length;
        } else {
            this.zzf = i12 - 1;
        }
        return this.zzb.subSequence(i5, iZzc).toString();
    }

    public abstract int zzc(int i5);

    public abstract int zzd(int i5);
}
