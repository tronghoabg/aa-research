package com.google.android.recaptcha.internal;

import Bf.i;
import Ef.H;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import ff.AbstractC2641B;
import ff.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingResourceException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzcx implements RecaptchaClient, RecaptchaTasksClient {

    @NotNull
    private static final i zza = new i("^[a-zA-Z0-9/_]{0,100}$");

    @NotNull
    private final Application zzb;

    @NotNull
    private final zzl zzc;

    @NotNull
    private final String zzd;

    @NotNull
    private final zzbv zze;

    @NotNull
    private final zzpq zzf;

    @NotNull
    private final zzdc zzg;

    @NotNull
    private final zzbl zzh;

    @NotNull
    private final zzbo zzi;

    public zzcx(@NotNull Application application, @NotNull zzl zzlVar, @NotNull String str, @NotNull zzbo zzboVar, @NotNull zzbv zzbvVar, @NotNull zzpq zzpqVar, @NotNull zzdc zzdcVar, @NotNull zzbl zzblVar, @NotNull zzds zzdsVar) {
        this.zzb = application;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zzi = zzboVar;
        this.zze = zzbvVar;
        this.zzf = zzpqVar;
        this.zzg = zzdcVar;
        this.zzh = zzblVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(long r5, java.lang.String r7, com.google.android.recaptcha.internal.zzdc r8, jf.InterfaceC3103c r9) throws com.google.android.recaptcha.internal.zzbj, java.util.MissingResourceException {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcp
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcp r0 = (com.google.android.recaptcha.internal.zzcp) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcp r0 = new com.google.android.recaptcha.internal.zzcp
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.recaptcha.internal.zzdf r5 = r0.zzd
            Fe.e.U(r9)     // Catch: java.lang.Exception -> L29
            goto L49
        L29:
            r6 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Fe.e.U(r9)
            r9 = 27
            com.google.android.recaptcha.internal.zzdf r8 = r8.zzf(r9)
            com.google.android.recaptcha.internal.zzl r9 = r4.zzc     // Catch: java.lang.Exception -> L50
            r0.zzd = r8     // Catch: java.lang.Exception -> L50
            r0.zzc = r3     // Catch: java.lang.Exception -> L50
            java.lang.Object r9 = r9.zzb(r7, r5, r0)     // Catch: java.lang.Exception -> L50
            if (r9 == r1) goto L4f
            r5 = r8
        L49:
            com.google.android.recaptcha.internal.zzpw r9 = (com.google.android.recaptcha.internal.zzpw) r9     // Catch: java.lang.Exception -> L29
            r5.zza()     // Catch: java.lang.Exception -> L29
            return r9
        L4f:
            return r1
        L50:
            r5 = move-exception
            r6 = r5
            r5 = r8
        L53:
            boolean r7 = r6 instanceof com.google.android.recaptcha.internal.zzbj
            if (r7 == 0) goto L5a
            com.google.android.recaptcha.internal.zzbj r6 = (com.google.android.recaptcha.internal.zzbj) r6
            goto L64
        L5a:
            com.google.android.recaptcha.internal.zzbj r6 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r7 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r8 = com.google.android.recaptcha.internal.zzbg.zzaa
            r9 = 0
            r6.<init>(r7, r8, r9)
        L64:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zzf(long, java.lang.String, com.google.android.recaptcha.internal.zzdc, jf.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(com.google.android.recaptcha.RecaptchaAction r22, long r23, jf.InterfaceC3103c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zzg(com.google.android.recaptcha.RecaptchaAction, long, jf.c):java.lang.Object");
    }

    private final void zzh(zzqf zzqfVar, zzdc zzdcVar) throws zzbj, MissingResourceException {
        zzdf zzdfVarZzf = zzdcVar.zzf(29);
        try {
            List<zzqh> listZzk = zzqfVar.zzk();
            int iD = AbstractC2641B.D(p.a0(listZzk, 10));
            if (iD < 16) {
                iD = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
            for (zzqh zzqhVar : listZzk) {
                linkedHashMap.put(zzqhVar.zzg(), zzqhVar.zzi());
            }
            this.zzh.zzb(linkedHashMap);
            this.zzc.zzf(zzqfVar);
            zzdfVarZzf.zza();
        } catch (Exception e7) {
            zzbj zzbjVar = e7 instanceof zzbj ? (zzbj) e7 : new zzbj(zzbh.zzb, zzbg.zzaa, null);
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }

    private final boolean zzi(Application application) {
        int i5 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @org.jetbrains.annotations.Nullable
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo170execute0E7RQCE(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r5, long r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2530n> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcq
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzcq r0 = (com.google.android.recaptcha.internal.zzcq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcq r0 = new com.google.android.recaptcha.internal.zzcq
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Fe.e.U(r8)
            ef.n r8 = (ef.C2530n) r8
            java.lang.Object r5 = r8.f34674a
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Fe.e.U(r8)
            r0.zzc = r3
            java.lang.Object r5 = r4.zzg(r5, r6, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.mo170execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @org.jetbrains.annotations.Nullable
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo171executegIAlus(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r5, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2530n> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcr
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzcr r0 = (com.google.android.recaptcha.internal.zzcr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcr r0 = new com.google.android.recaptcha.internal.zzcr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Fe.e.U(r6)
            ef.n r6 = (ef.C2530n) r6
            java.lang.Object r5 = r6.f34674a
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Fe.e.U(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.mo170execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.mo171executegIAlus(com.google.android.recaptcha.RecaptchaAction, jf.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction) {
        return zzax.zza(H.h(this.zzi.zzb(), null, new zzct(this, recaptchaAction, 10000L, null), 3));
    }

    @NotNull
    public final String zze() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction, long j8) {
        return zzax.zza(H.h(this.zzi.zzb(), null, new zzct(this, recaptchaAction, j8, null), 3));
    }
}
