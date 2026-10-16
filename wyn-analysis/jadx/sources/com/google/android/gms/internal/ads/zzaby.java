package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final /* synthetic */ class zzaby implements zzdu {
    static final /* synthetic */ zzaby zza = new zzaby();

    private /* synthetic */ zzaby() {
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
