package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC1713b;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzbhq implements InterfaceC1713b {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbhi zza;
    final /* synthetic */ zzcgd zzb;
    final /* synthetic */ zzbhs zzc;

    public zzbhq(zzbhs zzbhsVar, zzbhi zzbhiVar, zzcgd zzcgdVar) {
        this.zza = zzbhiVar;
        this.zzb = zzcgdVar;
        Objects.requireNonNull(zzbhsVar);
        this.zzc = zzbhsVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        zzbhs zzbhsVar = this.zzc;
        synchronized (zzbhsVar.zzf()) {
            try {
                if (zzbhsVar.zzd()) {
                    return;
                }
                zzbhsVar.zze(true);
                final zzbhh zzbhhVarZzc = zzbhsVar.zzc();
                if (zzbhhVarZzc == null) {
                    return;
                }
                zzhcp zzhcpVar = zzcfy.zza;
                final zzbhi zzbhiVar = this.zza;
                final zzcgd zzcgdVar = this.zzb;
                final p8.p pVarZza = zzhcpVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() throws IOException {
                        zzcgd zzcgdVar2 = zzcgdVar;
                        zzbhh zzbhhVar = zzbhhVarZzc;
                        zzbhq zzbhqVar = this.zza;
                        try {
                            zzbhk zzbhkVarZzq = zzbhhVar.zzq();
                            boolean zZzp = zzbhhVar.zzp();
                            zzbhi zzbhiVar2 = zzbhiVar;
                            zzbhf zzbhfVarZzf = zZzp ? zzbhkVarZzq.zzf(zzbhiVar2) : zzbhkVarZzq.zze(zzbhiVar2);
                            if (!zzbhfVarZzf.zza()) {
                                zzcgdVar2.zzd(new RuntimeException("No entry contents."));
                                zzbhqVar.zzc.zzb();
                                return;
                            }
                            zzbhn zzbhnVar = new zzbhn(zzbhqVar, zzbhfVarZzf.zzb(), 1);
                            int i5 = zzbhnVar.read();
                            if (i5 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbhnVar.unread(i5);
                            zzcgdVar2.zzc(zzbhu.zza(zzbhnVar, zzbhfVarZzf.zzd(), zzbhfVarZzf.zzg(), zzbhfVarZzf.zzf(), zzbhfVarZzf.zze()));
                        } catch (RemoteException e7) {
                            e = e7;
                            int i10 = G6.L.f4523b;
                            H6.l.d("Unable to obtain a cache service instance.", e);
                            zzcgdVar2.zzd(e);
                            zzbhqVar.zzc.zzb();
                        } catch (IOException e10) {
                            e = e10;
                            int i102 = G6.L.f4523b;
                            H6.l.d("Unable to obtain a cache service instance.", e);
                            zzcgdVar2.zzd(e);
                            zzbhqVar.zzc.zzb();
                        }
                    }
                });
                zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbho
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzcgdVar.isCancelled()) {
                            pVarZza.cancel(true);
                        }
                    }
                }, zzcfy.zzh);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) {
    }
}
