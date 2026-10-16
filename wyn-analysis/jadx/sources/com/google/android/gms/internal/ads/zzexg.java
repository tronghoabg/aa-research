package com.google.android.gms.internal.ads;

import D6.C0395s;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzexg implements zzfcs {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final InterfaceC3596a zzc;
    private final Executor zzd;
    private final zzfcs zze;
    private final long zzf;
    private final zzdzt zzg;

    public zzexg(zzfcs zzfcsVar, long j8, InterfaceC3596a interfaceC3596a, Executor executor, zzdzt zzdztVar) {
        this.zzc = interfaceC3596a;
        this.zze = zzfcsVar;
        this.zzf = j8;
        this.zzd = executor;
        this.zzg = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzexd zzexdVar;
        zzbio zzbioVar = zzbix.zznw;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zznv)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcfy.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzexf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j8 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j8, j8, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzexd zzexdVar2 = (zzexd) atomicReference.get();
                    if (zzexdVar2 == null) {
                        zzexd zzexdVar3 = new zzexd(this.zze.zza(), this.zzf, this.zzc);
                        atomicReference.set(zzexdVar3);
                        return zzexdVar3.zza;
                    }
                    if (((Boolean) this.zzb.get()).booleanValue() || !zzexdVar2.zza()) {
                        zzexdVar = zzexdVar2;
                    } else {
                        p8.p pVar = zzexdVar2.zza;
                        zzfcs zzfcsVar = this.zze;
                        zzexd zzexdVar4 = new zzexd(zzfcsVar.zza(), this.zzf, this.zzc);
                        this.zza.set(zzexdVar4);
                        if (((Boolean) c0395s.f2492c.zzd(zzbix.zznx)).booleanValue()) {
                            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzny)).booleanValue()) {
                                zzdzs zzdzsVarZza = this.zzg.zza();
                                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "scs");
                                zzdzsVarZza.zzc("sid", String.valueOf(zzfcsVar.zzb()));
                                zzdzsVarZza.zzd();
                            }
                            return pVar;
                        }
                        zzexdVar = zzexdVar4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzexdVar = (zzexd) atomicReference2.get();
            if (zzexdVar == null || zzexdVar.zza()) {
                zzfcs zzfcsVar2 = this.zze;
                zzexd zzexdVar5 = new zzexd(zzfcsVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzexdVar5);
                zzexdVar = zzexdVar5;
            }
        }
        return zzexdVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return this.zze.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzexd(this.zze.zza(), this.zzf, this.zzc));
    }
}
