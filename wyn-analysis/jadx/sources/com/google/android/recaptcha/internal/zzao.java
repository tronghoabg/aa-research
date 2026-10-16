package com.google.android.recaptcha.internal;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzao extends AbstractC3471j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzap zzc;
    final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzapVar, zzdf zzdfVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzc = zzapVar;
        this.zzd = zzdfVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzao(this.zzc, this.zzd, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // lf.AbstractC3462a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) throws java.util.MissingResourceException {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.zzb
            if (r1 == 0) goto Le
            java.lang.Object r0 = r6.zza
            Fe.e.U(r7)     // Catch: java.lang.Exception -> Lc
            goto L5c
        Lc:
            r7 = move-exception
            goto L2f
        Le:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            com.google.android.recaptcha.internal.zzan r1 = new com.google.android.recaptcha.internal.zzan     // Catch: java.lang.Exception -> L2b
            com.google.android.recaptcha.internal.zzap r2 = r6.zzc     // Catch: java.lang.Exception -> L2b
            com.google.android.recaptcha.internal.zzdf r3 = r6.zzd     // Catch: java.lang.Exception -> L2b
            r4 = 0
            r1.<init>(r2, r3, r7, r4)     // Catch: java.lang.Exception -> L2b
            r6.zza = r7     // Catch: java.lang.Exception -> L2b
            r2 = 1
            r6.zzb = r2     // Catch: java.lang.Exception -> L2b
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = Ef.H.Q(r2, r1, r6)     // Catch: java.lang.Exception -> L2b
            if (r7 != r0) goto L5c
            return r0
        L2b:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L2f:
            com.google.android.recaptcha.internal.zzap r1 = r6.zzc
            Ef.t r1 = r1.zzf()
            kotlin.jvm.internal.G r0 = (kotlin.jvm.internal.G) r0
            java.lang.Object r0 = r0.f39740a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L3e
            r0 = r7
        L3e:
            Ef.u r1 = (Ef.C0514u) r1
            r1.Y(r0)
            com.google.android.recaptcha.internal.zzap r0 = r6.zzc
            com.google.android.recaptcha.internal.zzat r1 = com.google.android.recaptcha.internal.zzat.zza
            com.google.android.recaptcha.internal.zzap.zzh(r0, r1)
            com.google.android.recaptcha.internal.zzdf r0 = r6.zzd
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r7 = r7.getMessage()
            r1.<init>(r2, r3, r7)
            r0.zzb(r1)
        L5c:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzao.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
