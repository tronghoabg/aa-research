package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzahi extends zzago {
    private final long zza;

    public zzahi(zzagb zzagbVar, long j8) {
        super(zzagbVar);
        zzgtr.zza(zzagbVar.zzn() >= j8);
        this.zza = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzago, com.google.android.gms.internal.ads.zzagb
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
