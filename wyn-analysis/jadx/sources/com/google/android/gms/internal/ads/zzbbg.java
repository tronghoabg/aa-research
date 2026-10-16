package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbbg implements zzbbn {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzbbg(zzbbo zzbboVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzbboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.zza, this.zzb);
    }
}
