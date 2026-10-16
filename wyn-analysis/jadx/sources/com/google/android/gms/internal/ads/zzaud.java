package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.File;

/* loaded from: classes3.dex */
final class zzaud implements zzaug {
    final /* synthetic */ File zza;

    public zzaud(zzauh zzauhVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzauhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final File zza() {
        return this.zza;
    }
}
