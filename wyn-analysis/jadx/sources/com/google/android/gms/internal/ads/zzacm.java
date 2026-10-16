package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzacm implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable zza;

    public zzacm(zzaco zzacoVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzacoVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        this.zza.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        this.zza.run();
    }
}
