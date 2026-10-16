package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbev extends BroadcastReceiver {
    final /* synthetic */ zzbez zza;

    public zzbev(zzbez zzbezVar) {
        Objects.requireNonNull(zzbezVar);
        this.zza = zzbezVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg(3);
    }
}
