package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzdca implements F6.o {
    private final zzfky zzc;
    private final zzfkn zzd;
    private final InterfaceC3596a zze;
    private final zzdzt zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfrm zza = zzfrn.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    public zzdca(zzfky zzfkyVar, zzfkn zzfknVar, InterfaceC3596a interfaceC3596a, zzdzt zzdztVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfkyVar;
        this.zzd = zzfknVar;
        this.zze = interfaceC3596a;
        this.zzf = zzdztVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdzt zzdztVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfrn) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoB)).booleanValue()) {
                    zzdzs zzdzsVarZza = zzdztVar.zza();
                    zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "pclma");
                    zzdzsVarZza.zzc("pclmd", strEncodeToString);
                    zzdzsVarZza.zzc("gqi", str);
                    zzdzsVarZza.zzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzo(int i5) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfrm zzfrmVar = this.zza;
                    zzfqc zzfqcVarZza = zzfqd.zza();
                    zzfqcVarZza.zzb(i5);
                    ((C3597b) this.zze).getClass();
                    zzfqcVarZza.zza(System.currentTimeMillis());
                    zzfrmVar.zza((zzfqd) zzfqcVarZza.zzbu());
                    if (i5 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // F6.o
    public final void zzdT() {
    }

    @Override // F6.o
    public final void zzdU(int i5) {
    }

    @Override // F6.o
    public final void zzdo() {
        zzo(3);
    }

    @Override // F6.o
    public final void zzdp() {
        zzo(5);
    }

    @Override // F6.o
    public final void zzdq() {
        zzo(4);
    }

    @Override // F6.o
    public final void zzdv() {
        zzo(7);
    }

    @Override // F6.o
    public final void zzdw() {
        zzo(8);
    }

    @Override // F6.o
    public final void zzdx() {
        zzo(6);
    }

    @Override // F6.o
    public final void zzdy() {
        zzo(9);
    }

    @Override // F6.o
    public final void zzdz() {
        zzo(10);
    }

    @Override // F6.o
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            int i5 = this.zzd.zzaE;
            if (i5 > 0 && !this.zzh) {
                zzfrm zzfrmVar = this.zza;
                ((C3597b) this.zze).getClass();
                zzfrmVar.zzb(System.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, i5, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
