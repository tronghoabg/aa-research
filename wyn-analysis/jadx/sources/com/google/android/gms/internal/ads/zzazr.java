package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzazr implements PackageManager$OnChecksumsReadyListener {
    final zzhcy zza = zzhcy.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                ApkChecksum apkChecksumD = ab.d.d(list.get(i5));
                if (apkChecksumD.getType() == 8) {
                    zzhcy zzhcyVar = this.zza;
                    zzgzo zzgzoVarZzi = zzgzo.zzn().zzi();
                    byte[] value = apkChecksumD.getValue();
                    zzhcyVar.zza(zzgzoVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
