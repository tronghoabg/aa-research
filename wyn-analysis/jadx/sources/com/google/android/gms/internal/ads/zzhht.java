package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhht extends zzhfh {
    private final zzhhs zza;
    private final String zzb;
    private final zzhhr zzc;
    private final zzhfh zzd;

    public /* synthetic */ zzhht(zzhhs zzhhsVar, String str, zzhhr zzhhrVar, zzhfh zzhfhVar, byte[] bArr) {
        this.zza = zzhhsVar;
        this.zzb = str;
        this.zzc = zzhhrVar;
        this.zzd = zzhfhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhht)) {
            return false;
        }
        zzhht zzhhtVar = (zzhht) obj;
        return zzhhtVar.zzc.equals(this.zzc) && zzhhtVar.zzd.equals(this.zzd) && zzhhtVar.zzb.equals(this.zzb) && zzhhtVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhht.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzhhs zzhhsVar = this.zza;
        zzhfh zzhfhVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhfhVar);
        String strValueOf3 = String.valueOf(zzhhsVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        AbstractC3256n.p(sb2, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        AbstractC3256n.p(sb2, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhhs.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzhhs zzc() {
        return this.zza;
    }

    public final zzhfh zzd() {
        return this.zzd;
    }
}
