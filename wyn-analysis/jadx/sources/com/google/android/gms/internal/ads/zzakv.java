package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzakv {
    public final int zza;
    public final int zzb;
    public final float zzc;

    private zzakv(int i5, int i10, float f10) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = f10;
    }

    public static /* synthetic */ zzakv zza(int i5) {
        int i10 = i5 >> 13;
        if (i10 == 0) {
            return null;
        }
        return new zzakv(i10, (i5 >> 10) & 7, ((i5 & 511) * ((i5 & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakv)) {
            return false;
        }
        zzakv zzakvVar = (zzakv) obj;
        return this.zza == zzakvVar.zza && this.zzb == zzakvVar.zzb && Float.compare(this.zzc, zzakvVar.zzc) == 0;
    }

    public final int hashCode() {
        int i5 = this.zza;
        float f10 = this.zzc;
        return Float.floatToIntBits(f10) + (((i5 * 31) + this.zzb) * 31);
    }

    public final String toString() {
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        float f10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f10).length() + 1);
        N0.a.l(i5, i10, "GainField{name=", ", originator=", sb2);
        sb2.append(", gain=");
        sb2.append(f10);
        sb2.append("}");
        return sb2.toString();
    }
}
