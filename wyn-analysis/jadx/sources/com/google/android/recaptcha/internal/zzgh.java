package com.google.android.recaptcha.internal;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzgh implements zzgm {

    @NotNull
    private final Context zza;

    public zzgh(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    @Nullable
    public final Object zza(@NotNull Object... objArr) {
        return zzau.zza(this.zza.getContentResolver());
    }
}
