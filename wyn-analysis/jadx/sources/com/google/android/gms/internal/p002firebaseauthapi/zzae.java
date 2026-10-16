package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzae extends zzf<String> {
    final CharSequence zza;
    private final zzh zzb;
    private int zze;
    private int zzd = 0;
    private final boolean zzc = false;

    public zzae(zzx zzxVar, CharSequence charSequence) {
        this.zzb = zzxVar.zza;
        this.zze = zzxVar.zzc;
        this.zza = charSequence;
    }

    public abstract int zza(int i5);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final /* synthetic */ String zza() {
        int i5 = this.zzd;
        while (true) {
            int i10 = this.zzd;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int iZzb = zzb(i10);
            if (iZzb == -1) {
                iZzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(iZzb);
            }
            int i11 = this.zzd;
            if (i11 != i5) {
                while (i5 < iZzb && this.zzb.zza(this.zza.charAt(i5))) {
                    i5++;
                }
                while (iZzb > i5 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                    iZzb--;
                }
                int i12 = this.zze;
                if (i12 == 1) {
                    iZzb = this.zza.length();
                    this.zzd = -1;
                    while (iZzb > i5 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                        iZzb--;
                    }
                } else {
                    this.zze = i12 - 1;
                }
                return this.zza.subSequence(i5, iZzb).toString();
            }
            int i13 = i11 + 1;
            this.zzd = i13;
            if (i13 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzb(int i5);
}
