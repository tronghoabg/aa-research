package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
final class zzgtt implements Serializable, zzgts {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtt) {
            return this.zza.equals(((zzgtt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z2 = true;
        for (Object obj : this.zza) {
            if (!z2) {
                sb2.append(',');
            }
            sb2.append(obj);
            z2 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final boolean zza(Object obj) {
        int i5 = 0;
        while (true) {
            List list = this.zza;
            if (i5 >= list.size()) {
                return true;
            }
            if (!((zzgts) list.get(i5)).zza(obj)) {
                return false;
            }
            i5++;
        }
    }
}
