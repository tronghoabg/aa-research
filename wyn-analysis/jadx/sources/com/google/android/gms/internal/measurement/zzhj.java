package com.google.android.gms.internal.measurement;

import N0.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k8.InterfaceC3199h;

/* loaded from: classes4.dex */
public abstract class zzhj<T> {
    private static final Object zza = new Object();
    private static volatile zzhu zzb = null;
    private static volatile boolean zzc = false;
    private static zzhy zzd;
    private static final AtomicInteger zze;
    private final zzhr zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        new AtomicReference();
        zzd = new zzhy(new zzhx() { // from class: com.google.android.gms.internal.measurement.zzho
            @Override // com.google.android.gms.internal.measurement.zzhx
            public final boolean zza() {
                return zzhj.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Boolean bool, boolean z2) {
        return new zzhq(zzhrVar, str, bool, true);
    }

    private final T zzb(zzhu zzhuVar) {
        Object objZza;
        zzhb zzhbVarZza = this.zzf.zzb != null ? zzhi.zza(zzhuVar.zza(), this.zzf.zzb) ? this.zzf.zzg ? zzgu.zza(zzhuVar.zza().getContentResolver(), zzhk.zza(zzhk.zza(zzhuVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
            @Override // java.lang.Runnable
            public final void run() {
                zzhj.zzc();
            }
        }) : zzgu.zza(zzhuVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
            @Override // java.lang.Runnable
            public final void run() {
                zzhj.zzc();
            }
        }) : null : zzhw.zza(zzhuVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
            @Override // java.lang.Runnable
            public final void run() {
                zzhj.zzc();
            }
        });
        if (zzhbVarZza == null || (objZza = zzhbVarZza.zza(zzb())) == null) {
            return null;
        }
        return zza(objZza);
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    public abstract T zza(Object obj);

    private zzhj(zzhr zzhrVar, String str, T t10, boolean z2) {
        this.zzi = -1;
        String str2 = zzhrVar.zza;
        if (str2 == null && zzhrVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzhrVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzhrVar;
        this.zzg = str;
        this.zzh = t10;
        this.zzk = z2;
        this.zzl = false;
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Double d3, boolean z2) {
        return new zzhp(zzhrVar, str, d3, true);
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Long l10, boolean z2) {
        return new zzhn(zzhrVar, str, l10, true);
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, String str2, boolean z2) {
        return new zzhs(zzhrVar, str, str2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0027, B:14:0x0037, B:20:0x0053, B:22:0x005e, B:35:0x007e, B:38:0x0086, B:39:0x008b, B:40:0x008f, B:25:0x0065, B:34:0x007a, B:28:0x006c, B:31:0x0073, B:41:0x0093), top: B:47:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T zza() {
        /*
            r8 = this;
            boolean r0 = r8.zzk
            if (r0 != 0) goto L11
            com.google.android.gms.internal.measurement.zzhy r0 = com.google.android.gms.internal.measurement.zzhj.zzd
            java.lang.String r1 = r8.zzg
            boolean r0 = r0.zza(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            Fe.e.w(r1, r0)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzhj.zze
            int r0 = r0.get()
            int r1 = r8.zzi
            if (r1 >= r0) goto L97
            monitor-enter(r8)
            int r1 = r8.zzi     // Catch: java.lang.Throwable -> L4c
            if (r1 >= r0) goto L93
            com.google.android.gms.internal.measurement.zzhu r1 = com.google.android.gms.internal.measurement.zzhj.zzb     // Catch: java.lang.Throwable -> L4c
            k8.a r2 = k8.C3192a.f39293a     // Catch: java.lang.Throwable -> L4c
            r3 = 0
            if (r1 == 0) goto L4e
            k8.p r2 = r1.zzb()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L4c
            k8.j r2 = (k8.AbstractC3201j) r2     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            java.lang.Object r3 = r2.a()     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.measurement.zzhh r3 = (com.google.android.gms.internal.measurement.zzhh) r3     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.measurement.zzhr r4 = r8.zzf     // Catch: java.lang.Throwable -> L4c
            android.net.Uri r5 = r4.zzb     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = r4.zza     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r4.zzd     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = r8.zzg     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.zza(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r0 = move-exception
            goto L95
        L4e:
            if (r1 == 0) goto L52
            r4 = 1
            goto L53
        L52:
            r4 = 0
        L53:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            Fe.e.w(r5, r4)     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.measurement.zzhr r4 = r8.zzf     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r4.zzf     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r8.zza(r1)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L65
            goto L7e
        L65:
            java.lang.Object r4 = r8.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L7a
            goto L7e
        L6c:
            java.lang.Object r4 = r8.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L73
            goto L7e
        L73:
            java.lang.Object r4 = r8.zza(r1)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L7a
            goto L7e
        L7a:
            java.lang.Object r4 = r8.zze()     // Catch: java.lang.Throwable -> L4c
        L7e:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L8f
            if (r3 != 0) goto L8b
            java.lang.Object r4 = r8.zze()     // Catch: java.lang.Throwable -> L4c
            goto L8f
        L8b:
            java.lang.Object r4 = r8.zza(r3)     // Catch: java.lang.Throwable -> L4c
        L8f:
            r8.zzj = r4     // Catch: java.lang.Throwable -> L4c
            r8.zzi = r0     // Catch: java.lang.Throwable -> L4c
        L93:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4c
            goto L97
        L95:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4c
            throw r0
        L97:
            T r0 = r8.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhj.zza():java.lang.Object");
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzb(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzhu r0 = com.google.android.gms.internal.measurement.zzhj.zzb
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzhj.zza
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzhu r1 = com.google.android.gms.internal.measurement.zzhj.zzb     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.zzhu r1 = com.google.android.gms.internal.measurement.zzhj.zzb     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.zzgu.zzc()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzhw.zza()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzhc.zza()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.zzhl r1 = new com.google.android.gms.internal.measurement.zzhl     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            k8.p r1 = S3.f.z(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzgv r2 = new com.google.android.gms.internal.measurement.zzgv     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzhj.zzb = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzhj.zze     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhj.zzb(android.content.Context):void");
    }

    private final T zza(zzhu zzhuVar) {
        InterfaceC3199h interfaceC3199h;
        zzhr zzhrVar = this.zzf;
        if (!zzhrVar.zze && ((interfaceC3199h = zzhrVar.zzh) == null || ((Boolean) interfaceC3199h.apply(zzhuVar.zza())).booleanValue())) {
            zzhc zzhcVarZza = zzhc.zza(zzhuVar.zza());
            zzhr zzhrVar2 = this.zzf;
            Object objZza = zzhcVarZza.zza(zzhrVar2.zze ? null : zza(zzhrVar2.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? a.f(str, this.zzg) : this.zzg;
    }
}
