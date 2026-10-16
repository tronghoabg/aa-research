package com.google.android.gms.internal.ads;

import D6.A0;
import D6.C0395s;
import D6.InterfaceC0358a;
import D6.InterfaceC0362b0;
import D6.InterfaceC0373g0;
import D6.InterfaceC0407y;
import D6.K0;
import D6.y1;
import android.util.Pair;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzetk implements y6.f, zzdgf, zzden, zzddc, zzddt, InterfaceC0358a, zzdcz, zzdfq, zzddp, zzdlg {
    final zzdzt zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicReference zzk = new AtomicReference();
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzks)).intValue());

    public zzetk(zzdzt zzdztVar) {
        this.zza = zzdztVar;
    }

    private final void zzs() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzfht.zza(this.zzd, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesu
                    @Override // com.google.android.gms.internal.ads.zzfhs
                    public final /* synthetic */ void zza(Object obj) {
                        Pair pair2 = pair;
                        ((InterfaceC0362b0) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzms)).booleanValue()) {
            return;
        }
        zzfht.zza(this.zzc, zzesz.zza);
    }

    @Override // y6.f
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzfht.zza(this.zzd, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzess
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC0362b0) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i5 = G6.L.f4523b;
            H6.l.a("The queue for app events is full, dropping the new event.");
            zzdzt zzdztVar = this.zza;
            if (zzdztVar != null) {
                zzdzs zzdzsVarZza = zzdztVar.zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "dae_action");
                zzdzsVarZza.zzc("dae_name", str);
                zzdzsVarZza.zzc("dae_data", str2);
                zzdzsVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(final K0 k02) {
        zzfhs zzfhsVar = new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC0407y) obj).zzd(k02);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzfht.zza(atomicReference, zzfhsVar);
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC0407y) obj).zzc(k02.f2338a);
            }
        });
        zzfht.zza(this.zzf, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesq
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) {
                ((D6.B) obj).zzc(k02);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
        zzfht.zza(this.zzc, zzesw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzfht.zza(this.zzc, zzeta.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzfht.zza(this.zzc, zzetc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        zzfht.zza(this.zzc, zzetd.zza);
        zzfht.zza(this.zzg, zzeti.zza);
        zzfht.zza(this.zzk, zzetj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzfht.zza(this.zzc, zzesy.zza);
        AtomicReference atomicReference = this.zzg;
        zzfht.zza(atomicReference, zzetf.zza);
        zzfht.zza(atomicReference, zzetg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzms)).booleanValue()) {
            zzfht.zza(this.zzc, zzetb.zza);
        }
        zzfht.zza(this.zzg, zzeth.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzg() {
        zzfht.zza(this.zzc, zzesx.zza);
        zzfht.zza(this.zzf, zzete.zza);
        this.zzj.set(true);
        zzs();
    }

    public final synchronized InterfaceC0407y zzi() {
        return (InterfaceC0407y) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(final K0 k02) {
        zzfht.zza(this.zzg, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC0373g0) obj).B(k02);
            }
        });
    }

    public final synchronized InterfaceC0362b0 zzk() {
        return (InterfaceC0362b0) this.zzd.get();
    }

    public final void zzl(InterfaceC0407y interfaceC0407y) {
        this.zzc.set(interfaceC0407y);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final y1 y1Var) {
        zzfht.zza(this.zze, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) {
                ((A0) obj).t(y1Var);
            }
        });
    }

    public final void zzn(zzfti zzftiVar) {
        this.zzk.set(zzftiVar);
    }

    public final void zzo(InterfaceC0362b0 interfaceC0362b0) {
        this.zzd.set(interfaceC0362b0);
        this.zzi.set(true);
        zzs();
    }

    public final void zzp(A0 a02) {
        this.zze.set(a02);
    }

    public final void zzq(D6.B b5) {
        this.zzf.set(b5);
    }

    public final void zzr(InterfaceC0373g0 interfaceC0373g0) {
        this.zzg.set(interfaceC0373g0);
    }
}
