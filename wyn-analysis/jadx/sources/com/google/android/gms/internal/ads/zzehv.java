package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.os.RemoteException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzehv {
    private final Context zza;
    private final zzhcp zzb;
    private final zzhcp zzc;
    private final zzimt zzd;
    private final H6.a zze;
    private final zzehr zzf;
    private final zzdzt zzg;

    public zzehv(Context context, zzhcp zzhcpVar, zzhcp zzhcpVar2, zzimt zzimtVar, H6.a aVar, zzehr zzehrVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzhcpVar;
        this.zzc = zzhcpVar2;
        this.zzd = zzimtVar;
        this.zze = aVar;
        this.zzf = zzehrVar;
        this.zzg = zzdztVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzeiq) this.zzd.zzb()).zzi(this.zze.f4927a);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpN)).booleanValue()) {
                zzdzs zzdzsVarZza = this.zzg.zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "ptard");
                zzdzsVarZza.zzc("ptard", "l");
                zzdzsVarZza.zzd();
            }
        } catch (RemoteException | NullPointerException e7) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpO)).booleanValue()) {
                C6.n.f1857D.f1868h.zzh(e7, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        U u10 = C6.n.f1857D.f1863c;
        if (U.e(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeht
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
            return;
        }
        zzehs zzehsVar = new zzehs(this);
        zzehx zzehxVarZzb = this.zzf.zzb();
        zzehxVarZzb.zzb(zzehsVar);
        final zzegf zzegfVarZza = zzehxVarZzb.zza().zza();
        zzhcp zzhcpVar = this.zzb;
        Objects.requireNonNull(zzegfVarZza);
        zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzegfVarZza.zza();
            }
        });
    }

    public final /* synthetic */ zzdzt zzd() {
        return this.zzg;
    }
}
