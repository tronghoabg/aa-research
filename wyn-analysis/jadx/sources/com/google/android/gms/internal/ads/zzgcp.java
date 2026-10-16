package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import u1.InterfaceC4220i;

/* loaded from: classes3.dex */
public final class zzgcp implements zzgbf {

    @NotNull
    private final Ef.E zza;

    @NotNull
    private final zzgst zzb;

    @NotNull
    private final Nf.a zzc;

    @NotNull
    private final Nf.a zzd;

    @NotNull
    private final Nf.a zze;
    private boolean zzf;
    private zzgbd zzg;
    private boolean zzh;

    @NotNull
    private final InterfaceC4220i zzi;

    @NotNull
    private final zzdxe zzj;

    public zzgcp(@NotNull InterfaceC4220i adQualityDataStore, @NotNull zzgbr coroutineScopeProvider, @NotNull zzdxe dataPinger, @NotNull zzgbo clock) {
        AbstractC3340k.e(adQualityDataStore, "adQualityDataStore");
        AbstractC3340k.e(coroutineScopeProvider, "coroutineScopeProvider");
        AbstractC3340k.e(dataPinger, "dataPinger");
        AbstractC3340k.e(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgst();
        this.zzc = Nf.e.a();
        this.zzd = Nf.e.a();
        this.zze = Nf.e.a();
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzA(jf.InterfaceC3103c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgbx
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgbx r0 = (com.google.android.gms.internal.ads.zzgbx) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgbx r0 = new com.google.android.gms.internal.ads.zzgbx
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.zza
            Nf.a r0 = (Nf.a) r0
            Fe.e.U(r8)     // Catch: java.lang.Throwable -> L2f
            goto L65
        L2f:
            r8 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.zza
            Nf.a r2 = (Nf.a) r2
            Fe.e.U(r8)
            r8 = r2
            goto L51
        L42:
            Fe.e.U(r8)
            Nf.a r8 = r7.zze
            r0.zza = r8
            r0.zzd = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 == r1) goto L75
        L51:
            u1.i r2 = r7.zzi     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.zzgby r4 = new com.google.android.gms.internal.ads.zzgby     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6d
            r0.zza = r8     // Catch: java.lang.Throwable -> L6d
            r0.zzd = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 == r1) goto L75
            r6 = r0
            r0 = r8
            r8 = r6
        L65:
            com.google.android.gms.internal.ads.zzgbi r8 = (com.google.android.gms.internal.ads.zzgbi) r8     // Catch: java.lang.Throwable -> L2f
            r0.a(r5)
            ef.C r8 = ef.C2515C.f34653a
            return r8
        L6d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L71:
            r0.a(r5)
            throw r8
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzA(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzB(long r6, jf.InterfaceC3103c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgbw
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgbw r0 = (com.google.android.gms.internal.ads.zzgbw) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgbw r0 = new com.google.android.gms.internal.ads.zzgbw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            Nf.a r0 = (Nf.a) r0
            Fe.e.U(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            Fe.e.U(r8)
            Nf.a r8 = r5.zzc
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            java.lang.Object r0 = r8.b(r0)
            if (r0 == r1) goto L73
            r0 = r8
        L47:
            r8 = 0
            com.google.android.gms.internal.ads.zzgbd r1 = r5.zzg     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = "adQualityDataBuilder"
            if (r1 == 0) goto L6b
            long r3 = r1.zzi()     // Catch: java.lang.Throwable -> L65
            long r6 = r6 - r3
            com.google.android.gms.internal.ads.zzgbd r3 = r5.zzg     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L67
            long r2 = r3.zzg()     // Catch: java.lang.Throwable -> L65
            long r6 = r6 - r2
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L65
            r0.a(r8)
            ef.C r6 = ef.C2515C.f34653a
            return r6
        L65:
            r6 = move-exception
            goto L6f
        L67:
            kotlin.jvm.internal.AbstractC3340k.m(r2)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L6b:
            kotlin.jvm.internal.AbstractC3340k.m(r2)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L6f:
            r0.a(r8)
            throw r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzB(long, jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzC(jf.InterfaceC3103c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgcb
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgcb r0 = (com.google.android.gms.internal.ads.zzgcb) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgcb r0 = new com.google.android.gms.internal.ads.zzgcb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zze
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L50
            if (r2 == r6) goto L48
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r0 = r0.zza
            Nf.a r0 = (Nf.a) r0
            Fe.e.U(r8)     // Catch: java.lang.Throwable -> L32
            goto L92
        L32:
            r8 = move-exception
            goto L9c
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            java.lang.Object r2 = r0.zzb
            Nf.a r2 = (Nf.a) r2
            java.lang.Object r5 = r0.zza
            com.google.android.gms.internal.ads.zzgbe r5 = (com.google.android.gms.internal.ads.zzgbe) r5
            Fe.e.U(r8)
            goto L7e
        L48:
            java.lang.Object r2 = r0.zza
            Nf.a r2 = (Nf.a) r2
            Fe.e.U(r8)
            goto L5f
        L50:
            Fe.e.U(r8)
            Nf.a r2 = r7.zzc
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r8 = r2.b(r0)
            if (r8 == r1) goto Lac
        L5f:
            com.google.android.gms.internal.ads.zzgbd r8 = r7.zzg     // Catch: java.lang.Throwable -> La0
            if (r8 == 0) goto La2
            com.google.android.gms.internal.ads.zziep r8 = r8.zzbu()     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.internal.ads.zzgbe r8 = (com.google.android.gms.internal.ads.zzgbe) r8     // Catch: java.lang.Throwable -> La0
            r2.a(r3)
            kotlin.jvm.internal.AbstractC3340k.b(r8)
            Nf.a r2 = r7.zze
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r5
            java.lang.Object r5 = r2.b(r0)
            if (r5 == r1) goto Lac
            r5 = r8
        L7e:
            u1.i r8 = r7.zzi     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzgcc r6 = new com.google.android.gms.internal.ads.zzgcc     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r5, r3)     // Catch: java.lang.Throwable -> L9a
            r0.zza = r2     // Catch: java.lang.Throwable -> L9a
            r0.zzb = r3     // Catch: java.lang.Throwable -> L9a
            r0.zze = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r8 = r8.a(r6, r0)     // Catch: java.lang.Throwable -> L9a
            if (r8 == r1) goto Lac
            r0 = r2
        L92:
            com.google.android.gms.internal.ads.zzgbi r8 = (com.google.android.gms.internal.ads.zzgbi) r8     // Catch: java.lang.Throwable -> L32
            r0.a(r3)
            ef.C r8 = ef.C2515C.f34653a
            return r8
        L9a:
            r8 = move-exception
            r0 = r2
        L9c:
            r0.a(r3)
            throw r8
        La0:
            r8 = move-exception
            goto La8
        La2:
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.AbstractC3340k.m(r8)     // Catch: java.lang.Throwable -> La0
            throw r3     // Catch: java.lang.Throwable -> La0
        La8:
            r2.a(r3)
            throw r8
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzC(jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean zzD(com.google.android.gms.internal.ads.zzgbe r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = ff.o.z0(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzD(com.google.android.gms.internal.ads.zzgbe):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Nf.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [Nf.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.zzgcp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(jf.InterfaceC3103c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.zzgck
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.zzgck r0 = (com.google.android.gms.internal.ads.zzgck) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgck r0 = new com.google.android.gms.internal.ads.zzgck
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.zzb
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzd
            ef.C r3 = ef.C2515C.f34653a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            Fe.e.U(r10)
            return r3
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            java.lang.Object r2 = r0.zza
            Nf.a r2 = (Nf.a) r2
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L40
            goto L6b
        L40:
            r10 = move-exception
            goto Ld3
        L43:
            java.lang.Object r2 = r0.zza
            Nf.a r2 = (Nf.a) r2
            Fe.e.U(r10)
            goto L5b
        L4b:
            Fe.e.U(r10)
            Nf.a r10 = r9.zze
            r0.zza = r10
            r0.zzd = r6
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto Ld7
            r2 = r10
        L5b:
            u1.i r10 = r9.zzi     // Catch: java.lang.Throwable -> L40
            Hf.l r10 = r10.getData()     // Catch: java.lang.Throwable -> L40
            r0.zza = r2     // Catch: java.lang.Throwable -> L40
            r0.zzd = r5     // Catch: java.lang.Throwable -> L40
            java.lang.Object r10 = Hf.k0.q(r10, r0)     // Catch: java.lang.Throwable -> L40
            if (r10 == r1) goto Ld7
        L6b:
            com.google.android.gms.internal.ads.zzgbi r10 = (com.google.android.gms.internal.ads.zzgbi) r10     // Catch: java.lang.Throwable -> L40
            r2.a(r7)
            if (r10 == 0) goto Ld2
            int r2 = r10.zza()
            if (r2 != 0) goto L79
            goto Ld2
        L79:
            java.util.Map r10 = r10.zzb()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L85:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getValue()
            com.google.android.gms.internal.ads.zzgbe r5 = (com.google.android.gms.internal.ads.zzgbe) r5
            com.google.android.gms.internal.ads.zziej r5 = r5.zzcc()
            java.lang.String r8 = "toBuilder(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r5, r8)
            com.google.android.gms.internal.ads.zzgbd r5 = (com.google.android.gms.internal.ads.zzgbd) r5
            java.lang.Object r2 = r2.getValue()
            java.lang.String r8 = "<get-value>(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r2, r8)
            com.google.android.gms.internal.ads.zzgbe r2 = (com.google.android.gms.internal.ads.zzgbe) r2
            boolean r2 = zzD(r2)
            if (r2 == 0) goto Lb6
            r5.zzf(r6)
        Lb6:
            com.google.android.gms.internal.ads.zzdxe r2 = r9.zzj
            com.google.android.gms.internal.ads.zziep r5 = r5.zzbu()
            java.lang.String r8 = "build(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r5, r8)
            com.google.android.gms.internal.ads.zzgbe r5 = (com.google.android.gms.internal.ads.zzgbe) r5
            r2.zza(r5)
            goto L85
        Lc7:
            r0.zza = r7
            r0.zzd = r4
            java.lang.Object r10 = r9.zzA(r0)
            if (r10 != r1) goto Ld2
            goto Ld7
        Ld2:
            return r3
        Ld3:
            r2.a(r7)
            throw r10
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzs(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzt(java.lang.String r7, jf.InterfaceC3103c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgce
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzgce r0 = (com.google.android.gms.internal.ads.zzgce) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgce r0 = new com.google.android.gms.internal.ads.zzgce
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r1 = r0.zzb
            java.lang.Object r7 = r0.zza
            Nf.a r7 = (Nf.a) r7
            java.lang.String r0 = r0.zzf
            Fe.e.U(r8)
            goto L51
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            Fe.e.U(r8)
            Nf.a r8 = r6.zzc
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzf = r7
            r0.zza = r8
            r0.zzb = r4
            r0.zze = r3
            java.lang.Object r0 = r8.b(r0)
            if (r0 == r1) goto L7e
            r0 = r7
            r7 = r8
            r1 = r4
        L51:
            r8 = 0
            boolean r4 = r6.zzf     // Catch: java.lang.Throwable -> L79
            ef.C r5 = ef.C2515C.f34653a
            if (r4 == 0) goto L5c
            r7.a(r8)
            return r5
        L5c:
            r6.zzf = r3     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzgbe r3 = com.google.android.gms.internal.ads.zzgbe.zzp()     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zziej r3 = r3.zzcc()     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "toBuilder(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r3, r4)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzgbd r3 = (com.google.android.gms.internal.ads.zzgbd) r3     // Catch: java.lang.Throwable -> L79
            r6.zzg = r3     // Catch: java.lang.Throwable -> L79
            r3.zza(r0)     // Catch: java.lang.Throwable -> L79
            r3.zzj(r1)     // Catch: java.lang.Throwable -> L79
            r7.a(r8)
            return r5
        L79:
            r0 = move-exception
            r7.a(r8)
            throw r0
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzt(java.lang.String, jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:31:0x0080, B:33:0x0084, B:42:0x00a0, B:43:0x00a5), top: B:52:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #1 {all -> 0x009e, blocks: (B:31:0x0080, B:33:0x0084, B:42:0x00a0, B:43:0x00a5), top: B:52:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(jf.InterfaceC3103c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzgca
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzgca r0 = (com.google.android.gms.internal.ads.zzgca) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgca r0 = new com.google.android.gms.internal.ads.zzgca
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zze
            ef.C r3 = ef.C2515C.f34653a
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L51
            if (r2 == r8) goto L49
            if (r2 == r7) goto L3f
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            Fe.e.U(r11)
            return r3
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3b:
            Fe.e.U(r11)
            goto L95
        L3f:
            long r7 = r0.zzb
            java.lang.Object r2 = r0.zza
            Nf.a r2 = (Nf.a) r2
            Fe.e.U(r11)
            goto L80
        L49:
            java.lang.Object r2 = r0.zza
            Nf.a r2 = (Nf.a) r2
            Fe.e.U(r11)
            goto L60
        L51:
            Fe.e.U(r11)
            Nf.a r2 = r10.zzd
            r0.zza = r2
            r0.zze = r8
            java.lang.Object r11 = r2.b(r0)
            if (r11 == r1) goto Laf
        L60:
            boolean r11 = r10.zzh     // Catch: java.lang.Throwable -> Laa
            if (r11 == 0) goto L68
            r2.a(r4)
            return r3
        L68:
            r10.zzh = r8     // Catch: java.lang.Throwable -> Laa
            r2.a(r4)
            Nf.a r2 = r10.zzc
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r7
            java.lang.Object r11 = r2.b(r0)
            if (r11 == r1) goto Laf
            r7 = r8
        L80:
            com.google.android.gms.internal.ads.zzgbd r11 = r10.zzg     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto La0
            r11.zzo(r7)     // Catch: java.lang.Throwable -> L9e
            r2.a(r4)
            r0.zza = r4
            r0.zze = r6
            java.lang.Object r11 = r10.zzB(r7, r0)
            if (r11 != r1) goto L95
            goto Laf
        L95:
            r0.zze = r5
            java.lang.Object r11 = r10.zzC(r0)
            if (r11 == r1) goto Laf
            return r3
        L9e:
            r11 = move-exception
            goto La6
        La0:
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.AbstractC3340k.m(r11)     // Catch: java.lang.Throwable -> L9e
            throw r4     // Catch: java.lang.Throwable -> L9e
        La6:
            r2.a(r4)
            throw r11
        Laa:
            r11 = move-exception
            r2.a(r4)
            throw r11
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzu(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(jf.InterfaceC3103c r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzv(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzw(jf.InterfaceC3103c r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzw(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: all -> 0x00e7, TRY_ENTER, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzx(jf.InterfaceC3103c r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzx(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzy(jf.InterfaceC3103c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.zzgcg
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.gms.internal.ads.zzgcg r0 = (com.google.android.gms.internal.ads.zzgcg) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgcg r0 = new com.google.android.gms.internal.ads.zzgcg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zzc
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            Nf.a r0 = (Nf.a) r0
            Fe.e.U(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            Fe.e.U(r7)
            Nf.a r7 = r6.zzc
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzb = r7
            r0.zza = r4
            r0.zze = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto L66
            r0 = r7
            r1 = r4
        L4c:
            r7 = 0
            com.google.android.gms.internal.ads.zzgbd r3 = r6.zzg     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L5c
            r3.zzs(r1)     // Catch: java.lang.Throwable -> L5a
            r0.a(r7)
            ef.C r7 = ef.C2515C.f34653a
            return r7
        L5a:
            r1 = move-exception
            goto L62
        L5c:
            java.lang.String r1 = "adQualityDataBuilder"
            kotlin.jvm.internal.AbstractC3340k.m(r1)     // Catch: java.lang.Throwable -> L5a
            throw r7     // Catch: java.lang.Throwable -> L5a
        L62:
            r0.a(r7)
            throw r1
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzy(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzz(java.lang.String r8, jf.InterfaceC3103c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzgbu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzgbu r0 = (com.google.android.gms.internal.ads.zzgbu) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgbu r0 = new com.google.android.gms.internal.ads.zzgbu
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.zza
            Nf.a r8 = (Nf.a) r8
            Fe.e.U(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L2f:
            r9 = move-exception
            goto L7a
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.zzb
            Nf.a r8 = (Nf.a) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            Fe.e.U(r9)
            r9 = r8
            r8 = r2
            goto L58
        L47:
            Fe.e.U(r9)
            Nf.a r9 = r7.zze
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 == r1) goto L7e
        L58:
            u1.i r2 = r7.zzi     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.internal.ads.zzgbv r4 = new com.google.android.gms.internal.ads.zzgbv     // Catch: java.lang.Throwable -> L76
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L76
            r0.zza = r9     // Catch: java.lang.Throwable -> L76
            r0.zzb = r5     // Catch: java.lang.Throwable -> L76
            r0.zze = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L76
            if (r8 == r1) goto L7e
            r6 = r9
            r9 = r8
            r8 = r6
        L6e:
            com.google.android.gms.internal.ads.zzgbi r9 = (com.google.android.gms.internal.ads.zzgbi) r9     // Catch: java.lang.Throwable -> L2f
            r8.a(r5)
            ef.C r8 = ef.C2515C.f34653a
            return r8
        L76:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7a:
            r8.a(r5)
            throw r9
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcp.zzz(java.lang.String, jf.c):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zza() {
        Ef.H.D(this.zza, null, new zzgcj(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzb(@NotNull String gwsQueryId) {
        AbstractC3340k.e(gwsQueryId, "gwsQueryId");
        zzgsw.zza(this.zza, this.zzb, new zzgcd(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzc() {
        zzgsw.zza(this.zza, this.zzb, new zzgbz(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzd() {
        zzgsw.zza(this.zza, this.zzb, new zzgcn(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zze() {
        zzgsw.zza(this.zza, this.zzb, new zzgch(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzf() {
        zzgsw.zza(this.zza, this.zzb, new zzgcl(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final void zzg() {
        zzgsw.zza(this.zza, this.zzb, new zzgcf(this, null));
    }
}
