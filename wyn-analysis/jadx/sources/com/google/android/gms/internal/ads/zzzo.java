package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzzo {
    public static final zzzo zza = new zzzo(new zzbg[0]);
    public final int zzb;
    private final zzgwt zzc;
    private int zzd;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
    }

    public zzzo(zzbg... zzbgVarArr) {
        this.zzc = zzgwt.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i5 = 0;
        while (i5 < this.zzc.size()) {
            int i10 = i5 + 1;
            for (int i11 = i10; i11 < this.zzc.size(); i11++) {
                if (((zzbg) this.zzc.get(i5)).equals(this.zzc.get(i11))) {
                    zzeh.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i5 = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzo.class == obj.getClass()) {
            zzzo zzzoVar = (zzzo) obj;
            if (this.zzb == zzzoVar.zzb && this.zzc.equals(zzzoVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzd;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i5) {
        return (zzbg) this.zzc.get(i5);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgwt zzc() {
        return zzgwt.zzq(zzgxt.zzc(this.zzc, zzzn.zza));
    }
}
