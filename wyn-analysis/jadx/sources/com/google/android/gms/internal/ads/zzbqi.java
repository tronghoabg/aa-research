package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbqi implements F6.a {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ InterfaceC0358a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbqi(zzbqk zzbqkVar, boolean z2, InterfaceC0358a interfaceC0358a, Map map, Map map2) {
        this.zzb = z2;
        this.zzc = interfaceC0358a;
        this.zzd = map;
        this.zze = map2;
        Objects.requireNonNull(zzbqkVar);
        this.zza = false;
    }

    @Override // F6.a
    public final void zza(boolean z2) {
        if (this.zza) {
            return;
        }
        if (z2 && this.zzb) {
            ((zzdlg) this.zzc).zzdu();
        }
        this.zza = true;
        Map map = this.zzd;
        map.put((String) this.zze.get("event_id"), Boolean.valueOf(z2));
        ((zzbst) this.zzc).zze("openIntentAsync", map);
    }

    @Override // F6.a
    public final void zzb(int i5) {
    }
}
