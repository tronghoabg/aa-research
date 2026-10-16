package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
abstract class zzdn extends zzdc {
    final CharSequence zza;
    int zzb = 0;
    int zzc = f.API_PRIORITY_OTHER;

    public zzdn(zzdo zzdoVar, CharSequence charSequence) {
        this.zza = charSequence;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdc
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i5 = this.zzb;
        while (true) {
            int i10 = this.zzb;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i10);
            if (iZzd == -1) {
                iZzd = this.zza.length();
                this.zzb = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzb = iZzc;
            }
            if (iZzc != i5) {
                if (i5 < iZzd) {
                    this.zza.charAt(i5);
                }
                if (i5 < iZzd) {
                    this.zza.charAt(iZzd - 1);
                }
                int i11 = this.zzc;
                if (i11 == 1) {
                    CharSequence charSequence = this.zza;
                    int length = charSequence.length();
                    this.zzb = -1;
                    if (length > i5) {
                        charSequence.charAt(length - 1);
                    }
                    iZzd = length;
                } else {
                    this.zzc = i11 - 1;
                }
                return this.zza.subSequence(i5, iZzd).toString();
            }
            int i12 = iZzc + 1;
            this.zzb = i12;
            if (i12 > this.zza.length()) {
                this.zzb = -1;
            }
        }
    }

    public abstract int zzc(int i5);

    public abstract int zzd(int i5);
}
