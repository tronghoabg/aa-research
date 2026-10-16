package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes4.dex */
public final class zzci extends AbstractC3343n implements a {
    public static final zzci zza = new zzci();

    public zzci() {
        super(0);
    }

    @Override // tf.a
    @NotNull
    public final Object invoke() {
        int i5 = zzbb.zza;
        Object objZzb = zzba.zza().zzb(915034752);
        if (objZzb != null) {
            return (zzeb) objZzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.vm.allowlist.AllowlistHandler");
    }
}
