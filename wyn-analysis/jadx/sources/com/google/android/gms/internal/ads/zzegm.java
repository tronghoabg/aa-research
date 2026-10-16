package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzegm extends zzegk {
    private final Context zzg;
    private final Executor zzh;

    public zzegm(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzcam(context, C6.n.f1857D.f1879t.j(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoG)).booleanValue() ? new zzegj(this.zza, this.zze) : new zzegi(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzegz(1));
                    } catch (Throwable th) {
                        C6.n.f1857D.f1868h.zzh(th, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzegz(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p8.p zza(zzcbk zzcbkVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzcbkVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcgd zzcgdVar = this.zza;
                zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcfy.zzh);
                zzegk.zzc(this.zzg, zzcgdVar, this.zzh);
                return zzcgdVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
