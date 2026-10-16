package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
public final class zzcwb implements zzimz {
    private final zzcvz zza;

    private zzcwb(zzcvz zzcvzVar) {
        this.zza = zzcvzVar;
    }

    public static zzcwb zzc(zzcvz zzcvzVar) {
        return new zzcwb(zzcvzVar);
    }

    public static View zzd(zzcvz zzcvzVar) {
        View viewZzb = zzcvzVar.zzb();
        zzinh.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
