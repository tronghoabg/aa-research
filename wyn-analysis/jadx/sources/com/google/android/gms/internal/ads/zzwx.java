package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzwx {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzhq zzc;

    public zzwx(zzagg zzaggVar, zzanq zzanqVar) {
    }

    public final void zza(zzhq zzhqVar) {
        if (zzhqVar != this.zzc) {
            this.zzc = zzhqVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
