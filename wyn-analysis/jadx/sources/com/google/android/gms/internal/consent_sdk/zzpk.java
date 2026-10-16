package com.google.android.gms.internal.consent_sdk;

import R8.v;
import java.io.IOException;

/* loaded from: classes.dex */
class zzpk extends zzpj {
    protected final byte[] zza;

    public zzpk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte zza(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public byte zzb(int i5) {
        return this.zza[i5];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final int zze(int i5, int i10, int i11) {
        return zzqs.zzb(i5, this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final zzpm zzf(int i5, int i10) {
        zzpm.zzi(0, 47, zzd());
        return new zzph(this.zza, 0, 47);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final void zzg(zzpe zzpeVar) throws IOException {
        zzpeVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    public final boolean zzh(zzpm zzpmVar) {
        if (!(zzpmVar instanceof zzpk)) {
            return zzpmVar.zzh(this);
        }
        int iZzd = zzd();
        if (iZzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException(v.e(iZzd, zzpmVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        zzpk zzpkVar = (zzpk) zzpmVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzpkVar.zza;
        zzpkVar.zzc();
        int i5 = 0;
        int i10 = 0;
        while (i5 < iZzd) {
            if (bArr[i5] != bArr2[i10]) {
                return false;
            }
            i5++;
            i10++;
        }
        return true;
    }
}
