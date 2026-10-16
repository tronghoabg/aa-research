package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzaqb {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzaqb(int i5) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzb(int i5, int i10) {
        if (this.zze) {
            int i11 = this.zza - i10;
            this.zza = i11;
            if (this.zzb != 0 || i5 != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i11;
        } else if (i5 == 179) {
            this.zze = true;
        }
        zzc(zzd, 0, 3);
        return false;
    }

    public final void zzc(byte[] bArr, int i5, int i10) {
        if (this.zze) {
            int i11 = i10 - i5;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i12 = this.zza + i11;
            if (length < i12) {
                this.zzc = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i5, this.zzc, this.zza, i11);
            this.zza += i11;
        }
    }
}
