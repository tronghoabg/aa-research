package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbfi implements zzbfk {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzbfi(zzbfl zzbflVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzbflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
