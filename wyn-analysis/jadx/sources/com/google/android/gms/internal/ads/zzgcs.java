package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzgcs {
    private static zzgcs zzb;
    final zzgct zza;

    private zzgcs(Context context) {
        this.zza = zzgct.zza(context);
    }

    public static final zzgcs zza(Context context) {
        zzgcs zzgcsVar;
        synchronized (zzgcs.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgcs(context);
                }
                zzgcsVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcsVar;
    }

    public final void zzb(boolean z2) throws IOException {
        synchronized (zzgcs.class) {
            try {
                zzgct zzgctVar = this.zza;
                zzgctVar.zzb("paidv2_publisher_option", Boolean.valueOf(z2));
                if (!z2) {
                    zzgctVar.zzf("paidv2_creation_time");
                    zzgctVar.zzf("paidv2_id");
                    zzgctVar.zzf("vendor_scoped_gpid_v2_id");
                    zzgctVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgcs.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z2) throws IOException {
        synchronized (zzgcs.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z2));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgcs.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}
