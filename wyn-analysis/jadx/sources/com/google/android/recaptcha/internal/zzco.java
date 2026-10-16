package com.google.android.recaptcha.internal;

import Ef.H;
import Ef.L0;
import Fe.c;
import Nf.a;
import Nf.e;
import android.app.Application;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import java.util.UUID;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzco {

    @Nullable
    private static zzcx zzb;

    @NotNull
    public static final zzco zza = new zzco();

    @NotNull
    private static final String zzc = UUID.randomUUID().toString();

    @NotNull
    private static final a zzd = e.a();

    @NotNull
    private static final zzbo zzf = new zzbo();

    @NotNull
    private static final zzl zze = new zzl(null, 1, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i5 = zzbb.zza;
        zzba.zzb(new zzbc(915034663, new zzbf(null, 1, null)), new zzbc(915034752, new zzeb()), new zzbc(915034668, new zzbk()));
    }

    private zzco() {
    }

    public static final /* synthetic */ zzcx zza(zzco zzcoVar, String str) throws zzbj {
        zzcx zzcxVar = zzb;
        if (zzcxVar == null) {
            return null;
        }
        if (AbstractC3340k.a(zzcxVar.zze(), str)) {
            return zzcxVar;
        }
        throw new zzbj(zzbh.zzd, zzbg.zzan, null);
    }

    @Nullable
    public static final Object zzg(@NotNull Application application, @NotNull String str, long j8, @Nullable zzdq zzdqVar, @NotNull InterfaceC3103c interfaceC3103c) throws j, RecaptchaException, L0 {
        return H.P(zzf.zzb().getCoroutineContext(), new zzcc(application, str, j8, null, null), interfaceC3103c);
    }

    @NotNull
    public static final Task zzh(@NotNull Application application, @NotNull String str, long j8) throws j, RecaptchaException, L0 {
        return zzax.zza(H.h(zzf.zza(), null, new zzch(application, str, j8, null), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.google.android.recaptcha.internal.zzdf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(java.lang.String r14, android.app.Application r15, tf.p r16, jf.InterfaceC3103c r17) throws com.google.android.recaptcha.RecaptchaException, java.util.MissingResourceException {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcn
            if (r1 == 0) goto L15
            r1 = r0
            com.google.android.recaptcha.internal.zzcn r1 = (com.google.android.recaptcha.internal.zzcn) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.zzc = r2
            goto L1a
        L15:
            com.google.android.recaptcha.internal.zzcn r1 = new com.google.android.recaptcha.internal.zzcn
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.zza
            kf.a r2 = kf.a.f39711a
            int r3 = r1.zzc
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            com.google.android.recaptcha.internal.zzdf r14 = r1.zzd
            Fe.e.U(r0)     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbj -> L2d
            goto L7b
        L2b:
            r0 = move-exception
            goto L80
        L2d:
            r0 = move-exception
            goto L95
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            Fe.e.U(r0)
            com.google.android.recaptcha.internal.zzbv r0 = new com.google.android.recaptcha.internal.zzbv
            java.lang.String r3 = "https://www.recaptcha.net/recaptcha/api3"
            r0.<init>(r3)
            com.google.android.recaptcha.internal.zzbo r3 = com.google.android.recaptcha.internal.zzco.zzf
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r9 = r5.toString()
            com.google.android.recaptcha.internal.zzdk r11 = new com.google.android.recaptcha.internal.zzdk
            com.google.android.recaptcha.internal.zzdm r5 = new com.google.android.recaptcha.internal.zzdm
            java.lang.String r0 = r0.zzc()
            r5.<init>(r0)
            Ef.E r0 = r3.zza()
            r11.<init>(r15, r5, r0)
            java.lang.String r8 = com.google.android.recaptcha.internal.zzco.zzc
            com.google.android.recaptcha.internal.zzdc r6 = new com.google.android.recaptcha.internal.zzdc
            r12 = 0
            r7 = r14
            r10 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6.zzc(r9)
            r14 = 6
            com.google.android.recaptcha.internal.zzdf r14 = r6.zzf(r14)
            r1.zzd = r14     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbj -> L2d
            r1.zzc = r4     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbj -> L2d
            r0 = r16
            java.lang.Object r0 = r0.invoke(r6, r1)     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbj -> L2d
            if (r0 == r2) goto L7f
        L7b:
            r14.zza()     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbj -> L2d
            return r0
        L7f:
            return r2
        L80:
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r2, r3, r0)
            r14.zzb(r1)
            com.google.android.recaptcha.RecaptchaException r14 = r1.zzc()
            throw r14
        L95:
            r14.zzb(r0)
            com.google.android.recaptcha.RecaptchaException r14 = r0.zzc()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzi(java.lang.String, android.app.Application, tf.p, jf.c):java.lang.Object");
    }

    private final void zzj(String str) throws zzbj {
        try {
            zzpj zzpjVarZzj = zzpj.zzj(zzhz.zzh().zzj(str));
            int i5 = zzbb.zza;
            ((zzeb) c.z(zzci.zza).getValue()).zza(zzpjVarZzj);
        } catch (Exception e7) {
            throw new zzbj(zzbh.zzl, zzbg.zzao, e7.getMessage());
        }
    }

    private final boolean zzk(Application application) {
        int i5 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.android.recaptcha.internal.zzbl, com.google.android.recaptcha.internal.zzbo] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(android.app.Application r28, java.lang.String r29, long r30, com.google.android.recaptcha.internal.zzdc r32, com.google.android.recaptcha.internal.zzbv r33, android.webkit.WebView r34, com.google.android.recaptcha.internal.zzdq r35, com.google.android.recaptcha.internal.zzbo r36, jf.InterfaceC3103c r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzl(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzdc, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Application, android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(android.app.Application r14, java.lang.String r15, long r16, com.google.android.recaptcha.internal.zzbv r18, android.webkit.WebView r19, com.google.android.recaptcha.internal.zzdq r20, com.google.android.recaptcha.internal.zzbo r21, com.google.android.recaptcha.internal.zzdc r22, jf.InterfaceC3103c r23) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r23
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcm
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzcm r1 = (com.google.android.recaptcha.internal.zzcm) r1
            int r2 = r1.zzd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzd = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            com.google.android.recaptcha.internal.zzcm r1 = new com.google.android.recaptcha.internal.zzcm
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.zzb
            kf.a r1 = kf.a.f39711a
            int r2 = r12.zzd
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r12.zza
            com.google.android.recaptcha.internal.zzco r15 = r12.zze
            Fe.e.U(r0)     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L35
            goto L6b
        L2f:
            r0 = move-exception
            r14 = r0
            goto L73
        L32:
            r0 = move-exception
            r14 = r0
            goto L81
        L35:
            r0 = move-exception
            goto L83
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            Fe.e.U(r0)
            com.google.android.recaptcha.internal.zzbs r0 = new com.google.android.recaptcha.internal.zzbs     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            r0.<init>(r14)     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            com.google.android.recaptcha.internal.zzdo r2 = new com.google.android.recaptcha.internal.zzdo     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            r2.<init>()     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            com.google.android.recaptcha.internal.zzdq r10 = new com.google.android.recaptcha.internal.zzdq     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            r10.<init>(r0, r2)     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            r12.zze = r13     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            r12.zza = r14     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            r12.zzd = r3     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            r9 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r8 = r18
            r11 = r21
            r7 = r22
            java.lang.Object r0 = r2.zzl(r3, r4, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L70
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r15 = r13
        L6b:
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L35
            com.google.android.recaptcha.internal.zzco.zzb = r0     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.RecaptchaException -> L32 com.google.android.recaptcha.internal.zzbj -> L35
            return r0
        L70:
            r0 = move-exception
            r15 = r0
            goto L82
        L73:
            com.google.android.recaptcha.internal.zzbj r15 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r0 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r14 = r14.getMessage()
            r15.<init>(r0, r1, r14)
            throw r15
        L81:
            throw r14
        L82:
            r15 = r13
        L83:
            com.google.android.recaptcha.internal.zzbh r1 = r0.zzb()
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzc
            boolean r1 = kotlin.jvm.internal.AbstractC3340k.a(r1, r2)
            if (r1 == 0) goto La0
            android.app.Application r14 = (android.app.Application) r14
            boolean r14 = r15.zzk(r14)
            if (r14 != 0) goto La0
            com.google.android.recaptcha.internal.zzbj r14 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbg r15 = com.google.android.recaptcha.internal.zzbg.zzap
            r0 = 0
            r14.<init>(r2, r15, r0)
            throw r14
        La0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzm(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, com.google.android.recaptcha.internal.zzdc, jf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v10, types: [Nf.a] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [Nf.a] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [Nf.a] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(@org.jetbrains.annotations.NotNull android.app.Application r21, @org.jetbrains.annotations.NotNull java.lang.String r22, long r23, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzbv r25, @org.jetbrains.annotations.Nullable android.webkit.WebView r26, @org.jetbrains.annotations.Nullable com.google.android.recaptcha.internal.zzdq r27, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzbo r28, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r29) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r29
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcd
            if (r1 == 0) goto L17
            r1 = r0
            com.google.android.recaptcha.internal.zzcd r1 = (com.google.android.recaptcha.internal.zzcd) r1
            int r2 = r1.zzf
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.zzf = r2
            r2 = r20
            goto L1e
        L17:
            com.google.android.recaptcha.internal.zzcd r1 = new com.google.android.recaptcha.internal.zzcd
            r2 = r20
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.zzd
            kf.a r3 = kf.a.f39711a
            int r4 = r1.zzf
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L5c
            if (r4 == r6) goto L41
            if (r4 != r5) goto L39
            java.lang.Object r1 = r1.zza
            Nf.a r1 = (Nf.a) r1
            Fe.e.U(r0)     // Catch: java.lang.Throwable -> L36
            goto La3
        L36:
            r0 = move-exception
            goto Lab
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            long r8 = r1.zzc
            java.lang.Object r4 = r1.zzb
            com.google.android.recaptcha.internal.zzbo r6 = r1.zzi
            com.google.android.recaptcha.internal.zzbv r10 = r1.zzh
            java.lang.String r11 = r1.zzg
            java.lang.Object r12 = r1.zza
            android.app.Application r12 = (android.app.Application) r12
            Fe.e.U(r0)
            r16 = r6
            r13 = r10
            r10 = r12
            r18 = r8
            r9 = r11
            r11 = r18
            goto L85
        L5c:
            Fe.e.U(r0)
            Nf.a r0 = com.google.android.recaptcha.internal.zzco.zzd
            r4 = r21
            r1.zza = r4
            r8 = r22
            r1.zzg = r8
            r9 = r25
            r1.zzh = r9
            r10 = r28
            r1.zzi = r10
            r1.zzb = r0
            r11 = r23
            r1.zzc = r11
            r1.zzf = r6
            java.lang.Object r6 = r0.b(r1)
            if (r6 == r3) goto Laf
            r13 = r9
            r16 = r10
            r10 = r4
            r9 = r8
            r4 = r0
        L85:
            com.google.android.recaptcha.internal.zzco r0 = com.google.android.recaptcha.internal.zzco.zza     // Catch: java.lang.Throwable -> La9
            com.google.android.recaptcha.internal.zzce r8 = new com.google.android.recaptcha.internal.zzce     // Catch: java.lang.Throwable -> La9
            r17 = 0
            r14 = 0
            r15 = 0
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> La9
            r1.zza = r4     // Catch: java.lang.Throwable -> La9
            r1.zzg = r7     // Catch: java.lang.Throwable -> La9
            r1.zzh = r7     // Catch: java.lang.Throwable -> La9
            r1.zzi = r7     // Catch: java.lang.Throwable -> La9
            r1.zzb = r7     // Catch: java.lang.Throwable -> La9
            r1.zzf = r5     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = r0.zzi(r9, r10, r8, r1)     // Catch: java.lang.Throwable -> La9
            if (r0 == r3) goto Laf
            r1 = r4
        La3:
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0     // Catch: java.lang.Throwable -> L36
            r1.a(r7)
            return r0
        La9:
            r0 = move-exception
            r1 = r4
        Lab:
            r1.a(r7)
            throw r0
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zze(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, jf.c):java.lang.Object");
    }
}
