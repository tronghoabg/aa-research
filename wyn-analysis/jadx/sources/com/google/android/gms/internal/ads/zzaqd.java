package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzaqd {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzaqd(int i5) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzb(int i5, int i10) {
        int i11 = this.zzf;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i5 == 179 || i5 == 181) {
                            this.zza -= i10;
                            this.zze = false;
                            return true;
                        }
                    } else if ((i5 & 240) != 32) {
                        zzeh.zzc("H263Reader", "Unexpected start code value");
                        zza();
                    } else {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                } else if (i5 > 31) {
                    zzeh.zzc("H263Reader", "Unexpected start code value");
                    zza();
                } else {
                    this.zzf = 3;
                }
            } else if (i5 != 181) {
                zzeh.zzc("H263Reader", "Unexpected start code value");
                zza();
            } else {
                this.zzf = 2;
            }
        } else if (i5 == 176) {
            this.zzf = 1;
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
