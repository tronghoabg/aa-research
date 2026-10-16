package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzeeg {
    zzcah zza;
    zzcah zzb;
    private final Context zzc;
    private final zzeed zzd;
    private final zzdzt zze;
    private final G6.N zzf;

    public zzeeg(zzeed zzeedVar, zzdzt zzdztVar, Context context, G6.N n10) {
        this.zzd = zzeedVar;
        this.zze = zzdztVar;
        this.zzc = context;
        this.zzf = n10;
    }

    public final void zza() {
        boolean z2;
        try {
            G6.O o7 = (G6.O) this.zzf;
            o7.l();
            synchronized (o7.f4531a) {
                z2 = o7.f4528E;
            }
            if (z2) {
                return;
            }
            zzeed zzeedVar = this.zzd;
            zzeedVar.zza();
            zzeedVar.zzb(new zzeef(this));
        } catch (Exception e7) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfZ)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzcaf.zzc(this.zzc);
                }
                this.zzb.zzh(e7, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzcaf.zza(this.zzc);
                }
                this.zza.zzh(e7, "InstallReferrer.initializeAndReport");
            }
        }
    }

    public final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    public final /* synthetic */ zzeed zzc() {
        return this.zzd;
    }

    public final /* synthetic */ zzdzt zzd() {
        return this.zze;
    }

    public final /* synthetic */ G6.N zze() {
        return this.zzf;
    }
}
