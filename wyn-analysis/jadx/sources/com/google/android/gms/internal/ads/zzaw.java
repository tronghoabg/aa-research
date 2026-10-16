package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaw {
    private final zzr zza = new zzr();

    public final zzaw zza(int i5) {
        this.zza.zza(i5);
        return this;
    }

    public final zzaw zzb(int i5, boolean z2) {
        if (z2) {
            this.zza.zza(i5);
        }
        return this;
    }

    public final zzaw zzc(int... iArr) {
        for (int i5 = 0; i5 < 20; i5++) {
            this.zza.zza(iArr[i5]);
        }
        return this;
    }

    public final zzaw zzd(zzax zzaxVar) {
        zzs zzsVarZza = zzaxVar.zza();
        for (int i5 = 0; i5 < zzsVarZza.zzb(); i5++) {
            this.zza.zza(zzsVarZza.zzc(i5));
        }
        return this;
    }

    public final zzax zze() {
        return new zzax(this.zza.zzb(), null);
    }
}
