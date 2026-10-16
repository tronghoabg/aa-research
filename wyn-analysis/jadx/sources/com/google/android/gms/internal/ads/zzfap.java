package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzfap implements zzfcq {
    public final zzfkm zza;

    public zzfap(zzfkm zzfkmVar) {
        this.zza = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfkm zzfkmVar = this.zza;
        if (zzfkmVar != null) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznE)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", zzfkmVar.zzb());
            bundle.putBoolean("disable_ml", zzfkmVar.zzc());
        }
    }
}
