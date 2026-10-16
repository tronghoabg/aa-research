package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzyu implements zzxk {
    private final zzhq zza;
    private final zzyd zzb;
    private int zzc;
    private final zzabw zzd;

    public zzyu(zzhq zzhqVar, final zzagg zzaggVar) {
        zzyd zzydVar = new zzyd() { // from class: com.google.android.gms.internal.ads.zzyt
            @Override // com.google.android.gms.internal.ads.zzyd
            public final /* synthetic */ zzye zza(zzqh zzqhVar) {
                return new zzwp(zzaggVar);
            }
        };
        zzabw zzabwVar = new zzabw(-1);
        this.zza = zzhqVar;
        this.zzb = zzydVar;
        this.zzd = zzabwVar;
        this.zzc = 1048576;
    }

    public final zzyu zza(int i5) {
        this.zzc = i5;
        return this;
    }

    public final zzyv zzb(zzak zzakVar) {
        zzakVar.zzb.getClass();
        return new zzyv(zzakVar, this.zza, this.zzb, zzuq.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}
