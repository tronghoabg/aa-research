package com.google.android.gms.internal.ads;

import Ef.C0485e0;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgbt {
    @NotNull
    public static final zzgbr zza(@NotNull final ExecutorService executorService) {
        AbstractC3340k.e(executorService, "executorService");
        return new zzgbr() { // from class: com.google.android.gms.internal.ads.zzgbs
            @Override // com.google.android.gms.internal.ads.zzgbr
            public final Ef.E zza() {
                return Ef.H.c(new C0485e0(executorService));
            }
        };
    }
}
