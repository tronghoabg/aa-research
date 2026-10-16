package com.google.android.recaptcha.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class zze {
    private boolean zza;

    @Nullable
    public zzdf zza(@NotNull String str) {
        throw null;
    }

    @Nullable
    public zzdf zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: Exception -> 0x0090, TRY_LEAVE, TryCatch #0 {Exception -> 0x0090, blocks: (B:28:0x0081, B:30:0x008c), top: B:49:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r22) throws com.google.android.recaptcha.internal.zzbj, java.util.MissingResourceException {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, jf.c):java.lang.Object");
    }

    @Nullable
    public abstract Object zzd(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c);

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[PHI: r9 r10 r12
  0x009b: PHI (r9v8 com.google.android.recaptcha.internal.zzdf) = (r9v5 com.google.android.recaptcha.internal.zzdf), (r9v14 com.google.android.recaptcha.internal.zzdf) binds: [B:38:0x0099, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r10v6 com.google.android.recaptcha.internal.zze) = (r10v3 com.google.android.recaptcha.internal.zze), (r10v10 com.google.android.recaptcha.internal.zze) binds: [B:38:0x0099, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r12v8 java.lang.Object) = (r12v9 java.lang.Object), (r12v10 java.lang.Object) binds: [B:38:0x0099, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(long r9, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzpq r11, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r12) throws com.google.android.recaptcha.internal.zzbj, java.util.MissingResourceException {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzd
            ef.C r3 = ef.C2515C.f34653a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L53
            if (r2 == r7) goto L47
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbj r9 = (com.google.android.recaptcha.internal.zzbj) r9
            Fe.e.U(r12)
            goto Lb0
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            com.google.android.recaptcha.internal.zzdf r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            Fe.e.U(r12)
            goto L9b
        L47:
            com.google.android.recaptcha.internal.zzdf r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            Fe.e.U(r12)     // Catch: java.lang.Exception -> L51
            goto L77
        L51:
            r11 = move-exception
            goto L8c
        L53:
            Fe.e.U(r12)
            com.google.android.recaptcha.internal.zzdf r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L62
            r12.zza()
            return r3
        L62:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L88
            r2.<init>(r8, r11, r4)     // Catch: java.lang.Exception -> L88
            r0.zza = r8     // Catch: java.lang.Exception -> L88
            r0.zze = r12     // Catch: java.lang.Exception -> L88
            r0.zzd = r7     // Catch: java.lang.Exception -> L88
            java.lang.Object r9 = Ef.H.Q(r9, r2, r0)     // Catch: java.lang.Exception -> L88
            if (r9 == r1) goto Lb5
            r10 = r12
            r12 = r9
            r9 = r10
            r10 = r8
        L77:
            ef.n r12 = (ef.C2530n) r12     // Catch: java.lang.Exception -> L51
            java.lang.Object r11 = r12.f34674a     // Catch: java.lang.Exception -> L51
            Fe.e.U(r11)     // Catch: java.lang.Exception -> L51
            r10.zza = r7     // Catch: java.lang.Exception -> L51
            if (r9 == 0) goto L85
            r9.zza()     // Catch: java.lang.Exception -> L51
        L85:
            return r3
        L86:
            r11 = r9
            goto L8a
        L88:
            r9 = move-exception
            goto L86
        L8a:
            r10 = r8
            r9 = r12
        L8c:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r6
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto Lb5
        L9b:
            r11 = r12
            com.google.android.recaptcha.internal.zzbj r11 = (com.google.android.recaptcha.internal.zzbj) r11
            if (r9 == 0) goto La3
            r9.zzb(r11)
        La3:
            r0.zza = r11
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lb5
            r9 = r11
        Lb0:
            ef.m r9 = Fe.e.z(r9)
            return r9
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzpq, jf.c):java.lang.Object");
    }

    @Nullable
    public abstract Object zzf(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c) throws zzbj;

    @Nullable
    public Object zzg(@NotNull zzbj zzbjVar, @NotNull InterfaceC3103c interfaceC3103c) {
        return C2515C.f34653a;
    }

    @Nullable
    public abstract Object zzh(@NotNull zzpq zzpqVar, @NotNull InterfaceC3103c interfaceC3103c) throws zzbj;

    @Nullable
    public Object zzi(@NotNull String str, long j8, @NotNull Exception exc, @NotNull InterfaceC3103c interfaceC3103c) {
        return C2515C.f34653a;
    }

    @Nullable
    public Object zzj(@NotNull Exception exc, @NotNull InterfaceC3103c interfaceC3103c) {
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
    }

    public void zzk(@NotNull zzqf zzqfVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
