package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdkf extends zzdix implements zzdkh {
    public zzdkf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zza(final String str) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkh) obj).zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zzb(final String str) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkh) obj).zzb(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zzc(final String str, final String str2) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkh) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zzd(String str) {
        final String str2 = "MalformedJson";
        zzs(new zzdiw(str2) { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkh) obj).zzd("MalformedJson");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zze() {
        zzs(zzdkc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zzf() {
        zzs(zzdkd.zza);
    }
}
