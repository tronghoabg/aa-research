package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzcui {
    private final String zza;
    private final zzbuy zzb;
    private final Executor zzc;
    private zzcun zzd;
    private final zzbpx zze = new zzcuf(this);
    private final zzbpx zzf = new zzcuh(this);

    public zzcui(String str, zzbuy zzbuyVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbuyVar;
        this.zzc = executor;
    }

    public final void zza(zzcun zzcunVar) {
        zzbuy zzbuyVar = this.zzb;
        zzbuyVar.zzb("/updateActiveView", this.zze);
        zzbuyVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcunVar;
    }

    public final void zzb(zzclb zzclbVar) {
        zzclbVar.zzab("/updateActiveView", this.zze);
        zzclbVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzclb zzclbVar) {
        zzclbVar.zzac("/updateActiveView", this.zze);
        zzclbVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        zzbuy zzbuyVar = this.zzb;
        zzbuyVar.zzc("/updateActiveView", this.zze);
        zzbuyVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final /* synthetic */ boolean zze(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzcun zzg() {
        return this.zzd;
    }
}
