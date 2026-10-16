package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgrb extends zzgsc {
    private final int zza;
    private final String zzb;
    private final int zzc;
    private final Boolean zzd;

    public /* synthetic */ zzgrb(int i5, String str, int i10, Boolean bool, byte[] bArr) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = bool;
    }

    public final boolean equals(Object obj) {
        String str;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgsc) {
            zzgsc zzgscVar = (zzgsc) obj;
            if (this.zza == zzgscVar.zza() && ((str = this.zzb) != null ? str.equals(zzgscVar.zzb()) : zzgscVar.zzb() == null) && this.zzc == zzgscVar.zzc() && ((bool = this.zzd) != null ? bool.equals(zzgscVar.zzd()) : zzgscVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i5 = this.zza;
        int i10 = this.zzc;
        Boolean bool = this.zzd;
        return ((((iHashCode ^ ((i5 ^ 1000003) * 1000003)) * 1000003) ^ i10) * 1000003) ^ (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i10 = this.zzc;
        int length3 = String.valueOf(i10).length();
        Boolean bool = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i5);
        sb2.append(", sessionToken=");
        sb2.append(str);
        sb2.append(", uiMode=");
        sb2.append(i10);
        sb2.append(", userInteracted=");
        sb2.append(bool);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final Boolean zzd() {
        return this.zzd;
    }
}
