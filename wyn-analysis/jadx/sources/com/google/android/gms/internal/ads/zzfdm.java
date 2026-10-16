package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzfdm implements zzfcs {
    private final G6.N zza;
    private final Context zzb;
    private final zzhcp zzc;
    private final ScheduledExecutorService zzd;
    private final zzely zze;
    private final zzflg zzf;
    private final H6.a zzg;

    public zzfdm(G6.N n10, Context context, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzely zzelyVar, zzflg zzflgVar, H6.a aVar) {
        this.zza = n10;
        this.zzb = context;
        this.zzc = zzhcpVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzelyVar;
        this.zzf = zzflgVar;
        this.zzg = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.zzb.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.zzfcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.p zza() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdm.zza():p8.p");
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 56;
    }

    public final /* synthetic */ p8.p zzc(final Throwable th) {
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmb)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    C6.n.f1857D.f1868h.zzj(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    C6.n.f1857D.f1868h.zzi(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzhcf.zza(th instanceof SecurityException ? new zzfdn("", 2, null) : th instanceof IllegalStateException ? new zzfdn("", 3, null) : th instanceof IllegalArgumentException ? new zzfdn("", 4, null) : th instanceof TimeoutException ? new zzfdn("", 5, null) : new zzfdn("", 0, null));
    }
}
