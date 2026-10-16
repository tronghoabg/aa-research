package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaqr {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzaqr(int i5, int i10) {
        this.zzc = i5;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza() {
        this.zzd = false;
        this.zze = false;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final void zzc(int i5) {
        zzgtr.zzi(!this.zzd);
        boolean z2 = i5 == this.zzc;
        this.zzd = z2;
        if (z2) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final void zzd(byte[] bArr, int i5, int i10) {
        if (this.zzd) {
            int i11 = i10 - i5;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i12 = this.zzb + i11;
            if (length < i12) {
                this.zza = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i5, this.zza, this.zzb, i11);
            this.zzb += i11;
        }
    }

    public final boolean zze(int i5) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i5;
        this.zzd = false;
        this.zze = true;
        return true;
    }
}
