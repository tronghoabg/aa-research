package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbcf extends BroadcastReceiver {
    final /* synthetic */ zzbcg zza;

    public zzbcf(zzbcg zzbcgVar) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
