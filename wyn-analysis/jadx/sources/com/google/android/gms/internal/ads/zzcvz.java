package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* loaded from: classes3.dex */
public class zzcvz {
    private final zzcxy zza;
    private final View zzb;
    private final zzfko zzc;
    private final zzclb zzd;

    public zzcvz(View view, zzclb zzclbVar, zzcxy zzcxyVar, zzfko zzfkoVar) {
        this.zzb = view;
        this.zzd = zzclbVar;
        this.zza = zzcxyVar;
        this.zzc = zzfkoVar;
    }

    public final zzclb zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcxy zzc() {
        return this.zza;
    }

    public final zzfko zzd() {
        return this.zzc;
    }

    public zzdel zze(Set set) {
        return new zzdel(set);
    }
}
