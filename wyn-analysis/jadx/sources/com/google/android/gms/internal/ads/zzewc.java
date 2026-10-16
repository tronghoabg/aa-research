package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* loaded from: classes3.dex */
final /* synthetic */ class zzewc implements zzhbn {
    static final /* synthetic */ zzewc zza = new zzewc();

    private /* synthetic */ zzewc() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ p8.p zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzhcf.zza(new zzewg(null, -1)) : zzhcf.zza(new zzewg(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
