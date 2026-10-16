package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzfbq implements zzfcq {
    private final String zza;

    public zzfbq(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("request_id", this.zza);
    }
}
