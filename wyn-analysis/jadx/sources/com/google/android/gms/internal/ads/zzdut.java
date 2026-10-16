package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class zzdut implements InterfaceC0358a, zzbon, F6.o, zzbop, F6.c {
    private InterfaceC0358a zza;
    private zzbon zzb;
    private F6.o zzc;
    private zzbop zzd;
    private F6.c zze;

    @Override // D6.InterfaceC0358a
    public final synchronized void onAdClicked() {
        InterfaceC0358a interfaceC0358a = this.zza;
        if (interfaceC0358a != null) {
            interfaceC0358a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    public final synchronized void zza(String str, Bundle bundle) {
        zzbon zzbonVar = this.zzb;
        if (zzbonVar != null) {
            zzbonVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final synchronized void zzb(String str, String str2) {
        zzbop zzbopVar = this.zzd;
        if (zzbopVar != null) {
            zzbopVar.zzb(str, str2);
        }
    }

    @Override // F6.o
    public final synchronized void zzdT() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdT();
        }
    }

    @Override // F6.o
    public final synchronized void zzdU(int i5) {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdU(i5);
        }
    }

    @Override // F6.o
    public final void zzdo() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdo();
        }
    }

    @Override // F6.o
    public final void zzdp() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdp();
        }
    }

    @Override // F6.o
    public final void zzdq() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdq();
        }
    }

    @Override // F6.o
    public final synchronized void zzdv() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdv();
        }
    }

    @Override // F6.o
    public final synchronized void zzdw() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdw();
        }
    }

    @Override // F6.o
    public final synchronized void zzdx() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdx();
        }
    }

    @Override // F6.o
    public final void zzdy() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdy();
        }
    }

    @Override // F6.o
    public final void zzdz() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzdz();
        }
    }

    @Override // F6.o
    public final synchronized void zzh() {
        F6.o oVar = this.zzc;
        if (oVar != null) {
            oVar.zzh();
        }
    }

    @Override // F6.c
    public final synchronized void zzl() {
        F6.c cVar = this.zze;
        if (cVar != null) {
            cVar.zzl();
        }
    }

    public final synchronized void zzm(InterfaceC0358a interfaceC0358a, zzbon zzbonVar, F6.o oVar, zzbop zzbopVar, F6.c cVar) {
        this.zza = interfaceC0358a;
        this.zzb = zzbonVar;
        this.zzc = oVar;
        this.zzd = zzbopVar;
        this.zze = cVar;
    }
}
