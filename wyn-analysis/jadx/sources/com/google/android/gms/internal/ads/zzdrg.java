package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzdrg implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdvf zzd;
    private final InterfaceC3596a zze;
    private zzbnz zzf;
    private zzbpx zzg;

    public zzdrg(zzdvf zzdvfVar, InterfaceC3596a interfaceC3596a) {
        this.zzd = zzdvfVar;
        this.zze = interfaceC3596a;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            ((C3597b) this.zze).getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final void zza(final zzbnz zzbnzVar) {
        this.zzf = zzbnzVar;
        zzbpx zzbpxVar = this.zzg;
        if (zzbpxVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbpxVar);
        }
        zzbpx zzbpxVar2 = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdrg zzdrgVar = this.zza;
                try {
                    zzdrgVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i5 = G6.L.f4523b;
                    H6.l.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbnz zzbnzVar2 = zzbnzVar;
                zzdrgVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbnzVar2 == null) {
                    int i10 = G6.L.f4523b;
                    H6.l.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbnzVar2.zze(str);
                    } catch (RemoteException e7) {
                        H6.l.i("#007 Could not call remote method.", e7);
                    }
                }
            }
        };
        this.zzg = zzbpxVar2;
        this.zzd.zzd("/unconfirmedClick", zzbpxVar2);
    }

    public final zzbnz zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }
}
