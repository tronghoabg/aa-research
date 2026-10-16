package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfdr implements zzfcs {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcfc zzg;

    public zzfdr(zzcfc zzcfcVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i5, boolean z2, boolean z10) {
        this.zzg = zzcfcVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i5;
        this.zze = z2;
        this.zzf = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzhbx zzhbxVarZzw = zzhbx.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzi((zzhbx) zzhcf.zzk(zzhbxVarZzw, zzgtiVar, executor), ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzbM)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfds zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzgcr r0 = new com.google.android.gms.internal.ads.zzgcr
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzei
            D6.s r2 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L1c:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzej
            D6.s r2 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L2f:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzgcv r1 = com.google.android.gms.internal.ads.zzgcv.zzh(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            j$.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            j$.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzeo     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            D6.s r4 = D6.C0395s.f2489e     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzbiv r4 = r4.f2492c     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Object r0 = r4.zzd(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzgcr r0 = r1.zzj(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            goto L6b
        L5a:
            r0 = move-exception
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            C6.n r1 = C6.n.f1857D
            com.google.android.gms.internal.ads.zzcfk r1 = r1.f1868h
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.zzh(r0, r2)
            com.google.android.gms.internal.ads.zzgcr r0 = new com.google.android.gms.internal.ads.zzgcr
            r0.<init>()
        L6b:
            com.google.android.gms.internal.ads.zzfds r1 = new com.google.android.gms.internal.ads.zzfds
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdr.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzfds");
    }

    public final zzfds zzd(Throwable th) {
        H6.f fVar = C0392q.f2477g.f2478a;
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfds(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgcr());
    }
}
