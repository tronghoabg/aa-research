package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzbhe {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbha(this);
    private final Object zzc = new Object();
    private zzbhh zzd;
    private Context zze;
    private zzbhk zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbhh zzbhhVarZze = zze(new zzbhc(this), new zzbhd(this));
                    this.zzd = zzbhhVarZze;
                    zzbhhVarZze.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                zzbio zzbioVar = zzbix.zzfo;
                C0395s c0395s = C0395s.f2489e;
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                    zzf();
                } else {
                    if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfn)).booleanValue()) {
                        C6.n.f1857D.f1867g.zzb(new zzbhb(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        zzbio zzbioVar = zzbix.zzfp;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzf();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcfy.zzd.schedule(this.zzb, ((Long) c0395s.f2492c.zzd(zzbix.zzfq)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final zzbhf zzc(zzbhi zzbhiVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbhf();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbhiVar);
                }
                return this.zzf.zze(zzbhiVar);
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.d("Unable to call into cache service.", e7);
                return new zzbhf();
            }
        }
    }

    public final long zzd(zzbhi zzbhiVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zzg(zzbhiVar);
                    } catch (RemoteException e7) {
                        int i5 = G6.L.f4523b;
                        H6.l.d("Unable to call into cache service.", e7);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized zzbhh zze(InterfaceC1713b interfaceC1713b, InterfaceC1714c interfaceC1714c) {
        return new zzbhh(this.zze, C6.n.f1857D.f1879t.j(), interfaceC1713b, interfaceC1714c);
    }

    public final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            try {
                zzbhh zzbhhVar = this.zzd;
                if (zzbhhVar == null) {
                    return;
                }
                if (zzbhhVar.isConnected() || this.zzd.isConnecting()) {
                    this.zzd.disconnect();
                }
                this.zzd = null;
                this.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzbhh zzi() {
        return this.zzd;
    }

    public final /* synthetic */ void zzj(zzbhh zzbhhVar) {
        this.zzd = null;
    }

    public final /* synthetic */ void zzk(zzbhk zzbhkVar) {
        this.zzf = zzbhkVar;
    }
}
