package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import jf.InterfaceC3103c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzag implements zzaa {

    @NotNull
    private final zzdc zza;

    @NotNull
    private final zzap zzb;
    private boolean zzc = true;

    @NotNull
    private String zzd = "";

    @NotNull
    private final int zze;

    public zzag(@NotNull zzdc zzdcVar, @NotNull Context context, @NotNull E e7, @NotNull zzap zzapVar, @NotNull int i5) {
        this.zza = zzdcVar;
        this.zzb = zzapVar;
        this.zze = i5;
    }

    private static final String zzi(zziv zzivVar) {
        zzhz zzhzVarZzg = zzhz.zzg();
        byte[] bArrZzl = zzivVar.zzl();
        byte[] bArrZzd = zzhr.zza().zza(zzhzVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zziv zzivVarZzk = zziv.zzk(bArrZzd, 0, bArrZzd.length);
        zzhz zzhzVarZzh = zzhz.zzh();
        byte[] bArrZzl2 = zzivVarZzk.zzl();
        return zzhzVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @NotNull
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c) {
        return H.l(new zzae(this, str, null), interfaceC3103c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r13.zze(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzaa
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzd(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzps r12, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r13) throws java.util.MissingResourceException {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzd
            ef.C r3 = ef.C2515C.f34653a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r12 = r0.zza
            com.google.android.recaptcha.internal.zzdf r12 = (com.google.android.recaptcha.internal.zzdf) r12
            Fe.e.U(r13)
            goto L87
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            com.google.android.recaptcha.internal.zzdf r12 = r0.zze
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzag r2 = (com.google.android.recaptcha.internal.zzag) r2
            Fe.e.U(r13)
            goto L78
        L43:
            Fe.e.U(r13)
            com.google.android.recaptcha.internal.zzdf r13 = com.google.android.recaptcha.internal.zzab.zzc(r11)
            int r2 = r11.zze
            r7 = 3
            if (r2 != r7) goto L8c
            long r7 = r12.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L5a
            goto L8c
        L5a:
            com.google.android.recaptcha.internal.zziv r2 = r12.zzg()
            java.lang.String r2 = zzi(r2)
            r11.zzd = r2
            com.google.android.recaptcha.internal.zzap r2 = r11.zzb
            long r7 = r12.zzf()
            r0.zza = r11
            r0.zze = r13
            r0.zzd = r6
            java.lang.Object r12 = r2.zzd(r7, r0)
            if (r12 == r1) goto L8b
            r2 = r11
            r12 = r13
        L78:
            com.google.android.recaptcha.internal.zzap r13 = r2.zzb
            r0.zza = r12
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r13 = r13.zze(r0)
            if (r13 != r1) goto L87
            goto L8b
        L87:
            r12.zza()
            return r3
        L8b:
            return r1
        L8c:
            r12 = 0
            r11.zzc = r12
            com.google.android.recaptcha.internal.zzbj r12 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r0 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzac
            r12.<init>(r0, r1, r4)
            r13.zzb(r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzag.zzd(com.google.android.recaptcha.internal.zzps, jf.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(@NotNull zzqf zzqfVar) {
        this.zzd = zzi(zzqfVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
