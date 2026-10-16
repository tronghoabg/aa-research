package com.google.android.gms.internal.ads;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcld implements zzhcc {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzclm zzd;

    public zzcld(zzclm zzclmVar, List list, String str, Uri uri) {
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
        Objects.requireNonNull(zzclmVar);
        this.zzd = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(this.zzc);
        int i5 = G6.L.f4523b;
        H6.l.f("Failed to parse gmsg params for: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.zza;
        String str = this.zzb;
        this.zzd.zzaa((Map) obj, list, str);
    }
}
