package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class zzhlb implements zzhld {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzhlb(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhld
    public final boolean zza() {
        return this.zza.get();
    }
}
