package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import D6.K0;
import com.google.android.gms.internal.ads.zzbic;

/* loaded from: classes3.dex */
public final class zzdyj implements zzdgf, zzden, zzddc, zzddt, InterfaceC0358a, zzdiq {
    private final zzbhw zza;
    private boolean zzb = false;

    public zzdyj(zzbhw zzbhwVar, zzfii zzfiiVar) {
        this.zza = zzbhwVar;
        zzbhwVar.zzc(2);
        if (zzfiiVar != null) {
            zzbhwVar.zzc(1101);
        }
    }

    @Override // D6.InterfaceC0358a
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(K0 k02) {
        switch (k02.f2338a) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(final zzfky zzfkyVar) {
        this.zza.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyi
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzbic.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbic.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzfkyVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzj(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzb(zzbhvVar);
        zzbhwVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzk(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyg
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzb(zzbhvVar);
        zzbhwVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzl(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyh
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzb(zzbhvVar);
        zzbhwVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzm(boolean z2) {
        this.zza.zzc(true != z2 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzn(boolean z2) {
        this.zza.zzc(true != z2 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzo() {
        this.zza.zzc(1109);
    }
}
