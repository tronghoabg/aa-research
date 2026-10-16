package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class zzbfq implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private final AtomicBoolean zzd = new AtomicBoolean(true);
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.zza = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzdxc) it.next()).zzg(activity);
                    } catch (Exception e7) {
                        C6.n.f1857D.f1868h.zzh(e7, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i5 = G6.L.f4523b;
                        H6.l.d("", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdxc) it.next()).zzf(activity);
                } catch (Exception e7) {
                    C6.n.f1857D.f1868h.zzh(e7, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i5 = G6.L.f4523b;
                    H6.l.d("", e7);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            U.f4562l.removeCallbacks(runnable);
        }
        G6.M m10 = U.f4562l;
        zzbfp zzbfpVar = new zzbfp(this);
        this.zzh = zzbfpVar;
        m10.postDelayed(zzbfpVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean andSet = this.zzd.getAndSet(true);
        Runnable runnable = this.zzh;
        if (runnable != null) {
            U.f4562l.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdxc) it.next()).zze(activity);
                } catch (Exception e7) {
                    C6.n.f1857D.f1868h.zzh(e7, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i5 = G6.L.f4523b;
                    H6.l.d("", e7);
                }
            }
            if (andSet) {
                int i10 = G6.L.f4523b;
                H6.l.a("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzbfr) it2.next()).zza(true);
                    } catch (Exception e10) {
                        int i11 = G6.L.f4523b;
                        H6.l.d("", e10);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzbK)).longValue();
        this.zzi = true;
    }

    public final void zzb(zzbfr zzbfrVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbfrVar);
        }
    }

    public final void zzc(zzbfr zzbfrVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbfrVar);
        }
    }

    public final Activity zzd() {
        return this.zza;
    }

    public final Context zze() {
        return this.zzb;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzc;
    }

    public final /* synthetic */ AtomicBoolean zzg() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    public final /* synthetic */ List zzi() {
        return this.zzf;
    }

    public final void zzj(zzdxc zzdxcVar) {
        synchronized (this.zzc) {
            this.zzg.add(zzdxcVar);
        }
    }
}
