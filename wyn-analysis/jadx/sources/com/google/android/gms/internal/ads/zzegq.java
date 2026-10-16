package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzegq extends zzegk {
    private String zzg;
    private int zzh = 1;

    public zzegq(Context context) {
        this.zzf = new zzcam(context, C6.n.f1857D.f1879t.j(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i5 = this.zzh;
                        if (i5 == 2) {
                            this.zzf.zzp().zzg(this.zze, ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoG)).booleanValue() ? new zzegj(this.zza, this.zze) : new zzegi(this));
                        } else if (i5 == 3) {
                            this.zzf.zzp().zzh(this.zzg, ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoG)).booleanValue() ? new zzegj(this.zza, this.zze) : new zzegi(this));
                        } else {
                            this.zza.zzd(new zzegz(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzegz(1));
                    } catch (Throwable th) {
                        C6.n.f1857D.f1868h.zzh(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzegz(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) {
        int i5 = G6.L.f4523b;
        H6.l.a("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzegz(1));
    }

    public final p8.p zza(zzcbk zzcbkVar) {
        synchronized (this.zzb) {
            try {
                int i5 = this.zzh;
                if (i5 != 1 && i5 != 2) {
                    return zzhcf.zzc(new zzegz(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzcbkVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcgd zzcgdVar = this.zza;
                zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcfy.zzh);
                return zzcgdVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p8.p zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i5 = this.zzh;
                if (i5 != 1 && i5 != 3) {
                    return zzhcf.zzc(new zzegz(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                zzcgd zzcgdVar = this.zza;
                zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzego
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcfy.zzh);
                return zzcgdVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
