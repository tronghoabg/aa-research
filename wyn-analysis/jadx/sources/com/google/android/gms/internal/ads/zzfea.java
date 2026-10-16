package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* loaded from: classes3.dex */
final /* synthetic */ class zzfea implements zzhbn {
    static final /* synthetic */ zzfea zza = new zzfea();

    private /* synthetic */ zzfea() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ p8.p zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzhcf.zza(new zzfec(null, -1)) : zzhcf.zza(new zzfec(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
