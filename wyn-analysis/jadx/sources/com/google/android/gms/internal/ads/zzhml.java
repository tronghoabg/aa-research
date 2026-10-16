package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhml extends zzheq {
    private final String zza;
    private final zzhtx zzb;

    public /* synthetic */ zzhml(String str, zzhtx zzhtxVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhtxVar;
    }

    public final String toString() {
        String str = this.zza;
        int iOrdinal = this.zzb.ordinal();
        return R8.v.g("(typeUrl=", str, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzb != zzhtx.RAW;
    }
}
