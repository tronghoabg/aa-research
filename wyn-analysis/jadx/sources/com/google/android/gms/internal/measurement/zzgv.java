package com.google.android.gms.internal.measurement;

import R8.v;
import android.content.Context;
import k8.InterfaceC3207p;

/* loaded from: classes4.dex */
final class zzgv extends zzhu {
    private final Context zza;
    private final InterfaceC3207p zzb;

    public zzgv(Context context, InterfaceC3207p interfaceC3207p) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = interfaceC3207p;
    }

    public final boolean equals(Object obj) {
        InterfaceC3207p interfaceC3207p;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhu) {
            zzhu zzhuVar = (zzhu) obj;
            if (this.zza.equals(zzhuVar.zza()) && ((interfaceC3207p = this.zzb) != null ? interfaceC3207p.equals(zzhuVar.zzb()) : zzhuVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        InterfaceC3207p interfaceC3207p = this.zzb;
        return iHashCode ^ (interfaceC3207p == null ? 0 : interfaceC3207p.hashCode());
    }

    public final String toString() {
        return v.g("FlagsContext{context=", String.valueOf(this.zza), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final InterfaceC3207p zzb() {
        return this.zzb;
    }
}
