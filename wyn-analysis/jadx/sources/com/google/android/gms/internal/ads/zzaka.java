package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzaka implements zzao {
    public final List zza;

    public zzaka(List list) {
        this.zza = list;
        boolean z2 = false;
        if (!list.isEmpty()) {
            long j8 = ((zzajz) list.get(0)).zzb;
            int i5 = 1;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                if (((zzajz) list.get(i5)).zza < j8) {
                    z2 = true;
                    break;
                } else {
                    j8 = ((zzajz) list.get(i5)).zzb;
                    i5++;
                }
            }
        }
        zzgtr.zza(!z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaka.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaka) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
