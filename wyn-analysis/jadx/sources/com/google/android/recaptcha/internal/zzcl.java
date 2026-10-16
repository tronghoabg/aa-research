package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes4.dex */
public final class zzcl extends AbstractC3343n implements a {
    public static final zzcl zza = new zzcl();

    public zzcl() {
        super(0);
    }

    @Override // tf.a
    @NotNull
    public final Object invoke() {
        int i5 = zzbb.zza;
        Object objZzb = zzba.zza().zzb(915034668);
        if (objZzb != null) {
            return (zzbk) objZzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.common.NetworkStatus");
    }
}
