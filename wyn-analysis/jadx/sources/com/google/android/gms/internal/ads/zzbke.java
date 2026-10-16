package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzbke {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    private final ScheduledExecutorService zzc;

    public zzbke(Context context, ScheduledExecutorService scheduledExecutorService, zzbkg zzbkgVar, zzfqq zzfqqVar) {
        this.zzc = scheduledExecutorService;
    }

    public final void zza(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }

    public final p8.p zzb() {
        return (zzhbx) zzhcf.zzi(zzhbx.zzw(zzhcf.zza(null)), ((Long) zzbkw.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
    }
}
