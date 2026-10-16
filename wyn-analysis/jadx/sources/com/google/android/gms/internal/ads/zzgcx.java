package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzgcx {
    private static zzgcx zzb;
    final zzgct zza;

    private zzgcx(Context context) {
        this.zza = zzgct.zza(context);
        zzgcs.zza(context);
    }

    public static final zzgcx zza(Context context) {
        zzgcx zzgcxVar;
        synchronized (zzgcx.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgcx(context);
                }
                zzgcxVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcxVar;
    }

    public final void zzb(zzgcr zzgcrVar) throws IOException {
        synchronized (zzgcx.class) {
            zzgct zzgctVar = this.zza;
            zzgctVar.zzf("vendor_scoped_gpid_v2_id");
            zzgctVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
