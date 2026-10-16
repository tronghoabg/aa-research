package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdid extends zzdix implements zzbop {
    public zzdid(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdic
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((y6.f) obj).onAppEvent(str, str2);
            }
        });
    }
}
