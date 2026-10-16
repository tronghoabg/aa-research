package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzctg implements zzddu {
    private final zzfme zza;

    public zzctg(zzfme zzfmeVar) {
        this.zza = zzfmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfln e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Cannot invoke onPause for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb(Context context) {
        try {
            zzfme zzfmeVar = this.zza;
            zzfmeVar.zzj();
            if (context != null) {
                zzfmeVar.zzp(context);
            }
        } catch (zzfln e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Cannot invoke onResume for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfln e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Cannot invoke onDestroy for the mediation adapter.", e7);
        }
    }
}
