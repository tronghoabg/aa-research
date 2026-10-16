package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* loaded from: classes3.dex */
final /* synthetic */ class zzewe implements zzgti {
    static final /* synthetic */ zzewe zza = new zzewe();

    private /* synthetic */ zzewe() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzewg(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
