package com.google.android.recaptcha.internal;

import ff.o;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzeg {

    @NotNull
    private final zzhb zza;

    public zzeg() {
        this(1);
    }

    @NotNull
    public final List zwk() {
        return zza();
    }

    @NotNull
    public final List zza() {
        return o.S0(this.zza);
    }

    public final boolean zzb(@NotNull List list) {
        this.zza.add(list);
        return true;
    }

    public zzeg(int i5) {
        this.zza = zzhb.zza(i5);
    }
}
