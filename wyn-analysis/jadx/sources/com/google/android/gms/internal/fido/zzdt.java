package com.google.android.gms.internal.fido;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes.dex */
public final class zzdt {
    private final byte zza;
    private final byte zzb;

    public zzdt(int i5) {
        this.zza = (byte) (i5 & Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
        this.zzb = (byte) (i5 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
