package com.google.android.gms.internal.ads;

import android.os.IBinder;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzgqz extends zzgsa {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzgqz(IBinder iBinder, String str, int i5, float f10, int i10, int i11, String str2, int i12, String str3, String str4, String str5, byte[] bArr) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i5;
        this.zzd = f10;
        this.zze = i12;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgsa) {
            zzgsa zzgsaVar = (zzgsa) obj;
            if (this.zza.equals(zzgsaVar.zza()) && ((str = this.zzb) != null ? str.equals(zzgsaVar.zzb()) : zzgsaVar.zzb() == null) && this.zzc == zzgsaVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzgsaVar.zzd())) {
                zzgsaVar.zze();
                zzgsaVar.zzf();
                zzgsaVar.zzg();
                if (this.zze == zzgsaVar.zzh()) {
                    zzgsaVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzgsaVar.zzj()) : zzgsaVar.zzj() == null) {
                        zzgsaVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i5 = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i5) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i5 = this.zzc;
        int length3 = String.valueOf(i5).length();
        float f10 = this.zzd;
        int length4 = String.valueOf(f10).length();
        int i10 = this.zze;
        int length5 = String.valueOf(i10).length();
        String str2 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        AbstractC3256n.p(sb2, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb2.append(", layoutGravity=");
        sb2.append(i5);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f10);
        sb2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb2.append(i10);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final IBinder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final int zzf() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final String zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final String zzj() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final String zzk() {
        return null;
    }
}
