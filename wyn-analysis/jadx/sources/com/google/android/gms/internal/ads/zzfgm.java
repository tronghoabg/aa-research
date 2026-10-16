package com.google.android.gms.internal.ads;

import D6.A0;
import D6.K0;
import D6.y1;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfgm implements zzddc, zzdey, zzfib, F6.o, zzdfq, zzddp, zzdlg {
    private final zzfmr zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfgm zzi = null;

    public zzfgm(zzfmr zzfmrVar) {
        this.zza = zzfmrVar;
    }

    public static zzfgm zzn(zzfgm zzfgmVar) {
        zzfgm zzfgmVar2 = new zzfgm(zzfgmVar.zza);
        zzfgmVar2.zzi = zzfgmVar;
        return zzfgmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(final K0 k02) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdJ(k02);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbgt) obj).zzd(k02);
            }
        });
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgc
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbgt) obj).zzc(k02.f2338a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
    }

    @Override // F6.o
    public final void zzdT() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdT();
        } else {
            zzfht.zza(this.zzf, zzffx.zza);
        }
    }

    @Override // F6.o
    public final void zzdU(final int i5) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdU(i5);
        } else {
            zzfht.zza(this.zzf, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgd
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) {
                    ((F6.o) obj).zzdU(i5);
                }
            });
        }
    }

    @Override // F6.o
    public final void zzdo() {
    }

    @Override // F6.o
    public final void zzdp() {
    }

    @Override // F6.o
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdu();
        } else {
            zzfht.zza(this.zzd, zzfgj.zza);
        }
    }

    @Override // F6.o
    public final void zzdv() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdv();
        } else {
            zzfht.zza(this.zzf, zzffy.zza);
        }
    }

    @Override // F6.o
    public final void zzdw() {
    }

    @Override // F6.o
    public final void zzdx() {
    }

    @Override // F6.o
    public final void zzdy() {
    }

    @Override // F6.o
    public final void zzdz() {
    }

    @Override // F6.o
    public final void zzh() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzh();
            return;
        }
        zzfht.zza(this.zzf, zzffz.zza);
        AtomicReference atomicReference = this.zzd;
        zzfht.zza(atomicReference, zzfgh.zza);
        zzfht.zza(atomicReference, zzfgi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(final K0 k02) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzj(k02);
        } else {
            zzfht.zza(this.zzd, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfge
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbgx) obj).zze(k02);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zzl() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzl();
        } else {
            zzfht.zza(this.zze, zzffw.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final y1 y1Var) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzm(y1Var);
        } else {
            zzfht.zza(this.zzg, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgf
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) {
                    ((A0) obj).t(y1Var);
                }
            });
        }
    }

    public final void zzo(zzbgt zzbgtVar) {
        this.zzb.set(zzbgtVar);
    }

    public final void zzp(zzbgx zzbgxVar) {
        this.zzd.set(zzbgxVar);
    }

    public final void zzq(F6.o oVar) {
        this.zzf.set(oVar);
    }

    public final void zzr(A0 a02) {
        this.zzg.set(a02);
    }

    public final void zzs(zzfti zzftiVar) {
        this.zzh.set(zzftiVar);
    }

    public final void zzt(final zzbgq zzbgqVar) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzt(zzbgqVar);
        } else {
            zzfht.zza(this.zzb, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfga
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbgt) obj).zzb(zzbgqVar);
                }
            });
        }
    }

    public final void zzu() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzu();
            return;
        }
        this.zza.zzb();
        zzfht.zza(this.zzc, zzfgg.zza);
        zzfht.zza(this.zzd, zzfgk.zza);
        zzfht.zza(this.zzh, zzfgl.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    public final void zzv(zzfib zzfibVar) {
        this.zzi = (zzfgm) zzfibVar;
    }
}
