package com.google.android.gms.internal.mlkit_vision_text_common;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
final class zztq extends zztu {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zztq(String str, boolean z2, int i5, zztp zztpVar) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztu) {
            zztu zztuVar = (zztu) obj;
            if (this.zza.equals(zztuVar.zzb()) && this.zzb == zztuVar.zzc() && this.zzc == zztuVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.zza);
        sb2.append(", enableFirelog=");
        sb2.append(this.zzb);
        sb2.append(", firelogEventType=");
        return AbstractC0279p0.j(this.zzc, "}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final boolean zzc() {
        return this.zzb;
    }
}
