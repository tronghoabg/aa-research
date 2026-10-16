package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;

/* loaded from: classes4.dex */
final class zzbs extends zzbu {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzbs(byte[] bArr, int i5, int i10, boolean z2, zzbr zzbrVar) {
        super(null);
        this.zze = f.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i5) throws zzdc {
        int i10 = this.zze;
        this.zze = 0;
        int i11 = this.zzc + this.zzd;
        this.zzc = i11;
        if (i11 <= 0) {
            this.zzd = 0;
            return i10;
        }
        this.zzd = i11;
        this.zzc = 0;
        return i10;
    }
}
