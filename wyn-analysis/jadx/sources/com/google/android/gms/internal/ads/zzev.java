package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzev {
    public static final zzev zza = new zzev(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzev(0, 0);
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzev(int i5, int i10) {
        boolean z2 = false;
        if ((i5 == -1 || i5 >= 0) && (i10 == -1 || i10 >= 0)) {
            z2 = true;
        }
        zzgtr.zza(z2);
        this.zzb = i5;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzev) {
            zzev zzevVar = (zzev) obj;
            if (this.zzb == zzevVar.zzb && this.zzc == zzevVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzb;
        return ((i5 >>> 16) | (i5 << 16)) ^ this.zzc;
    }

    public final String toString() {
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i10).length());
        sb2.append(i5);
        sb2.append("x");
        sb2.append(i10);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }
}
