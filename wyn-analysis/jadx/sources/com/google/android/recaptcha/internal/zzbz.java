package com.google.android.recaptcha.internal;

import android.content.Context;
import d7.f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzbz {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final f zzb = f.f34129b;

    @NotNull
    public static final int zza(@NotNull Context context) {
        int iC = zzb.c(context);
        return (iC == 1 || iC == 3 || iC == 9) ? 4 : 3;
    }
}
