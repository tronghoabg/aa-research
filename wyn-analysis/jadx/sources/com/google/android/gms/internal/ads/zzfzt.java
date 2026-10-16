package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import Va.M6;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzfzt extends zzfzz {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfzt(String str, boolean z2, int i5, zzfzr zzfzrVar, int i10, byte[] bArr) {
        this.zzb = str;
        this.zzc = i5;
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfzz) {
            zzfzz zzfzzVar = (zzfzz) obj;
            if (this.zzb.equals(zzfzzVar.zza())) {
                zzfzzVar.zzb();
                int i5 = this.zzc;
                int iZzd = zzfzzVar.zzd();
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == iZzd) {
                    zzfzzVar.zzc();
                    int i10 = this.zzd;
                    int iZze = zzfzzVar.zze();
                    if (i10 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i5 = this.zzc;
        if (i5 == 0) {
            throw null;
        }
        int i10 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i5;
        if (this.zzd != 0) {
            return (i10 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i5 = this.zzc;
        String str = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + AbstractC0279p0.g(String.valueOf(str3).length() + 73, 52, str) + 1);
        AbstractC3256n.p(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return M6.t(sb2, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final zzfzr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final int zze() {
        return this.zzd;
    }
}
