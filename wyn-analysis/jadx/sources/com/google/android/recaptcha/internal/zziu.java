package com.google.android.recaptcha.internal;

import R8.v;
import java.io.IOException;

/* loaded from: classes4.dex */
class zziu extends zzit {
    protected final byte[] zza;

    public zziu(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziv) || zzd() != ((zziv) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziu)) {
            return obj.equals(this);
        }
        zziu zziuVar = (zziu) obj;
        int iZzj = zzj();
        int iZzj2 = zziuVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zziuVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zziuVar.zzd()) {
            throw new IllegalArgumentException(v.e(iZzd, zziuVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zziuVar.zza;
        zziuVar.zzc();
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

    @Override // com.google.android.recaptcha.internal.zziv
    public byte zza(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public byte zzb(int i5) {
        return this.zza[i5];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public void zze(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final int zzf(int i5, int i10, int i11) {
        return zzla.zzb(i5, this.zza, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final zziv zzg(int i5, int i10) {
        int iZzi = zziv.zzi(0, i10, zzd());
        return iZzi == 0 ? zziv.zzb : new zziq(this.zza, 0, iZzi);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final void zzh(zzin zzinVar) throws IOException {
        ((zzjd) zzinVar).zzc(this.zza, 0, zzd());
    }
}
