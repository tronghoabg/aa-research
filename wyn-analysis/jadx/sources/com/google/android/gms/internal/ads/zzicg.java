package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzicg implements Map.Entry {
    zzicg zza;
    zzicg zzb;
    zzicg zzc;
    zzicg zzd;
    zzicg zze;
    final Object zzf;
    final boolean zzg;
    Object zzh;
    int zzi;

    public zzicg(boolean z2) {
        this.zzf = null;
        this.zzg = z2;
        this.zze = this;
        this.zzd = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.zzh;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzh;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zzf;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzh;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.zzh;
        this.zzh = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzf);
        String strValueOf2 = String.valueOf(this.zzh);
        return M6.t(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }

    public zzicg(boolean z2, zzicg zzicgVar, Object obj, zzicg zzicgVar2, zzicg zzicgVar3) {
        this.zza = zzicgVar;
        this.zzf = obj;
        this.zzg = z2;
        this.zzi = 1;
        this.zzd = zzicgVar2;
        this.zze = zzicgVar3;
        zzicgVar3.zzd = this;
        zzicgVar2.zze = this;
    }
}
