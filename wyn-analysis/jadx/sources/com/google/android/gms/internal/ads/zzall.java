package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzall implements zzali {
    private final int zza;
    private final int zzb;
    private final zzeu zzc;

    public zzall(zzga zzgaVar, zzv zzvVar) {
        zzeu zzeuVar = zzgaVar.zza;
        this.zzc = zzeuVar;
        zzeuVar.zzh(12);
        int iZzH = zzeuVar.zzH();
        if ("audio/raw".equals(zzvVar.zzp)) {
            int iZzI = zzfm.zzI(zzvVar.zzK) * zzvVar.zzH;
            if (iZzH % iZzI != 0) {
                zzeh.zzc("BoxParsers", com.google.android.gms.internal.consent_sdk.a.u(iZzI, iZzH, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: ", new StringBuilder(String.valueOf(iZzI).length() + 66 + String.valueOf(iZzH).length())));
                iZzH = iZzI;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzeuVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzc() {
        int i5 = this.zza;
        return i5 == -1 ? this.zzc.zzH() : i5;
    }
}
