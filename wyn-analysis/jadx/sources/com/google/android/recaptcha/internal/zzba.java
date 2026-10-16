package com.google.android.recaptcha.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzba {
    @NotNull
    public static final zzbb zza() {
        zzbb zzbbVar = zzbb.zzb;
        if (zzbbVar != null) {
            return zzbbVar;
        }
        zzbb zzbbVar2 = new zzbb((Map) zzbb.zzc.invoke(), null);
        zzbb.zzb = zzbbVar2;
        return zzbbVar2;
    }

    public static final void zzb(@NotNull zzbc... zzbcVarArr) {
        zzbb.zzc = new zzaz(zzbcVarArr);
    }
}
