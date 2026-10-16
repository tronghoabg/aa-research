package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import java.io.IOException;

/* loaded from: classes.dex */
class zzaiw extends zzaix {
    protected final byte[] zzb;

    public zzaiw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaip) || zzb() != ((zzaip) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzaiw)) {
            return obj.equals(this);
        }
        zzaiw zzaiwVar = (zzaiw) obj;
        int iZza = zza();
        int iZza2 = zzaiwVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzaiwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public byte zza(int i5) {
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public byte zzb(int i5) {
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final zzajb zzc() {
        return zzajb.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final zzaip zza(int i5, int i10) {
        int iZza = zzaip.zza(0, i10, zzb());
        return iZza == 0 ? zzaip.zza : new zzait(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final int zzb(int i5, int i10, int i11) {
        return zzakb.zza(i5, this.zzb, zze(), i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public void zza(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.zzb, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final void zza(zzaim zzaimVar) throws IOException {
        zzaimVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
    public final boolean zza(zzaip zzaipVar, int i5, int i10) {
        if (i10 <= zzaipVar.zzb()) {
            if (i10 <= zzaipVar.zzb()) {
                if (zzaipVar instanceof zzaiw) {
                    zzaiw zzaiwVar = (zzaiw) zzaipVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzaiwVar.zzb;
                    int iZze = zze() + i10;
                    int iZze2 = zze();
                    int iZze3 = zzaiwVar.zze();
                    while (iZze2 < iZze) {
                        if (bArr[iZze2] != bArr2[iZze3]) {
                            return false;
                        }
                        iZze2++;
                        iZze3++;
                    }
                    return true;
                }
                return zzaipVar.zza(0, i10).equals(zza(0, i10));
            }
            throw new IllegalArgumentException(v.e(i10, zzaipVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        throw new IllegalArgumentException("Length too large: " + i10 + zzb());
    }
}
