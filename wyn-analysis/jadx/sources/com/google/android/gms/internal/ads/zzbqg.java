package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.InterfaceC0358a;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbqg implements zzhcc {
    final /* synthetic */ Map zza;
    final /* synthetic */ InterfaceC0358a zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbqk zzd;

    public zzbqg(zzbqk zzbqkVar, Map map, InterfaceC0358a interfaceC0358a, String str) {
        this.zza = map;
        this.zzb = interfaceC0358a;
        this.zzc = str;
        Objects.requireNonNull(zzbqkVar);
        this.zzd = zzbqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        C6.n.f1857D.f1868h.zzh(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlI)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }
}
