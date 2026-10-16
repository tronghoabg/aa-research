package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgbk {

    @NotNull
    private final zzgbg zza;

    public final /* synthetic */ zzgbi zza() {
        zziep zziepVarZzbu = this.zza.zzbu();
        AbstractC3340k.d(zziepVarZzbu, "build(...)");
        return (zzgbi) zziepVarZzbu;
    }

    public final /* synthetic */ zziht zzb() {
        Map mapZzb = this.zza.zzb();
        AbstractC3340k.d(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziht(mapZzb);
    }

    public final void zzc(@NotNull zziht zzihtVar, @NotNull String key, @NotNull zzgbe value) {
        AbstractC3340k.e(zzihtVar, "<this>");
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zziht zzihtVar, String key) {
        AbstractC3340k.e(zzihtVar, "<this>");
        AbstractC3340k.e(key, "key");
        this.zza.zza(key);
    }
}
