package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final /* synthetic */ class zzeuw implements zzhbn {
    static final /* synthetic */ zzeuw zza = new zzeuw();

    private /* synthetic */ zzeuw() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ p8.p zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzhcf.zza(new zzeuz(Integer.toString(17))) : zzhcf.zza(new zzeuz(null));
    }
}
