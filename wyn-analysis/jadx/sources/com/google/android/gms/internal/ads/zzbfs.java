package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzbfs {
    private final Object zza = new Object();
    private zzbfq zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i5 = G6.L.f4523b;
                        H6.l.f("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzbfq();
                        }
                        this.zzb.zza(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzbfr zzbfrVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbfq();
                }
                this.zzb.zzb(zzbfrVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzbfr zzbfrVar) {
        synchronized (this.zza) {
            try {
                zzbfq zzbfqVar = this.zzb;
                if (zzbfqVar == null) {
                    return;
                }
                zzbfqVar.zzc(zzbfrVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity zzd() {
        synchronized (this.zza) {
            try {
                zzbfq zzbfqVar = this.zzb;
                if (zzbfqVar == null) {
                    return null;
                }
                return zzbfqVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zze() {
        synchronized (this.zza) {
            try {
                zzbfq zzbfqVar = this.zzb;
                if (zzbfqVar == null) {
                    return null;
                }
                return zzbfqVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            try {
                zzbfq zzbfqVar = this.zzb;
                if (zzbfqVar == null) {
                    return false;
                }
                return zzbfqVar.zzg().get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(zzdxc zzdxcVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbfq();
                }
                this.zzb.zzj(zzdxcVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
