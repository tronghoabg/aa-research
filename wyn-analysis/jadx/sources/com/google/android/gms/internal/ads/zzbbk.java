package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbbk implements zzbbn {
    final /* synthetic */ Activity zza;

    public zzbbk(zzbbo zzbboVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
