package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class zzfnr {
    private final zzfmv zza;
    private final zzfno zzb;
    private final zzfmr zzc;
    private zzfnx zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfnr(zzfmv zzfmvVar, zzfmr zzfmrVar, zzfno zzfnoVar) {
        this.zza = zzfmvVar;
        this.zzc = zzfmrVar;
        this.zzb = zzfnoVar;
        zzfmrVar.zza(new zzfmq() { // from class: com.google.android.gms.internal.ads.zzfnq
            @Override // com.google.android.gms.internal.ads.zzfmq
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfnx(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzfnm(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        return;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzd() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzhq     // Catch: java.lang.Throwable -> L2e
            D6.s r1 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            C6.n r0 = C6.n.f1857D     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzcfk r0 = r0.f1868h     // Catch: java.lang.Throwable -> L2e
            G6.N r0 = r0.zzp()     // Catch: java.lang.Throwable -> L2e
            G6.O r0 = (G6.O) r0     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzcff r0 = r0.r()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.zzi()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L30
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L2e
            r0.clear()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            return
        L2e:
            r0 = move-exception
            goto L6f
        L30:
            boolean r0 = r4.zzi()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L6d
        L36:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L6d
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzfnp r0 = (com.google.android.gms.internal.ads.zzfnp) r0     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L58
            com.google.android.gms.internal.ads.zzfnf r1 = r0.zzb()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.zzfmv r1 = r4.zza     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzfnf r2 = r0.zzb()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.zzc(r2)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L36
        L58:
            com.google.android.gms.internal.ads.zzfmv r1 = r4.zza     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzfno r2 = r4.zzb     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzfnx r3 = new com.google.android.gms.internal.ads.zzfnx     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L2e
            r4.zze = r3     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzfnm r1 = new com.google.android.gms.internal.ads.zzfnm     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2e
            r3.zza(r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            return
        L6d:
            monitor-exit(r4)
            return
        L6f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfnr.zzd():void");
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzfnp zzfnpVar) {
        this.zzd.add(zzfnpVar);
    }

    public final synchronized p8.p zzb(zzfnp zzfnpVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfnpVar);
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    public final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(zzfnx zzfnxVar) {
        this.zze = null;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
