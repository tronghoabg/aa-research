package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.InterfaceC0513t;
import Nf.a;
import Nf.e;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import ef.C2515C;
import jf.InterfaceC3103c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzap {
    public InterfaceC0513t zza;

    @NotNull
    private final E zzb;

    @NotNull
    private final zzdc zzc;

    @NotNull
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;

    @NotNull
    private zzat zze = zzat.zza;

    @NotNull
    private final a zzg = e.a();

    public zzap(@NotNull Context context, @NotNull E e7, @NotNull zzdc zzdcVar, @NotNull StandardIntegrityManager standardIntegrityManager, long j8) {
        this.zzb = e7;
        this.zzc = zzdcVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(jf.InterfaceC3103c r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzai
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzai r0 = (com.google.android.recaptcha.internal.zzai) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzai r0 = new com.google.android.recaptcha.internal.zzai
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r7)
            return r7
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            Fe.e.U(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            Ef.K r7 = com.google.android.recaptcha.internal.zzas.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzi(jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r6, jf.InterfaceC3103c r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzaj
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzaj r0 = (com.google.android.recaptcha.internal.zzaj) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaj r0 = new com.google.android.recaptcha.internal.zzaj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.zzd
            Fe.e.U(r7)
            goto L4b
        L38:
            Fe.e.U(r7)
            Ef.t r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            Ef.u r7 = (Ef.C0514u) r7
            java.lang.Object r7 = r7.p(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            Ef.K r6 = com.google.android.recaptcha.internal.zzas.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzj(java.lang.String, jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Fe.e.U(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzap r2 = r0.zzd
            Fe.e.U(r8)
            goto L64
        L3d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzap r2 = r0.zzd
            Fe.e.U(r8)     // Catch: java.lang.Exception -> L57
            return r8
        L45:
            Fe.e.U(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L56
            r0.zze = r7     // Catch: java.lang.Exception -> L56
            r0.zzc = r5     // Catch: java.lang.Exception -> L56
            java.lang.Object r7 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L56
            if (r7 != r1) goto L55
            goto L71
        L55:
            return r7
        L56:
            r2 = r6
        L57:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L64
            goto L71
        L64:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r7 = r2.zzj(r7, r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzc(java.lang.String, jf.c):java.lang.Object");
    }

    @Nullable
    public final Object zzd(long j8, @NotNull InterfaceC3103c interfaceC3103c) {
        this.zzf = j8;
        return C2515C.f34653a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzam
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzam r0 = (com.google.android.recaptcha.internal.zzam) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzam r0 = new com.google.android.recaptcha.internal.zzam
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzd
            ef.C r3 = ef.C2515C.f34653a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            Fe.e.U(r14)
            return r3
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L34:
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzap r6 = r0.zze
            Fe.e.U(r14)
            goto L4e
        L3c:
            Fe.e.U(r14)
            Nf.a r2 = r13.zzg
            r0.zze = r13
            r0.zza = r2
            r0.zzd = r5
            java.lang.Object r14 = r2.b(r0)
            if (r14 == r1) goto Lad
            r6 = r13
        L4e:
            r14 = 0
            com.google.android.recaptcha.internal.zzat r7 = r6.zze     // Catch: java.lang.Throwable -> La8
            com.google.android.recaptcha.internal.zzat r8 = com.google.android.recaptcha.internal.zzat.zza     // Catch: java.lang.Throwable -> La8
            boolean r7 = kotlin.jvm.internal.AbstractC3340k.a(r7, r8)     // Catch: java.lang.Throwable -> La8
            if (r7 != 0) goto L5d
            r2.a(r14)
            return r3
        L5d:
            com.google.android.recaptcha.internal.zzat r7 = com.google.android.recaptcha.internal.zzat.zzb     // Catch: java.lang.Throwable -> La8
            r6.zze = r7     // Catch: java.lang.Throwable -> La8
            r2.a(r14)
            com.google.android.recaptcha.internal.zzdc r2 = r6.zzc
            java.lang.String r7 = r2.zzd()
            r2.zzc(r7)
            r2.zzb(r4)
            r7 = 38
            com.google.android.recaptcha.internal.zzdf r2 = r2.zzf(r7)
            Ef.u r7 = Ef.H.b()
            r6.zza = r7
            Ef.E r7 = r6.zzb
            com.google.android.recaptcha.internal.zzao r8 = new com.google.android.recaptcha.internal.zzao
            r8.<init>(r6, r2, r14)
            r2 = 3
            Ef.H.D(r7, r14, r8, r2)
            r0.zze = r14
            r0.zza = r14
            r0.zzd = r4
            boolean r14 = r6.zzh
            if (r14 != 0) goto La4
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzak r8 = new com.google.android.recaptcha.internal.zzak
            r8.<init>(r6)
            r9 = 28800000(0x1b77400, double:1.42290906E-316)
            r11 = r9
            r7.schedule(r8, r9, r11)
            r6.zzh = r5
        La4:
            if (r3 != r1) goto La7
            goto Lad
        La7:
            return r3
        La8:
            r0 = move-exception
            r2.a(r14)
            throw r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zze(jf.c):java.lang.Object");
    }

    @NotNull
    public final InterfaceC0513t zzf() {
        InterfaceC0513t interfaceC0513t = this.zza;
        if (interfaceC0513t != null) {
            return interfaceC0513t;
        }
        return null;
    }
}
