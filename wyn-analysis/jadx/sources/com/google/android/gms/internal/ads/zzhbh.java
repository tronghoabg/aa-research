package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* loaded from: classes3.dex */
abstract class zzhbh extends zzhbl {
    private static final zzhcn zza = new zzhcn(zzhbh.class);
    private zzgwp zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzhbh(zzgwp zzgwpVar, boolean z2, boolean z10) {
        super(zzgwpVar.size());
        this.zzb = zzgwpVar;
        this.zzc = z2;
        this.zzd = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i5, p8.p pVar) {
        try {
            if (pVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i5, pVar);
            }
            zzz(null);
        } catch (Throwable th) {
            zzz(null);
            throw th;
        }
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i5, p8.p pVar) {
        try {
            zzw(i5, zzhdg.zza(pVar));
        } catch (ExecutionException e7) {
            zzE(e7.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgwp zzgwpVar) {
        int iZzC = zzC();
        int i5 = 0;
        zzgtr.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgwpVar != null) {
                zzgzh it = zzgwpVar.iterator();
                while (it.hasNext()) {
                    p8.p pVar = (p8.p) it.next();
                    if (!pVar.isCancelled()) {
                        zzG(i5, pVar);
                    }
                    i5++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public void zzA(int i5) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final void zzc() {
        zzgwp zzgwpVar = this.zzb;
        zzA(1);
        if ((zzgwpVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgzh it = zzgwpVar.iterator();
            while (it.hasNext()) {
                ((p8.p) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String zzd() {
        zzgwp zzgwpVar = this.zzb;
        return zzgwpVar != null ? "futures=".concat(zzgwpVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgzh it = this.zzb.iterator();
            final int i5 = 0;
            while (it.hasNext()) {
                final p8.p pVar = (p8.p) it.next();
                int i10 = i5 + 1;
                if (pVar.isDone()) {
                    zzy(i5, pVar);
                } else {
                    pVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i5, pVar);
                        }
                    }, zzhbu.INSTANCE);
                }
                i5 = i10;
            }
            return;
        }
        zzgwp zzgwpVar = this.zzb;
        final zzgwp zzgwpVar2 = true != this.zzd ? null : zzgwpVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgwpVar2);
            }
        };
        zzgzh it2 = zzgwpVar.iterator();
        while (it2.hasNext()) {
            p8.p pVar2 = (p8.p) it2.next();
            if (pVar2.isDone()) {
                zzz(zzgwpVar2);
            } else {
                pVar2.addListener(runnable, zzhbu.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i5, Object obj);

    public abstract void zzx();
}
