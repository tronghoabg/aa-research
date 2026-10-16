package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbfe implements zzbfk {
    final /* synthetic */ Activity zza;

    public zzbfe(zzbfl zzbflVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
