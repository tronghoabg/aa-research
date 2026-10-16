package com.google.android.recaptcha.internal;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzdz extends AbstractC3471j implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzek zzd;
    final /* synthetic */ zzea zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzek zzekVar, zzea zzeaVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzd = zzekVar;
        this.zze = zzeaVar;
        this.zzf = str;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzdz(this.zzd, this.zze, this.zzf, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdz) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L20;
     */
    @Override // lf.AbstractC3462a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Le
            Fe.e.U(r7)
            goto L85
        Le:
            java.lang.Object r1 = r6.zzb
            java.lang.Object r2 = r6.zza
            Fe.e.U(r7)     // Catch: java.lang.Exception -> L16
            goto L59
        L16:
            r7 = move-exception
            goto L72
        L18:
            Fe.e.U(r7)
            com.google.android.recaptcha.internal.zzek r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbt r1 = new com.google.android.recaptcha.internal.zzbt
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzhz r1 = com.google.android.recaptcha.internal.zzhz.zzh()     // Catch: java.lang.Exception -> L16
            byte[] r7 = r1.zzj(r7)     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzro r7 = com.google.android.recaptcha.internal.zzro.zzi(r7)     // Catch: java.lang.Exception -> L16
            r7.zzf()     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzea r1 = r6.zze     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzge r1 = com.google.android.recaptcha.internal.zzea.zzb(r1)     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzrg r1 = r1.zza(r7)     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzgz r3 = com.google.android.recaptcha.internal.zzgz.zzb()     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzea r4 = r6.zze     // Catch: java.lang.Exception -> L16
            java.util.List r1 = r1.zzi()     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzek r5 = r6.zzd     // Catch: java.lang.Exception -> L16
            r6.zza = r7     // Catch: java.lang.Exception -> L16
            r6.zzb = r3     // Catch: java.lang.Exception -> L16
            r6.zzc = r2     // Catch: java.lang.Exception -> L16
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzea.zzc(r4, r1, r5, r6)     // Catch: java.lang.Exception -> L16
            if (r1 == r0) goto L84
            r2 = r7
            r1 = r3
        L59:
            r7 = r1
            com.google.android.recaptcha.internal.zzgz r7 = (com.google.android.recaptcha.internal.zzgz) r7     // Catch: java.lang.Exception -> L16
            r7.zzf()     // Catch: java.lang.Exception -> L16
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzgz r1 = (com.google.android.recaptcha.internal.zzgz) r1     // Catch: java.lang.Exception -> L16
            long r3 = r1.zza(r7)     // Catch: java.lang.Exception -> L16
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Exception -> L16
            r7.<init>(r3)     // Catch: java.lang.Exception -> L16
            com.google.android.recaptcha.internal.zzro r2 = (com.google.android.recaptcha.internal.zzro) r2     // Catch: java.lang.Exception -> L16
            r2.zzf()     // Catch: java.lang.Exception -> L16
            goto L85
        L72:
            com.google.android.recaptcha.internal.zzea r1 = r6.zze
            com.google.android.recaptcha.internal.zzek r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzea.zzd(r1, r7, r2, r6)
            if (r7 != r0) goto L85
        L84:
            return r0
        L85:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
