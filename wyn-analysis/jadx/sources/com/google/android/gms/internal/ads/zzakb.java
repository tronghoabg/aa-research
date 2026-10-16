package com.google.android.gms.internal.ads;

import A.AbstractC0213f;

/* loaded from: classes3.dex */
public final class zzakb implements zzao {
    public final float zza;
    public final int zzb;

    public zzakb(float f10, int i5) {
        this.zza = f10;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakb.class == obj.getClass()) {
            zzakb zzakbVar = (zzakb) obj;
            if (this.zza == zzakbVar.zza && this.zzb == zzakbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0213f.c(this.zza, 527, 31) + this.zzb;
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        int i5 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i5).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i5);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
