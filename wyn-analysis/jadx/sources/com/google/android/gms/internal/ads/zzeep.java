package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final /* synthetic */ class zzeep implements zzhbn {
    static final /* synthetic */ zzeep zza = new zzeep();

    private /* synthetic */ zzeep() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ p8.p zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzhcf.zzc(cause);
    }
}
